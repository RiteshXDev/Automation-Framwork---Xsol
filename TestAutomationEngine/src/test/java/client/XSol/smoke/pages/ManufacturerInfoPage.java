package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ManufacturerInfoPage extends MobileBaseTest
{
    public ManufacturerInfoPage() {
        initMobileElements(this);

    }
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(14)")
    @iOSXCUITFindBy(accessibility = "\uF248, Diagnostics +, System guides & articles")
    public WebElement diagnosticsButton;

    @AndroidFindBy(accessibility = "\uF1C7, Manufacturer Info, Manufacturer-specific guides & settings, \uF23B")
    @iOSXCUITFindBy(accessibility = "\uF1C7, Manufacturer Info, Manufacturer-specific guides & settings, \uF23B")
    public WebElement manufacturerInfoButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"baxi1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Manufacturer Specific Information\"`]/XCUIElementTypeOther[8]/XCUIElementTypeLink/XCUIElementTypeImage")
    public WebElement baxiLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ariston1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Manufacturer Specific Information\"`]/XCUIElementTypeOther[7]/XCUIElementTypeLink/XCUIElementTypeImage")
    public WebElement aristonLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"keston1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Manufacturer Specific Information\"`]/XCUIElementTypeOther[3]/XCUIElementTypeLink/XCUIElementTypeImage")
    public WebElement kestonLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"worcester1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Manufacturer Specific Information\"`]/XCUIElementTypeOther[9]/XCUIElementTypeLink/XCUIElementTypeImage")
    public WebElement worcesterLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"potterton1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Manufacturer Specific Information\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink/XCUIElementTypeImage")
    public WebElement pottertonLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"vaillant2\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Manufacturer Specific Information\"`]/XCUIElementTypeOther[6]/XCUIElementTypeLink/XCUIElementTypeImage")
    public WebElement vaillantLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"glowworm1\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Manufacturer Specific Information\"`]/XCUIElementTypeOther[5]/XCUIElementTypeLink/XCUIElementTypeImage")
    public WebElement glowwormLogo;


    /* common button */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF127\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"\uF127\"`]")
    public WebElement backButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF383\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"\uF383\"`]")
    public WebElement homeButton;

}
