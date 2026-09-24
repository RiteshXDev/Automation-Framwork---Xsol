package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class UsefulGuidesPage extends MobileBaseTest
{
    public UsefulGuidesPage() {
        initMobileElements(this);

    }
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(14)")
    @iOSXCUITFindBy(accessibility = "\uF248, Diagnostics +, System guides & articles")
    public WebElement diagnosticsButton;

    @AndroidFindBy(accessibility = "\uF1A6, Useful Guides, Expansion vessels, pumps, hall sensors, PCBs & more, \uF23B")
    @iOSXCUITFindBy(accessibility = "\uF1A6, Useful Guides, Expansion vessels, pumps, hall sensors, PCBs & more, \uF23B")
    public WebElement usefulGuidesButton;

    /* Useful Guide */

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Servicing an Expansion Vessel\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Servicing an Expansion Vessel\"`]")
    public WebElement servicingVesselButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Common Pump Failure Guide\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Common Pump Failure Guide\"`]")
    public WebElement commonPumpGuideButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Electrical Insulating Mat Advice\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Electrical Insulating Mat Advice\"`]")
    public WebElement electricalAdviceButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"What is a Hall Sensor?\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"What is a Hall Sensor?\"`]")
    public WebElement hallSensorButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Testing for External Mixing\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Testing for External Mixing\"`]")
    public WebElement externalMixingButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Measuring a Flow Rate and Temperature Rise\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Measuring a Flow Rate and Temperature Rise\"`]")
    public WebElement measuringTemperatureRiseButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Notes on Using Temperature Clamps\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Notes on Using Temperature Clamps\"`]")
    public WebElement temperatureClampButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Information on Solar Assisted Hot Water\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Information on Solar Assisted Hot Water\"`]")
    public WebElement solarHotWaterButton;

    /* Information on PCBs */

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"STATIC! Read this before changing a PCB\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"STATIC! Read this before changing a PCB\"`]")
    public WebElement changingAPCBButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Before ordering a PCB\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Before ordering a PCB\"`]")
    public WebElement beforeOrderingPCBButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"IDEAL Replacement PCB guide\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"IDEAL Replacement PCB guide\"`]")
    public WebElement replacementGuideButton;

    /* Useful Tools */

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Using the Multimeter\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Using the Multimeter\"`]")
    public WebElement usingMultimeterButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"LayServKit\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Service Kits Link\"`]")
    public WebElement serviceKitsLinkButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"Layer2\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Useful Fault Finding Tools\"`]")
    public WebElement faultFindingToolsButton;

    /* Common Buttons */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF383\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"\uF383\"`]")
    public WebElement homeButton;

}

