package core.controller.web;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface WebController
{
    /**
     * Launch Application URL
     */
    void launchApplication(String url);

    /**
     * Click Web Element
     */
    void click(WebElement element);

    /**
     * Enter Text Into Web Element
     */
    void type(WebElement element, String text);

    /**
     * Wait Until Element Is Clickable And Click
     */
    void waitAndClick(WebElement element);

    /**
     * Wait Until Element Is Visible And Enter Text
     */
    void waitAndType(WebElement element,String text);

    /**
     * Get Text From Web Element
     */
    String getText(WebElement element);

    /**
     * Verify Exact Text
     */
    boolean verifyText(WebElement element, String expectedText);

    /**
     * Verify Partial Text
     */
    boolean verifyContainsText(WebElement element, String expectedText);

    /**
     * Verify Element Is Displayed
     */
    boolean verifyElementDisplayed(WebElement element);

    /**
     * Click Element If Displayed
     */
    boolean clickIfDisplayed(WebElement element);

    /**
     * Scroll To Web Element
     */
    void scrollToElement(WebElement element);

    /**
     * Scroll Up To Element
     */
    void scrollUpToElement(WebElement element);


    /**
     * Perform JavaScript Click
     */
    void jsClick(WebElement element);

    /**
     * Refresh Current Page
     */
    void refreshPage();

    /**
     * Navigate Back
     */
    void navigateBack();

    /**
     * Navigate Forward
     */
    void navigateForward();

    /**
     * Get Current URL
     */
    String getCurrentUrl();

    /**
     * Get Current Page Title
     */
    String getPageTitle();

    /**
     * Perform Explicit Wait
     */
    void explicitWait(int seconds);

    /**
     * Wait Until Page Is Fully Loaded
     */
    void waitForPageLoad();

    /**
     * Press Any Keyboard Key
     */
    void pressKey(Keys key);

    /**
     * Press Any Keyboard Key On Web Element
     */
    void pressKey(WebElement element, Keys key);

    /**
     * Type Text Using Keyboard
     */
    void typeUsingKeyboard(String text);

    /**
     * Save Element Value To File
     */
    void saveElementValueToFile(WebElement element, String fileName);

    /**
     * Read Element Value From File And Type
     */
    void typeValueFromFile(WebElement element);

    /**
     * Verify Element Text With Saved File
     */
    boolean verifyElementTextFromFile(WebElement element);

    /**
     * Wait Until Element Is Clickable And Perform JavaScript Click
     */
    void waitAndJsClick(WebElement element);

    /**
     * Drag Panel Edge Horizontally
     */
    void dragPanelRight(WebElement resizeHandle, int xOffset);

    /**
     * Scroll Container Horizontally
     */
    void scrollHorizontally(WebElement container, int pixels);

    /**
     * Click Menu/Dropdown Option By Visible Text
     */
    void clickMenuOption(WebElement menu, String option);

    /**
     * Verify Status Is Displayed In Row
     */
    boolean verifyStatus(WebElement row, String expectedStatus);

    /**
     * Open Menu, Scroll And Select Option
     */
    void selectMenuOption(WebElement menu, String option);

    /**
     * Get Table Text
     */
    String getTableText(WebElement table);

    /**
     * Verify Table Changed
     */
    void verifyTableChanged(String before, String after);

    /**
     * Drag Element Using Native Mouse Events
     */
    void dragUsingRobot(WebElement source, WebElement target);

    /**
     * Upload File
     */
    void uploadFile(WebElement fileInput, String filePath);

    /**
     * Upload Multiple Files From Folder
     */
    void uploadMultipleFiles(WebElement fileInput, String folderPath);

    /**
     * Verify Text Exists And Click It
     */
    void verifyContainsTextAndClick(WebElement container, String expectedText);

    /**
     * Get Next Collection Name
     */
    String getNextCollectionName(WebElement container, String baseName);

    /**
     * Get Element Content
     */
    String getElementContent(WebElement element);

    /**
     * Verify Element Content Changed
     */
    boolean verifyContentChanged(WebElement element, String previousContent);

    /**
     * Hover Over the Element and click it
     */
    boolean hoverAndClick(WebElement parent,WebElement button);


}