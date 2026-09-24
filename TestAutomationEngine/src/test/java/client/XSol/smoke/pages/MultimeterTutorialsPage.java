package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class MultimeterTutorialsPage extends MobileBaseTest
{
    public MultimeterTutorialsPage() {
        initMobileElements(this);

    }
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(14)")
    @iOSXCUITFindBy(accessibility = "\uF248, Diagnostics +, System guides & articles")
    public WebElement diagnosticsButton;

    @AndroidFindBy(accessibility = "\uF590, Multimeter Tutorials, How to use your multimeter for common tests, \uF23B")
    @iOSXCUITFindBy(accessibility = "\uF590, Multimeter Tutorials, How to use your multimeter for common tests, \uF23B")
    public WebElement multimeterTutorialsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF383\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"\uF383\"`]")
    public WebElement homeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"How to set to FULL range and DC volts\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"How to set to FULL range and DC volts\"`]")
    public WebElement howToSetToFullRangeLink;



}
