package client.XSol.regression.tests;

import base.mobile.MobileBaseTest;
import client.XSol.regression.pages.Boiler_4731157Page;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class Boiler_4731157Test extends MobileBaseTest {
    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_1() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwOperationSatisfactoryButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.chHeatsSatisfactorilyButton);
        ui.waitAndTap(page.systemPressureRisesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_pressure.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemPressureRemainsButton);
        ui.waitAndTap(page.burnerModulatesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_applianceAppears.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerDoesNotModulatesButton);
        ui.waitAndTap(page.resistanceConformsToButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_chModulation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceDoesNotConformsToButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_calibration4.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_2() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwOperationSatisfactoryButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.chNoisyButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);
        ui.waitAndTap(page.singleSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_fault2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.variableSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_chNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);
        ui.waitAndTap(page.bypassIncorrectButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.bypassCorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_restriction.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_3() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwOperationSatisfactoryButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerHeatsUpButSystemButton);
        ui.waitAndTap(page.spindleExtendedAsShownButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_mechanical3.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.spindleNotExtendedAsShownButton);
        ui.waitAndTap(page.voltageAsAboveButton);
        ui.waitAndTap(page.resistanceAsAboveAndInGoodButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_electrical2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceNotAsAboveOrInButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_diverterValveOperation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageNotAsAboveButton);
        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_fault.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_dvFunction3.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_4() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwOperationSatisfactoryButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerShutsDownBeforeButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);
        ui.waitAndTap(page.singleSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_efficiency2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.variableSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_chShutDown.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);
        ui.waitAndTap(page.resistanceDoesNotConformsToButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_calibration3.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceConformsToButton);
        ui.waitAndTap(page.syphonAndOrDrainButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_blocked4.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.syphonAndDrainClearButton);
        ui.waitAndTap(page.flueBlockedOrDamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_blockage4.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_chTempControl.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_5() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwOperationSatisfactoryButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerTempLowButton);
        ui.waitAndTap(page.resistanceDoesNotConformsToButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_calibration5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceConformsToButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_monitoringFunction.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_6() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwNoisyButton);
        ui.waitAndTap(page.pressureIncorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_dhwNoisey.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemPressureCorrectButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);
        ui.waitAndTap(page.singleSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_efficiency3.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.variableSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_dhwNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);
        ui.waitAndTap(page.chHeatsSatisfactorilyNoButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_primaryCircuit.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.chDoesNotHeatSatisfactorilyButton);
        ui.waitAndTap(page.bypassIncorrectButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.bypassCorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_dhwNoisy.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_7() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwTooCoolRadiatorsColdButton);
        ui.waitAndTap(page.pressureIncorrectButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemPressureCorrectButton);
        ui.waitAndTap(page.fanSpeedIncreasesButton);
        ui.waitAndTap(page.gasInletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_low3.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.gasInletPressureSatisfactoryButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);
        ui.waitAndTap(page.singleSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_efficiency.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.variableSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_dhwCoolRads.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);
        ui.waitAndTap(page.controlKnobUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_damaged.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.controlKnobSatisfactoryButton);
        ui.waitAndTap(page.differentialAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_dhwCoolRadsCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.differentialExcessivelyHighButton);
        ui.waitAndTap(page.differentialExcessivelyHighButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_dhwCoolRadsCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.differentialCorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_heatTransfer.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_8() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwCoolRadiatorsBeginButton);
        ui.waitAndTap(page.spindleRetractedAsShownButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_mechanical2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.spindleNotRetractedButton);
        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_dcFunction2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);
        ui.waitAndTap(page.resistanceNotAsAboveOrInButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_diverterNotOperating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistancesAsAboveAndInGoodButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_mechanical.txt");

        ui.waitAndTap(page.returnToHomeButton);

    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_9() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwTooHotButton);
        ui.waitAndTap(page.resistanceDoesNotConformsToTableButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_calibration.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceConformsToTableButton);
        ui.waitAndTap(page.resistanceDoesNotConformsToButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_calibration2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceConformsToButton);
        ui.waitAndTap(page.dhwSensorUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "39_scale.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.dhwSensorSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "40_dhwTempControl.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_10() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesCorrectlyButton);
        ui.waitAndTap(page.fanPressureIsAExpectedButton);
        ui.waitAndTap(page.burnerIgnitesWithChDemandButton);
        ui.waitAndTap(page.selectOutcome6Button);
        ui.waitAndTap(page.dhwRunsCoolBurnerButton);
        ui.waitAndTap(page.pressureIncorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "41_dhwBurnerCycles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemPressureCorrectButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);
        ui.waitAndTap(page.singleSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "42_dhwPumpRuns.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.variableSpeedPumpButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "43_dhwCycles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);
        ui.waitAndTap(page.resistanceDoesNotConformsToTableButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "44_dhwCycles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceConformsToTableButton);
        ui.waitAndTap(page.resistanceDoesNotConformsToButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "45_dhwCycles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceConformsToButton);
        ui.waitAndTap(page.differentialAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "46_dhwCycles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.differentialExcessivelyHighButton);
        ui.waitAndTap(page.differentialExcessivelyHighButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "47_dhwCycles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.differentialCorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "48_dhwCycles.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_11() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);

        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.burnerIgnitesSmoothlyButton);
        ui.waitAndTap(page.voltageAbsentButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);
        ui.waitAndTap(page.voltageDoesNotReduceAsAboveButton);
        ui.waitAndTap(page.gasInletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "49_low2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.gasInletPressureSatisfactoryButton);
        ui.waitAndTap(page.syphonAndOrDrainBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "50_blocked.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.syphonAndDrainClearButton);
        ui.waitAndTap(page.flueBlockedOrDamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "51_blockage2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueClearAndUndamagedButton);
        ui.waitAndTap(page.flameSenseElectrodeUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "52_fault.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flameSenseElectrodeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "53_damagedOrChoked2.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4731157")
    public void test_boiler4731157_12() {
        final String SD_PATH = "xsol/boilers/4731157/";

        Boiler_4731157Page page = new Boiler_4731157Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4731157");
        ui.waitAndTap(page.worcesterGreenstarButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);


        ui.waitAndTap(page.xsolDiagnosisFromStartLink);

        ui.waitAndTap(page.flowRateSatisfactoryButton);
        ui.waitAndTap(page.flowSwitchOperatesButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.combustionFanRunsButton);
        ui.waitAndTap(page.pumpRunsButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRUnsButBurnerDoesNotButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsThenSpeedsUpFor5Button);
        ui.waitAndTap(page.syphonAndDrainClearButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.strongAndConsistentSparkingButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.pressureBehavesAsDescribedButton);
        ui.waitAndTap(page.electrodeLeadsInGoodConditionButton);
        ui.waitAndTap(page.fanPressureIsAsExpectedButton);
        ui.waitAndTap(page.airIntakeClearOfRestrictionsButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.burnerAndElectrodeAssemblyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "54_mechanical.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

}





