package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class FaultCodesPage extends MobileBaseTest {
    public FaultCodesPage() {
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

    @AndroidFindBy( uiAutomator = "new UiSelector().description(\"Select Outcome (5), \uF145\")")
    public WebElement uiA_select5OptionButton;

    @AndroidFindBy( accessibility = "Select Outcome (3), \uF145")
    @iOSXCUITFindBy( accessibility = "Select Outcome (3), \uF145")
    public WebElement select3OptionButton;

    @AndroidFindBy( accessibility = "FAULT CODES Carries out tests associated with the selected fault code.")
    @iOSXCUITFindBy( accessibility = "FAULT CODES Carries out tests associated with the selected fault code.")
    public WebElement faultCodesLink;

    @AndroidFindBy( accessibility = "F1 - Ignition Lockout")
    public WebElement f1IgnitionLockOutLink;



    /* Fault Code Links  */

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ER - Communication Fault\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"ER - Communication Fault\"`][2]")
    public WebElement erCommunicationFaultLink;


    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"F1 - Ignition Lockout\"`][2]")
    public WebElement f1IgnitionLockoutLink;

    @AndroidFindBy( accessibility = "F2 - Fan Fault")
    public WebElement f2FanFaultLink;

    @AndroidFindBy( accessibility = "F6 - Flow thermistor fault")
    public WebElement f6FlowThermistorFaultLink;

    //Fault Codes : F2 - Fan Fault
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"DISPLAY ALTERS BUT FAULT CODE REOCCURS\"`][2]")
    public WebElement displayAlters_codeReoccursLink;




    @AndroidFindBy(accessibility = "MAINS VOLTAGE PRESENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE PRESENT")
    public WebElement mainVoltagePresentButton;

    @AndroidFindBy(accessibility = "MAINS VOLTAGE ABSENT")
    @iOSXCUITFindBy(accessibility = "MAINS VOLTAGE ABSENT")
    public WebElement mainVoltageAbsentButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement searchTopButton;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement seearchTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Jump to TYPE OF DIAGNOSTIC PROCEDURE\").instance(0)")
    public WebElement typeOfDiagnosticsProcedurelist;

    @AndroidFindBy(accessibility = "Search")
    public WebElement searchIconButton;

    @AndroidFindBy( accessibility = "ER FAULT STILL SHOWING")
    @iOSXCUITFindBy( accessibility = "ER FAULT STILL SHOWING")
    public WebElement erFaultStillShowingButton;

    @AndroidFindBy( accessibility = "ER FAULT CLEARED")
    @iOSXCUITFindBy( accessibility = "ER FAULT CLEARED")
    public WebElement erFaultClearedButton;

    @AndroidFindBy( accessibility = "VOLTAGE AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGE AS ABOVE")
    public WebElement voltageAsAboveButton;

    @AndroidFindBy( accessibility = "VOLTAGES AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGES AS ABOVE")
    public WebElement voltagesAsAboveButton;

    @AndroidFindBy( accessibility = "ONE OR MORE VOLTAGES NOT AS ABOVE")
    @iOSXCUITFindBy( accessibility = "ONE OR MORE VOLTAGES NOT AS ABOVE")
    public WebElement oneOrMoreVoltageButton;

    @AndroidFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED AT EACH WIRE IN THE HARNESS")
    @iOSXCUITFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED AT EACH WIRE IN THE HARNESS")
    public WebElement continuityZeroResistanceButton;

    @AndroidFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED ACROSS THE HARNESS")
    @iOSXCUITFindBy( accessibility = "CONTINUITY / ZERO RESISTANCE MEASURED ACROSS THE HARNESS")
    public WebElement continuityZeroResistance_theHarnessButton;

    @AndroidFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS 1 OR MORE OF THE HARNESS WIRES")
    @iOSXCUITFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS 1 OR MORE OF THE HARNESS WIRES")
    public WebElement openCircuitMeasuredButton;

    @AndroidFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS THE HARNESS")
    @iOSXCUITFindBy( accessibility = "OPEN CIRCUIT MEASURED ACROSS THE HARNESS")
    public WebElement openCircuitMeasured_harnessWireButton;






    @AndroidFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES")
    @iOSXCUITFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES")
    public WebElement burnerIgnitionAndEstablishesButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES BUT DOESNT ESTABLISH")
    @iOSXCUITFindBy( accessibility = "BURNER IGNITES BUT DOESNT ESTABLISH")
    public WebElement burnerIgnitesButDoesntButton;

    @AndroidFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES BUT WITH EXPLOSIVE IGNITION")
    @iOSXCUITFindBy( accessibility = "BURNER IGNITES AND ESTABLISHES BUT WITH EXPLOSIVE IGNITION")
    public WebElement burnerIgnites_ExplosiveButton;

    @AndroidFindBy( accessibility = "IGNITES BUT NOISY OR BAFFLES OUT")
    @iOSXCUITFindBy( accessibility = "IGNITES BUT NOISY OR BAFFLES OUT")
    public WebElement ignitesButNoisyButton;


    @AndroidFindBy( accessibility = "BOILER OPERATION SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "BOILER OPERATION SATISFACTORY")
    public WebElement boilerOperationSatisfactoryButton;

    @AndroidFindBy( accessibility = "BOILER AT TEMPERATURE BUT SYSTEM TOO COOL")
    @iOSXCUITFindBy( accessibility = "BOILER AT TEMPERATURE BUT SYSTEM TOO COOL")
    public WebElement boilerAtTemperatureButton;

    @AndroidFindBy( accessibility = "BOILER AND SYSTEM RUNNING TOO HOT")
    @iOSXCUITFindBy( accessibility = "BOILER AND SYSTEM RUNNING TOO HOT")
    public WebElement boilerAndSystemRunningButton;


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

    @AndroidFindBy( accessibility = "RESISTANCES AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCES AS EXPECTED")
    public WebElement resistancesAsExpectedButton;

    @AndroidFindBy( accessibility = "RESISTANCE OUTSIDE RANGE")
    @iOSXCUITFindBy( accessibility = "RESISTANCE OUTSIDE RANGE")
    public WebElement resistanceOutsideRangeButton;

    @AndroidFindBy( accessibility = "BOILER RESPONDS TO DEMAND")
    @iOSXCUITFindBy( accessibility = "BOILER RESPONDS TO DEMAND")
    public WebElement boilerRespondToDemandButton;

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
    public WebElement systemFilledButton;

    @AndroidFindBy( accessibility = "SYSTEM NOT FILLED OR FULLY VENTED")
    @iOSXCUITFindBy( accessibility = "SYSTEM NOT FILLED OR FULLY VENTED")
    public WebElement systemNotFilledButon;

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
    public WebElement heatOutputIncorrectButton;

    @AndroidFindBy( accessibility = "RESISTANCE NOT AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCE NOT AS EXPECTED")
    public WebElement resistanceNotAsExpectedButton;

    @AndroidFindBy( accessibility = "RESISTANCES NOT AS EXPECTED")
    @iOSXCUITFindBy( accessibility = "RESISTANCES NOT AS EXPECTED")
    public WebElement resistancesNotAsExpectedButton;

    @AndroidFindBy( accessibility = "WATER AT OUTLET OF CONDENSATE TRAP")
    @iOSXCUITFindBy( accessibility = "WATER AT OUTLET OF CONDENSATE TRAP")
    public WebElement waterAtOutputOfCondensateButton;

    @AndroidFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    @iOSXCUITFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    public WebElement noWaterRunningButton;

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
    public WebElement heatExchangeFluewaysClearButton;

    @AndroidFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS BLOCKED OR RESTRICTED")
    @iOSXCUITFindBy( accessibility = "HEAT EXCHANGER FLUEWAYS BLOCKED OR RESTRICTED")
    public WebElement heatExchangerFluewaysBlockedButton;

    @AndroidFindBy( accessibility = "20°C OR LESS")
    @iOSXCUITFindBy( accessibility = "20°C OR LESS")
    public WebElement orLess;

    @AndroidFindBy( accessibility = "MORE THAN 20°C")
    @iOSXCUITFindBy( accessibility = "MORE THAN 20°C")
    public WebElement moreThan;

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
    public WebElement pumpOverrun_NotRunningButton;

    @AndroidFindBy( accessibility = "PUMP OVERRUN ALREADY SET CORRECTLY")
    @iOSXCUITFindBy( accessibility = "PUMP OVERRUN ALREADY SET CORRECTLY")
    public WebElement pumpOverrun_setCorrectlyButton;

    @AndroidFindBy( accessibility = "PUMP OVERRUN REQUIRED ADJUSTMENT")
    @iOSXCUITFindBy( accessibility = "PUMP OVERRUN REQUIRED ADJUSTMENT")
    public WebElement pumpOverrunRequiredButton;

    @AndroidFindBy( accessibility = "BOILER AND SYSTEM TOO COOL")
    @iOSXCUITFindBy( accessibility = "BOILER AND SYSTEM TOO COOL")
    public WebElement  boilerSystemTooCoolButton;

    @AndroidFindBy( accessibility = "PRESSURE REACHES AT LEAST -0.8MB (E.G. -1.5MB)")
    @iOSXCUITFindBy( accessibility = "PRESSURE REACHES AT LEAST -0.8MB (E.G. -1.5MB)")
    public WebElement pressureReachesAtLeastButton;

    @AndroidFindBy( accessibility = "PRESSURE DOES NOT REACH -0.8MB (E.G. -0.5MB)")
    @iOSXCUITFindBy( accessibility = "PRESSURE DOES NOT REACH -0.8MB (E.G. -0.5MB)")
    public WebElement pressureDoesNotReach;

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

    @AndroidFindBy( accessibility = "FLUE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "FLUE SATISFACTORY")
    public WebElement flueSatisfactoryButton;

    @AndroidFindBy( accessibility = "FLUE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "FLUE UNSATISFACTORY")
    public WebElement flueUnsatisfactoryButton;

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
    public WebElement combustionTestOkButton;

    @AndroidFindBy( accessibility = "COMBUSTION TESTS FAILED")
    @iOSXCUITFindBy( accessibility = "COMBUSTION TESTS FAILED")
    public WebElement combustionTestFailedButton;

    @AndroidFindBy( accessibility = "AIR INTAKE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "AIR INTAKE SATISFACTORY")
    public WebElement airIntakeSatisfactoryButton;

    @AndroidFindBy( accessibility = "AIR INTAKE RESTRICTED OR BLOCKED")
    @iOSXCUITFindBy( accessibility = "AIR INTAKE RESTRICTED OR BLOCKED")
    public WebElement airIntakeRestrictedButton;

    @AndroidFindBy( accessibility = "INJECTOR CLEAR")
    @iOSXCUITFindBy( accessibility = "INJECTOR CLEAR")
    public WebElement injectorClearButton;

    @AndroidFindBy( accessibility = "INJECTOR BLOCKED")
    @iOSXCUITFindBy( accessibility = "INJECTOR BLOCKED")
    public WebElement injectorBlockedButton;

    @AndroidFindBy( accessibility = "WATER AT OUTLET OF CONDENSATE TRAP")
    @iOSXCUITFindBy( accessibility = "WATER AT OUTLET OF CONDENSATE TRAP")
    public WebElement waterAtOutletTrapButton;

    @AndroidFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    @iOSXCUITFindBy( accessibility = "NO WATER RUNNING THROUGH TRAP")
    public WebElement noWaterThroughTrapButton;

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
    public WebElement inletSatisfactoryButton;

    @AndroidFindBy( accessibility = "INLET PRESSURE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "INLET PRESSURE UNSATISFACTORY")
    public WebElement inletUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE LEAD SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE LEAD SATISFACTORY")
    public WebElement electrodeSatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE LEAD UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE LEAD UNSATISFACTORY")
    public WebElement electrodeUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE CHECKS ALL SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE CHECKS ALL SATISFACTORY")
    public WebElement electrodeCheckSatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE CHECKS UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE CHECKS UNSATISFACTORY")
    public WebElement electrodeCheckUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "INLET PRESSURE SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "INLET PRESSURE SATISFACTORY")
    public WebElement inletPressureSatisfactoryButton;

    @AndroidFindBy( accessibility = "INLET PRESSURE UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "INLET PRESSURE UNSATISFACTORY")
    public WebElement inletPressureUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "STRONG CONSISTENT SPARK OBSERVED")
    @iOSXCUITFindBy( accessibility = "STRONG CONSISTENT SPARK OBSERVED")
    public WebElement sparkObservedButton ;

    @AndroidFindBy( accessibility = "WEAK OR NO SPARKING OBSERVED")
    @iOSXCUITFindBy( accessibility = "WEAK OR NO SPARKING OBSERVED")
    public WebElement noSparkObservedButton;

    @AndroidFindBy( accessibility = "ELECTRODE LEAD SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE LEAD SATISFACTORY")
    public WebElement electrodeLeadSatisfactoryButton;

    @AndroidFindBy( accessibility = "ELECTRODE LEAD UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "ELECTRODE LEAD UNSATISFACTORY")
    public WebElement electrodeLeadUnsatisfactoryButton;

    @AndroidFindBy( accessibility = "VOLTAGE NOT AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGE NOT AS ABOVE")
    public WebElement voltageNotAsAboveButton;

    @AndroidFindBy( accessibility = "VOLTAGES NOT AS ABOVE")
    @iOSXCUITFindBy( accessibility = "VOLTAGES NOT AS ABOVE")
    public WebElement voltagesNotAsAboveButton;

    @AndroidFindBy( accessibility = "HARNESS CHECKS SATISFACTORY")
    @iOSXCUITFindBy( accessibility = "HARNESS CHECKS SATISFACTORY")
    public WebElement harnessCheckSatisfactoryButton;

    @AndroidFindBy( accessibility = "HARNESS CHECKS UNSATISFACTORY")
    @iOSXCUITFindBy( accessibility = "HARNESS CHECKS UNSATISFACTORY")
    public WebElement harnessCheckUnsatisfactoryButton;

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

    @AndroidFindBy( accessibility = "BURNER DOESNT IGNITE")
    @iOSXCUITFindBy( accessibility = "BURNER DOESNT IGNITE")
    public WebElement burnerDoesntIgniteButton;

    @AndroidFindBy( accessibility = "STRONG CONSISTENT SPARK OBSERVED")
    @iOSXCUITFindBy( accessibility = "STRONG CONSISTENT SPARK OBSERVED")
    public WebElement strongConsistentButton;

    @AndroidFindBy( accessibility = "WEAK OR NO SPARKING OBSERVED")
    @iOSXCUITFindBy( accessibility = "WEAK OR NO SPARKING OBSERVED")
    public WebElement weakOrNoSparkingButton;

    @AndroidFindBy( accessibility = "BURNER STILL DOES NOT IGNITE AND / OR ESTABLISH")
    @iOSXCUITFindBy( accessibility = "BURNER STILL DOES NOT IGNITE AND / OR ESTABLISH")
    public WebElement burnerStillDoesNotIgniteButton;

    @AndroidFindBy( accessibility = "BURNER NOW IGNITES AND ESTABLISHES")
    @iOSXCUITFindBy( accessibility = "BURNER NOW IGNITES AND ESTABLISHES")
    public WebElement burnerNowIgnitesAndButton;





    @AndroidFindBy( accessibility = "DISPLAY ALTERS BUT FAULT CODE REOCCURS")
    public WebElement displayAltersButFaultLink;

    @AndroidFindBy( accessibility = "DISPLAY ALTERS BUT FAULT CODE IMMEDIATELY REOCCURS")
    public WebElement displayAltersBut_immediatelyReoccursLink;

    @AndroidFindBy( accessibility = "DISPLAY ALTERS THEN DIFFERENT FAULT CODE APPEARS")
    public WebElement displayAltersThenDifferentLink;

    @AndroidFindBy( accessibility = "DISPLAY ALTERS AND ENTERS STANDBY")
    public WebElement displayAltersAndEntersLink;

    @AndroidFindBy( accessibility = "DISPLAY DOES NOT ALTER")
    public WebElement displayDoesNotAlterLink;

    @AndroidFindBy( accessibility = "FAN RUNS")
    public WebElement fanRunsButton;

    @AndroidFindBy( accessibility = "FAN RUNS FOR APPROX 10 SECONDS THEN STOPS 4 TIMES")
    @iOSXCUITFindBy( accessibility = "FAN RUNS FOR APPROX 10 SECONDS THEN STOPS 4 TIMES")
    public WebElement fanRunsForApprox10SecondsButton;

    @AndroidFindBy( accessibility = "FAN DOESN'T RUN")
    @iOSXCUITFindBy( accessibility = "FAN DOESN'T RUN")
    public WebElement fanDoesntRunButton;

    @AndroidFindBy( accessibility = "APPROX. 22VDC MEASURED")
    @iOSXCUITFindBy( accessibility = "APPROX. 22VDC MEASURED")
    public WebElement approxMeasuredButton;

    @AndroidFindBy( accessibility = "NO OR INCORRECT VOLTAGE")
    @iOSXCUITFindBy( accessibility = "NO OR INCORRECT VOLTAGE")
    public WebElement noOrIncorrectVoltageButton;

    @AndroidFindBy( accessibility = "APPROX. 0V OR 11V DC MEASURED")
    @iOSXCUITFindBy( accessibility = "APPROX. 0V OR 11V DC MEASURED")
    public WebElement approx0or11DcMeasured;

    @AndroidFindBy( accessibility = "APPROX. 5.5VDC MEASURED")
    @iOSXCUITFindBy( accessibility = "APPROX. 5.5VDC MEASURED")
    public WebElement approx55VdcMeasured ;

    @AndroidFindBy( accessibility = "PUMP RUNNING")
    @iOSXCUITFindBy( accessibility = "PUMP RUNNING")
    public WebElement pumpRunningButton;

    @AndroidFindBy( accessibility = "PUMP DOES NOT RUN")
    @iOSXCUITFindBy( accessibility = "PUMP DOES NOT RUN")
    public WebElement pumpDoesNotRunButton;

    @AndroidFindBy( accessibility = "MAINS VOLTAGE MEASURED")
    @iOSXCUITFindBy( accessibility = "MAINS VOLTAGE MEASURED")
    public WebElement mainsVoltageMeasuredButton;

    @AndroidFindBy( accessibility = "MAINS VOLTAGE ABSENT")
    @iOSXCUITFindBy( accessibility = "MAINS VOLTAGE ABSENT")
    public WebElement mainsVoltageAbsentButton;

    @AndroidFindBy( accessibility = "MAINS VOLTAGE PRESENT")
    @iOSXCUITFindBy( accessibility = "MAINS VOLTAGE PRESENT")
    public WebElement mainsVoltagePresentButton;

    @AndroidFindBy( accessibility = "HARNESS IN GOOD CONDITION THROUGHOUT")
    @iOSXCUITFindBy( accessibility = "HARNESS IN GOOD CONDITION THROUGHOUT")
    public WebElement harnessInGoodConditionButton;

    @AndroidFindBy( accessibility = "HARNESS IN POOR CONDITION")
    @iOSXCUITFindBy( accessibility = "HARNESS IN POOR CONDITION")
    public WebElement HarnessInPoorConditionButton;







}
