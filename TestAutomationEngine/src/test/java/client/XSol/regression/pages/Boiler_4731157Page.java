package client.XSol.regression.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class Boiler_4731157Page extends MobileBaseTest
{
    public Boiler_4731157Page() {
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

    @AndroidFindBy(accessibility = "W, Worcester, Greenstar HE Plus - ZWBR 11-35A, 4731157")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement worcesterGreenstarButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"XSOL DIAGNOSIS FROM START SEQUENCE\"]")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement xsolDiagnosisFromLink;

    @AndroidFindBy( accessibility = "Continue")
    @iOSXCUITFindBy(accessibility = "Continue")
    public WebElement importantNoticeContinueButton;

    @AndroidFindBy( accessibility = "CONTINUE")
    @iOSXCUITFindBy(accessibility = "CONTINUE")
    public WebElement continueButton;

    @AndroidFindBy( accessibility = "PASS")
    @iOSXCUITFindBy(accessibility = "PASS")
    public WebElement passButton;

    @AndroidFindBy( accessibility = "FLOW RATE SATISFACTORY")
    @iOSXCUITFindBy(accessibility = "FLOW RATE SATISFACTORY")
    public WebElement flowRateSatisfactoryButton;

    @AndroidFindBy( accessibility = "FLOW RATE UNSATISFACTORY")
    @iOSXCUITFindBy(accessibility = "FLOW RATE UNSATISFACTORY")
    public WebElement flowRateUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "FLOW SWITCH OPERATES AND RELEASES MICROSWITCH WIPER")
    @iOSXCUITFindBy(accessibility = "FLOW SWITCH OPERATES AND RELEASES MICROSWITCH WIPER")
    public WebElement flowSwitchOperatesButton;

    @AndroidFindBy( accessibility = "FLOW SWITCH DOES NOT OPERATE CORRECTLY")
    @iOSXCUITFindBy(accessibility = "FLOW SWITCH DOES NOT OPERATE CORRECTLY")
    public WebElement flowSwitchDoesNotOperateButton;

    @AndroidFindBy( accessibility = "COMBUSTION FAN RUNS")
    @iOSXCUITFindBy(accessibility = "COMBUSTION FAN RUNS")
    public WebElement combustionFanRunsButton;

    @AndroidFindBy( accessibility = "COMBUSTION FAN DOES NOT RUN")
    @iOSXCUITFindBy(accessibility = "COMBUSTION FAN DOES NOT RUN")
    public WebElement combustionFanDoesNotRunsButton;

    @AndroidFindBy( accessibility = "PUMP RUNS")
    @iOSXCUITFindBy(accessibility = "PUMP RUNS")
    public WebElement pumpRunsButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES CORRECTLY")
    @iOSXCUITFindBy(accessibility = "BURNER IGNITES AND ESTABLISHES CORRECTLY")
    public WebElement burnerIgnitesAndEstablishesCorrectlyButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES SMOOTHLY BUT DOES NOT ESTABLISH")
    @iOSXCUITFindBy(accessibility = "BURNER IGNITES SMOOTHLY BUT DOES NOT ESTABLISH")
    public WebElement burnerIgnitesSmoothlyButton;

    @AndroidFindBy( accessibility = "FAN RUNS BUT BURNER DOES NOT IGNITE")
    @iOSXCUITFindBy(accessibility = "FAN RUNS BUT BURNER DOES NOT IGNITE")
    public WebElement fanRUnsButBurnerDoesNotButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES BUT BAFFLES")
    @iOSXCUITFindBy(accessibility = "BURNER IGNITES BUT BAFFLES")
    public WebElement burnerIgnitesButBafflesButton;

    @AndroidFindBy( accessibility = "FAN PRESSURE IS AS EXPECTED")
    @iOSXCUITFindBy(accessibility = "FAN PRESSURE IS AS EXPECTED")
    public WebElement fanPressureIsAExpectedButton;

    @AndroidFindBy( accessibility = "FAN PRESSURE IS LOW (E.G. -0.5 MBAR)")
    @iOSXCUITFindBy(accessibility = "FAN PRESSURE IS LOW (E.G. -0.5 MBAR)")
    public WebElement fanPressureIsLowButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES WITH CH DEMAND")
    @iOSXCUITFindBy(accessibility = "BURNER IGNITES WITH CH DEMAND")
    public WebElement burnerIgnitesWithChDemandButton;

    @AndroidFindBy( accessibility = "BURNER DOES NOT IGNITE WITH CH DEMAND")
    @iOSXCUITFindBy(accessibility = "BURNER DOES NOT IGNITE WITH CH DEMAND")
    public WebElement burnerDoesNotIgnitesWithChDemandButton;


    @AndroidFindBy( accessibility = "DHW NOISY (KETTLING)")
    @iOSXCUITFindBy(accessibility = "DHW NOISY (KETTLING)")
    public WebElement dhwNoisyButton;

    @AndroidFindBy( accessibility = "DHW TOO COOL, RADIATORS COLD")
    @iOSXCUITFindBy(accessibility = "DHW TOO COOL, RADIATORS COLD")
    public WebElement dhwTooCoolRadiatorsColdButton;

    @AndroidFindBy( accessibility = "DHW COOL, RADIATORS BEGIN TO HEAT")
    @iOSXCUITFindBy(accessibility = "DHW COOL, RADIATORS BEGIN TO HEAT")
    public WebElement dhwCoolRadiatorsBeginButton;

    @AndroidFindBy( accessibility = "DHW TOO HOT")
    @iOSXCUITFindBy(accessibility = "DHW TOO HOT")
    public WebElement dhwTooHotButton;

    @AndroidFindBy( accessibility = "DHW RUNS COOL, BURNER CYCLES ON AND OFF")
    @iOSXCUITFindBy(accessibility = "DHW RUNS COOL, BURNER CYCLES ON AND OFF")
    public WebElement dhwRunsCoolBurnerButton;

    @AndroidFindBy( accessibility = "CH HEATS SATISFACTORILY")
    @iOSXCUITFindBy(accessibility = "CH HEATS SATISFACTORILY")
    public WebElement chHeatsSatisfactorilyButton;

    @AndroidFindBy( accessibility = "CH NOISY (KETTLING)")
    @iOSXCUITFindBy(accessibility = "CH NOISY (KETTLING)")
    public WebElement chNoisyButton;

    @AndroidFindBy( accessibility = "BOILER HEATS UP BUT SYSTEM REMAINS COOL")
    @iOSXCUITFindBy(accessibility = "BOILER HEATS UP BUT SYSTEM REMAINS COOL")
    public WebElement boilerHeatsUpButSystemButton;

    @AndroidFindBy( accessibility = "BOILER SHUTS DOWN BEFORE TEMPERATURE IS SATISFIED")
    @iOSXCUITFindBy(accessibility = "BOILER SHUTS DOWN BEFORE TEMPERATURE IS SATISFIED")
    public WebElement boilerShutsDownBeforeButton;

    @AndroidFindBy( accessibility = "BOILER TEMP LOW SYSTEM TEMP LOW")
    @iOSXCUITFindBy(accessibility = "BOILER TEMP LOW SYSTEM TEMP LOW")
    public WebElement boilerTempLowButton;

    @AndroidFindBy( accessibility = "SYSTEM PRESSURE REMAINS STABLE")
    @iOSXCUITFindBy(accessibility = "SYSTEM PRESSURE REMAINS STABLE")
    public WebElement systemPressureRemainsButton;

    @AndroidFindBy( accessibility = "SYSTEM PRESSURE RISES EXCESSIVELY")
    @iOSXCUITFindBy(accessibility = "SYSTEM PRESSURE RISES EXCESSIVELY")
    public WebElement systemPressureRisesButton;

    @AndroidFindBy( accessibility = "BURNER MODULATES")
    @iOSXCUITFindBy(accessibility = "BURNER MODULATES")
    public WebElement burnerModulatesButton;

    @AndroidFindBy( accessibility = "BURNER DOES NOT MODULATE")
    @iOSXCUITFindBy(accessibility = "BURNER DOES NOT MODULATE")
    public WebElement burnerDoesNotModulatesButton;

    @AndroidFindBy( accessibility = "RESISTANCE CONFORMS TO THE TABLE ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCE CONFORMS TO THE TABLE ABOVE")
    public WebElement resistanceConformsToButton;

    @AndroidFindBy( accessibility = "RESISTANCE CONFORMS TO TABLE ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCE CONFORMS TO TABLE ABOVE")
    public WebElement resistanceConformsToTableButton;

    @AndroidFindBy( accessibility = "RESISTANCE DOES NOT CONFORM TO THE TABLE ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCE DOES NOT CONFORM TO THE TABLE ABOVE")
    public WebElement resistanceDoesNotConformsToButton;

    @AndroidFindBy( accessibility = "RESISTANCE DOES NOT CONFORM TO TABLE ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCE DOES NOT CONFORM TO TABLE ABOVE")
    public WebElement resistanceDoesNotConformsToTableButton;

    @AndroidFindBy( accessibility = "VARIABLE SPEED PUMP FITTED")
    @iOSXCUITFindBy(accessibility = "VARIABLE SPEED PUMP FITTED")
    public WebElement variableSpeedPumpButton;

    @AndroidFindBy( accessibility = "SINGLE SPEED PUMP FITTED")
    @iOSXCUITFindBy(accessibility = "SINGLE SPEED PUMP FITTED")
    public WebElement singleSpeedPumpButton;

    @AndroidFindBy( accessibility = "BYPASS CORRECT")
    @iOSXCUITFindBy(accessibility = "BYPASS CORRECT")
    public WebElement bypassCorrectButton;

    @AndroidFindBy( accessibility = "BYPASS INCORRECT")
    @iOSXCUITFindBy(accessibility = "BYPASS INCORRECT")
    public WebElement bypassIncorrectButton;

    @AndroidFindBy( accessibility = "SPINDLE EXTENDED AS SHOWN")
    @iOSXCUITFindBy(accessibility = "SPINDLE EXTENDED AS SHOWN")
    public WebElement spindleExtendedAsShownButton;

    @AndroidFindBy( accessibility = "SPINDLE NOT EXTENDED AS SHOWN")
    @iOSXCUITFindBy(accessibility = "SPINDLE NOT EXTENDED AS SHOWN")
    public WebElement spindleNotExtendedAsShownButton;

    @AndroidFindBy( accessibility = "RESISTANCES AS ABOVE AND IN GOOD CONDITION")
    @iOSXCUITFindBy(accessibility = "RESISTANCES AS ABOVE AND IN GOOD CONDITION")
    public WebElement resistanceAsAboveAndInGoodButton;

    @AndroidFindBy( accessibility = "RESISTANCES NOT AS ABOVE OR IN POOR CONDITION")
    @iOSXCUITFindBy(accessibility = "RESISTANCES NOT AS ABOVE OR IN POOR CONDITION")
    public WebElement resistanceNotAsAboveOrInButton;

    @AndroidFindBy( accessibility = "RESISTANCES AS ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCES AS ABOVE")
    public WebElement resistanceAsAboveButton;

    @AndroidFindBy( accessibility = "RESISTANCES NOT AS ABOVE")
    @iOSXCUITFindBy(accessibility = "RESISTANCES NOT AS ABOVE")
    public WebElement resistanceNotAsAboveButton;

    @AndroidFindBy( accessibility = "SYPHON AND DRAIN CLEAR")
    @iOSXCUITFindBy(accessibility = "SYPHON AND DRAIN CLEAR")
    public WebElement syphonAndDrainClearButton;

    @AndroidFindBy( accessibility = "SYPHON AND/OR DRAIN BLOCKED")
    @iOSXCUITFindBy(accessibility = "SYPHON AND/OR DRAIN BLOCKED")
    public WebElement syphonAndOrDrainButton;

    @AndroidFindBy( accessibility = "FLUE CLEAR AND UNDAMAGED")
    @iOSXCUITFindBy(accessibility = "FLUE CLEAR AND UNDAMAGED")
    public WebElement flueClearAndUndamagedButton;

    @AndroidFindBy( accessibility = "FLUE BLOCKED OR DAMAGED")
    @iOSXCUITFindBy(accessibility = "FLUE BLOCKED OR DAMAGED")
    public WebElement flueBlockedOrDamagedButton;

    @AndroidFindBy( accessibility = "SYSTEM PRESSURE CORRECT")
    @iOSXCUITFindBy( accessibility = "SYSTEM PRESSURE CORRECT")
    public WebElement systemPressureCorrectButton;

    @AndroidFindBy( accessibility = "PRESSURE INCORRECT")
    @iOSXCUITFindBy( accessibility = "PRESSURE INCORRECT")
    public WebElement pressureIncorrectButton;

    @AndroidFindBy( accessibility = "CH HEATS SATISFACTORILY, NO KETTLING")
    @iOSXCUITFindBy( accessibility = "CH HEATS SATISFACTORILY, NO KETTLING")
    public WebElement chHeatsSatisfactorilyNoButton;

    @AndroidFindBy( accessibility = "CH DOES NOT HEAT SATISFACTORILY, BOILER KETTLES")
    @iOSXCUITFindBy( accessibility = "CH DOES NOT HEAT SATISFACTORILY, BOILER KETTLES")
    public WebElement chDoesNotHeatSatisfactorilyButton;

    @AndroidFindBy( accessibility = "FAN SPEED INCREASES")
    @iOSXCUITFindBy(accessibility = "FAN SPEED INCREASES")
    public WebElement fanSpeedIncreasesButton;

    @AndroidFindBy( accessibility = "FAN SPEED DOES NOT INCREASE")
    @iOSXCUITFindBy(accessibility = "FAN SPEED DOES NOT INCREASE")
    public WebElement fanSpeedDoesNotIncreaseButton;

    @AndroidFindBy( accessibility = "GAS INLET PRESSURE SATISFACTORY")
    @iOSXCUITFindBy(accessibility = "GAS INLET PRESSURE SATISFACTORY")
    public WebElement gasInletPressureSatisfactoryButton;

    @AndroidFindBy( accessibility = "GAS INLET PRESSURE UNSATISFACTORY")
    @iOSXCUITFindBy(accessibility = "GAS INLET PRESSURE UNSATISFACTORY")
    public WebElement gasInletPressureUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "CONTROL KNOB SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "CONTROL KNOB SATISFACTORY")
    public WebElement controlKnobSatisfactoryButton;

    @AndroidFindBy( accessibility = "CONTROL KNOB UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "CONTROL KNOB UNSATISFACTORY")
    public WebElement controlKnobUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "DIFFERENTIAL AS ABOVE")
    @iOSXCUITFindBy( accessibility = "DIFFERENTIAL AS ABOVE")
    public WebElement differentialAsAboveButton;

    @AndroidFindBy( accessibility = "DIFFERENTIAL EXCESSIVELY HIGH")
    @iOSXCUITFindBy( accessibility = "DIFFERENTIAL EXCESSIVELY HIGH")
    public WebElement differentialExcessivelyHighButton;

    @AndroidFindBy( accessibility = "DIFFERENTIAL CORRECT")
    @iOSXCUITFindBy( accessibility = "DIFFERENTIAL CORRECT")
    public WebElement differentialCorrectButton;

    @AndroidFindBy( accessibility = "SPINDLE RETRACTED AS SHOWN")
    @iOSXCUITFindBy( accessibility = "SPINDLE RETRACTED AS SHOWN")
    public WebElement spindleRetractedAsShownButton;

    @AndroidFindBy( accessibility = "SPINDLE NOT RETRACTED")
    @iOSXCUITFindBy( accessibility = "SPINDLE NOT RETRACTED")
    public WebElement spindleNotRetractedButton;

    @AndroidFindBy( accessibility = "RESISTANCES AS ABOVE AND IN GOOD CONDITION")
    @iOSXCUITFindBy( accessibility = "RESISTANCES AS ABOVE AND IN GOOD CONDITION")
    public WebElement resistancesAsAboveAndInGoodButton;

    @AndroidFindBy( accessibility = "DHW SENSOR SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "DHW SENSOR SATISFACTORY")
    public WebElement dhwSensorSatisfactoryButton;

    @AndroidFindBy( accessibility = "DHW SENSOR UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "DHW SENSOR UNSATISFACTORY")
    public WebElement dhwSensorUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "VOLTAGE REDUCES AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGE REDUCES AS ABOVE")
    public WebElement voltageReducesAsAboveButton;

    @AndroidFindBy( accessibility = "VOLTAGE DOES NOT REDUCE AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGE DOES NOT REDUCE AS ABOVE")
    public WebElement voltageDoesNotReduceAsAboveButton;

    @AndroidFindBy( accessibility = "SYPHON AND/OR DRAIN BLOCKED")
    @iOSXCUITFindBy( accessibility = "SYPHON AND/OR DRAIN BLOCKED")
    public WebElement syphonAndOrDrainBlockedButton;

    @AndroidFindBy( accessibility = "FLAME SENSE ELECTRODE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "FLAME SENSE ELECTRODE SATISFACTORY")
    public WebElement flameSenseElectrodeSatisfactoryButton;

    @AndroidFindBy( accessibility = "FLAME SENSE ELECTRODE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "FLAME SENSE ELECTRODE UNSATISFACTORY")
    public WebElement flameSenseElectrodeUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "VOLTAGE ABSENT")
    @iOSXCUITFindBy( accessibility = "VOLTAGE ABSENT")
    public WebElement voltageAbsentButton;

    @AndroidFindBy( accessibility = "FAN RUNS THEN SPEEDS UP FOR 5 SECONDS THEN SLOWS & REPEATS (NORMAL OPERATION)")
    @iOSXCUITFindBy( accessibility = "FAN RUNS THEN SPEEDS UP FOR 5 SECONDS THEN SLOWS & REPEATS (NORMAL OPERATION)")
    public WebElement fanRunsThenSpeedsUpFor5Button;

    @AndroidFindBy( accessibility = "STRONG AND CONSISTENT SPARKING OCCURS")
    @iOSXCUITFindBy( accessibility = "STRONG AND CONSISTENT SPARKING OCCURS")
    public WebElement strongAndConsistentSparkingButton;

    @AndroidFindBy( accessibility = "PRESSURE BEHAVES AS DESCRIBED ABOVE")
    @iOSXCUITFindBy( accessibility = "PRESSURE BEHAVES AS DESCRIBED ABOVE")
    public WebElement pressureBehavesAsDescribedButton;

    @AndroidFindBy( accessibility = "ELECTRODE LEADS IN GOOD CONDITION RESISTANCE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE LEADS IN GOOD CONDITION RESISTANCE SATISFACTORY")
    public WebElement electrodeLeadsInGoodConditionButton;

    @AndroidFindBy( accessibility = "FAN PRESSURE IS AS EXPECTED (DOES NOT DROP BELOW -1.5 MBAR)")
    @iOSXCUITFindBy( accessibility = "FAN PRESSURE IS AS EXPECTED (DOES NOT DROP BELOW -1.5 MBAR)")
    public WebElement fanPressureIsAsExpectedButton;

    @AndroidFindBy( accessibility = "AIR INTAKE CLEAR OF RESTRICTIONS AND/OR BLOCKAGES")
    @iOSXCUITFindBy( accessibility = "AIR INTAKE CLEAR OF RESTRICTIONS AND/OR BLOCKAGES")
    public WebElement airIntakeClearOfRestrictionsButton;

    @AndroidFindBy( accessibility = "BURNER AND ELECTRODE ASSEMBLY IN GOOD CONDITION")
    @iOSXCUITFindBy( accessibility = "BURNER AND ELECTRODE ASSEMBLY IN GOOD CONDITION")
    public WebElement burnerAndElectrodeAssemblyButton;

    @AndroidFindBy( accessibility = "XSOL DIAGNOSIS FROM START SEQUENCE")
    @iOSXCUITFindBy( accessibility = "XSOL DIAGNOSIS FROM START SEQUENCE")
    public WebElement xsolDiagnosisFromStartLink;















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

    @AndroidFindBy( accessibility = "BOILER FIRES WITH NO DEMAND")
    @iOSXCUITFindBy(accessibility = "BOILER FIRES WITH NO DEMAND")
    public WebElement boilerFiresWithNoButton;

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

    @AndroidFindBy(accessibility = "Select Outcome (6), \uF145")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Select Outcome (6), \uF145\"`]")
    public WebElement selectOutcome6Button;


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


    @AndroidFindBy( accessibility = "PUMP RUNNING")
    @iOSXCUITFindBy( accessibility = "PUMP RUNNING")
    public WebElement pumpRunningButton;

    @AndroidFindBy( accessibility = "PUMP DOES NOT RUN")
    @iOSXCUITFindBy( accessibility = "PUMP DOES NOT RUN")
    public WebElement pumpDoesNotRunButton;


    //select from 4
    @AndroidFindBy( accessibility = "FAN RUNS")
    @iOSXCUITFindBy( accessibility = "FAN RUNS")
    public WebElement fanRunsButton;

    @AndroidFindBy( accessibility = "FAN RUNS CONTINUALLY WITH NO DEMAND")
    @iOSXCUITFindBy( accessibility = "FAN RUNS CONTINUALLY WITH NO DEMAND")
    public WebElement fanRunsContinuallyWithNoButton;

    @AndroidFindBy( accessibility = "FAN RUNS FOR APPROX 10 SECONDS THEN STOPS 4 TIMES")
    @iOSXCUITFindBy( accessibility = "FAN RUNS FOR APPROX 10 SECONDS THEN STOPS 4 TIMES")
    public WebElement fanRunsForApproxButton;

    @AndroidFindBy( accessibility = "FAN DOESN'T RUN")
    @iOSXCUITFindBy( accessibility = "FAN DOESN'T RUN")
    public WebElement fanDoesntRunButton;


    //Select from 5
    @AndroidFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES")
    @iOSXCUITFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES")
    public WebElement burnerIgnitesAndEstablishesButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES BUT DOESNT ESTABLISH")
    @iOSXCUITFindBy( accessibility = "BURNER IGNITES BUT DOESNT ESTABLISH")
    public WebElement burnerIgnitesButDoesntButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES BUT WITH EXPLOSIVE IGNITION")
    @iOSXCUITFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES BUT WITH EXPLOSIVE IGNITION")
    public WebElement burnerIgnitesAndEstalishesButButton;

    @AndroidFindBy( accessibility = "IGNITES BUT NOISY OR BAFFLES OUT")
    @iOSXCUITFindBy( accessibility = "IGNITES BUT NOISY OR BAFFLES OUT")
    public WebElement ignitesButNoisyButton;

    @AndroidFindBy( accessibility = "BURNER DOESNT IGNITE")
    @iOSXCUITFindBy( accessibility = "BURNER DOESNT IGNITE")
    public WebElement burnerDoesntIgnitesButton;

    //Select From 5
    @AndroidFindBy( accessibility = "BOILER OPERATION SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "BOILER OPERATION SATISFACTORY")
    public WebElement boilerOperationSatisfactoryButton;

    @AndroidFindBy( accessibility = "BOILER AT TEMPERATURE BUT SYSTEM TOO COOL")
    @iOSXCUITFindBy( accessibility = "BOILER AT TEMPERATURE BUT SYSTEM TOO COOL")
    public WebElement boilerAtTemperatureButton;

    @AndroidFindBy( accessibility = "BOILER AND SYSTEM RUNNING TOO HOT")
    @iOSXCUITFindBy( accessibility = "BOILER AND SYSTEM RUNNING TOO HOT")
    public WebElement boilerAndSystemButton;

    @AndroidFindBy( accessibility = "BOILER AND SYSTEM TOO COOL")
    @iOSXCUITFindBy( accessibility = "BOILER AND SYSTEM TOO COOL")
    public WebElement boilerAndSystemTooCoolButton;

    @AndroidFindBy( accessibility = "BOILER NOISY")
    @iOSXCUITFindBy( accessibility = "BOILER NOISY")
    public WebElement boilerNoisyButton;



    @AndroidFindBy( accessibility = "FAN SPEED REDUCES")
    @iOSXCUITFindBy( accessibility = "FAN SPEED REDUCES")
    public WebElement fanSpeedReducesButton;

    @AndroidFindBy( accessibility = "FAN SPEED DOES NOT REDUCE")
    @iOSXCUITFindBy( accessibility = "FAN SPEED DOES NOT REDUCE")
    public WebElement fanSpeedDoesNotReduceButton;

    @AndroidFindBy( accessibility = "RESISTANCE AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCE AS EXPECTED")
    public WebElement resistanceAsExpectedButton;

    @AndroidFindBy( accessibility = "RESISTANCE OUTSIDE RANGE")
    @iOSXCUITFindBy( accessibility = "RESISTANCE OUTSIDE RANGE")
    public WebElement resistanceOutsideRangeButton;

    @AndroidFindBy( accessibility = "BOILER RESPONDS TO DEMAND")
    @iOSXCUITFindBy( accessibility = "BOILER RESPONDS TO DEMAND")
    public WebElement boilerRespondsToDemandButton;

    @AndroidFindBy( accessibility = "BOILER DOES NOT RESPOND")
    @iOSXCUITFindBy( accessibility = "BOILER DOES NOT RESPOND")
    public WebElement boilerDoesNotRespondButton;

    @AndroidFindBy( accessibility = "DHW OPERATION SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "DHW OPERATION SATISFACTORY")
    public WebElement dhwOperationSatisfactoryButton;

    @AndroidFindBy( accessibility = "DHW OPERATION UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "DHW OPERATION UNSATISFACTORY")
    public WebElement dhwOperationUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "SET CORRECTLY")
    @iOSXCUITFindBy( accessibility = "SET CORRECTLY")
    public WebElement setCorrectlyButton;

    @AndroidFindBy( accessibility = "SET INCORRECTLY OR FOR TOO LONG")
    @iOSXCUITFindBy( accessibility = "SET INCORRECTLY OR FOR TOO LONG")
    public WebElement setIncorrectlyButton;


    @AndroidFindBy( accessibility = "SYSTEM FILLED AND FULLY VENTED")
    @iOSXCUITFindBy( accessibility = "SYSTEM FILLED AND FULLY VENTED")
    public WebElement systemFilledAndFullyButton;

    @AndroidFindBy( accessibility = "SYSTEM NOT FILLED OR FULLY VENTED")
    @iOSXCUITFindBy( accessibility = "SYSTEM NOT FILLED OR FULLY VENTED")
    public WebElement systemNotFilledButton;

    @AndroidFindBy( accessibility = "CH SET POINT SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "CH SET POINT SATISFACTORY")
    public WebElement chSetPointSatisfactoryButton;

    @AndroidFindBy( accessibility = "CH SET POINT UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "CH SET POINT UNSATISFACTORY")
    public WebElement chSetPointUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "HEAT OUTPUT CORRECT")
    @iOSXCUITFindBy( accessibility = "HEAT OUTPUT CORRECT")
    public WebElement heatOutputCorrect;

    @AndroidFindBy( accessibility = "HEAT OUTPUT INCORRECT")
    @iOSXCUITFindBy( accessibility = "HEAT OUTPUT INCORRECT")
    public WebElement heatOutputIncorrect;

    @AndroidFindBy( uiAutomator = "new UiSelector().description(\"RESISTANCE AS EXPECTED\")")
    @iOSXCUITFindBy( accessibility = "RESISTANCE AS EXPECTED")
    public WebElement resistanceAsExpectedUIButton;

    @AndroidFindBy( accessibility = "RESISTANCE NOT AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCE NOT AS EXPECTED")
    public WebElement resistanceNotAsExpectedButton;

    @AndroidFindBy( accessibility = "WATER AT OUTLET OF CONDENSATE TRAP")
    @iOSXCUITFindBy( accessibility = "WATER AT OUTLET OF CONDENSATE TRAP")
    public WebElement waterAtOutletOfCondensateButton;

    @AndroidFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    @iOSXCUITFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    public WebElement noWaterRunningThroughButton;

    @AndroidFindBy( accessibility = "WATER AT SUMP OUTLET")
    @iOSXCUITFindBy( accessibility = "WATER AT SUMP OUTLET")
    public WebElement waterAtSumpOutletButton;

    @AndroidFindBy( accessibility = "NOTHING DRAINING THROUGH SUMP")
    @iOSXCUITFindBy( accessibility = "NOTHING DRAINING THROUGH SUMP")
    public WebElement nothingDrainingThroughButton;

    @AndroidFindBy( accessibility = "PUMP SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "PUMP SATISFACTORY")
    public WebElement pumpSatisfactoryButton;

    @AndroidFindBy( accessibility = "PUMP UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "PUMP UNSATISFACTORY")
    public WebElement pumpUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS CLEAR")
    @iOSXCUITFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS CLEAR")
    public WebElement heatExchangerFluewaysClearButton;

    @AndroidFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS BLOCKED OR RESTRICTED")
    @iOSXCUITFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS BLOCKED OR RESTRICTED")
    public WebElement heatExchangerFluewaysButton;

    @AndroidFindBy( accessibility = "20°C OR LESS")
    @iOSXCUITFindBy( accessibility = "20°C OR LESS")
    public WebElement cOrLessButton;

    @AndroidFindBy( accessibility = "MORE THAN 20°C")
    @iOSXCUITFindBy( accessibility = "MORE THAN 20°C")
    public WebElement moreThanCButton;

    @AndroidFindBy( accessibility = "BURNER GOES OUT")
    @iOSXCUITFindBy( accessibility = "BURNER GOES OUT")
    public WebElement burnerGoesOutButton;

    @AndroidFindBy( accessibility = "BURNER STAYS ON")
    @iOSXCUITFindBy( accessibility = "BURNER STAYS ON")
    public WebElement burnerStaysOnButton;

    @AndroidFindBy( accessibility = "PUMP OVERRUN INDICATED")
    @iOSXCUITFindBy( accessibility = "PUMP OVERRUN INDICATED")
    public WebElement pumpOverrunIndicatedButton;

    @AndroidFindBy( accessibility = "PUMP OVERRUN NOT INDICATED")
    @iOSXCUITFindBy( accessibility = "PUMP OVERRUN NOT INDICATED")
    public WebElement pumpOverrunNotIndicatedButton;

    @AndroidFindBy( accessibility = "PUMP OVERRUN INDICATED BUT PUMP NOT RUNNING")
    @iOSXCUITFindBy( accessibility = "PUMP OVERRUN INDICATED BUT PUMP NOT RUNNING")
    public WebElement pumpOverrunIndicatedButButton;

    @AndroidFindBy( accessibility = "PUMP OVERRUN ALREADY SET CORRECTLY")
    @iOSXCUITFindBy( accessibility = "PUMP OVERRUN ALREADY SET CORRECTLY")
    public WebElement pumpOverrunAlreadyButton;

    @AndroidFindBy( accessibility = "PUMP OVERRUN REQUIRED ADJUSTMENT")
    @iOSXCUITFindBy( accessibility = "PUMP OVERRUN REQUIRED ADJUSTMENT")
    public WebElement pumpOverrunRequiredButton;

    @AndroidFindBy( accessibility = "PRESSURE REACHES AT LEAST -0.8MB (E.G. -1.5MB)")
    @iOSXCUITFindBy( accessibility = "PRESSURE REACHES AT LEAST -0.8MB (E.G. -1.5MB)")
    public WebElement pressureReachesAtLeastButton;

    @AndroidFindBy( accessibility = "PRESSURE DOES NOT REACH -0.8MB (E.G. -0.5MB)")
    @iOSXCUITFindBy( accessibility = "PRESSURE DOES NOT REACH -0.8MB (E.G. -0.5MB)")
    public WebElement pressureDoesNotReachButton;

    @AndroidFindBy( accessibility = "FLUE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "FLUE SATISFACTORY")
    public WebElement flueSatisfactoryButton;

    @AndroidFindBy( accessibility = "FLUE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "FLUE UNSATISFACTORY")
    public WebElement flueUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "BURNER CLEAR AND UNDAMAGED")
    @iOSXCUITFindBy( accessibility = "BURNER CLEAR AND UNDAMAGED")
    public WebElement burnerClearAndUndamagedButton;

    @AndroidFindBy( accessibility = "BURNER RESTRICTED / BLOCKED OR DAMAGED")
    @iOSXCUITFindBy( accessibility = "BURNER RESTRICTED / BLOCKED OR DAMAGED")
    public WebElement burnerRestrictedButton;

    @AndroidFindBy( accessibility = "GAS RATE CORRECT")
    @iOSXCUITFindBy( accessibility = "GAS RATE CORRECT")
    public WebElement gasRateCorrectButton;

    @AndroidFindBy( accessibility = "GAS RATE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "GAS RATE UNSATISFACTORY")
    public WebElement gasRateUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "SATISFACTORY")
    public WebElement satisfactoryButton;

    @AndroidFindBy( accessibility = "PRESSURE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "PRESSURE UNSATISFACTORY")
    public WebElement pressureUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "PRESSURE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "PRESSURE SATISFACTORY")
    public WebElement pressureSatisfactoryButton;

    @AndroidFindBy( accessibility = "COMBUSTION TESTS OK")
    @iOSXCUITFindBy( accessibility = "COMBUSTION TESTS OK")
    public WebElement combustionTestsOkbutton;

    @AndroidFindBy( accessibility = "COMBUSTION TESTS FAILED")
    @iOSXCUITFindBy( accessibility = "COMBUSTION TESTS FAILED")
    public WebElement combustionTestsFailedButton;


    @AndroidFindBy( accessibility = "AIR INTAKE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "AIR INTAKE SATISFACTORY")
    public WebElement airIntakeSatisfactoryButton;

    @AndroidFindBy( accessibility = "AIR INTAKE RESTRICTED OR BLOCKED")
    @iOSXCUITFindBy( accessibility = "AIR INTAKE RESTRICTED OR BLOCKED")
    public WebElement airIntakeRestrictedButton;

    @AndroidFindBy( accessibility = "INJECTOR CLEAR")
    @iOSXCUITFindBy( accessibility = "INJECTOR CLEAR")
    public WebElement injectionClearButton;

    @AndroidFindBy( accessibility = "INJECTOR BLOCKED")
    @iOSXCUITFindBy( accessibility = "INJECTOR BLOCKED")
    public WebElement injectionBlockedButton;

    @AndroidFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS CLEAR")
    @iOSXCUITFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS CLEAR")
    public WebElement heatExchangerClearButton;

    @AndroidFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS BLOCKED OR RESTRICTED")
    @iOSXCUITFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS BLOCKED OR RESTRICTED")
    public WebElement heatExchangerBlockedButton;

    @AndroidFindBy( accessibility = "BYPASS CORRECTLY ADJUSTED")
    @iOSXCUITFindBy( accessibility = "BYPASS CORRECTLY ADJUSTED")
    public WebElement bypassCorrectlyAdjustedButton;

    @AndroidFindBy( accessibility = "BYPASS INCORRECTLY ADJUSTED")
    @iOSXCUITFindBy( accessibility = "BYPASS INCORRECTLY ADJUSTED")
    public WebElement bypassIncorrectlyAdjustedButton;

    @AndroidFindBy( accessibility = "MOVES FREELY")
    @iOSXCUITFindBy( accessibility = "MOVES FREELY")
    public WebElement movesFreelyButton;

    @AndroidFindBy( accessibility = "RESTRICTED OR DAMAGED")
    @iOSXCUITFindBy( accessibility = "RESTRICTED OR DAMAGED")
    public WebElement restrictedOrDamagedButton;

    @AndroidFindBy( accessibility = "INLET PRESSURE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "INLET PRESSURE SATISFACTORY")
    public WebElement inletPressureSatisfactoryButton;

    @AndroidFindBy( accessibility = "INLET PRESSURE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "INLET PRESSURE UNSATISFACTORY")
    public WebElement inletPressureUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED ACROSS THE HARNESS")
    @iOSXCUITFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED ACROSS THE HARNESS")
    public WebElement continuityZeroResistanceButton;

    @AndroidFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED AT EACH WIRE IN THE HARNESS")
    @iOSXCUITFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED AT EACH WIRE IN THE HARNESS")
    public WebElement continuityZeroResistanceMeasuredAtEachButton;

    @AndroidFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS THE HARNESS")
    @iOSXCUITFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS THE HARNESS")
    public WebElement openCircuitMeasuredButton;

    @AndroidFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS 1 OR MORE OF THE HARNESS WIRES")
    @iOSXCUITFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS 1 OR MORE OF THE HARNESS WIRES")
    public WebElement openCircuitMeasuredAcrossButton;

    @AndroidFindBy( accessibility = "OPEN CIRCUIT MEASURED")
    @iOSXCUITFindBy( accessibility = "OPEN CIRCUIT MEASURED")
    public WebElement openCircuit_MeasuredButton;

    @AndroidFindBy( accessibility = "ELECTRODE LEAD SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE LEAD SATISFACTORY")
    public WebElement electrodeLeadSatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE LEAD UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE LEAD UNSATISFACTORY")
    public WebElement electrodeLeadUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "RESISTANCE AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCE AS EXPECTED")
    public WebElement resistaceAsExpectedButton;

    @AndroidFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    @iOSXCUITFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    public WebElement noWaterRunningTroughButton;

    @AndroidFindBy( accessibility = "ELECTRODE CHECKS ALL SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE CHECKS ALL SATISFACTORY")
    public WebElement electrodeChecksAllSatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE CHECKS SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE CHECKS SATISFACTORY")
    public WebElement electrodeChecksSatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE CHECKS UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE CHECKS UNSATISFACTORY")
    public WebElement electrodeChecksUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "STRONG CONSISTENT SPARK OBSERVED")
    @iOSXCUITFindBy( accessibility = "STRONG CONSISTENT SPARK OBSERVED")
    public WebElement strongConsistentSparkButton;

    @AndroidFindBy( accessibility = "WEAK OR NO SPARKING OBSERVED")
    @iOSXCUITFindBy( accessibility = "WEAK OR NO SPARKING OBSERVED")
    public WebElement weakOrNoSparkingButton;

    @AndroidFindBy( accessibility = "HARNESS CHECKS SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "HARNESS CHECKS SATISFACTORY")
    public WebElement harnessChecksSatisfactoryButton;

    @AndroidFindBy( accessibility = "HARNESS CHECKS UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "HARNESS CHECKS UNSATISFACTORY")
    public WebElement harnessChecksUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "VOLTAGE AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGE AS ABOVE")
    public WebElement voltageAsAboveButton;

    @AndroidFindBy( accessibility = "VOLTAGE NOT AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGE NOT AS ABOVE")
    public WebElement voltageNotAsAboveButton;

    @AndroidFindBy( accessibility = "VOLTAGES AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGES AS ABOVE")
    public WebElement voltagesAsAboveButton;

    @AndroidFindBy( accessibility = "VOLTAGES NOT AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGES NOT AS ABOVE")
    public WebElement voltagesNotAsAboveButton;

    @AndroidFindBy( accessibility = "STILL NOISY, EXPLOSIVE OR BAFFLING")
    @iOSXCUITFindBy( accessibility = "STILL NOISY, EXPLOSIVE OR BAFFLING")
    public WebElement stillNoisyExplosiveButton;

    @AndroidFindBy( accessibility = "BURNER NOW IGNITES SMOOTHLY AND DOES NOT BAFFLE")
    @iOSXCUITFindBy( accessibility = "BURNER NOW IGNITES SMOOTHLY AND DOES NOT BAFFLE")
    public WebElement burnerNowIgnitesSmoothlyButton;

    @AndroidFindBy( accessibility = "BAFFLE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "BAFFLE SATISFACTORY")
    public WebElement baffleSatisfactoryButton;

    @AndroidFindBy( accessibility = "BAFFLE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "BAFFLE UNSATISFACTORY")
    public WebElement baffleUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "RESISTANCES AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCES AS EXPECTED")
    public WebElement resistancesAsExpectedButton;

    @AndroidFindBy( accessibility = "RESISTANCES NOT AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCES NOT AS EXPECTED")
    public WebElement resistancesNotAsExpectedButton;

    @AndroidFindBy( accessibility = "BURNER STILL DOES NOT IGNITE AND / OR ESTABLISH")
    @iOSXCUITFindBy( accessibility = "BURNER STILL DOES NOT IGNITE AND / OR ESTABLISH")
    public WebElement burnerStillDoesNotIgniteButton;

    @AndroidFindBy( accessibility = "BURNER NOW IGNITES AND ESTABLISHES")
    @iOSXCUITFindBy( accessibility = "BURNER NOW IGNITES AND ESTABLISHES")
    public WebElement burnerNowIgnitesAndEstablishesButton;

    @AndroidFindBy( accessibility = "0 - 8.00 VDC  MEASURED")
    @iOSXCUITFindBy( accessibility = "0 - 8.00 VDC  MEASURED")
    public WebElement vdcMeasuredButton;

    @AndroidFindBy( accessibility = "APPROX. 12VDC OR GREATER MEASURED")
    @iOSXCUITFindBy( accessibility = "APPROX. 12VDC OR GREATER MEASURED")
    public WebElement greaterMeasuredButton;

    @AndroidFindBy( accessibility = "APPROX. 0V OR 11V DC MEASURED")
    @iOSXCUITFindBy( accessibility = "APPROX. 0V OR 11V DC MEASURED")
    public WebElement approxDcMeasuredButton;

    @AndroidFindBy( accessibility = "APPROX. 5.5VDC MEASURED")
    @iOSXCUITFindBy( accessibility = "APPROX. 5.5VDC MEASURED")
    public WebElement approxMeasuredButton;

    @AndroidFindBy( accessibility = "APPROX. 22VDC MEASURED")
    @iOSXCUITFindBy( accessibility = "APPROX. 22VDC MEASURED")
    public WebElement approx22vdcButton;

    @AndroidFindBy( accessibility = "NO OR INCORRECT VOLTAGE")
    @iOSXCUITFindBy( accessibility = "NO OR INCORRECT VOLTAGE")
    public WebElement noOrIncorrectVoltageButton;

    @AndroidFindBy( accessibility = "MAINS VOLTAGE MEASURED")
    @iOSXCUITFindBy( accessibility = "MAINS VOLTAGE MEASURED")
    public WebElement mainVoltageMeasuredButton;

    @AndroidFindBy( accessibility = "SHORT CIRCUIT MEASURED")
    @iOSXCUITFindBy( accessibility = "SHORT CIRCUIT MEASURED")
    public WebElement shortCircuitMeasuredButton;

    @AndroidFindBy( accessibility = "DISPLAY STILL BLANK")
    @iOSXCUITFindBy( accessibility = "DISPLAY STILL BLANK")
    public WebElement displayStillBlankButton;

    @AndroidFindBy( accessibility = "DISPLAY NOW WORKS")
    @iOSXCUITFindBy( accessibility = "DISPLAY NOW WORKS")
    public WebElement displayNowWorksButton;

    @AndroidFindBy( accessibility = "DISPLAY BLANK WITH FAN DISCONNECTED")
    @iOSXCUITFindBy( accessibility = "DISPLAY BLANK WITH FAN DISCONNECTED")
    public WebElement displayBlankWithFanButton;

    @AndroidFindBy( accessibility = "DISPLAY WORKING WITH FAN DISCONNECTED")
    @iOSXCUITFindBy( accessibility = "DISPLAY WORKING WITH FAN DISCONNECTED")
    public WebElement displayWorkingWithFanButton;

    @AndroidFindBy( accessibility = "ONE OR MORE VOLTAGES NOT AS ABOVE")
    @iOSXCUITFindBy( accessibility = "ONE OR MORE VOLTAGES NOT AS ABOVE")
    public WebElement oneOrMoreVoltageButton;

    @AndroidFindBy( accessibility = "TEMPERATURE ABOVE 8°C")
    @iOSXCUITFindBy( accessibility = "TEMPERATURE ABOVE 8°C")
    public WebElement temperatureAbove8CButton;

    @AndroidFindBy( accessibility = "TEMPERATURE 8°C OR LOWER")
    @iOSXCUITFindBy( accessibility = "TEMPERATURE 8°C OR LOWER")
    public WebElement temperature8cOrLowerButton;
}
