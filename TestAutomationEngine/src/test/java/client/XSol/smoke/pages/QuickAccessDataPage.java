package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class QuickAccessDataPage extends MobileBaseTest
{
    public QuickAccessDataPage() {
        initMobileElements(this);

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search Appliance\"]")
    @iOSXCUITFindBy(accessibility = "\uF55F, Search Appliance")
    public WebElement searchApplianceButton;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    public WebElement searchApplianceTextBox;

    @AndroidFindBy( uiAutomator = "new UiSelector().text(\"\uF55F\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"\uF55F\"`]")
    public WebElement searchApplianceButtonSmall;

    @AndroidFindBy(accessibility = "B, British, Gas 330+ Open Vented, 4101911")
    @iOSXCUITFindBy(accessibility = "B, \uF599, British, Gas 330+ Open Vented, 4101911")
    public WebElement Gas330OpenButton;

    @AndroidFindBy( accessibility = "Continue")
    @iOSXCUITFindBy(accessibility = "Continue")
    public WebElement importantNoticeContinueButton;

    @AndroidFindBy( accessibility = "CONTINUE")
    @iOSXCUITFindBy(accessibility = "CONTINUE")
    public WebElement continueButton;



    /* Common Buttons */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF383\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"\uF383\"`]")
    public WebElement homeButton;

    @AndroidFindBy(accessibility = "Return to Home")
    @iOSXCUITFindBy(accessibility = "Return to Home")
    public WebElement returnToHomeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF127\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"\uF127\"`]")
    public WebElement backButton;

    @AndroidFindBy( accessibility = "Select Outcome (5), \uF145")
    @iOSXCUITFindBy( accessibility = "Select Outcome (5), \uF145")
    public WebElement select5OptionButton;

    @AndroidFindBy( accessibility = "Select Outcome (3), \uF145")
    @iOSXCUITFindBy( accessibility = "Select Outcome (3), \uF145")
    public WebElement select3OptionButton;

}
