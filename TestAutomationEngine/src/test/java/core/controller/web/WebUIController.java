package core.controller.web;

import base.web.WebBaseTest;
import core.performance.web.WebPerformanceLogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebUIController  implements WebController
{
    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final Logger log =
            LogManager.getLogger(
                    WebUIController.class);

    /**
     * Initialize Web UI Controller
     */
    public WebUIController(WebDriver driver)
    {
        this.driver = driver;

        this.wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10));
    }

    /**
     * Launch Application URL
     */
    public void launchApplication(String url)
    {
        long start =
                System.currentTimeMillis();

        driver.get(url);

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "launchApplication",
                url,
                "PAGE_LOAD",
                end - start);

        log.info(
                "Navigated To URL : {}",
                url);
    }

    /**
     * Click Web Element
     */
    public void click(WebElement element)
    {
        long start =
                System.currentTimeMillis();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        element));

        element.click();

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "click",
                element.toString(),
                "CLICK_ACTION",
                end - start);

        log.info(
                "Clicked Element");
    }

    /**
     * Enter Text Into Web Element
     */
    public void type(WebElement element, String text)
    {
        long start =
                System.currentTimeMillis();

        wait.until(
                ExpectedConditions.visibilityOf(
                        element));

        element.clear();

        element.sendKeys(
                text);

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "type",
                element.toString(),
                "TYPE_ACTION",
                end - start);

        log.info(
                "Entered Text : {}",
                text);
    }


    /**
     * Wait Until Element Is Clickable And Click
     */
    public void waitAndClick(WebElement element)
    {
        long start =
                System.currentTimeMillis();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        element));

        element.click();

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "waitAndClick",
                element.toString(),
                "CLICK_ACTION",
                end - start);

        log.info(
                "Clicked After Wait");
    }


    /**
     * Wait Until Element Is Clickable And Perform JavaScript Click
     */
    public void waitAndJsClick(WebElement element)
    {
        long start =
                System.currentTimeMillis();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        element));

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        element);

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "waitAndJsClick",
                element.toString(),
                "JS_CLICK_ACTION",
                end - start);

        log.info(
                "JavaScript Click Performed After Wait");
    }


    /**
     * Wait Until Element Is Visible And Enter Text
     */
    public void waitAndType(WebElement element, String text)
    {
        long start =
                System.currentTimeMillis();

        wait.until(
                ExpectedConditions.visibilityOf(
                        element));

        element.clear();

        element.sendKeys(
                text);

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "waitAndType",
                element.toString(),
                "TYPE_ACTION",
                end - start);

        log.info(
                "Typed After Wait : {}",
                text);
    }

    /**
     * Get Text From Web Element
     */
    public String getText(WebElement element)
    {
        wait.until(
                ExpectedConditions.visibilityOf(
                        element));

        return element.getText();
    }

    /**
     * Verify Exact Text
     */
    public boolean verifyText(WebElement element, String expectedText)
    {
        String actualText =
                getText(element);

        boolean result =
                actualText.equals(
                        expectedText);

        log.info(
                "Expected : {} | Actual : {}",
                expectedText,
                actualText);

        return result;
    }

    /**
     * Verify Element Contains Text
     */
    public boolean verifyContainsText(
            WebElement container,
            String expectedText)
    {
        try
        {
            wait.until(
                    ExpectedConditions.textToBePresentInElement(
                            container,
                            expectedText));

            if(container.getText()
                    .toLowerCase()
                    .contains(expectedText.toLowerCase()))
            {
                log.info(
                        "Verified '{}' is present.",
                        expectedText);

                return true;
            }

            log.error(
                    "'{}' not found.",
                    expectedText);

            return false;
        }
        catch (Exception e)
        {
            log.error(
                    "'{}' not found.",
                    expectedText);

            return false;
        }
    }

    /**
     * Verify Text Exists And Click It
     */
    public void verifyContainsTextAndClick(WebElement container, String expectedText)
    {
        try
        {
            wait.until(
                    ExpectedConditions.textToBePresentInElement(
                            container,
                            expectedText));

            WebElement element =
                    container.findElement(
                            By.xpath(".//*[normalize-space()='"
                                    + expectedText
                                    + "']"));

            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            element));

            element.click();

            log.info(
                    "Verified And Clicked '{}'.",
                    expectedText);
        }
        catch (Exception e)
        {
            log.error(
                    "'{}' not found.",
                    expectedText);

            throw new RuntimeException(
                    "Failed To Click Text : " + expectedText,
                    e);
        }
    }

    /**
     * Verify Element Is Displayed
     */
    public boolean verifyElementDisplayed(WebElement element)
    {
        try
        {
            wait.until(
                    ExpectedConditions.visibilityOf(
                            element));

            return element.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    /**
     * Click Element If Displayed
     */
    public boolean clickIfDisplayed(WebElement element)
    {
        try
        {
            wait.until(
                    ExpectedConditions.visibilityOf(
                            element));

            if(element.isDisplayed())
            {
                click(
                        element);

                return true;
            }
        }
        catch(Exception ignored)
        {

        }

        return false;
    }

    /**
     * Get Element Content
     */
    public String getElementContent(WebElement element)
    {
        wait.until(
                ExpectedConditions.visibilityOf(element));

        return element.getDomProperty("innerHTML");
    }

    /**
     * Scroll To Web Element
     */
    public void scrollToElement(WebElement element)
    {
        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView(true);",
                        element);

        log.info(
                "Scrolled To Element");
    }

    /**
     * Scroll Up To Element
     */
    public void scrollUpToElement(WebElement element)
    {
        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'start', inline:'nearest'});",
                        element);

        log.info(
                "Scrolled Up To Element");
    }


    /**
     * Perform JavaScript Click
     */
    public void jsClick(WebElement element)
    {
        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        element);

        log.info(
                "JavaScript Click Performed");
    }

    /**
     * Refresh Current Page
     */
    public void refreshPage()
    {
        driver.navigate()
                .refresh();

        log.info(
                "Page Refreshed");
    }

    /**
     * Navigate Back
     */
    public void navigateBack()
    {
        driver.navigate()
                .back();

        log.info(
                "Navigated Back");
    }

    /**
     * Navigate Forward
     */
    public void navigateForward()
    {
        driver.navigate()
                .forward();

        log.info(
                "Navigated Forward");
    }

    /**
     * Get Current URL
     */
    public String getCurrentUrl()
    {
        return driver.getCurrentUrl();
    }

    /**
     * Get Current Page Title
     */
    public String getPageTitle()
    {
        return driver.getTitle();
    }

    /**
     * Perform Explicit Wait
     */
    public void explicitWait(int seconds)
    {
        try
        {
            Thread.sleep(
                    seconds * 1000L);
        }
        catch(InterruptedException e)
        {
            Thread.currentThread()
                    .interrupt();
        }
    }

    /**
     * Wait Until Page Is Fully Loaded
     */
    public void waitForPageLoad()
    {
        new WebDriverWait(
                driver,
                Duration.ofSeconds(30))
                .until(
                        webDriver ->
                                ((JavascriptExecutor) webDriver)
                                        .executeScript(
                                                "return document.readyState")
                                        .equals(
                                                "complete"));

        log.info(
                "Page Loaded Successfully");
    }

    /**
     * Press Any Keyboard Key
     */
    public void pressKey(Keys key)
    {
        driver.switchTo()
                .activeElement()
                .sendKeys(
                        key);

        log.info(
                "Pressed Key : {}",
                key);
    }

    /**
     * Press Any Keyboard Key On Web Element
     */
    public void pressKey(WebElement element, Keys key)
    {
        wait.until(
                ExpectedConditions.visibilityOf(
                        element));

        element.sendKeys(
                key);

        log.info(
                "Pressed Key : {}",
                key);
    }


    /**
     * Type Text Using Keyboard
     */
    public void typeUsingKeyboard(String text)
    {
        WebElement activeElement =
                driver.switchTo()
                        .activeElement();

        wait.until(
                ExpectedConditions.visibilityOf(
                        activeElement));

        activeElement.sendKeys(
                text);

        log.info(
                "Typed Using Keyboard : {}",
                text);
    }


    /**
     * Save Element Value To File
     */
    public void saveElementValueToFile(
            WebElement element,
            String fileName)
    {
        try
        {
            wait.until(
                    ExpectedConditions.visibilityOf(element));

            String value =
                    element.getAttribute("value");

            File folder =
                    new File("src/main/resources/model-numbers");

            if(!folder.exists())
            {
                folder.mkdirs();
            }

            File file =
                    new File(folder, fileName + ".txt");

            Files.writeString(
                    file.toPath(),
                    value,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            log.info(
                    "Element Value '{}' Saved To {}",
                    value,
                    file.getAbsolutePath());
        }
        catch (Exception e)
        {
            throw new RuntimeException(
                    "Failed To Save Element Value",
                    e);
        }
    }

    /**
     * Read Value From Available File And Type
     */
    public void typeValueFromFile(WebElement element)
    {
        try
        {
            wait.until(
                    ExpectedConditions.visibilityOf(
                            element));

            File folder =
                    new File(
                            "src/main/resources/model-numbers");

            File[] files =
                    folder.listFiles(
                            (dir, name) ->
                                    name.toLowerCase().endsWith(".txt"));

            if(files == null || files.length == 0)
            {
                throw new RuntimeException(
                        "No Text File Found In model-numbers Folder");
            }

            File file =
                    files[0];

            String value =
                    Files.readString(
                                    file.toPath())
                            .trim();

            element.clear();

            element.sendKeys(
                    value);

            log.info(
                    "Typed Value From File : {}",
                    file.getName());
        }
        catch(Exception e)
        {
            throw new RuntimeException(
                    "Failed To Read Value From File",
                    e);
        }
    }

    /**
     * Verify Element Text With Saved File
     */
    public boolean verifyElementTextFromFile(WebElement element)
    {
        try
        {
            wait.until(
                    ExpectedConditions.visibilityOf(
                            element));

            File folder =
                    new File(
                            "src/main/resources/model-numbers");

            File[] files =
                    folder.listFiles(
                            (dir, name) ->
                                    name.toLowerCase().endsWith(".txt"));

            if(files == null || files.length == 0)
            {
                throw new RuntimeException(
                        "No Text File Found");
            }

            String expectedValue =
                    Files.readString(
                                    files[0].toPath())
                            .trim();

            String actualValue =
                    element.getText()
                            .trim();

            boolean result =
                    expectedValue.equals(
                            actualValue);

            log.info(
                    "Expected : {}",
                    expectedValue);

            log.info(
                    "Actual : {}",
                    actualValue);

            return result;
        }
        catch(Exception e)
        {
            throw new RuntimeException(
                    "Failed To Verify Element Text",
                    e);
        }
    }

    /**
     * Drag Panel Edge Horizontally Using Pointer Events
     */
    public void dragPanelRight(WebElement resizeHandle, int xOffset)
    {
        long start =
                System.currentTimeMillis();

        wait.until(
                ExpectedConditions.visibilityOf(
                        resizeHandle));

        Rectangle rect =
                resizeHandle.getRect();

        int startX =
                rect.getX()
                        + (rect.getWidth() / 2);

        int startY =
                rect.getY()
                        + (rect.getHeight() / 2);

        PointerInput mouse =
                new PointerInput(
                        PointerInput.Kind.MOUSE,
                        "mouse");

        Sequence drag =
                new Sequence(
                        mouse,
                        1);

        drag.addAction(
                mouse.createPointerMove(
                        Duration.ZERO,
                        PointerInput.Origin.viewport(),
                        startX,
                        startY));

        drag.addAction(
                mouse.createPointerDown(
                        PointerInput.MouseButton.LEFT.asArg()));

        drag.addAction(
                mouse.createPointerMove(
                        Duration.ofMillis(800),
                        PointerInput.Origin.viewport(),
                        startX + xOffset,
                        startY));

        drag.addAction(
                mouse.createPointerUp(
                        PointerInput.MouseButton.LEFT.asArg()));

        ((RemoteWebDriver) driver).perform(
                List.of(drag));

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "dragPanelRight",
                resizeHandle.toString(),
                "DRAG_ACTION",
                end - start);

        log.info(
                "Panel Resized By {} Pixels",
                xOffset);
    }

    /**
     * Scroll Container Horizontally
     */
    public void scrollHorizontally(WebElement container, int pixels)
    {
        long start =
                System.currentTimeMillis();

        wait.until(
                ExpectedConditions.visibilityOf(
                        container));

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollLeft += arguments[1];",
                        container,
                        pixels);

        long end =
                System.currentTimeMillis();

        WebPerformanceLogger.log(
                WebBaseTest.testName.get(),
                "scrollHorizontally",
                container.toString(),
                "SCROLL_ACTION",
                end - start);

        log.info(
                "Scrolled Horizontally By {} Pixels",
                pixels);
    }

    /**
     * Click Menu/Dropdown Option By Visible Text
     */
    public void clickMenuOption(WebElement menu, String option)
    {
        // Open Menu/Dropdown
        click(menu);

        // Click Option
        WebElement menuOption = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(String.format(
                                "//*[normalize-space()='%s']",
                                option))));

        menuOption.click();

        log.info("Clicked Menu Option : {}", option);
    }

    /**
     * Verify Status Is Displayed In Row
     */
    public boolean verifyStatus(WebElement row, String expectedStatus)
    {
        try
        {
            WebElement status = row.findElement(
                    By.xpath(String.format(
                            ".//*[normalize-space()='%s']",
                            expectedStatus)));

            wait.until(
                    ExpectedConditions.visibilityOf(status));

            log.info(
                    "Verified Status : {}",
                    expectedStatus);

            return status.isDisplayed();
        }
        catch (Exception e)
        {
            log.error(
                    "Status '{}' not found.",
                    expectedStatus);

            return false;
        }
    }

    /**
     * Open Menu And Select Option
     */
    public void selectMenuOption(WebElement menu, String option)
    {
        try
        {
            log.info("====================================");
            log.info("Opening Dropdown");

            click(menu);

            log.info("Dropdown Opened");

            WebElement dropdown = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[contains(@class,'overflow-auto')]")));

            log.info("Dropdown Found");

            List<WebElement> options =
                    dropdown.findElements(By.tagName("button"));

            log.info("Total Options Found : {}", options.size());

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            log.info("Checking Option : {}", option);

            for (WebElement element : options)
            {
                String text = element.getText().trim();



                if(text.equalsIgnoreCase(option))
                {
                    log.info("Matching Option Found : {}", text);

                    js.executeScript(
                            "arguments[0].scrollIntoView({block:'center'});",
                            element);

                    wait.until(
                            ExpectedConditions.elementToBeClickable(element));

                    try
                    {
                        element.click();
                    }
                    catch (Exception e)
                    {
                        log.info("Normal Click Failed. Using JavaScript Click.");

                        js.executeScript(
                                "arguments[0].click();",
                                element);
                    }

                    log.info("Successfully Selected : {}", option);

                    wait.until(
                            ExpectedConditions.invisibilityOf(dropdown));

                    log.info("Dropdown Closed");
                    log.info("====================================");

                    return;
                }
            }

            log.error("Option Not Found : {}", option);

            throw new RuntimeException(
                    "Menu Option Not Found : " + option);
        }
        catch (Exception e)
        {
            log.error("Failed To Select Menu Option : {}", option, e);
            throw e;
        }
    }


    /**
     * Get Table Text
     */
    public String getTableText(WebElement table)
    {
        wait.until(ExpectedConditions.visibilityOf(table));
        return table.getText().trim();
    }

    /**
     * Verify Table Changed
     */
    public void verifyTableChanged(String before, String after)
    {
        if(before.equals(after))
        {
            throw new AssertionError(
                    "Table content did not change after clicking Next.");
        }

        log.info("Table content changed successfully.");
    }




    /**
     * Drag Element Using Native Mouse Events
     */
    public void dragUsingRobot(WebElement source, WebElement target)
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOf(source));
            wait.until(ExpectedConditions.visibilityOf(target));

            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].scrollIntoView({block:'center',inline:'center'});",
                    source);

            js.executeScript(
                    "arguments[0].scrollIntoView({block:'center',inline:'center'});",
                    target);

            Thread.sleep(500);

            Rectangle s = source.getRect();
            Rectangle t = target.getRect();

            int startX = s.getX() + (s.getWidth() / 2);
            int startY = s.getY() + (s.getHeight() / 2);

            // Drop near the center of the target column
            int endX = t.getX() + (t.getWidth() / 2);
            int endY = t.getY() + 120;

            // Browser position on the desktop
            org.openqa.selenium.Point window = driver.manage().window().getPosition();

            int browserX = window.getX();
            int browserY = window.getY();

            // Approximate browser chrome height
            int titleBar = 90;

            Robot robot = new Robot();
            robot.setAutoDelay(20);

            int screenStartX = browserX + startX;
            int screenStartY = browserY + titleBar + startY;

            int screenEndX = browserX + endX;
            int screenEndY = browserY + titleBar + endY;

            System.out.println("Screen Start : " + screenStartX + "," + screenStartY);
            System.out.println("Screen End   : " + screenEndX + "," + screenEndY);

            robot.mouseMove(screenStartX, screenStartY);
            robot.delay(300);

            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(500);

            // Smooth drag
            int steps = 40;

            for (int i = 1; i <= steps; i++)
            {
                int x = screenStartX + ((screenEndX - screenStartX) * i / steps);
                int y = screenStartY + ((screenEndY - screenStartY) * i / steps);

                robot.mouseMove(x, y);
                robot.delay(15);
            }

            robot.delay(500);

            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            System.out.println("Drag Completed");
        }
        catch (Exception e)
        {
            throw new RuntimeException("Robot Drag Failed", e);
        }
    }

    /**
     * Upload File
     */
    public void uploadFile(WebElement fileInput, String filePath)
    {
        try
        {
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.cssSelector("input[type='file']")));

            fileInput.sendKeys(
                    new File(filePath).getAbsolutePath());

            log.info(
                    "File Uploaded Successfully : {}",
                    filePath);
        }
        catch (Exception e)
        {
            log.error(
                    "Failed To Upload File : {}",
                    filePath,
                    e);

            throw new RuntimeException(
                    "Failed To Upload File",
                    e);
        }
    }

    /**
     * Upload Multiple Files From Folder
     */
    public void uploadMultipleFiles(WebElement fileInput, String folderPath)
    {
        try
        {
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.cssSelector("input[type='file']")));

            File folder =
                    new File(folderPath);

            if(!folder.exists() || !folder.isDirectory())
            {
                throw new RuntimeException(
                        "Invalid Folder : " + folderPath);
            }

            File[] files =
                    folder.listFiles(File::isFile);

            if(files == null || files.length == 0)
            {
                throw new RuntimeException(
                        "No Files Found In Folder : " + folderPath);
            }

            StringBuilder paths =
                    new StringBuilder();

            for(File file : files)
            {
                paths.append(file.getAbsolutePath())
                        .append("\n");
            }

            fileInput.sendKeys(
                    paths.toString().trim());

            log.info(
                    "{} Files Uploaded Successfully From {}",
                    files.length,
                    folderPath);
        }
        catch (Exception e)
        {
            log.error(
                    "Failed To Upload Files From {}",
                    folderPath,
                    e);

            throw new RuntimeException(
                    "Failed To Upload Multiple Files",
                    e);
        }
    }

    /**
     * Get Next Collection Name
     */
    public String getNextCollectionName(WebElement container, String baseName)
    {
        try
        {
            wait.until(
                    ExpectedConditions.visibilityOf(container));

            String text =
                    container.getText();

            Pattern pattern =
                    Pattern.compile("\\b" + Pattern.quote(baseName) + "(?:-(\\d+))?\\b");

            Matcher matcher =
                    pattern.matcher(text);

            boolean baseExists = false;
            int highestNumber = 0;

            while(matcher.find())
            {
                baseExists = true;

                String number =
                        matcher.group(1);

                if(number != null)
                {
                    highestNumber =
                            Math.max(
                                    highestNumber,
                                    Integer.parseInt(number));
                }
            }

            if(!baseExists)
            {
                log.info(
                        "Collection '{}' Does Not Exist",
                        baseName);

                return baseName;
            }

            String nextCollection =
                    baseName + "-" + (highestNumber + 1);

            log.info(
                    "Next Collection Name : {}",
                    nextCollection);

            return nextCollection;
        }
        catch(Exception e)
        {
            throw new RuntimeException(
                    "Failed To Get Next Collection Name",
                    e);
        }
    }

    /**
     * Verify Element Content Changed
     */
    public boolean verifyContentChanged(WebElement element, String previousContent)
    {
        try
        {
            wait.until(driver ->
                    !element.getDomProperty("innerHTML")
                            .equals(previousContent));

            log.info("Element Content Changed");

            return true;
        }
        catch (Exception e)
        {
            log.error("Element Content Did Not Change");

            return false;
        }
    }

    /**
     * Hover Over the Element and click it
     */
    public boolean hoverAndClick(WebElement parent,WebElement button)
    {
        try
        {
            new Actions(driver)
                    .moveToElement(parent)
                    .perform();

            wait.until(ExpectedConditions.elementToBeClickable(button));

            button.click();

            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
