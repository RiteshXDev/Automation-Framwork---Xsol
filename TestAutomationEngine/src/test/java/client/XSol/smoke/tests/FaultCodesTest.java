package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.FaultCodesPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class FaultCodesTest extends MobileBaseTest {
    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : ER Communication Fault ")
    public void test_faultCodes_erCommunicationFault() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/01_erCommunicationFacult/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();
        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.erCommunicationFaultLink);
        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_observationDisconnect.txt");

        ui.waitAndTap(page.erFaultClearedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_causingERFaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.erFaultStillShowingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_voltageToInterface.txt");

        ui.waitAndTap(page.oneOrMoreVoltageButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_erFault.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltagesAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_interfaceHarness.txt");

        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_erFault.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_erFault");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout ")
    public void test_faultCodes_f1IgnitionLockout() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        */

       // ui.printAllScrollableTexts();
        //ui.compareScreenWithFile(SD_PATH + "01_observationBurner.txt");

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_boilerOperation.txt");

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerOperationSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_chModulation.txt");

        ui.waitAndTap(page.fanSpeedDoesNotReduceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_flowThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_chModulation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_chModulation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.fanSpeedReducesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_dhwDemand.txt");

        ui.waitAndTap(page.boilerDoesNotRespondButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_dhwDemandRecognised.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerRespondToDemandButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_operationDhw.txt");

        ui.waitAndTap(page.dhwOperationUnsatisfactoryButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.dhwOperationSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_anticycle.txt");

        ui.waitAndTap(page.setIncorrectlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_stuckInAnticycle.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.setCorrectlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_applicanceAppears.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler at temperature but system too cool ")
    public void test_faultCodes_f1IgnitionLockout_boilerTemperature_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/01_boilerAtTemperature/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */


        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerAtTemperatureButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inspectionSystem.txt");

        ui.waitAndTap(page.systemNotFilledButon);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_notEnoughHeat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemFilledButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_boilerThermostatSet.txt");

        ui.waitAndTap(page.chSetPointUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_setPointAdjustment.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_inspectionHeat.txt");

        ui.waitAndTap(page.heatOutputIncorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_adjustmentHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_flowThermistor.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_flowThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_outOfRangeNot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noContinuityFlowNot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_returnTherminstor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_returnThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_outOfRangeNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_noContinuityReturn.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler at temperature but system too cool ")
    public void test_faultCodes_f1IgnitionLockout_boilerTemperature_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/01_boilerAtTemperature/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();



        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerAtTemperatureButton);
        ui.waitAndTap(page.systemFilledButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);
        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_condensateTrapAnd.txt");

        ui.waitAndTap(page.noWaterRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_blockedNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_blockedNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_restrictedNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_heatExchangerFlueways.txt");

        ui.waitAndTap(page.heatExchangerFluewaysBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_restrictedNotEnough.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatExchangeFluewaysClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_flowAndReturn.txt");

        ui.waitAndTap(page.moreThan);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.orLess);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_blockedNotEnough.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler and system running too hot ")
    public void test_faultCodes_f1IgnitionLockout_boilerAndSystemRunning_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/02_boilerAndSystemRunning/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.explicitWait(2);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.explicitWait(2);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerAndSystemRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_boilerThermistorSet.txt");

        ui.waitAndTap(page.chSetPointUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_setPointAdjustment.txt");


        //ui.performOnAndroid(() -> ui.waitAndTap(page.backButton));
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_inspectionHeatOutput.txt");

        ui.waitAndTap(page.heatOutputIncorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_adjustmentHeatingOutput.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_flowThermistorAnd.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_flowThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_outRangeBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_noContinuityFlow.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_returnThermistorAnd.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_returnThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_outOfRangeBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noContinuityReturn.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_endDemand.txt");

        ui.waitAndTap(page.burnerStaysOnButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_switchedLiveAtMain.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_permanentlyOnBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler and system running too hot ")
    public void test_faultCodes_f1IgnitionLockout_boilerAndSystemRunning_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/02_boilerAndSystemRunning/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerAndSystemRunningButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);
        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.burnerGoesOutButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_pumpOverrunStatus.txt");

        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.pumpOverrun_NotRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_boilerTooHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.pumpOverrunNotIndicatedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_boilerTooHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.pumpOverrunIndicatedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_overrunSetCorrectly.txt");

        ui.waitAndTap(page.pumpOverrunRequiredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_notSetCorrectly.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpOverrun_setCorrectlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_boilerAndSystem.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler and system too cool")
    public void test_faultCodes_f1IgnitionLockout_boilerAndSystemTooCool_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/03_boilerSystemTooCool/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.explicitWait(1);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerSystemTooCoolButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_boilerThermostatSet.txt");

        ui.waitAndTap(page.chSetPointUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_setPointAdjustment.txt");

        //ui.performOnAndroid(() -> ui.waitAndTap(page.backButton));
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_inspectionHeatoutput.txt");

        ui.waitAndTap(page.heatOutputIncorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_adjustmentHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_flowThermistorAnd.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_floeThermistorResistance.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_outOfRange.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_noContinuityFlow.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_reuturnThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_returnThermistorResistance.txt");

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
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler and system too cool")
    public void test_faultCodes_f1IgnitionLockout_boilerAndSystemTooCool_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/03_boilerSystemTooCool/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerSystemTooCoolButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);
        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_presssureFanOn.txt");

        ui.waitAndTap(page.pressureDoesNotReach);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_boilerTooCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_boilerTooCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_boilerTooCool.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler and system too cool")
    public void test_faultCodes_f1IgnitionLockout_boilerAndSystemTooCool_3() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/03_boilerSystemTooCool/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerSystemTooCoolButton);
        ui.waitAndTap(page.chSetPointSatisfactoryButton);
        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);
        ui.waitAndTap(page.gasRateCorrectButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.gasRateUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_inletPressure.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_inletPressureAtMeter.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_gasMeterTooLow.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_restrictedTooLow.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.satisfactoryButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_boilerTooCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_boilerTooCool.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_boilerTooCool.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler Noisy")
    public void test_faultCodes_f1IgnitionLockout_boilerNoisy_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/04_boilerNoisy/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerNoisyButton);
        ui.waitAndTap(page.systemNotFilledButon);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_boilerNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemFilledButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inspectionHeatOutput.txt");

        ui.waitAndTap(page.heatOutputIncorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_adjustmentHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_combustionTestHigh.txt");

        ui.waitAndTap(page.combustionTestFailedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_condunsateTrap.txt");

        ui.waitAndTap(page.noWaterRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_noisyFailed.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_operationDhw.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_airInTake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_operationDhw.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_injector.txt");

        ui.waitAndTap(page.injectorBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.injectorClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_heatExchanger.txt");

        ui.waitAndTap(page.heatExchangerFluewaysBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatExchangeFluewaysClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_noisy.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Boiler Noisy")
    public void test_faultCodes_f1IgnitionLockout_boilerNoisy_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/04_boilerNoisy/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitionAndEstablishesButton);
        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.boilerNoisyButton);
        ui.waitAndTap(page.systemFilledButton);
        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.combustionTestOkButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_operationDhw.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);

        ui.waitAndTap(page.noWaterThroughTrapButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutletTrapButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_flowThermistorAnd.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_returnThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_noisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.bypassIncorrectlyAdjustedButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.bypassCorrectlyAdjustedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_flowAndReutrn.txt");

        ui.waitAndTap(page.moreThan);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_boilerNoisy.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.orLess);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_fanMechanical.txt");

        ui.waitAndTap(page.restrictedOrDamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_ooperationDhw.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.movesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_boilerNoisy.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner ignites but doesn't establish")
    public void test_faultCodes_f1IgnitionLockout_burnerDoesntEstablish_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/05_burnerDoesntEstablish/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitesButDoesntButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inletPressureAt.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_gasMeterBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_restricterdBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.inletSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_resistanceHarness.txt");

        ui.waitAndTap(page.openCircuitMeasured_harnessWireButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_earthContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasured_harnessWireButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_sparkElectrode.txt");

        ui.waitAndTap(page.electrodeUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_notRectifying.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_resistanceSpark.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noRectificationPath.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_condensateTrap.txt");

        ui.waitAndTap(page.noWaterThroughTrapButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_sump.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner ignites but doesn't establish")
    public void test_faultCodes_f1IgnitionLockout_burnerDoesntEstablish_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/05_burnerDoesntEstablish/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnitesButDoesntButton);
        ui.waitAndTap(page.inletSatisfactoryButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);
        ui.waitAndTap(page.electrodeSatisfactoryButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.waterAtOutletTrapButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_pressureFanOn.txt");

        ui.waitAndTap(page.pressureDoesNotReach);
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

        ui.waitAndTap(page.electrodeCheckUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_damagesBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeCheckSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_injector.txt");

        ui.waitAndTap(page.injectorBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_doesNotEstablish.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.injectorClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_noRectification.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner ignites and establish but with explosive ignition")
    public void test_faultCodes_f1IgnitionLockout_burnerIgnites_explosiveIgnition_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/06_explosiveIgnition/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnites_ExplosiveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inletPressureAt.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_sparkTest.txt");

        ui.waitAndTap(page.noSparkObservedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_sparkElectrode.txt");

        ui.waitAndTap(page.electrodeLeadUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeLeadSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_powerToSpark.txt");

        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_fanSpeed.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_sparkGeneratorLead.txt");

        ui.waitAndTap(page.harnessCheckUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.harnessCheckSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noSpark.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.sparkObservedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_condensateTrap.txt");

        ui.waitAndTap(page.noWaterRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_explosiveIgnition.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner ignites and establish but with explosive ignition")
    public void test_faultCodes_f1IgnitionLockout_burnerIgnites_explosiveIgnition_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/06_explosiveIgnition/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnites_ExplosiveButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.sparkObservedButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);
        ui.waitAndTap(page.pressureDoesNotReach);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_electrode.txt");

        ui.waitAndTap(page.electrodeCheckUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_explosiveIgnition.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner ignites and establish but with explosive ignition")
    public void test_faultCodes_f1IgnitionLockout_burnerIgnites_explosiveIgnition_3() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/06_explosiveIgnition/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerIgnites_ExplosiveButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.sparkObservedButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);
        ui.waitAndTap(page.electrodeCheckSatisfactoryButton);
        ui.waitAndTap(page.burnerNowIgnitesSmoothlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stillNoisyExplosiveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_explosvieIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_heatExchanger.txt");

        ui.waitAndTap(page.baffleUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_explosiveIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.baffleSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_explosiveIgnition.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Ignites but noisy or baffles out")
    public void test_faultCodes_f1IgnitionLockout_ignitesButNoisy_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/07_ignitesButNoisy/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.ignitesButNoisyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletPressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inletPressure.txt");

        ui.waitAndTap(page.pressureUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_gasMeterBaffles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_restirctedBaffles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_condensateTrap.txt");

        ui.waitAndTap(page.noWaterRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_blockedBaffles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_blockedBaffles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_pressureFanOn.txt");

        ui.waitAndTap(page.pressureDoesNotReach);
        ui.waitAndTap(page.flueUnsatisfactoryButton);


        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_bafflesOutOr.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_bafflesOutOr.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_bafflesOurOr.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Ignites but noisy or baffles out")
    public void test_faultCodes_f1IgnitionLockout_ignitesButNoisy_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/07_ignitesButNoisy/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.ignitesButNoisyButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_bafflesOutOr.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_electrode.txt");

        ui.waitAndTap(page.electrodeCheckUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_noisyBaffles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeCheckSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_gasValveThrottle.txt");

        ui.waitAndTap(page.burnerNowIgnitesSmoothlyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_restrictedBaffles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stillNoisyExplosiveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_restrictedBaffles.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_heatExchanger.txt");

        ui.waitAndTap(page.baffleUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_bafflesOutOr.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.baffleSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_bafflesOutOr.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner doesnt ignite")
    public void test_faultCodes_f1IgnitionLockout_burnerDoesntIgnite_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/08_burnerDoesntIgnite/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerDoesntIgniteButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_inletPressure.txt");

        ui.waitAndTap(page.inletPressureSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_sparkTest.txt");

        ui.waitAndTap(page.weakOrNoSparkingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_sparkElectrode.txt");

        ui.waitAndTap(page.electrodeLeadUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.electrodeLeadSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_powerToSpark.txt");

        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_fanVoltageAt.txt");

        ui.waitAndTap(page.voltagesNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_hallSensor.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltagesAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_fanSpeedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_sparkGenerator.txt");

        ui.waitAndTap(page.harnessCheckUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.harnessCheckSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_noSparkBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.strongConsistentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_electrode.txt");

        ui.waitAndTap(page.electrodeCheckUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_damagedBurner.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner doesnt ignite")
    public void test_faultCodes_f1IgnitionLockout_burnerDoesntIgnite_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/08_burnerDoesntIgnite/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerDoesntIgniteButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.strongConsistentButton);
        ui.waitAndTap(page.electrodeCheckSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_resistanceGas.txt");

        ui.waitAndTap(page.resistancesNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_gasValveHarness.txt");

        ui.waitAndTap(page.harnessCheckUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.harnessCheckSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_noIgnition.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistancesAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_gasValve.txt");

        ui.waitAndTap(page.voltagesNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_noPowerToGas.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltagesAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_condensateTrap.txt");

        ui.waitAndTap(page.noWaterRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_blockedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_blockedBurner.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F1 Ignition Lockout - Burner doesnt ignite")
    public void test_faultCodes_f1IgnitionLockout_burnerDoesntIgnite_3() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/02_f1IgnitionLockout/08_burnerDoesntIgnite/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();

        ui.waitAndTap(page.f1IgnitionLockOutLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(204, 516), // F1 - Ignition Lockout - Android
                () -> ui.tapOnElement(103, 230)// F1 - Ignition Lockout - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
         */

        ui.waitAndTap(page.select5OptionButton);
        ui.waitAndTap(page.burnerDoesntIgniteButton);
        ui.waitAndTap(page.inletPressureSatisfactoryButton);
        ui.waitAndTap(page.strongConsistentButton);
        ui.waitAndTap(page.electrodeCheckSatisfactoryButton);
        ui.waitAndTap(page.resistancesAsExpectedButton);
        ui.waitAndTap(page.voltagesAsAboveButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);
        ui.waitAndTap(page.pressureDoesNotReach);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_restrictedOrDamaged.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_inspectionBurner.txt");

        ui.waitAndTap(page.burnerRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_restrictedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerClearAndUndamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_fluewaysBlocked.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pressureReachesAtLeastButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_gasValveThrottle.txt");

        ui.waitAndTap(page.burnerNowIgnitesAndButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_restrictedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerStillDoesNotIgniteButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_airIntake.txt");

        ui.waitAndTap(page.airIntakeRestrictedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_restrictedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.airIntakeSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_injector.txt");

        ui.waitAndTap(page.injectorBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_restrictedBurner.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.injectorClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_restrictedBurner.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F2 - Fan Fault - Fan Doesn't run")
    public void test_faultCodes_f2FanFault_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/03_f2FanFault/01_fanDoesntRun/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f2FanFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersButFaultLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(256, 590),//Fault Code : F2 - Fan Fault - Android
                () -> ui.tapOnElement(81,255)   //Fault Code : F2 - Fan Fault - iOS
        );


        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        // ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(160, 627), //Display Alters But Fault Code Reoccurs - Android
                () ->  ui.tapOnElement(84, 267)   //Display Alters But Fault Code Reoccurs - iOS
        );

        */

        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.fanDoesntRunButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_fanVoltageAtPCB.txt");

        ui.waitAndTap(page.noOrIncorrectVoltageButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.approxMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_fanVoltageAtPCB.txt");

        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_fanHarnessContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_f3FaultCodeOpen.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_fanMechanical.txt");

        ui.waitAndTap(page.restrictedOrDamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.movesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_f3FaultCode.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F2 - Fan Fault - Fan runs for Approx 10 seconds then stops 4 times")
    public void test_faultCodes_f2FanFault_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/03_f2FanFault/02_fanRunsForApprox/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f2FanFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersButFaultLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(256, 590),//Fault Code : F2 - Fan Fault - Android
                () -> ui.tapOnElement(81,255)   //Fault Code : F2 - Fan Fault - iOS
        );


        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        // ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(160, 627), //Display Alters But Fault Code Reoccurs - Android
                () ->  ui.tapOnElement(84, 267)   //Display Alters But Fault Code Reoccurs - iOS
        );

        */

        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.fanRunsForApprox10SecondsButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_fanVoltageAtPCB.txt");

        ui.waitAndTap(page.approx55VdcMeasured);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.approx0or11DcMeasured);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_fanHarness.txt");

        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_f3FaultCodeOpen.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_f3FaultCodeHall.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F2 - Fan Fault - Fan runs for Approx 10 seconds then stops 4 times")
    public void test_faultCodes_f2FanFault_3() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/03_f2FanFault/03_fanDoesntRun/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f2FanFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersButFaultLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(256, 590),//Fault Code : F2 - Fan Fault - Android
                () -> ui.tapOnElement(81,255)   //Fault Code : F2 - Fan Fault - iOS
        );


        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        // ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(160, 627), //Display Alters But Fault Code Reoccurs - Android
                () ->  ui.tapOnElement(84, 267)   //Display Alters But Fault Code Reoccurs - iOS
        );

        */

        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.fanDoesntRunButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_fanVoltageAt.txt");

        ui.waitAndTap(page.noOrIncorrectVoltageButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.approxMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_fanVoltageAt.txt");

        ui.waitAndTap(page.voltageNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltageAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_fanHarnessContinuity.txt");

        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_fanMechanical.txt");

        ui.waitAndTap(page.restrictedOrDamagedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_f3FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.movesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_f3FaultCode.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F2 - Fan Fault - Display Alters then different fault codes appears")
    public void test_faultCodes_f2FanFault_differentFaultCodeAppears() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/03_f2FanFault/04_differentFaultCodes/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f2FanFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersThenDifferentLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(256, 590),//Fault Code : F2 - Fan Fault - Android
                () -> ui.tapOnElement(81,255)   //Fault Code : F2 - Fan Fault - iOS
        );


        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        // ui.waitAndTap(page.displayAltersButFaultLink);


        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(345, 757), //Display Alters then different fault code appears - Android
                () ->  ui.tapOnElement(105, 316) //Display Alters then different fault code appears - iOS
        );

         */


        ui.scrollToTop();
        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultCodes");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F2 - Fan Fault - Display Alters And Enters Standby")
    public void test_faultCodes_f2FanFault_entersStandby() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/03_f2FanFault/05_entersStandby/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f2FanFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersAndEntersLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(256, 590),//Fault Code : F2 - Fan Fault - Android
                () -> ui.tapOnElement(81,255)   //Fault Code : F2 - Fan Fault - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(349, 883), //Display Alters and Enters Standby - Android
                () ->  ui.tapOnElement(132, 362) //Display Alters and Enters Standby - iOS
        );


         */


        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_dignosticsTypeSelection.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F2 - Fan Fault - Display Does Not Alter")
    public void test_faultCodes_f2FanFault_doesNotAlter() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/03_f2FanFault/06_doesNotAtler/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f2FanFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayDoesNotAlterLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(256, 590),//Fault Code : F2 - Fan Fault - Android
                () -> ui.tapOnElement(81,255)   //Fault Code : F2 - Fan Fault - iOS
        );
        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(341, 950), //Display Does Not Alter - Android
                () ->  ui.tapOnElement(75, 387) //Display Does Not Alter - iOS
        );


         */


        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_resetF2.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F6 - Flow Thermistor Fault - Display Alters And Enters Standby")
    public void test_faultCodes_f6FlowThermistorFault_entersStandby_1() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/04_f6FlowThermistor/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f6FlowThermistorFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersAndEntersLink);



        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(208, 865), //Fault Code : F6 - Flow Thermistor Fault - Android
                () ->  ui.tapOnElement(73, 360) //Fault Code : F6 - Flow Thermistor Fault - iOS
        );


        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(393, 928), //Display Alters And Enters Standby - Android
                () ->  ui.tapOnElement(119, 381) //Display Alters And Enters Standby - iOS
        );

         */


        ui.waitAndTap(page.heatOutputIncorrectButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_adjustmentHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatOutputCorrect);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_inspectionSystem.txt");

        ui.waitAndTap(page.systemNotFilledButon);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_f5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemFilledButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_flowThermistor.txt");

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_flowThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_outOfRange.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_returnThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_returnThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_outOfRange.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_pumpRuns.txt");

        ui.waitAndTap(page.pumpDoesNotRunButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_pumpVoltageFrom.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_voltageAtPump.txt");

        ui.waitAndTap(page.mainsVoltageMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_f5FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainsVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_pumpHarness.txt");

        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_f5FaultCode.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistance_theHarnessButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_f5FaultCode.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F6 - Flow Thermistor Fault - Display Alters And Enters Standby")
    public void test_faultCodes_f6FlowThermistorFault_entersStandby_2() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/04_f6FlowThermistor/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f6FlowThermistorFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersAndEntersLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(208, 865), //Fault Code : F6 - Flow Thermistor Fault - Android
                () ->  ui.tapOnElement(73, 360) //Fault Code : F6 - Flow Thermistor Fault - iOS
        );

        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(393, 928), //Display Alters And Enters Standby - Android
                () ->  ui.tapOnElement(119, 381) //Display Alters And Enters Standby - iOS
        );

         */

        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.systemFilledButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.pumpUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_restrictedF5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_endOfDemand.txt");

        ui.waitAndTap(page.burnerStaysOnButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_switchedLiveAt.txt");

        ui.waitAndTap(page.mainsVoltageAbsentButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainsVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_slPermPower.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.burnerGoesOutButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_pumpOverrun.txt");

        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.pumpOverrun_NotRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_f5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.pumpOverrunNotIndicatedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_f5NoOverrun.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.pumpOverrunIndicatedButton);
        ui.waitAndTap(page.bypassIncorrectlyAdjustedButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F6 - Flow Thermistor Fault - Display Alters And Enters Standby")
    public void test_faultCodes_f6FlowThermistorFault_entersStandby_3() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/04_f6FlowThermistor/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f6FlowThermistorFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersAndEntersLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(208, 865), //Fault Code : F6 - Flow Thermistor Fault - Android
                () ->  ui.tapOnElement(73, 360) //Fault Code : F6 - Flow Thermistor Fault - iOS
        );

        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(393, 928), //Display Alters And Enters Standby - Android
                () ->  ui.tapOnElement(119, 381) //Display Alters And Enters Standby - iOS
        );

         */

        ui.waitAndTap(page.heatOutputCorrect);
        ui.waitAndTap(page.systemFilledButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.pumpRunningButton);
        ui.waitAndTap(page.pumpSatisfactoryButton);
        ui.waitAndTap(page.burnerGoesOutButton);
        ui.waitAndTap(page.select3OptionButton);
        ui.waitAndTap(page.pumpOverrunIndicatedButton);
        ui.waitAndTap(page.bypassCorrectlyAdjustedButton);
        ui.waitAndTap(page.noWaterThroughTrapButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_sump.txt");

        ui.waitAndTap(page.nothingDrainingThroughButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_blockedF5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_blockedF5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtSumpOutletButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_blockedF5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.waterAtOutputOfCondensateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_temperatureDifferential.txt");

        ui.waitAndTap(page.moreThan);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_f5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.orLess);
        ui.waitAndTap(page.flueUnsatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_blockageF5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.flueSatisfactoryButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_heatExchanger.txt");

        ui.waitAndTap(page.heatExchangerFluewaysBlockedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_restrictedF5.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatExchangeFluewaysClearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_f5.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F6 - Flow Thermistor Fault - Display Alters Then Different Fault Code Appears")
    public void test_faultCodes_f6FlowThermistorFault_differentFaultCodes() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/04_f6FlowThermistor/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f6FlowThermistorFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersThenDifferentLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(208, 865), //Fault Code : F6 - Flow Thermistor Fault - Android
                () ->  ui.tapOnElement(73, 360) //Fault Code : F6 - Flow Thermistor Fault - iOS
        );

        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(349, 991), //Display Alters then different fault code appears - Android
                () -> ui.tapOnElement(145, 407) //Display Alters then different fault code appears - iOS
        );

         */


        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_faultCode.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F6 - Flow Thermistor Fault - Display Alters But Fault Code immediately Reoccurs")
    public void test_faultCodes_f6FlowThermistorFault_faultCodeImmediatelyReoccurs() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/04_f6FlowThermistor/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f6FlowThermistorFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayAltersBut_immediatelyReoccursLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(208, 865), //Fault Code : F6 - Flow Thermistor Fault - Android
                () ->  ui.tapOnElement(73, 360) //Fault Code : F6 - Flow Thermistor Fault - iOS
        );

        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(390, 1143), //Display Alters But Fault Code immediately Reoccurs - Android
                () -> ui.tapOnElement(123, 457) //Display Alters But Fault Code immediately Reoccurs - iOS
        );

         */

        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_flowThermistor.txt");

        ui.waitAndTap(page.resistanceOutsideRangeButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_outOfRange.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "39_noContinuity.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "40_inspectionHarness.txt");

        ui.waitAndTap(page.HarnessInPoorConditionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "41_f6Damaged.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.harnessInGoodConditionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "42_f6.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Fault Codes : F6 - Flow Thermistor Fault - Display Does Not Alter")
    public void test_faultCodes_f6FlowThermistorFault_displayDoesNotAlter() {
        final String SD_PATH = "xsol/diagnosticsTypeSelection/facultCodes/04_f6FlowThermistor/";

        FaultCodesPage page = new FaultCodesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.waitAndTap(page.faultCodesLink);

        ui.scrollToTop();
        ui.waitAndTap(page.f6FlowThermistorFaultLink);
        ui.scrollToBottom();
        ui.waitAndTap(page.displayDoesNotAlterLink);

        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 969), //Fault Code Link - Android
                () -> ui.tapOnElement(84,396)   //Fault Code Link - iOS
        );

        ui.scrollToTop();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(208, 865), //Fault Code : F6 - Flow Thermistor Fault - Android
                () ->  ui.tapOnElement(73, 360) //Fault Code : F6 - Flow Thermistor Fault - iOS
        );

        //ui.waitAndTap(page.f1IgnitionLockoutLink);
        //ui.waitAndTap(page.displayAltersButFaultLink);

        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () ->  ui.tapOnElement(204, 1262), //Display Does Not Alter - Android
                () ->  ui.tapOnElement(76, 506) //Display Does Not Alter - iOS
        );

         */

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "43_resetf6.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }
}

