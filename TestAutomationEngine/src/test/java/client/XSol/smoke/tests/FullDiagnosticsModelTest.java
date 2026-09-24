package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.FullDiagnosticsModelPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class FullDiagnosticsModelTest extends MobileBaseTest {
    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler operation satisfaction ")
    public void test_fullDiagnosticsModel_boilerOperation() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/01_boilerOperationSatisfactory/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_importantNotice.txt");

        ui.waitAndTap(page.importantNoticeContinueButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_openVentedSystem.txt");

        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_observationBoiler.txt");

        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_pumpRuns.txt");

        ui.waitAndTap(page.pumpRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_fanRuns.txt");

        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_observationBurnerIgnities.txt");

        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_boilerOperation");

        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerOperationSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_chModulation.txt");

        ui.waitAndTap(page.fanSpeedDoesNotReduceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_flowThermostatResistance.txt");

        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_chModulation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_chModulation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.fanSpeedReducesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_dhwDemand.txt");

        ui.waitAndTap(page.boilerDoesNotRespondButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_dhwDemandRecognised.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerRespondsToDemandButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_operationDhw.txt");

        ui.waitAndTap(page.dhwOperationUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_operationDhw.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.dhwOperationSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_anticycle.txt");

        ui.waitAndTap(page.setCorrectlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_applicanceAppearsSatisfactory.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.setIncorrectlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_stuckInAnticycle.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler at temperature but system too cool ")
    public void test_fullDiagnosticsModel_boilerAtTemperature() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/02_boilerAtTemperature/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerAtTemperatureButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inspectionSystemFilled.txt");

        ui.waitAndTap(page.systemNotFilledButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_notEnoughHeat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemFilledAndFullyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_boilerThermostatSet.txt");

        ui.waitAndTap(page.chSetPointUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_setPointAdjustment.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_inspectionHeatOutput.txt");

        ui.waitAndTap(page.heatOutputIncorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_adjustmentHeatingOutput.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_flowThermostatAndHarness.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_flowThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_outOfRangeNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_NoContinuityFlowNot.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_returnThermistorAnd.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_returnThermistorAnd.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_flowThermistorAnd.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_noContinuityReturn.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_condensateTrapAndSump.txt");

        ui.waitAndTap(page.noWaterRunningThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_blockedNotEnoughHeat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_blockedNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_restrictedNotEnough.txt"); // Heading Format Issue

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_heatExchangerFlueways.txt");

        ui.waitAndTap(page.heatExchangerFluewaysButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_restrictedNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatExchangerFluewaysClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_flowAndReturn.txt");

        ui.waitAndTap(page.moreThanCButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.cOrLessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_blockedNotEnoughHeat.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler and system running too hot")
    public void test_fullDiagnosticsModel_boilerAndSystemRunning() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/03_boilerAndSystemRunning/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerAndSystemButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_boilerThermostatSetPoint.txt");

        ui.waitAndTap(page.chSetPointUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_setPointAdjustment.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_inspectionHeatOutput.txt");

        ui.waitAndTap(page.heatOutputIncorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_adjustmentHeatingOutput.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_flowThermistorAndHarness.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_flowThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_outOfRangeBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedUIButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noContinuityFlow.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.resistanceAsExpectedUIButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_returnThermistorAnd.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_returnThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_outOfRangeBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_noContinuityReturn.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.resistanceAsExpectedUIButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_endOfDemand.txt");

        ui.waitAndTap(page.burnerStaysOnButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_switchedLiveAtMain.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_permantlyOnBoilerToo.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_permPowerBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerGoesOutButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_pumpOverrunStatus.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.pumpOverrunIndicatedButButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_boilerTooHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.pumpOverrunNotIndicatedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_boilerTooHotNoOverrun.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.pumpOverrunIndicatedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_overrunSetCorrectly.txt");

        ui.waitAndTap(page.pumpOverrunRequiredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_notSetCorrectlyTooHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpOverrunAlreadyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_boilerAndSystemTooHot.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler and system too cool")
    public void test_fullDiagnosticsModel_boilerAndSystemTooCool_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/04_boilerAndSystemTooCool/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerAndSystemTooCoolButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_boilerThermostatSetPoint.txt");

        ui.waitAndTap(page.chSetPointUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_setPointAdjestment.txt");

        ui.waitAndTap(page.backButton);
        //ui.explicitWait(1);
        //ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_inspectionHeatOutput.txt");

        ui.waitAndTap(page.heatOutputIncorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_adjustmentHeatingOutput.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_flowThermistorAndHarness.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_flowTHermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_outOfRangeBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedUIButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_noContinuityFlowBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_returnTHermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_outOfRangeBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noContinuityReturn.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler and system too cool")
    public void test_fullDiagnosticsModel_boilerAndSystemTooCool_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/04_boilerAndSystemTooCool/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerAndSystemTooCoolButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);
        ui.waitAndTap(page.heatOutputCorrect);
        ui.explicitWait(1);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.pressureDoesNotReachButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_boilerTooCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_boilerTooCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_boilerTooCool.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.pressureReachesAtLeastButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.gasRateCorrectButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.gasRateUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_inletPressure.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_inletPressureAtMeter.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_gasMeterTooLow.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_restrictedTooLow.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.satisfactoryButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_boilerTooCoolRestricted.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_boilerTooCoolRestricted.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_boilerTooCoolFlueways.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler noisy")
    public void test_fullDiagnosticsModel_boilerNoisy_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/05_boilerNoisy/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerNoisyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inspectionSystemFilled.txt");

        ui.waitAndTap(page.systemNotFilledButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_boilerNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.systemFilledAndFullyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_inspectionHeatOuput.txt");

        ui.waitAndTap(page.heatOutputIncorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_adjustmentHeatingOutput.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_combustionTestHigh.txt");

        ui.waitAndTap(page.combustionTestsFailedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_condensateTrapAnd.txt");

        ui.waitAndTap(page.noWaterRunningThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_noisyFailedCombustion.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_operationHdwNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_operationDhwNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_injector.txt");

        ui.waitAndTap(page.injectionBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.injectionClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_heatExchangerFlueways.txt");

        ui.waitAndTap(page.heatExchangerBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_heatExchangerFlueways.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatExchangerFluewaysClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_noisyValveGas.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler noisy")
    public void test_fullDiagnosticsModel_boilerNoisy_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/05_boilerNoisy/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstablishesButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerNoisyButton);
        ui.waitAndTap(page.systemFilledAndFullyButton);
        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.combustionTestsOkbutton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_operationDhwNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_condensateTrapAndSump.txt");

        ui.waitAndTap(page.noWaterRunningThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_noisySiphon.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_flowThermostatAndHarness.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_noisyThermistor.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_returnThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_noisyThermistor.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.bypassIncorrectlyAdjustedButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.bypassCorrectlyAdjustedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_flowAndReturnTemperature.txt");

        ui.waitAndTap(page.moreThanCButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_boilerNoisyDiffrential.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.cOrLessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_fanMecganical.txt");

        ui.waitAndTap(page.restrictedOrDamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_operationDhwNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.movesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_fanMechanical.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Burner Ignites but doesn't establish")
    public void test_fullDiagnosticsModel_burnerIgnitesbut_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/06_burnerIgnitesBut/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesButDoesntButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_doesTheInlet.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_repairReplaceInstrution.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_restrictedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_resistanceHarness.txt");

        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_earthContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_sparkElectrodeLead.txt");

        ui.waitAndTap(page.electrodeLeadUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_notRectifying.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeLeadSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_resistanceSparkGenerator.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noRectificationPath.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_condensateTrapAnd.txt");

        ui.waitAndTap(page.noWaterRunningThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_sump.txt");

        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_doesNotEastablish.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Burner Ignites but doesn't establish")
    public void test_fullDiagnosticsModel_burnerIgnitesbut_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/06_burnerIgnitesBut/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesButDoesntButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);
        ui.waitAndTap(page.electrodeLeadSatisfactoryButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_pressureFanOnIgnition.txt");

        ui.waitAndTap(page.pressureDoesNotReachButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_electrode.txt");

        ui.waitAndTap(page.electrodeChecksUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_damagedBurnerLights.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeChecksAllSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_injector.txt");

        ui.waitAndTap(page.injectionBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.injectionClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_noRectification.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Burner Ignites and establishes but with explosive ignition")
    public void test_fullDiagnosticsModel_burnerIgnitesAndEstablishes_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/07_burnerIgnitesAndEstablishes/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstalishesButButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inletPressureAtMeter.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_explosiveIgnitionRestricted.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.weakOrNoSparkingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_sparkElectrodeLead.txt");

        ui.waitAndTap(page.electrodeLeadUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_noContinuityExplosive.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeLeadSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_powerToSparkGenerator.txt");

        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_fanSpeedExplosive.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_sparkGeneratorLead.txt");

        ui.waitAndTap(page.harnessChecksUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noContinuityExplosive.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.harnessChecksSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_noSparkExplosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.strongConsistentSparkButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_condenstaeTrapAndSump.txt");

        ui.waitAndTap(page.noWaterRunningThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_explosiveIgnitionBlocked.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_explosiveIgnitionBlocked.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Burner Ignites and establishes but with explosive ignition")
    public void test_fullDiagnosticsModel_burnerIgnitesAndEstablishes_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/07_burnerIgnitesAndEstablishes/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerIgnitesAndEstalishesButButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.strongConsistentSparkButton);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_pressureFanOn.txt");

        ui.waitAndTap(page.pressureDoesNotReachButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_explosiveIgnitionRestricted.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_inpsectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_explosiveIgnitionRestricted.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_explosiveIgnitionFluways.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_eletrode.txt");

        ui.waitAndTap(page.electrodeChecksUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeChecksAllSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_gasValveBaseSettings.txt");

        ui.waitAndTap(page.burnerNowIgnitesSmoothlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_explosiveIgnitionRestricted.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stillNoisyExplosiveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_explosiveIgnitionRetricted.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_heatExchanger.txt");

        ui.waitAndTap(page.baffleUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.baffleSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_explosiveIgnition.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Ignites but noisy or baffles out")
    public void test_fullDiagnosticsModel_ignitesButNoisy_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/08_IgnitesButNoisyOrBaffles/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.ignitesButNoisyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inletPressureAtMeter.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_repairReplaceInstructions.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_restrictedBafflesOut.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.inletPressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_condensateTrapAndSump.txt");

        ui.waitAndTap(page.noWaterRunningThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_blockedBafflesOut.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_blockedBafflesOut.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_pressureFanOn.txt");

        ui.waitAndTap(page.pressureDoesNotReachButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_bafflesOutOrIsNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_bafflesOutOrIsNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_bafflesOutOrIsNoisy.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Ignites but noisy or baffles out")
    public void test_fullDiagnosticsModel_ignitesButNoisy_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/08_IgnitesButNoisyOrBaffles/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.ignitesButNoisyButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_bafflesOutOrNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_electrode.txt");

        ui.waitAndTap(page.electrodeChecksUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_noisyBafflesManu.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeChecksAllSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_gasValveThrottle.txt");

        ui.waitAndTap(page.burnerNowIgnitesSmoothlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_restrictedBafflesOut.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stillNoisyExplosiveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_restrictedBafflesOut.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_heatExchangerBaffles.txt");

        ui.waitAndTap(page.baffleUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_bafflesOurOr.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.baffleSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_bafflesOutOrIs.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Burner Doesn't ignite")
    public void test_fullDiagnosticsModel_burnerDoesntIgnite_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/09_burnerDoesntIgnite/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerDoesntIgnitesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inletPressureAtMeter.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_burnerDoesNotIgnite.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_burnerDoesNotIgnite.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_sparkTest.txt");

        ui.waitAndTap(page.weakOrNoSparkingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_sparkElectrodeLead.txt");

        ui.waitAndTap(page.electrodeLeadUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_noContinuityBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeLeadSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_PowerToSparkGenerator.txt");

        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_fanVoltageAtPcb.txt");

        ui.waitAndTap(page.voltagesNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_hallSensorNoIngnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltagesAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_FanSpeedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_sparkGeneratorLead.txt");

        ui.waitAndTap(page.harnessChecksUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_noContinuityBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.harnessChecksSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_noSparkBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.strongConsistentSparkButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_electrode.txt");

        ui.waitAndTap(page.electrodeChecksUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_damagedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeChecksAllSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_resistanceGasValve.txt");

        ui.waitAndTap(page.resistancesNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_gasValveHarness.txt");

        ui.waitAndTap(page.harnessChecksUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_noContinuityBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.harnessChecksSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_noIgnitionSolenoid.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Burner Doesn't ignite")
    public void test_fullDiagnosticsModel_burnerDoesntIgnite_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/09_burnerDoesntIgnite/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.burnerDoesntIgnitesButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.strongConsistentSparkButton);
        ui.waitAndTap(page.electrodeChecksAllSatisfactoryButton);
        ui.waitAndTap(page.resistancesAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_gasValveVoltage.txt");

        ui.waitAndTap(page.voltagesNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_noPowerToGas.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltagesAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_condensateTrapAnd.txt");

        ui.waitAndTap(page.noWaterRunningThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_blockedBurnerDoesnt.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_blockedBurnerDoesnt.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutletOfCondensateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_pressureFanOnIgnition.txt");

        ui.waitAndTap(page.pressureDoesNotReachButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_restrictedOrDamaged.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_restrictedBurnerDoesnt.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_fluewaysBlockedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_gasValveThrottle.txt");

        ui.waitAndTap(page.burnerNowIgnitesAndEstablishesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_restirctedBurnerDoesnt.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerStillDoesNotIgniteButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_restrictedBurnerDoesnt.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_injector.txt");

        ui.waitAndTap(page.injectionBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_restrictedBurnerDoesnt.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.injectionClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_injector.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Fan runs continually with no demands")
    public void test_fullDiagnosticsModel_fanRunsContinually() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/10_fanRunsContinuallyWith/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsContinuallyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_fanVoltageAtPcb.txt");

        ui.waitAndTap(page.greaterMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_permanentlyOnFan.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.vdcMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_fanHarnessContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_openCircFanRuns.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_hallSensorFanRuns.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Fan runs for approx 10 seconds then stops 4 times")
    public void test_fullDiagnosticsModel_fanRunsForApprox() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/11_fanRunsForApprox/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanRunsForApproxButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_fanVoltageAtPcb.txt");

        ui.waitAndTap(page.approxMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_hallSenseConnection.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.approxDcMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_farHarnessContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_openCircFanRuns.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_hallSensorFanRuns.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Fan doesn't run")
    public void test_fullDiagnosticsModel_fanDoesntRun_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/12_fanDoesntRun/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanDoesntRunButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_fanVoltageAtPcb.txt");

        ui.waitAndTap(page.noOrIncorrectVoltageButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_noPowerToFan.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.approx22vdcButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_fanVoltageAtPcbG.txt");

        ui.waitAndTap(page.voltageAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_fanHarnessContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_openCircFanRuns.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_noVoltageBackFromFan.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Fan doesn't run")
    public void test_fullDiagnosticsModel_fanDoesntRun_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/12_fanDoesntRun/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.fanDoesntRunButton);
        ui.waitAndTap(page.approx22vdcButton);
        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_flowThermistorAnd.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_flowThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_outofRangeFanRuns.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noContinuityFlowFan.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_reutrnThermistorAnd.txt");

        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_frostProtectionOn.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_returnThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_outOfRangeFanRuns.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_noContinuityReturn.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Pump does not run")
    public void test_fullDiagnosticsModel_pumpDoesNotRun_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/13_pumpDoesNotRun/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpDoesNotRunButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_pumpVoltageFromPcb.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_voltageAtPump.txt");

        ui.waitAndTap(page.mainVoltageMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_notRunningPump.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_pumpHarnessContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_ocVoltageAtPump.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_ocPumpRuns.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Pump does not run")
    public void test_fullDiagnosticsModel_pumpDoesNotRun_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/13_pumpDoesNotRun/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayOperatorsAndBoilerButton);
        ui.waitAndTap(page.pumpDoesNotRunButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_switchedLiveVoltage.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_switchedLiveAtMains.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_noContinuityPump.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noContinuityPumpRuns.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Display does not operates")
    public void test_fullDiagnosticsModel_displayDoesNotOperates_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/14_displayDoesNotOperates/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayDoesNotOperateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_mainsPowerInputToApplicance.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_fuseF1.txt");

        ui.waitAndTap(page.openCircuit_MeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_fuseFurtherInvestigation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.shortCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_resistanceHarness.txt");

        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_observationDisplay.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_supplyFault.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_observationDisconnect.txt");

        ui.waitAndTap(page.displayNowWorksButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_observationDisconnectFan.txt");

        ui.waitAndTap(page.displayWorkingWithFanButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_noDisplay.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.displayBlankWithFanButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_shortedNoDisplay.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Display does not operates")
    public void test_fullDiagnosticsModel_displayDoesNotOperates_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/14_displayDoesNotOperates/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.displayDoesNotOperateButton);
        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.displayStillBlankButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_voltageToInterfacePcb.txt");

        ui.waitAndTap(page.voltagesAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_interfaceHarness.txt");

        ui.waitAndTap(page.continuityZeroResistanceMeasuredAtEachButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_noVoltagePowerUp.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_openCircPowerUp.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.oneOrMoreVoltageButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_fuseF2.txt");

        ui.waitAndTap(page.openCircuit_MeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_fuseFurtherInvestigation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.shortCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_noPowerToInterface.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler fires with no demand")
    public void test_fullDiagnosticsModel_boilerFiresWithNoDemand_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/15_boilerFiresWithNoDemand/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.boilerFiresWithNoDemandButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_voltagePcbSwitchedLive.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_powerUpFanRuns.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_temperatureAmbient.txt");

        ui.waitAndTap(page.temperature8cOrLowerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_powerUp.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.temperatureAbove8CButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_frostStatInputTo.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_frostStatPowerUp.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : Boiler fires with no demand")
    public void test_fullDiagnosticsModel_boilerFiresWithNoDemand_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/15_boilerFiresWithNoDemand/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.boilerFiresWithNoDemandButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);
        ui.waitAndTap(page.temperatureAbove8CButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_flowThermistorAnd.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_flowThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_outOfRangePowerUp.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noContinuityFlowPower.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_flowThermistorResistance.txt");

        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noContinuityFlowPower.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_outOfRangePower.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Full Diagnostics Model : fault code or ER displayed")
    public void test_fullDiagnosticsModel_faultCodeOrER() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/fullDiagnosticsModel/15_boilerFiresWithNoDemand/";

        FullDiagnosticsModelPage page = new FullDiagnosticsModelPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.fullDiagnosticModelLink);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.faultCodeOrERButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_faultCode.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }
}
