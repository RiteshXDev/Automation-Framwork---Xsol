package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class FaultFindingYPlanPage extends MobileBaseTest
{
    public FaultFindingYPlanPage() {
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

    /* Select System from the list below */

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement yPlanSystemDotButton;

    @AndroidFindBy(accessibility = "y-plan%20description")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement yPlanStartButton;

    /* Y-Plan Wiring Diagram */

    @AndroidFindBy(accessibility = "yplanffg")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (Y-PLAN INFORMATION)\"`]/XCUIElementTypeOther[8]/XCUIElementTypeLink")
    public WebElement faultFindingButton;


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


    /* Select from the Outcome (7) */

    @AndroidFindBy(accessibility = "Select Outcome (7), \uF145")
    @iOSXCUITFindBy(accessibility = "Select Outcome (7), \uF145")
    public WebElement selectOutcome7Button;

    @AndroidFindBy(accessibility = "VALVE NOT STOPPING AT MID POSITION WITH BOTH DEMANDS OR NOT MOVING TO THE WATER ONLY POSITION AFTER HEATING DEMAND")
    @iOSXCUITFindBy(accessibility = "VALVE NOT STOPPING AT MID POSITION WITH BOTH DEMANDS OR NOT MOVING TO THE WATER ONLY POSITION AFTER HEATING DEMAND")
    public WebElement valveNotStoppingButton;

    @AndroidFindBy(accessibility = "VALVE IN HOT WATER POSITION BUT HOT WATER IS NOT GETTING HOT")
    @iOSXCUITFindBy(accessibility = "VALVE IN HOT WATER POSITION BUT HOT WATER IS NOT GETTING HOT")
    public WebElement valveInHotWaterButton;

    @AndroidFindBy(accessibility = "RADIATORS HEAT WITH NO DEMAND OR DEMAND FOR HOT WATER ONLY")
    @iOSXCUITFindBy(accessibility = "RADIATORS HEAT WITH NO DEMAND OR DEMAND FOR HOT WATER ONLY")
    public WebElement radiatorsHeatWithNoDemandButton;

    @AndroidFindBy(accessibility = "VALVE IS NOT MOVING TO THE HEATING ONLY POSITION OR HEATING IS INTERMITTENT")
    @iOSXCUITFindBy(accessibility = "VALVE IS NOT MOVING TO THE HEATING ONLY POSITION OR HEATING IS INTERMITTENT")
    public WebElement valveIsNotMovingButton;

    @AndroidFindBy(accessibility = "VALVE MOVES TO THE HEATING POSITION BUT THE RADIATORS ARE NOT GETTING HOT")
    @iOSXCUITFindBy(accessibility = "VALVE MOVES TO THE HEATING POSITION BUT THE RADIATORS ARE NOT GETTING HOT")
    public WebElement valveMovesToTheHeatingButton;

    @AndroidFindBy(accessibility = "VALVE WORKING PROPERLY BUT HOT WATER IS GETTING TOO HOT")
    @iOSXCUITFindBy(accessibility = "VALVE WORKING PROPERLY BUT HOT WATER IS GETTING TOO HOT")
    public WebElement valveWorkingProperlyButton;

    @AndroidFindBy(accessibility = "PUMP AND BOILER DO NOT RESPOND TO EITHER DEMAND")
    @iOSXCUITFindBy(accessibility = "PUMP AND BOILER DO NOT RESPOND TO EITHER DEMAND")
    public WebElement pumpAndBoilerDoNotButton;

    /* VALVE NOT STOPPING AT MID POSITION WITH BOTH DEMANDS..... */
    /* Select Outcome (3) */

    @AndroidFindBy(accessibility = "Select Outcome (3), \uF145")
    @iOSXCUITFindBy(accessibility = "Select Outcome (3), \uF145")
    public WebElement selectOutcome3Button;

    @AndroidFindBy(accessibility = "VALVE SPRINGS BACK AND REMAINS AT W WHEN POWER RESTORED")
    @iOSXCUITFindBy(accessibility = "VALVE SPRINGS BACK AND REMAINS AT W WHEN POWER RESTORED")
    public WebElement valveSpringBackButton;

    @AndroidFindBy(accessibility = "VALVE CLICKING OR DOES NOT REMAIN AT W WHEN POWER IS RESTORED")
    @iOSXCUITFindBy(accessibility = "VALVE CLICKING OR DOES NOT REMAIN AT W WHEN POWER IS RESTORED")
    public WebElement valveClickingOrButton;

    @AndroidFindBy(accessibility = "VALVE DOES NOT RETURN TO W WHEN POWER ISOLATED")
    @iOSXCUITFindBy(accessibility = "VALVE DOES NOT RETURN TO W WHEN POWER ISOLATED")
    public WebElement valveDoesNotReturnButton;



    @AndroidFindBy(accessibility = "MAINS VOLTAGE PRESENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE PRESENT")
    public WebElement mainVoltagePresentButton;

    @AndroidFindBy(accessibility = "MAINS VOLTAGE ABSENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE ABSENT")
    public WebElement mainVoltageAbsentButton;

    @AndroidFindBy(accessibility = "CLOSED CIRCUIT MEASURED")
    @iOSXCUITFindBy(accessibility = "CLOSED CIRCUIT MEASURED")
    public WebElement closedCircuitMeasuredButton;

    @AndroidFindBy(accessibility = "OPEN CIRCUIT MEASURED")
    @iOSXCUITFindBy(accessibility = "OPEN CIRCUIT MEASURED")
    public WebElement openCircuitMeasuredButton;


    @AndroidFindBy(accessibility = "ACTUATOR DOES NOT STOP AT MID POSITION")
    @iOSXCUITFindBy(accessibility = "ACTUATOR DOES NOT STOP AT MID POSITION")
    public WebElement doNotStopMidPosition;

    @AndroidFindBy(accessibility = "ACTUATOR STOPS AT MID POSITION")
    @iOSXCUITFindBy(accessibility = "ACTUATOR STOPS AT MID POSITION")
    public WebElement stopMidPosition;



    @AndroidFindBy(accessibility = "MAINS VOLTAGE STILL PRESENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE STILL PRESENT")
    public WebElement mainVoltageStillPresentButton;

    @AndroidFindBy(accessibility = "MAINS VOLTAGE NOW ABSENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE NOW ABSENT")
    public WebElement mainVoltageNowAbsentButton;

    @AndroidFindBy(accessibility = "NO THERMOSTAT FITTED OR NO CHANGE TO SYSTEM OPERATION")
    @iOSXCUITFindBy(accessibility = "NO THERMOSTAT FITTED OR NO CHANGE TO SYSTEM OPERATION")
    public WebElement noThermostatFittingButton;

    @AndroidFindBy(accessibility = "TEMP ABOVE SET POINT AND SYSTEM DOES NOT FIRE WHEN WIRE OFF")
    @iOSXCUITFindBy(accessibility = "TEMP ABOVE SET POINT AND SYSTEM DOES NOT FIRE WHEN WIRE OFF")
    public WebElement tempAboveSetPointButton;

    @AndroidFindBy(accessibility = "SPINDLE MOVES FREELY")
    @iOSXCUITFindBy(accessibility = "SPINDLE MOVES FREELY")
    public WebElement spindleMovesFreelyButton;

    @AndroidFindBy(accessibility = "VALVE SPINDLE IS STUCK")
    @iOSXCUITFindBy(accessibility = "VALVE SPINDLE IS STUCK")
    public WebElement valveSpindleIsStuckButton;

    @AndroidFindBy(accessibility = "HEAD OF THE VALVE IS NOT REMOVEABLE")
    @iOSXCUITFindBy(accessibility = "HEAD OF THE VALVE IS NOT REMOVEABLE")
    public WebElement headOfTheValveButton;

    @AndroidFindBy(accessibility = "INTERNAL PARTS OF VALVE IN GOOD CONDITION")
    @iOSXCUITFindBy(accessibility = "INTERNAL PARTS OF VALVE IN GOOD CONDITION")
    public WebElement internalPartsOfValveButton;

    @AndroidFindBy(accessibility = "EVIDENCE OF INTERNAL WEAR OR DAMAGE")
    @iOSXCUITFindBy(accessibility = "EVIDENCE OF INTERNAL WEAR OR DAMAGE")
    public WebElement evidenceOfInternalWearButton;


    /* VALVE IN HOT WATER POSITION BUT HOT WATER IS NOT GETTING HOT...*/

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






    @AndroidFindBy(accessibility = "RADIATORS REMAIN COOL")
    @iOSXCUITFindBy(accessibility = "RADIATORS REMAIN COOL")
    public WebElement radiatorsRemainCoolButton;

    @AndroidFindBy(accessibility = "RADIATORS HEAT WITH VALVE IN W POSITION")
    @iOSXCUITFindBy(accessibility = "RADIATORS HEAT WITH VALVE IN W POSITION")
    public WebElement radiatorsHeatWithValveButton;

    @AndroidFindBy(accessibility = "CORRECTLY  POSITIONED, SECURELY ATTACHED AND SET CORRECTLY")
    @iOSXCUITFindBy(accessibility = "CORRECTLY  POSITIONED, SECURELY ATTACHED AND SET CORRECTLY")
    public WebElement correctlyPositionButton;

    @AndroidFindBy(accessibility = "INCORRECT POSITION AND/OR NOT SECURELY ATTACHED")
    @iOSXCUITFindBy(accessibility = "INCORRECT POSITION AND/OR NOT SECURELY ATTACHED")
    public WebElement incorrectlyPositionButton;


    /* RADIATORS HEAT WITH NO DEMAND OR DEMAND FOR HOT WATER ONLY */

    @AndroidFindBy(accessibility = "VALVE DOES NOT REACH W POSITION WITH DEMAND FOR HOT WATER ONLY")
    @iOSXCUITFindBy(accessibility = "VALVE DOES NOT REACH W POSITION WITH DEMAND FOR HOT WATER ONLY")
    public WebElement valveDoesNotReachButton;

    @AndroidFindBy(accessibility = "VALVE AT W POSITION BUT RADIATORS HEAT WITH HOT WATER DEMAND")
    @iOSXCUITFindBy(accessibility = "VALVE AT W POSITION BUT RADIATORS HEAT WITH HOT WATER DEMAND")
    public WebElement valveAtWPositionButton;

    @AndroidFindBy(accessibility = "RESISTANCE IS NOT AS DESCRIBED")
    @iOSXCUITFindBy(accessibility = "RESISTANCE IS NOT AS DESCRIBED")
    public WebElement resistanceIsNotAsButton;

    @AndroidFindBy(accessibility = "RESISTANCE IS AS DESCRIBED")
    @iOSXCUITFindBy(accessibility = "RESISTANCE IS AS DESCRIBED")
    public WebElement resistanceIsAsButton;

    /* VALVE IS NOT MOVING TO THE HEATING ONLY POSITION OR HEATING IS INTERMITTENT */

    @AndroidFindBy(accessibility = "VALVE MOVES TO THE M POSITION")
    @iOSXCUITFindBy(accessibility = "VALVE MOVES TO THE M POSITION")
    public WebElement valveMovesToTheMButton;

    @AndroidFindBy(accessibility = "VALVE DOES NOT MOVE")
    @iOSXCUITFindBy(accessibility = "VALVE DOES NOT MOVE")
    public WebElement valveDoesNotMoveButton;

    @AndroidFindBy(accessibility = "TIMER CAN BE SET TO HEATING ONLY")
    @iOSXCUITFindBy(accessibility = "TIMER CAN BE SET TO HEATING ONLY")
    public WebElement timerCanBeSetButton;

    @AndroidFindBy(accessibility = "THE WATER COMES ON WITH THE HEATING")
    @iOSXCUITFindBy(accessibility = "THE WATER COMES ON WITH THE HEATING")
    public WebElement theWaterComesOnButton;

    @AndroidFindBy(accessibility = "VALVE SPRINGS BACK TO W")
    @iOSXCUITFindBy(accessibility = "VALVE SPRINGS BACK TO W")
    public WebElement valveSpringsBackToWButton;

    @AndroidFindBy(accessibility = "VALVE REMAINS IN THE M POSITION")
    @iOSXCUITFindBy(accessibility = "VALVE REMAINS IN THE M POSITION")
    public WebElement valveRemainInTheMButton;

    @AndroidFindBy(accessibility = "VALVE SPRINGS BACK TO W")
    public WebElement ValveSpringsBackToWButton;

    @AndroidFindBy(accessibility = "VALVE REMAINS IN THE M POSITION")
    @iOSXCUITFindBy(accessibility = "VALVE REMAINS IN THE M POSITION")
    public WebElement valveRemainInTheMPositionButton;

    @AndroidFindBy(accessibility = "RESISTANCES AS ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCES AS ABOVE")
    public WebElement resistanceAsAboveButton;

    @AndroidFindBy(accessibility = "RESISTANCES NOT AS ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCES NOT AS ABOVE")
    public WebElement resistanceNotAsAboveButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"RESISTANCE AS ABOVE\")")
    @iOSXCUITFindBy(accessibility = "RESISTANCE AS ABOVE")
    public WebElement resistanceAsAboveUIAButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"RESISTANCE NOT AS ABOVE\")")
    @iOSXCUITFindBy(accessibility = "RESISTANCE NOT AS ABOVE")
    public WebElement resistanceNotAsAboveUIAButton;


    @AndroidFindBy(accessibility = "MOTOR ROTATES FREELY")
    @iOSXCUITFindBy(accessibility = "MOTOR ROTATES FREELY")
    public WebElement motorRotatesFreelyButton;

    @AndroidFindBy(accessibility = "MOTOR DOES NOT ROTATE FREELY")
    @iOSXCUITFindBy(accessibility = "MOTOR DOES NOT ROTATE FREELY")
    public WebElement motorDoesNotRotateButton;

    @AndroidFindBy(accessibility = "DIVERTER VALVE NOW MOVES TO H")
    @iOSXCUITFindBy(accessibility = "DIVERTER VALVE NOW MOVES TO H")
    public WebElement diverterValveNowMovesButton;

    @AndroidFindBy(accessibility = "DIVERTER DOES NOT MOVE")
    @iOSXCUITFindBy(accessibility = "DIVERTER DOES NOT MOVE")
    public WebElement diverterDoesNotMoveButton;

    @AndroidFindBy(accessibility = "DIVERTER VALVE AT H AND THE HOT WATER PIPES REMAIN COOL")
    @iOSXCUITFindBy(accessibility = "DIVERTER VALVE AT H AND THE HOT WATER PIPES REMAIN COOL")
    public WebElement diverterValveAtHAndTheHotWaterButton;

    @AndroidFindBy(accessibility = "DIVERTER VALVE AT H BUT HOT WATER PIPES HEAT WITH CH DEMAND")
    @iOSXCUITFindBy(accessibility = "DIVERTER VALVE AT H BUT HOT WATER PIPES HEAT WITH CH DEMAND")
    public WebElement diverterValveAtHButHotWaterButton;


    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"PUMP AND BOILER DO NOT RESPOND TO EITHER DEMAND\"`][2]")
    public WebElement pumpAndBoilerDoNotlink;


}
