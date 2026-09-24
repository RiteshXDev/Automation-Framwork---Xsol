package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class FaultFindingSPanPage extends MobileBaseTest
{
    public FaultFindingSPanPage() {
        initMobileElements(this);

    }
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(14)")
    @iOSXCUITFindBy(accessibility = "\uF248, Diagnostics +, System guides & articles")
    public WebElement diagnosticsButton;

    @AndroidFindBy(accessibility = "\uF287, System Diagnostics, Heating system guides, wiring diagrams & fault finding, \uF23B")
    @iOSXCUITFindBy(accessibility = "\uF287, System Diagnostics, Heating system guides, wiring diagrams & fault finding, \uF23B")
    public WebElement systemDisagnosticsButton;

    @AndroidFindBy(accessibility = "startpagesd")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement welcomeToXsolContinueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"CONTINUE\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"CONTINUE\"`]")
    public WebElement systemDiagnosticsContinueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"REJECT\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"REJECT\"`]")
    public WebElement warningImportantNoticeRejectButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ACCEPT\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"ACCEPT\"`]")
    public WebElement warningImportantNoticeAcceptButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][2]")
    public WebElement sPlanSystemDotButton;

    @AndroidFindBy(accessibility = "s-plan%20description")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement sPlanStartButton;

    @AndroidFindBy(accessibility = "splanffg")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (S-PLAN INFORMATION)\"`]/XCUIElementTypeOther[7]/XCUIElementTypeLink")
    public WebElement faultFindingButton;

    @AndroidFindBy(accessibility = "Select Outcome (6), \uF145")
    @iOSXCUITFindBy(accessibility = "Select Outcome (6), \uF145")
    public WebElement selectOutcome6Button;

    /* select from the list */

    @AndroidFindBy(accessibility = "THE HEATING IS NOT WORKING BUT HOT WATER IS OK")
    @iOSXCUITFindBy(accessibility = "THE HEATING IS NOT WORKING BUT HOT WATER IS OK")
    public WebElement theHeatingIsNotWorkingButton;

    @AndroidFindBy(accessibility = "RADIATORS ARE GETTING HOT WITH NO HEATING DEMAND")
    @iOSXCUITFindBy(accessibility = "RADIATORS ARE GETTING HOT WITH NO HEATING DEMAND")
    public WebElement radiatorsAreGettingHotButton;

    @AndroidFindBy(accessibility = "NEITHER THE HEATING NOR THE HOT WATER ARE WORKING")
    @iOSXCUITFindBy(accessibility = "NEITHER THE HEATING NOR THE HOT WATER ARE WORKING")
    public WebElement neitherTheHeatingNotTheButton;

    @AndroidFindBy(accessibility = "BOILER IS FIRING WITHOUT DEMAND BUT RADIATORS REMAIN COOL")
    @iOSXCUITFindBy(accessibility = "BOILER IS FIRING WITHOUT DEMAND BUT RADIATORS REMAIN COOL")
    public WebElement boilerIsFiringWithoutButton;

    @AndroidFindBy(accessibility = "THE HOT WATER IS NOT WORKING BUT HEATING IS OK")
    @iOSXCUITFindBy(accessibility = "THE HOT WATER IS NOT WORKING BUT HEATING IS OK")
    public WebElement theHotWaterIsNotWorkingButton;

    @AndroidFindBy(accessibility = "HOT WATER IS GETTING TOO HOT")
    @iOSXCUITFindBy(accessibility = "HOT WATER IS GETTING TOO HOT")
    public WebElement hotWaterIsGettingButton;



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

    @AndroidFindBy(accessibility = "CONTINUE")
    @iOSXCUITFindBy(accessibility = "CONTINUE")
    public WebElement continueButton;





    @AndroidFindBy(accessibility = "ONE OR BOTH ZONE VALVES NOT MOVING")
    @iOSXCUITFindBy(accessibility = "ONE OR BOTH ZONE VALVES NOT MOVING")
    public WebElement oneOrBothZoneValvesButton;

    @AndroidFindBy(accessibility = "ZONE VALVES MOVE")
    @iOSXCUITFindBy(accessibility = "ZONE VALVES MOVE")
    public WebElement zoneValvesMovesButton;

    @AndroidFindBy(accessibility = "ZONE VALVE MOVES")
    @iOSXCUITFindBy(accessibility = "ZONE VALVE MOVES")
    public WebElement zoneValveMovesButton;

    @AndroidFindBy(accessibility = "ZONE VALVE NOT MOVING")
    @iOSXCUITFindBy(accessibility = "ZONE VALVE NOT MOVING")
    public WebElement zoneValveNotMovingButton;

    @AndroidFindBy(accessibility = "PUMP IS RUNNING")
    @iOSXCUITFindBy(accessibility = "PUMP IS RUNNING")
    public WebElement pumpIsRunningButton;

    @AndroidFindBy(accessibility = "PUMP IS NOT RUNNING")
    @iOSXCUITFindBy(accessibility = "PUMP IS NOT RUNNING")
    public WebElement pumpIsNotRunningButton;

    @AndroidFindBy(accessibility = "BOILER LIGHTING AND HEATING")
    @iOSXCUITFindBy(accessibility = "BOILER LIGHTING AND HEATING")
    public WebElement boilerLightingAndHeatingButton;

    @AndroidFindBy(accessibility = "BOILER NOT RESPONDING TO DEMAND")
    @iOSXCUITFindBy(accessibility = "BOILER NOT RESPONDING TO DEMAND")
    public WebElement boilerNotRespondingButton;

    @AndroidFindBy(accessibility = "RESISTANCES AS ABOVE / NON BRANDED ACTUATOR FITTED")
    @iOSXCUITFindBy(accessibility = "RESISTANCES AS ABOVE / NON BRANDED ACTUATOR FITTED")
    public WebElement resistanceAsAboveButton;

    @AndroidFindBy(accessibility = "RESISTANCES AS ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCES AS ABOVE")
    public WebElement resistance_As_AboveButton;

    @AndroidFindBy(accessibility = "RESISTANCES NOT AS ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCES NOT AS ABOVE")
    public WebElement resistanceNotAsAboveButton;



    /* Select Outcome (3) */

    @AndroidFindBy(accessibility = "Select Outcome (3), \uF145")
    @iOSXCUITFindBy(accessibility = "Select Outcome (3), \uF145")
    public WebElement selectOutcome3Button;

    @AndroidFindBy(accessibility = "SPINDLE MOVES FREELY")
    @iOSXCUITFindBy(accessibility = "SPINDLE MOVES FREELY")
    public WebElement spindleMovesFreelyButton;

    @AndroidFindBy(accessibility = "VALVE SPINDLE IS STUCK")
    @iOSXCUITFindBy(accessibility = "VALVE SPINDLE IS STUCK")
    public WebElement valveSpindleIsStuckButton;

    @AndroidFindBy(accessibility = "HEAD OF THE VALVE IS NOT REMOVEABLE")
    @iOSXCUITFindBy(accessibility = "HEAD OF THE VALVE IS NOT REMOVEABLE")
    public WebElement headOfTheValveButton;

    @AndroidFindBy(accessibility = "MOTOR ROTATES FREELY")
    @iOSXCUITFindBy(accessibility = "MOTOR ROTATES FREELY")
    public WebElement motorRotatesFreelyButton;

    @AndroidFindBy(accessibility = "MOTOR DOES NOT ROTATE FREELY")
    @iOSXCUITFindBy(accessibility = "MOTOR DOES NOT ROTATE FREELY")
    public WebElement motorDoesNotRotateButton;

    @AndroidFindBy(accessibility = "MAINS VOLTAGE PRESENT AND VALVE OPENS")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE PRESENT AND VALVE OPENS")
    public WebElement mainVoltagePresentAndValveButton;

    @AndroidFindBy(accessibility = "VOLTAGE OK BUT VALVE NOT MOVING")
    @iOSXCUITFindBy(accessibility = "VOLTAGE OK BUT VALVE NOT MOVING")
    public WebElement voltageOkButValveNotButton;

    @AndroidFindBy(accessibility = "VOLTAGE STILL NOT PRESENT AT BROWN WIRE")
    @iOSXCUITFindBy(accessibility = "VOLTAGE STILL NOT PRESENT AT BROWN WIRE")
    public WebElement voltageStillNotPresentButton;

    @AndroidFindBy(accessibility = "ZONE VALVE HAS OPENED")
    @iOSXCUITFindBy(accessibility = "ZONE VALVE HAS OPENED")
    public WebElement zoneValveHasOpenedButton;

    @AndroidFindBy(accessibility = "HEATING VALVE CLOSED BUT RADIATORS HEAT WITH HOT WATER DEMAND")
    @iOSXCUITFindBy(accessibility = "HEATING VALVE CLOSED BUT RADIATORS HEAT WITH HOT WATER DEMAND")
    public WebElement heatingValveClosedButton;

    @AndroidFindBy(accessibility = "HEATING VALVE DOES NOT FULLY CLOSE WITH NO HEATING DEMAND")
    @iOSXCUITFindBy(accessibility = "HEATING VALVE DOES NOT FULLY CLOSE WITH NO HEATING DEMAND")
    public WebElement heatingValveDoesNotFullyClosedButton;

    @AndroidFindBy(accessibility = "ZONE VALVE CLOSES")
    @iOSXCUITFindBy(accessibility = "ZONE VALVE CLOSES")
    public WebElement zoneValveClosesButton;

    @AndroidFindBy(accessibility = "ZONE VALVE DOES NOT CLOSE")
    @iOSXCUITFindBy(accessibility = "ZONE VALVE DOES NOT CLOSE")
    public WebElement zoneValveDoesNotCloseButton;

    @AndroidFindBy(accessibility = "DOES NOT FIRE WITH TIMER REMOVED")
    @iOSXCUITFindBy(accessibility = "DOES NOT FIRE WITH TIMER REMOVED")
    public WebElement doesNotFireWithTimerButton;

    @AndroidFindBy(accessibility = "STILL FIRING WITH TIMER REMOVED")
    @iOSXCUITFindBy(accessibility = "STILL FIRING WITH TIMER REMOVED")
    public WebElement stillFiringWithTimerButton;

    @AndroidFindBy(accessibility = "NO THERMOSTAT FITTED OR NO CHANGE TO SYSTEM OPERATION")
    @iOSXCUITFindBy(accessibility = "NO THERMOSTAT FITTED OR NO CHANGE TO SYSTEM OPERATION")
    public WebElement noThermostatFittedButton;

    @AndroidFindBy(accessibility = "SYSTEM DOES NOT FIRE WHEN THERMOSTAT DISCONNECTED")
    @iOSXCUITFindBy(accessibility = "SYSTEM DOES NOT FIRE WHEN THERMOSTAT DISCONNECTED")
    public WebElement systemDoesNotFireButton;

    @AndroidFindBy(accessibility = "HEAD DOES NOT SPRING BACK WHEN REMOVED")
    @iOSXCUITFindBy(accessibility = "HEAD DOES NOT SPRING BACK WHEN REMOVED")
    public WebElement headDoesNotSpringButton;

    @AndroidFindBy(accessibility = "HEAD SPRINGS BACK WHEN REMOVED")
    @iOSXCUITFindBy(accessibility = "HEAD SPRINGS BACK WHEN REMOVED")
    public WebElement headSpringBackButton;

    @AndroidFindBy(accessibility = "VALVE HEAD IS NOT REMOVEABLE")
    @iOSXCUITFindBy(accessibility = "VALVE HEAD IS NOT REMOVEABLE")
    public WebElement valveHeadIsNotButton;

    @AndroidFindBy(accessibility = "Select Outcome (4), \uF145")
    @iOSXCUITFindBy(accessibility = "Select Outcome (4), \uF145")
    public WebElement selectOutcome4Button;

    @AndroidFindBy(accessibility = "BOTH ZONE VALVES OPEN")
    @iOSXCUITFindBy(accessibility = "BOTH ZONE VALVES OPEN")
    public WebElement bothZoneValvesOpenButton;

    @AndroidFindBy(accessibility = "NEITHER VALVE OPENS")
    @iOSXCUITFindBy(accessibility = "NEITHER VALVE OPENS")
    public WebElement neitherValveOpensButton;

    @AndroidFindBy(accessibility = "HEATING VALVE OPENS BUT HOT WATER VALVE REMAINS CLOSED")
    @iOSXCUITFindBy(accessibility = "HEATING VALVE OPENS BUT HOT WATER VALVE REMAINS CLOSED")
    public WebElement heatingValveOpensButButton;

    @AndroidFindBy(accessibility = "HOT WATER VALVE OPENS BUT HEATING REMAINS CLOSED")
    @iOSXCUITFindBy(accessibility = "HOT WATER VALVE OPENS BUT HEATING REMAINS CLOSED")
    public WebElement hotWaterValveOpensButton;

    @AndroidFindBy(accessibility = "RESISTANCE CLOSED CIRCUIT")
    @iOSXCUITFindBy(accessibility = "RESISTANCE CLOSED CIRCUIT")
    public WebElement resistanceClosedCircuitButton;

    @AndroidFindBy(accessibility = "RESISTANCE OPEN CIRCUIT")
    @iOSXCUITFindBy(accessibility = "RESISTANCE OPEN CIRCUIT")
    public WebElement resistanceOpenCircuitButton;


    @AndroidFindBy(accessibility = "SYSTEM STILL FIRES WITH NO DEMAND")
    @iOSXCUITFindBy(accessibility = "SYSTEM STILL FIRES WITH NO DEMAND")
    public WebElement systemStillFiresButton;

    @AndroidFindBy(accessibility = "SYSTEM NO LONGER FIRES WITH NO DEMAND")
    @iOSXCUITFindBy(accessibility = "SYSTEM NO LONGER FIRES WITH NO DEMAND")
    public WebElement systemNoLongerFiresButton;

    @AndroidFindBy(accessibility = "BOILER HAS PERMANENT LIVE")
    @iOSXCUITFindBy(accessibility = "BOILER HAS PERMANENT LIVE")
    public WebElement boilerHasPermanentButton;

    @AndroidFindBy(accessibility = "BOILER DOES NOT HAVE PERMANENT LIVE")
    @iOSXCUITFindBy(accessibility = "BOILER DOES NOT HAVE PERMANENT LIVE")
    public WebElement boilerDoesNotHaveButton;


    @AndroidFindBy(accessibility = "HOT WATER VALVE CLOSED BUT CYLINDER CIRCS HEAT WITH CH DEMAND")
    @iOSXCUITFindBy(accessibility = "HOT WATER VALVE CLOSED BUT CYLINDER CIRCS HEAT WITH CH DEMAND")
    public WebElement hotWaterValveClosedButton;

    @AndroidFindBy(accessibility = "HOT WATER VALVE IS NOT CLOSED WITH NO HW DEMAND")
    @iOSXCUITFindBy(accessibility = "HOT WATER VALVE IS NOT CLOSED WITH NO HW DEMAND")
    public WebElement hotWaterValveIsNotClosedButton;

    @AndroidFindBy(accessibility = "HOT WATER VALVE CLOSED AND CYLINDER CIRCS REMAIN COOL WITH CH DEMAND")
    @iOSXCUITFindBy(accessibility = "HOT WATER VALVE CLOSED AND CYLINDER CIRCS REMAIN COOL WITH CH DEMAND")
    public WebElement hotWaterValveClosedAndCylinderButton;

    @AndroidFindBy(accessibility = "CORRECTLY  POSITIONED, SECURELY ATTACHED AND SET CORRECTLY")
    @iOSXCUITFindBy(accessibility = "CORRECTLY  POSITIONED, SECURELY ATTACHED AND SET CORRECTLY")
    public WebElement correctlyPositionedButton;

    @AndroidFindBy(accessibility = "INCORRECT POSITION AND/OR NOT SECURELY ATTACHED")
    @iOSXCUITFindBy(accessibility = "INCORRECT POSITION AND/OR NOT SECURELY ATTACHED")
    public WebElement incorrectPositionButton;

    @AndroidFindBy( accessibility = "VOLTAGE AS ABOVE")
    public WebElement voltageAsAboveButton;

    @AndroidFindBy( accessibility = "VOLTAGE NOT AS ABOVE")
    public WebElement voltageNotAsAboveButton;

}
