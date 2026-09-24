package core.controller.mobile;

import base.mobile.MobileBaseTest;
import com.aventstack.extentreports.ExtentTest;
import core.listeners.mobile.TestListener;
import core.utils.ComparisonMetricsUtil;
import core.utils.PerformanceUtil;
import core.utils.TextFileUtil;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.remote.SupportsContextSwitching;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileUIController implements UIController
{
    // Cached Screen Text
    private String cachedScreenText = "";

    // Appium Driver Instance
    private AppiumDriver driver;

    // Explicit Wait
    private WebDriverWait wait;

    // Framework Logger
    private static final Logger log = LogManager.getLogger(MobileUIController.class);

    /**
     * Initialize Mobile UI Controller
     */
    public MobileUIController(AppiumDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Get Context Switching Driver
     */
    private SupportsContextSwitching getContextDriver()
    {
        return (SupportsContextSwitching) driver;
    }

    /**
     * Get Readable Element Name
     */
    private String getElementName(WebElement element)
    {
        try
        {
            String text = element.getText();
            if(text != null && !text.isEmpty())
            {
                return text;
            }

            String desc = element.getAttribute("content-desc");
            if(desc != null && !desc.isEmpty())
            {
                return desc;
            }

            String id = element.getAttribute("resource-id");
            if(id != null && !id.isEmpty())
            {
                return id;
            }
        }
        catch(Exception e)
        {

        }

        return "UNKNOWN_ELEMENT";
    }

    /**
     * Tap Element
     */
    @Override
    public void tap(WebElement element)
    {
        String method = "tap";
        String elementName = getElementName(element);
        String testName = MobileBaseTest.testName.get();

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> {
                },
                () -> element.click(),
                "TAP_ACTION"
        );

        log.info("Tapped on element");
    }


    /**
     * Enter Text
     */
    @Override
    public void type(WebElement element, String text)
    {
        String method = "type";
        String elementName = getElementName(element);
        String testName = MobileBaseTest.testName.get();

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> {
                },
                () -> {
                    element.clear();
                    element.sendKeys(text);
                },
                "TYPE_ACTION"
        );

        log.info("Text entered successfully");
    }

    /**
     * Wait And Tap Element
     */
    @Override
    public void waitAndTap(WebElement element)
    {
        String method = "waitAndTap";
        String elementName = getElementName(element);
        String testName = MobileBaseTest.testName.get();

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> wait.until(
                        ExpectedConditions.visibilityOf(element)
                ),
                () -> element.click(),
                "TAP_ACTION"
        );

        log.info("Tapped after wait: {}", elementName);
    }

    /**
     * Wait And Enter Text
     */
    @Override
    public void waitAndType(WebElement element, String text)
    {
        String method = "waitAndType";
        String elementName = getElementName(element);
        String testName = MobileBaseTest.testName.get();

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> wait.until(
                        ExpectedConditions.visibilityOf(element)
                ),
                () -> {
                    element.clear();
                    element.sendKeys(text);
                },
                "TYPE_ACTION"
        );

        log.info("Typed after wait: {}", text);
    }


    /**
     * Switch To WebView Context
     */
    @Override
    public void switchToWebView()
    {
        log.info("Attempting to switch to WEBVIEW context");

        for(String context : getContextDriver().getContextHandles())
        {
            log.info("Available Context: {}", context);

            if(context.toLowerCase().contains("webview"))
            {
                getContextDriver().context(context);

                log.info("Switched to WEBVIEW: {}", context);

                return;
            }
        }

        throw new RuntimeException(
                "WEBVIEW context not found");
    }

    /**
     * Switch To Native Context
     */
    @Override
    public void switchToNative()
    {
        log.info("Switching back to NATIVE_APP");

        getContextDriver().context("NATIVE_APP");

        log.info("Switched to NATIVE_APP");
    }



    /**
     * Switch Back To Application
     */
    public void switchBackToApp()
    {
        String platform =
                driver.getCapabilities()
                        .getPlatformName()
                        .toString();

        InteractsWithApps appDriver =
                (InteractsWithApps) driver;

        if(platform.equalsIgnoreCase("Android"))
        {
            appDriver.activateApp("com.xsol.mobile");
        }
        else if(platform.equalsIgnoreCase("iOS"))
        {
            appDriver.activateApp("com.xsol.mobile.internal");
        }
    }



    /**
     * Drag Element
     */
    @Override
    public void dragElement(WebElement source, int endX, int endY)
    {
        String method = "dragElement";
        String elementName = getElementName(source);
        String testName = MobileBaseTest.testName.get();

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> wait.until(
                        ExpectedConditions.visibilityOf(source)
                ),
                () -> ((JavascriptExecutor) driver).executeScript(
                        "mobile: dragGesture",
                        ImmutableMap.of(
                                "element",
                                ((RemoteWebElement) source).getId(),
                                "endX",
                                endX,
                                "endY",
                                endY
                        )
                ),
                "DRAG_ACTION"
        );

        log.info("Drag gesture completed");
    }

    /**
     * Verify Exact Text
     */
    @Override
    public boolean verifyText(WebElement element, String expectedText)
    {
        String method = "verifyText";
        String elementName = getElementName(element);
        String testName = MobileBaseTest.testName.get();

        final boolean[] result = {false};

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> wait.until(
                        ExpectedConditions.visibilityOf(element)
                ),
                () ->
                {
                    String actualText = element.getText();

                    if(actualText.equals(expectedText))
                    {
                        log.info("Text verification passed");
                        log.info("Expected: {}", expectedText);
                        log.info("Actual: {}", actualText);

                        result[0] = true;
                    }
                    else
                    {
                        log.error("Text verification failed");
                        log.error("Expected: {}", expectedText);
                        log.error("Actual: {}", actualText);

                        throw new AssertionError(
                                "Expected text: "
                                        + expectedText
                                        + " but found: "
                                        + actualText);
                    }
                },
                "VERIFY_TEXT_ACTION"
        );

        return result[0];
    }

    /**
     * Verify Partial Text
     */
    @Override
    public boolean verifyContainsText(WebElement element, String expectedText)
    {
        String method = "verifyContainsText";
        String elementName = getElementName(element);
        String testName = MobileBaseTest.testName.get();

        final boolean[] result = {false};

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> wait.until(
                        ExpectedConditions.visibilityOf(element)
                ),
                () -> {
                    String actualText = element.getText();

                    if(actualText.contains(expectedText))
                    {
                        log.info("Partial text verification passed");
                        log.info("Expected Text: {}", expectedText);
                        log.info("Actual Text: {}", actualText);

                        result[0] = true;
                    }
                    else
                    {
                        log.error("Partial text verification failed");
                        log.error("Expected Text: {}", expectedText);
                        log.error("Actual Text: {}", actualText);

                        throw new AssertionError(
                                "Expected partial text: "
                                        + expectedText
                                        + " but found: "
                                        + actualText
                        );
                    }
                },
                "VERIFY_CONTAINS_TEXT_ACTION"
        );

        return result[0];
    }

    /**
     * Verify Element Displayed
     */
    @Override
    public boolean verifyElementDisplayed(WebElement element)
    {
        String method = "verifyElementDisplayed";
        String elementName = getElementName(element);
        String testName = MobileBaseTest.testName.get();

        final boolean[] result = {false};

        PerformanceUtil.measureAndLog(
                testName,
                method,
                elementName,
                () -> wait.until(
                        ExpectedConditions.visibilityOf(element)
                ),
                () -> {
                    if(element.isDisplayed())
                    {
                        log.info("Element is displayed: {}", elementName);
                        result[0] = true;
                    }
                    else
                    {
                        log.error("Element is NOT displayed: {}", elementName);

                        throw new AssertionError(
                                "Element not displayed: " + elementName);
                    }
                },
                "VERIFY_ELEMENT_DISPLAYED_ACTION"
        );

        return result[0];
    }

    /**
     * Click Element If Displayed
     */
    @Override
    public boolean clickIfDisplayed(WebElement element)
    {
        try
        {
            if(element.isDisplayed() && element.isEnabled())
            {
                element.click();
                return true;
            }
        }
        catch(Exception ignored)
        {
        }

        return false;
    }

    /**
     * Explicit Wait
     */
    public void explicitWait(int seconds)
    {
        try
        {
            new WebDriverWait(
                    driver,
                    Duration.ofSeconds(seconds))
                    .until(driver -> false);
        }
        catch(Exception ignored)
        {

        }
    }

    /**
     * Tap On Element Using X,Y Coordinates
     */
    public void tapOnElement(int x, int y)
    {
        PointerInput finger =
                new PointerInput(
                        PointerInput.Kind.TOUCH,
                        "finger");

        Sequence tap =
                new Sequence(
                        finger,
                        1);

        tap.addAction(
                finger.createPointerMove(
                        Duration.ofMillis(0),
                        PointerInput.Origin.viewport(),
                        x,
                        y));

        tap.addAction(
                finger.createPointerDown(
                        PointerInput.MouseButton.LEFT.asArg()));

        tap.addAction(
                new Pause(
                        finger,
                        Duration.ofMillis(100)));

        tap.addAction(
                finger.createPointerUp(
                        PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(
                Arrays.asList(tap));
    }

    /**
     * Tap On Element Using Fallback Coordinates
     */
    public void tapOnElementWithFallback(
            int x1,
            int y1,
            int x2,
            int y2)
    {
        try
        {
            tapOnElement(
                    x1,
                    y1);
        }
        catch(Exception e)
        {
            tapOnElement(
                    x2,
                    y2);
        }
    }

    /**
     * Tap On Element With Zoom Handling
     */
    public void tapOnElementWithFallbackAndZoomHandling(
            int firstX,
            int firstY,
            int secondX,
            int secondY,
            int zoomOutX,
            int zoomOutY)
    {
        try
        {
            // Capture screen before first tap
            String beforeSource =
                    driver.getPageSource();

            // Tap first coordinate
            tapOnElement(
                    firstX,
                    firstY);

            Thread.sleep(1000);

            // Capture screen after first tap
            String afterSource =
                    driver.getPageSource();

            // Check whether screen changed (zoom)
            if(!beforeSource.equals(afterSource))
            {
                log.info(
                        "Screen Zoom Detected. Performing Zoom Out");

                tapOnElement(
                        zoomOutX,
                        zoomOutY);

                Thread.sleep(1000);

                log.info(
                        "Zoom Out Completed");
            }

            // Tap actual target coordinate
            tapOnElement(
                    secondX,
                    secondY);

            log.info(
                    "Tapped Target Coordinate ({}, {})",
                    secondX,
                    secondY);
        }
        catch(Exception e)
        {
            throw new RuntimeException(
                    "Failed During Zoom Handling Flow",
                    e);
        }
    }

    /**
     * Execute Platform Specific Action
     */
    public void performBasedOnPlatform(Runnable androidAction, Runnable iosAction)
    {
        String platform =
                driver.getCapabilities()
                        .getPlatformName()
                        .toString();

        if(platform.equalsIgnoreCase("Android"))
        {
            androidAction.run();
        }
        else if(platform.equalsIgnoreCase("iOS"))
        {
            iosAction.run();
        }
    }

    /**
     * Execute Action Only On Android
     */
    public void performOnAndroid(Runnable androidAction)
    {
        String platform =
                driver.getCapabilities()
                        .getPlatformName()
                        .toString();

        if(platform.equalsIgnoreCase("Android"))
        {
            androidAction.run();
        }
    }

    /**
     * Scroll To Specific Text
     */
    @Override
    public void scrollToText(String text)
    {
        try
        {
            // Android Scroll
            if(isAndroid())
            {
                driver.findElement(
                        AppiumBy.androidUIAutomator(
                                "new UiScrollable(new UiSelector().scrollable(true))"
                                        + ".scrollIntoView(text(\""
                                        + text
                                        + "\"))"));

                log.info(
                        "Scrolled To Text : {}",
                        text);
            }

            // iOS Scroll
            else
            {
                String predicate =
                        "label CONTAINS '" + text + "' "
                                + "OR name CONTAINS '" + text + "' "
                                + "OR value CONTAINS '" + text + "'";

                try
                {
                    ((JavascriptExecutor) driver)
                            .executeScript(
                                    "mobile: scroll",
                                    ImmutableMap.of(
                                            "predicateString",
                                            predicate,
                                            "toVisible",
                                            true));

                    waitForTextElements();

                    List<WebElement> elements =
                            driver.findElements(
                                    AppiumBy.iOSNsPredicateString(
                                            predicate));

                    if(elements.isEmpty())
                    {
                        throw new RuntimeException("Text Not Found : " + text);
                    }

                    log.info("Found Text : {}", text);
                }
                catch(Exception e)
                {
                    log.error("Unable To Find Text : {}", text, e);
                    throw new RuntimeException("Text Not Found : " + text, e);
                }
            }
        }
        catch(Exception e)
        {
            log.error("Failed Scrolling To Text : {}", text, e);
            throw e;
        }
    }

    /**
     * Scroll To Bottom Of Screen
     */
    @Override
    public void scrollToBottom()
    {
        try
        {
            waitForTextElements();

            // Android Scroll
            if(isAndroid())
            {
                driver.findElement(
                        AppiumBy.androidUIAutomator(
                                "new UiScrollable(new UiSelector().scrollable(true))"
                                        + ".scrollToEnd(10)"));

                log.info("Scrolled To Bottom On Android");
            }

            // iOS Scroll
            else
            {
                for(int i = 0; i < 1; i++)
                {
                    ((JavascriptExecutor) driver)
                            .executeScript(
                                    "mobile: scroll",
                                    ImmutableMap.of(
                                            "direction",
                                            "down"));

                    Thread.sleep(500);
                }

                log.info("Scrolled To Bottom On iOS");
            }
        }
        catch(Exception e)
        {
            log.error("Failed To Scroll To Bottom", e);

            throw new RuntimeException("Unable To Scroll To Bottom", e);
        }
    }


    /**
     * Scroll To Top Of Screen
     */
    public void scrollToTop()
    {
        try
        {
            waitForTextElements();

            // Android Scroll
            if(isAndroid())
            {
                driver.findElement(
                        AppiumBy.androidUIAutomator(
                                "new UiScrollable(new UiSelector().scrollable(true))"
                                        + ".scrollToBeginning(10)"));

                log.info("Scrolled To Top On Android");
            }

            // iOS Scroll
            else
            {
                for(int i = 0; i < 1; i++)
                {
                    ((JavascriptExecutor) driver)
                            .executeScript(
                                    "mobile: scroll",
                                    ImmutableMap.of(
                                            "direction",
                                            "up"));

                    Thread.sleep(500);
                }

                log.info("Scrolled To Top On iOS");
            }
        }
        catch(Exception e)
        {
            log.error("Failed To Scroll To Top", e);

            throw new RuntimeException("Unable To Scroll To Top", e);
        }
    }



    /**
     * Normalize Text For Comparison
     */
    private String normalizeText(String text)
    {
        return text.toLowerCase()

                .replaceAll(
                        "[\\uE000-\\uF8FF]",
                        " ")

                .replaceAll(
                        "[•▪●◆■▶►]",
                        " ")

                .replaceAll(
                        "[^a-z0-9\\s]",
                        " ")

                .replaceAll(
                        "\\s+",
                        " ")

                .trim();
    }

    /**
     * Calculate Similarity Score
     */
    private double calculateSimilarityScore(String expected, String actual)
    {
        Set<String> expectedWords =
                new LinkedHashSet<>(
                        Arrays.asList(
                                expected.split("\\s+")));

        Set<String> actualWords =
                new LinkedHashSet<>(
                        Arrays.asList(
                                actual.split("\\s+")));

        if(expectedWords.isEmpty())
        {
            return 0;
        }

        int matchedWords = 0;

        for(String word : expectedWords)
        {
            if(actualWords.contains(word))
            {
                matchedWords++;
            }
        }

        return ((double) matchedWords
                / expectedWords.size())
                * 100;
    }

    /**
     * Perform Keyword Match
     */
    private boolean keywordMatch(String expected, String actual)
    {
        String[] importantWords = expected.split("\\s+");
        int matched = 0;
        int totalKeywords = 0;

        for(String word : importantWords)
        {
            if(word.length() <= 2)
            {
                continue;
            }

            totalKeywords++;

            if(actual.contains(word))
            {
                matched++;
            }
        }

        if(totalKeywords == 0)
        {
            return false;
        }

        double keywordPercentage =
                ((double) matched
                        / totalKeywords)
                        * 100;

        log.info("Keyword Match Score: {}%", keywordPercentage);
        return keywordPercentage >= 70;
    }

    /**
     * Wait For Text Elements To Load
     */
    private void waitForTextElements()
    {
        try
        {
            new WebDriverWait(
                    driver,
                    Duration.ofSeconds(2))
                    .until(driver -> false);
        }
        catch(Exception ignored)
        {

        }
    }

    /**
     * Get All Scrollable Texts From Current Screen
     */
    @Override
    public List<String> getAllScrollableTexts()
    {
        waitForTextElements();

        Set<String> uniqueTexts =
                new LinkedHashSet<>();

        try
        {
            // Extract Initial Screen Text
            extractTexts(uniqueTexts);

            // Android Scroll
            if(isAndroid())
            {
                boolean canScroll = true;

                while(canScroll)
                {
                    canScroll =
                            (Boolean)
                                    ((JavascriptExecutor) driver)
                                            .executeScript(
                                                    "mobile: scrollGesture",
                                                    ImmutableMap.of(
                                                            "left", 350,
                                                            "top", 600,
                                                            "width", 100,
                                                            "height", 600,
                                                            "direction", "down",
                                                            "percent", 1.0));

                    waitForTextElements();
                    extractTexts(uniqueTexts);
                }
            }

            // iOS Scroll
            else
            {
                int maxScrolls = 10;

                for(int i = 0; i < maxScrolls; i++)
                {
                    int beforeSwipeCount = uniqueTexts.size();
                    try
                    {
                        ((JavascriptExecutor) driver)
                                .executeScript(
                                        "mobile: swipe",
                                        ImmutableMap.of(
                                                "direction",
                                                "up"));

                        waitForTextElements();
                    }
                    catch(Exception e)
                    {
                        log.info("Unable To Swipe Further");
                        break;
                    }

                    extractTexts(uniqueTexts);

                    int afterSwipeCount = uniqueTexts.size();
                    // Stop When No New Text Is Found
                    if(beforeSwipeCount == afterSwipeCount)
                    {
                        log.info("No More New Content Found");
                        break;
                    }
                }
            }
        }
        catch(Exception e)
        {
            log.error("Failed Extracting Text", e);
        }

        return new ArrayList<>(uniqueTexts);
    }

    /**
     * Extract Text From Current Page Source
     */
    private void extractTexts(Set<String> uniqueTexts)
    {
        String pageSource = driver.getPageSource();
        String[] patterns =
                {
                        "text=\"([^\"]*)\"",
                        "content-desc=\"([^\"]*)\"",
                        "label=\"([^\"]*)\"",
                        "name=\"([^\"]*)\"",
                        "value=\"([^\"]*)\""
                };

        for(String regex : patterns)
        {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(pageSource);

            while(matcher.find())
            {
                String text = matcher.group(1);
                addIfValid(uniqueTexts, text);
            }
        }
    }

    /**
     * Add Valid Text To Collection
     */
    private void addIfValid(Set<String> uniqueTexts, String text)
    {
        if(text == null)
        {
            return;
        }

        text = normalizeText(text);

        if(text.isEmpty())
        {
            return;
        }
        uniqueTexts.add(text);
    }

    /**
     * Check Whether Platform Is Android
     */
    private boolean isAndroid()
    {
        return driver.getCapabilities().getPlatformName().toString().equalsIgnoreCase("Android");
    }

    /**
     * Check Whether Platform Is iOS
     */
    private boolean isIOS()
    {
        return driver.getCapabilities().getPlatformName().toString().equalsIgnoreCase("iOS");
    }

    /**
     * Print All Scrollable Texts
     */
    @Override
    public void printAllScrollableTexts()
    {
        String fullText = getFullScreenText();
        log.info("==================================");
        log.info("SCROLLABLE SCREEN TEXT");
        log.info("==================================");

        log.info(fullText);
    }

    /**
     * Get Full Screen Text
     */
    @Override
    public String getFullScreenText()
    {
        List<String> allTexts = getAllScrollableTexts();
        cachedScreenText = String.join(" ", allTexts);
        return cachedScreenText;
    }

    /**
     * Verify Expected Text Exists On Screen
     */
    @Override
    public boolean verifyTextOnScreen(String expectedText)
    {
        String actualText = normalizeText(cachedScreenText);
        expectedText = normalizeText(expectedText);
        double similarity = calculateSimilarityScore(expectedText, actualText);
        boolean keywordResult = keywordMatch(expectedText, actualText);

        log.info("Similarity Score: {}%", similarity);
        log.info("Keyword Match Result: {}", keywordResult);

        boolean result = similarity >= 80 || keywordResult;

        if(result)
        {
            log.info("SCREEN TEXT FOUND");
        }
        else
        {
            log.error("SCREEN TEXT NOT FOUND");
        }

        return result;
    }


    /**
     * Compare Screen Text With Expected File
     */
    @Override
    public boolean compareScreenWithFile(String fileName)
    {
        String expectedText = normalizeText(TextFileUtil.readTextFile(fileName));
        String actualText = normalizeText(cachedScreenText);
        double similarity = calculateSimilarityScore(expectedText, actualText);
        ComparisonMetricsUtil.addSimilarity(similarity);
        boolean keywordResult = keywordMatch(expectedText, actualText);
        log.info("Similarity Score: {}%", similarity);
        log.info("Keyword Match Result: {}", keywordResult);
        boolean result = similarity >= 80 || keywordResult;

        ExtentTest extentTest = TestListener.getTest();

    /*
    if(extentTest != null)
    {
        extentTest.info(
                "Similarity Score : "
                        + String.format(
                        "%.2f",
                        similarity)
                        + "%");

        extentTest.info(
                "Keyword Match Result : "
                        + keywordResult);
    }
    */

        if(result)
        {
            log.info("SCREEN TEXT VALIDATION PASSED");
        }
        else
        {
            log.error("SCREEN TEXT VALIDATION FAILED");
        }
        return result;
    }

    /**
     * Get All Text From Current View XML
     */
    @Override
    public List<String> getAllViewXmlTexts()
    {
        waitForTextElements();
        Set<String> uniqueTexts = new LinkedHashSet<>();

        try
        {
            String pageSource = driver.getPageSource();
            String[] patterns =
                    {
                            "text=\"([^\"]*)\"",
                            "content-desc=\"([^\"]*)\"",
                            "label=\"([^\"]*)\"",
                            "name=\"([^\"]*)\"",
                            "value=\"([^\"]*)\""
                    };

            for(String regex : patterns)
            {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(pageSource);
                while(matcher.find())
                {
                    String text = matcher.group(1);
                    addIfValid(uniqueTexts, text);
                }
            }
        }
        catch(Exception e)
        {
            log.error("Failed Extracting XML Text", e);
        }

        return new ArrayList<>(uniqueTexts);
    }

    /**
     * Print All View XML Text
     */
    @Override
    public void printAllViewXmlTexts()
    {
        String fullText = getFullViewXmlText();
        log.info("==================================");
        log.info("VIEW XML TEXT");
        log.info("==================================");
        log.info(fullText);
    }

    /**
     * Get Full View XML Text
     */
    @Override
    public String getFullViewXmlText()
    {
        List<String> allTexts = getAllViewXmlTexts();
        cachedScreenText = String.join(" ", allTexts);
        return cachedScreenText;
    }

    /**
     * Verify Expected Text Exists In View XML
     */
    @Override
    public boolean verifyTextInViewXml(String expectedText)
    {
        String actualText = normalizeText(cachedScreenText);
        expectedText = normalizeText(expectedText);
        double similarity = calculateSimilarityScore(expectedText, actualText);
        boolean keywordResult = keywordMatch(expectedText, actualText);

        log.info("Similarity Score: {}%", similarity);
        log.info("Keyword Match Result: {}", keywordResult);

        boolean result = similarity >= 80 || keywordResult;

        if(result)
        {
            log.info("XML TEXT FOUND");
        }
        else
        {
            log.error("XML TEXT NOT FOUND");
        }

        return result;
    }

    /**
     * Compare View XML Text With Expected File
     */
    @Override
    public boolean compareViewXmlWithFile(String fileName)
    {
        String expectedText = normalizeText(TextFileUtil.readTextFile(fileName));
        String actualText = normalizeText(cachedScreenText);

        double similarity = calculateSimilarityScore(expectedText, actualText);
        ComparisonMetricsUtil.addSimilarity(similarity);
        boolean keywordResult = keywordMatch(expectedText, actualText);
        log.info("Similarity Score: {}%", similarity);
        log.info("Keyword Match Result: {}", keywordResult);
        boolean result = similarity >= 80 || keywordResult;
        if(result)
        {
            log.info("XML VALIDATION PASSED");
        }
        else
        {
            log.error("XML VALIDATION FAILED");
        }
        return result;
    }





}
