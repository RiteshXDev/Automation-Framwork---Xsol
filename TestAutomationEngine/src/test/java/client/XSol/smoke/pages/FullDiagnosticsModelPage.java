package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class FullDiagnosticsModelPage extends MobileBaseTest
{
    public FullDiagnosticsModelPage() {
        initMobileElements(this);

    }

    @AndroidFindBy(uiAutomator = " @AndroidFindBy(xpath = \"//android.widget.TextView[@text=\\\"Search Appliance\\\"]\")\n" +
            "    @iOSXCUITFindBy(iOSClassChain = \"**/XCUIElementTypeOther[`name == \\\"\\uF55F, Search Appliance\\\"`]\")\n" +
            "    public WebElement searchApplianceButton;")
    public WebElement diagnosticTypeSelectionLinks;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search Appliance\"]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"\uF55F, Search Appliance\"`]")
    public WebElement searchApplianceButton;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Search Appliance\"`]")
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

    @AndroidFindBy(accessibility = "FULL DIAGNOSTIC MODEL")
    @iOSXCUITFindBy(accessibility = "FULL DIAGNOSTIC MODEL")
    public WebElement fullDiagnosticModelLink;



    //Select From 4
    @AndroidFindBy( accessibility = "DISPLAY OPERATES AND BOILER ENTERS STANDBY AS  ABOVE")
    @iOSXCUITFindBy( accessibility = "DISPLAY OPERATES AND BOILER ENTERS STANDBY AS  ABOVE")
    public WebElement displayOperatorsAndBoilerButton;

    @AndroidFindBy( accessibility = "DISPLAY DOES NOT OPERATE")
    @iOSXCUITFindBy( accessibility = "DISPLAY DOES NOT OPERATE")
    public WebElement displayDoesNotOperateButton;

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
    public WebElement fanRunsContinuallyButton;

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
