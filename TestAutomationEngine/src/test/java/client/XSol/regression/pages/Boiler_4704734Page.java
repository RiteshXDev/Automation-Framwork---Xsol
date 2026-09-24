package client.XSol.regression.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class Boiler_4704734Page extends MobileBaseTest
{
    public Boiler_4704734Page() {
        initMobileElements(this);

    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search Appliance\"]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"\uF55F, Search Appliance\"`]")
    public WebElement searchApplianceButton;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Search Appliance\"`]")
    public WebElement searchApplianceTextBox;

    @AndroidFindBy( uiAutomator = "new UiSelector().text(\"\uF55F\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"\uF55F\"`]")
    public WebElement searchApplianceButtonSmall;

    @AndroidFindBy(accessibility = "F, Flexicom, 30CX, 4704734")
    @iOSXCUITFindBy(accessibility = "F, \uF599, Flexicom, 30CX, 4704734")
    public WebElement flexicom30cxButton;

    @AndroidFindBy( accessibility = "Continue")
    @iOSXCUITFindBy(accessibility = "Continue")
    public WebElement importantNoticeContinueButton;

    @AndroidFindBy( accessibility = "CONTINUE")
    @iOSXCUITFindBy(accessibility = "CONTINUE")
    public WebElement continueButton;

    @AndroidFindBy( accessibility = "PASS")
    @iOSXCUITFindBy(accessibility = "PASS")
    public WebElement passButton;

    @AndroidFindBy( accessibility = "DISPLAY NOW OPERATES")
    @iOSXCUITFindBy(accessibility = "DISPLAY NOW OPERATES")
    public WebElement displayNowOperatesButton;

    @AndroidFindBy( accessibility = "DISPLAY STILL DOES NOT OPERATE")
    @iOSXCUITFindBy(accessibility = "DISPLAY STILL DOES NOT OPERATE")
    public WebElement displayStillDoesNotOperateButton;

    @AndroidFindBy( accessibility = "DISPLAY OPERATES")
    @iOSXCUITFindBy(accessibility = "DISPLAY OPERATES")
    public WebElement displayOperatesButton;

    @AndroidFindBy( accessibility = "DISPLAY DOES NOT OPERATE FAN DISCONNECTED")
    @iOSXCUITFindBy(accessibility = "DISPLAY DOES NOT OPERATE FAN DISCONNECTED")
    public WebElement displayDoes_fanDisconnectedButton;

    @AndroidFindBy( accessibility = "DISPLAY OPERATES WITH FAN DISCONNECTED")
    @iOSXCUITFindBy(accessibility = "DISPLAY OPERATES WITH FAN DISCONNECTED")
    public WebElement displayOperates_fanDisconnectedButton;

    @AndroidFindBy( accessibility = "BOILER ENTERS STANDBY AS ABOVE")
    @iOSXCUITFindBy(accessibility = "BOILER ENTERS STANDBY AS ABOVE")
    public WebElement boilerEntersStandbyButton;

    @AndroidFindBy( accessibility = "FAULT CODE DISPLAYED")
    @iOSXCUITFindBy(accessibility = "FAULT CODE DISPLAYED")
    public WebElement faultCodeDisplayedButton;


    @AndroidFindBy( accessibility = "PUMP RUNS CONTINUALLY BUT BOILER DOES NOT FIRE")
    @iOSXCUITFindBy(accessibility = "PUMP RUNS CONTINUALLY BUT BOILER DOES NOT FIRE")
    public WebElement pumpRunsContinuallyButton;

    @AndroidFindBy( accessibility = "FAN RUNS CONTINUALLY")
    @iOSXCUITFindBy(accessibility = "FAN RUNS CONTINUALLY")
    public WebElement fanRunsContinuallyButton;

    @AndroidFindBy( accessibility = "BOILER DOES NOT SHOW EITHER DEMAND (NO TAP OR RADIATOR)")
    @iOSXCUITFindBy(accessibility = "BOILER DOES NOT SHOW EITHER DEMAND (NO TAP OR RADIATOR)")
    public WebElement boilerDoesNotShowEitherButton;

    @AndroidFindBy( accessibility = "BOILER SHOWS DHW DEMAND (TAP SYMBOL DISPLAYED)")
    @iOSXCUITFindBy(accessibility = "BOILER SHOWS DHW DEMAND (TAP SYMBOL DISPLAYED)")
    public WebElement boilerShowsDhwDemandButton;

    @AndroidFindBy( accessibility = "BOILER SHOWS CH DEMAND (RADIATOR SYMBOL DISPLAYED)")
    @iOSXCUITFindBy(accessibility = "BOILER SHOWS CH DEMAND (RADIATOR SYMBOL DISPLAYED)")
    public WebElement boilerShowsChDemandButton;

    @AndroidFindBy( accessibility = "TEMPERATURE AROUND BOILER 8°C OR ABOVE")
    @iOSXCUITFindBy(accessibility = "TEMPERATURE AROUND BOILER 8°C OR ABOVE")
    public WebElement temperatureAroundBoilerButton;

    @AndroidFindBy( accessibility = "TEMPERATURE BELOW 8°C")
    @iOSXCUITFindBy(accessibility = "TEMPERATURE BELOW 8°C")
    public WebElement temperatureBelowButton;

    @AndroidFindBy( accessibility = "BOILER STILL FIRES WITH NO DEMAND")
    @iOSXCUITFindBy(accessibility = "BOILER STILL FIRES WITH NO DEMAND")
    public WebElement boilerStillFiresWithButton;

    @AndroidFindBy( accessibility = "BOILER NOW ENTERS STANDBY")
    @iOSXCUITFindBy(accessibility = "BOILER NOW ENTERS STANDBY")
    public WebElement boilerNowEntersStandbyButton;

    @AndroidFindBy( accessibility = "NO VOLTAGE")
    @iOSXCUITFindBy(accessibility = "NO VOLTAGE")
    public WebElement noVoltageButton;

    @AndroidFindBy( accessibility = "APPROX 12VDC OR GREATER")
    @iOSXCUITFindBy(accessibility = "APPROX 12VDC OR GREATER")
    public WebElement approx12VdcOrGreaterButton;

    @AndroidFindBy( accessibility = "new UiSelector().textContains(\\\"FULL DIAGNOSTIC MODEL\\\")\"")
    public WebElement fullDiagnosticsModelButton;

    @AndroidFindBy(accessibility = "Select Outcome (3), \uF145")
    @iOSXCUITFindBy(accessibility = "Select Outcome (3), \uF145")
    public WebElement selectOutcome3Button;

    @AndroidFindBy(accessibility = "Select Outcome (4), \uF145")
    @iOSXCUITFindBy(accessibility = "Select Outcome (4), \uF145")
    public WebElement selectOutcome4Button;

    @AndroidFindBy(accessibility = "Select Outcome (5), \uF145")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Select Outcome (5), \uF145\"`]")
    public WebElement selectOutcome5Button;


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

    @AndroidFindBy(accessibility = "MAINS VOLTAGE PRESENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE PRESENT")
    public WebElement mainVoltagePresentButton;

    @AndroidFindBy(accessibility = "MAINS VOLTAGE ABSENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE ABSENT")
    public WebElement mainVoltageAbsentButton;



    //Select From 4
    @AndroidFindBy( accessibility = "DISPLAY OPERATES AND BOILER ENTERS STANDBY AS  ABOVE")
    @iOSXCUITFindBy( accessibility = "DISPLAY OPERATES AND BOILER ENTERS STANDBY AS  ABOVE")
    public WebElement displayOperatorsAndBoilerButton;

    @AndroidFindBy( accessibility = "DISPLAY DOES NOT OPERATE CORRECTLY")
    @iOSXCUITFindBy( accessibility = "DISPLAY DOES NOT OPERATE CORRECTLY")
    public WebElement displayDoesNotOperateCorrectlyButton;

    @AndroidFindBy( accessibility = "DISPLAY DOES NOT OPERATE")
    @iOSXCUITFindBy( accessibility = "DISPLAY DOES NOT OPERATE")
    public WebElement displayDoesNotOperateButton;



    @AndroidFindBy( accessibility = "DISPLAY OPERATE CORRECTLY")
    @iOSXCUITFindBy( accessibility = "DISPLAY OPERATE CORRECTLY")
    public WebElement displayOperateCorrectlyButton;

    @AndroidFindBy( accessibility = "DISPLAY OPERATES CORRECTLY")
    @iOSXCUITFindBy( accessibility = "DISPLAY OPERATES CORRECTLY")
    public WebElement displayOperatesCorrectlyButton;

    @AndroidFindBy( accessibility = "BOILER FIRES WITH NO DEMAND")
    @iOSXCUITFindBy( accessibility = "BOILER FIRES WITH NO DEMAND")
    public WebElement boilerFiresWithNoDemandButton;

    @AndroidFindBy( accessibility = "FAULT CODE OR ER DISPLAYED")
    @iOSXCUITFindBy( accessibility = "FAULT CODE OR ER DISPLAYED")
    public WebElement faultCodeOrERButton;

    @AndroidFindBy( accessibility = "RESISTANCE AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCE AS EXPECTED")
    public WebElement resistanceAsExpectedButton;

    @AndroidFindBy( accessibility = "RESISTANCE NOT AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCE NOT AS EXPECTED")
    public WebElement resistanceNotAsExpectedButton;

    @AndroidFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED ACROSS THE HARNESS")
    @iOSXCUITFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED ACROSS THE HARNESS")
    public WebElement continuityZeroResistanceButton;

    @AndroidFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED AT EACH WIRE IN THE HARNESS")
    @iOSXCUITFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED AT EACH WIRE IN THE HARNESS")
    public WebElement continuityZeroResistanceMeasuredAtEachButton;

    @AndroidFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS 1 OR MORE OF THE HARNESS WIRES")
    @iOSXCUITFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS 1 OR MORE OF THE HARNESS WIRES")
    public WebElement openCircuitMeasuredAcrossButton;

    @AndroidFindBy( accessibility = "OPEN CIRCUIT MEASURED")
    @iOSXCUITFindBy( accessibility = "OPEN CIRCUIT MEASURED")
    public WebElement openCircuit_MeasuredButton;

    @AndroidFindBy( accessibility = "VOLTAGES AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGES AS ABOVE")
    public WebElement voltagesAsAboveButton;

    @AndroidFindBy( accessibility = "SHORT CIRCUIT MEASURED")
    @iOSXCUITFindBy( accessibility = "SHORT CIRCUIT MEASURED")
    public WebElement shortCircuitMeasuredButton;

    @AndroidFindBy( accessibility = "ONE OR MORE VOLTAGES NOT AS ABOVE")
    @iOSXCUITFindBy( accessibility = "ONE OR MORE VOLTAGES NOT AS ABOVE")
    public WebElement oneOrMoreVoltageButton;

}
