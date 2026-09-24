package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.FaultFindingSPanPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class FaultFindingSPlanTest extends MobileBaseTest {
    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The heating is not working but hot water is ok..")
    public void test_heatingIsNotWorking_zoneValveMoves_mvp() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/01_theHeatingNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_sPlanFaultFindingGuide.txt");

        ui.scrollToBottom();
        ui.waitAndTap(page.theHeatingIsNotWorkingButton);
        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(601,933), //Android
                () -> ui.tapOnElement(168,403)   //iOS
        );
        */

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_heatingZoneValve.txt");

        ui.waitAndTap(page.zoneValveMovesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_voltageOnOrangeWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_pumpRunning.txt");

        ui.waitAndTap(page.pumpIsRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_boilerRunning.txt");

        ui.waitAndTap(page.boilerLightingAndHeatingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_systemFaultHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerNotRespondingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_sPlanBoilerNotFiring.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpIsNotRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_voltageToPump.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_sPlanPumpNotRunning.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_sPlanNoPowerToPump.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The heating is not working but hot water is ok..")
    public void test_heatingIsNotWorking_zoneValveMoves_mva() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/01_theHeatingNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.theHeatingIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(601,933), //Android
                () -> ui.tapOnElement(168,403)   //iOS
        );
        */

        ui.waitAndTap(page.zoneValveMovesButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_voltageOnGreyWire.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noSupplyToGray.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_voltageOnBrownWire.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_sPlanNoHeating2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_resistanceEndFeed.txt");

        ui.waitAndTap(page.resistanceAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_microswitchFaulty.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_hotWaterOkNoHeating.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The heating is not working but hot water is ok..")
    public void test_heatingIsNotWorking_zoneValveNotMoving_mvp() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/01_theHeatingNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.theHeatingIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(601,933), //Android
                () -> ui.tapOnElement(168,403)   //iOS
        );
        */

        ui.waitAndTap(page.zoneValveNotMovingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_voltageOnBrownWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_resistanceBrownWire.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_resistanceSynchronMotor.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_noHeatingHWOk.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistance_As_AboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_noHeatingHWOk.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistance_As_AboveButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_mechanicalCheckSynchron.txt");

        ui.waitAndTap(page.motorRotatesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_headJammedHeating2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.motorDoesNotRotateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_sPlanNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_hotWaterOkNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_mechanicalCheckSynchron.txt");

        ui.waitAndTap(page.motorRotatesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_hotWaterOkNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.motorDoesNotRotateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_jammedNoHeating.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The heating is not working but hot water is ok..")
    public void test_heatingIsNotWorking_zoneValveNotMoving_mva() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/01_theHeatingNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.theHeatingIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(601,933), //Android
                () -> ui.tapOnElement(168,403)   //iOS
        );
        */

        ui.waitAndTap(page.zoneValveNotMovingButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_voltageRoomThermostat.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_linkOutRoomThermostat.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.mainVoltagePresentAndValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_sPlanNoheating.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageOkButValveNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_synchronMotorAndRoom.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_hotWaterOkNoHeat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_hotWater_nonRwv.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageStillNotPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_waterOkNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_linkOutTimerHeating.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.zoneValveHasOpenedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "39_sPlanNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageOkButValveNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "40_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "41_HwOkNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "42_hotWaterOkNoHeat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "43_hotWaterOkNoHeat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageStillNotPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "44_noVoltageToRoom.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Radiators are getting hot with no heating demand..")
    public void test_radiatorsAreGettingHot() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/02_radiatorsAreGettingHot/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.radiatorsAreGettingHotButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(540,1057), //Android
                () -> ui.tapOnElement(167,451)   //iOS
        );
        */

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_heatingComingWithHot.txt");

        ui.waitAndTap(page.heatingValveClosedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_bodyPassingOnHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.heatingValveDoesNotFullyClosedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_isolatePowerAndLook.txt");

        ui.waitAndTap(page.zoneValveClosesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_removeTimer.txt");

        ui.waitAndTap(page.doesNotFireWithTimerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_heatingWithNoDemand.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stillFiringWithTimerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_frostThermostatCheck.txt");

        ui.waitAndTap(page.noThermostatFittedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_shortOnWireFromSrost.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemDoesNotFireButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_onWithNoDemand.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.zoneValveDoesNotCloseButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headDoesNotSpringButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_headJammedHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headSpringBackButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_sPlanNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveHeadIsNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_heatingNonRemoveHead.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Neither the heating nor the hot water are working")
    public void test_neitherTheHeating_zoneValveMoves() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/03_neitherTheHeatingNor/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.neitherTheHeatingNotTheButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(506,1197), //Android
                () -> ui.tapOnElement(156,505)   //iOS
        );
        */

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_observationZone.txt");

        ui.waitAndTap(page.zoneValvesMovesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_pumpRunning.txt");

        ui.waitAndTap(page.pumpIsRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_boilerRunning.txt");

        ui.waitAndTap(page.boilerLightingAndHeatingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_systemFaultCH.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerNotRespondingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_sPlanBoilerNotFiring.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpIsNotRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_voltageToPump.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_hwAndChNotRunning.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_voltageOnOrangeWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_chAndHw.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noChAndHw.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Neither the heating nor the hot water are working")
    public void test_neitherTheHeating_oneOrBoth_mvp() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/03_neitherTheHeatingNor/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.neitherTheHeatingNotTheButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(506,1197), //Android
                () -> ui.tapOnElement(156,505)   //iOS
        );
        */


        ui.waitAndTap(page.oneOrBothZoneValvesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_mainPowerIntoSystem.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_mainSupplyToTimer.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_wiringCentreToTimer.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_linkOutTimer.txt");

        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.bothZoneValvesOpenButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_noHeatingOrHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.neitherValveOpensButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_noHeatingOrHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Neither the heating nor the hot water are working")
    public void test_neitherTheHeating_oneOrBoth_mva() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/03_neitherTheHeatingNor/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.neitherTheHeatingNotTheButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(506,1197), //Android
                () -> ui.tapOnElement(156,505)   //iOS
        );
        */


        ui.waitAndTap(page.oneOrBothZoneValvesButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_resistance3ampFuse.txt");

        ui.waitAndTap(page.resistanceClosedCircuitButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_neitherDemandWorking.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceOpenCircuitButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_mainFuse.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Neither the heating nor the hot water are working")
    public void test_neitherTheHeating_oneOrBoth_heatingValve() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/03_neitherTheHeatingNor/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.neitherTheHeatingNotTheButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(506,1197), //Android
                () -> ui.tapOnElement(156,505)   //iOS
        );
        */


        ui.waitAndTap(page.oneOrBothZoneValvesButton);
        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.selectOutcome4Button);

        ui.waitAndTap(page.heatingValveOpensButButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_timerFaulty.txt");

        ui.waitAndTap(page.continueButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_voltageCylinderThermostat.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_noVoltageToCYL.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_linkOutCylinder.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.mainVoltagePresentAndValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_allOff.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageStillNotPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_allOffCYLStat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageOkButValveNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_removeHeadFrom.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_synchronMotor.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_allOffBodyStuck.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_allOffBodyStuck1.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Neither the heating nor the hot water are working")
    public void test_neitherTheHeating_oneOrBoth_hotWaterValve() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/03_neitherTheHeatingNor/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);



        ui.scrollToBottom();
        ui.waitAndTap(page.neitherTheHeatingNotTheButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(506,1197), //Android
                () -> ui.tapOnElement(156,505)   //iOS
        );
        */



        ui.waitAndTap(page.oneOrBothZoneValvesButton);
        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.selectOutcome4Button);
        ui.waitAndTap(page.hotWaterValveOpensButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_timerFaulty.txt");

        ui.waitAndTap(page.continueButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_voltageRoomThermostat.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_noVoltageToRoom.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_linkOutRoom.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.mainVoltagePresentAndValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_allOffRoomThermostat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageStillNotPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_allOffRoomStat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageOkButValveNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_syncgronAndRoom.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_allOffBodyStuck2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "39_allOffBodyStuck2.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Boiler is firing without demand but radiators remain cool")
    public void test_boilerIsFiring() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/04_boilerIsFiring/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);



        ui.scrollToBottom();
        ui.waitAndTap(page.boilerIsFiringWithoutButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(499,1315), //Android
                () -> ui.tapOnElement(154,549)   //iOS
        );
        */


        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_removeTImer.txt");

        ui.waitAndTap(page.doesNotFireWithTimerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_hotWaterOnWith.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stillFiringWithTimerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_disconnectHeatingValve.txt");

        ui.waitAndTap(page.systemStillFiresButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_observationDoesBoiler.txt");

        ui.waitAndTap(page.boilerHasPermanentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_disconnectHotWater.txt");

        ui.waitAndTap(page.systemStillFiresButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_stuckOnWithNo.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.systemNoLongerFiresButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_hotWater.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_stuckOnWithNo.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_microswitchStuck.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveHeadIsNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_boilerFiringWithout.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_boilerFiringWithoutDemand.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Boiler is firing without demand but radiators remain cool")
    public void test_boilerIsFiring1_systemStillFires_boilerDoesNot() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/04_boilerIsFiring/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.boilerIsFiringWithoutButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(499,1315), //Android
                () -> ui.tapOnElement(154,549)   //iOS
        );
        */



        ui.waitAndTap(page.stillFiringWithTimerButton);
        ui.waitAndTap(page.systemStillFiresButton);
        ui.waitAndTap(page.boilerDoesNotHaveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_resistanceEndFeed.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_stuckOnNoDemand.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_microswitchStuck.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveHeadIsNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_boilerFiringWithout.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_boilerFiringWithout.txt");

        ui.waitAndTap(page.returnToHomeButton);

    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : Boiler is firing without demand but radiators remain cool")
    public void test_boilerIsFiring1_systemStillFires_systemNoLonger() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/04_boilerIsFiring/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);



        ui.scrollToBottom();
        ui.waitAndTap(page.boilerIsFiringWithoutButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(499,1315), //Android
                () -> ui.tapOnElement(154,549)   //iOS
        );
        */


        ui.waitAndTap(page.stillFiringWithTimerButton);
        ui.waitAndTap(page.systemNoLongerFiresButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_resistanceEndFeed.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_stuckOnNoDemand.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_microswitchStuckOn.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveHeadIsNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_boilerFiringWithoutDemand.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_boilerFiringWithout.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The hot water is not working but heating is ok")
    public void test_theHotWater_zoneValveMoves() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/05_theHotWaterIsNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.theHotWaterIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(495,1453), //Android
                () -> ui.tapOnElement(112,602)   //iOS
        );
        */



        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_hotWaterZoneValve.txt");

        ui.waitAndTap(page.zoneValveMovesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_voltageOnOrangeWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_pumpRunningHotWater.txt");

        ui.waitAndTap(page.pumpIsRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_boilerRunning.txt");

        ui.waitAndTap(page.boilerLightingAndHeatingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_systemFaultHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerNotRespondingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_sPlanBoilerNotFiring.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.pumpIsNotRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_voltageToPump.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_sPlanPumpNotRunning.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_sPlanNoPowerToPump.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The hot water is not working but heating is ok")
    public void test_theHotWater_zoneValveMoves_mva() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/05_theHotWaterIsNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);



        ui.scrollToBottom();
        ui.waitAndTap(page.theHotWaterIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(495,1453), //Android
                () -> ui.tapOnElement(112,602)   //iOS
        );
        */



        ui.waitAndTap(page.zoneValveMovesButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_voltageOnGreyWire.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noSupplyToHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_voltageOnBrownWire.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_noHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_resistanceEndFeed.txt");

        ui.waitAndTap(page.resistanceAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_microswitchFaulty.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_heatingOkNoHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The hot water is not working but heating is ok")
    public void test_theHotWater_zoneValveNotMoving_mvp() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/05_theHotWaterIsNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);


        ui.scrollToBottom();
        ui.waitAndTap(page.theHotWaterIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(495,1453), //Android
                () -> ui.tapOnElement(112,602)   //iOS
        );
        */



        ui.waitAndTap(page.zoneValveNotMovingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_voltageOnBrownWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_resistanceBrownWire.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_resistanceSychronMotor.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_noHotWaterHeat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistance_As_AboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_noHotWaterMotorOk.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistance_As_AboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_mechanicalCheck.txt");

        ui.waitAndTap(page.motorRotatesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_headJammedHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.motorDoesNotRotateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_sPlanNoHeatingHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_heatingOKNoHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_mechanicalCheckSynchron.txt");

        ui.waitAndTap(page.motorRotatesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_heatingOkNoHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.motorDoesNotRotateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_jammedNoHW.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The hot water is not working but heating is ok")
    public void test_theHotWater_zoneValveNotMoving_mva_mvp() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/05_theHotWaterIsNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);



        ui.scrollToBottom();
        ui.waitAndTap(page.theHotWaterIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(495,1453), //Android
                () -> ui.tapOnElement(112,602)   //iOS
        );
        */



        ui.waitAndTap(page.zoneValveNotMovingButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_voltageCylinderThermostat.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_linkOutCylinder.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.mainVoltagePresentAndValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_sPlanNotHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageStillNotPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_heatingOkNoWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageOkButValveNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_removeHeadFromValve.txt");


        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_sychronMotorAndCYL.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_heatingOkNoHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_heatingOkNoHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The hot water is not working but heating is ok")
    public void test_theHotWater_zoneValveNotMoving_mva_mva() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/05_theHotWaterIsNotWorking/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);



        ui.scrollToBottom();
        ui.waitAndTap(page.theHotWaterIsNotWorkingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(495,1453), //Android
                () -> ui.tapOnElement(112,602)   //iOS
        );
        */




        ui.waitAndTap(page.zoneValveNotMovingButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_linkOutTimer.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.mainVoltagePresentAndValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_sPlanNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageStillNotPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "39_noVoltageToCYLStat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.voltageOkButValveNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "40_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "41_heatOkNoHW.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "42_heatOkNoHW.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "43_heatOkNoHW.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - S Plan : The hot water is not working but heating is ok")
    public void test_theHotWater_zoneValveNotMoving_hotWater() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/sPlan/06_hotWaterIsGetting/";
        FaultFindingSPanPage page = new FaultFindingSPanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.sPlanSystemDotButton);
        ui.waitAndTap(page.sPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);



        ui.scrollToBottom();
        ui.waitAndTap(page.hotWaterIsGettingButton);

        /*
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(396,1579), //Android
                () -> ui.tapOnElement(71,648)   //iOS
        );
        */


        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_hotWaterGettingTooHot.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.hotWaterValveClosedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_bodyPassingOnHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.hotWaterValveIsNotClosedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_isolatePowerAndLook.txt");

        ui.waitAndTap(page.zoneValveClosesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_hotWaterResponds.txt");

        ui.waitAndTap(page.doesNotFireWithTimerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_hotWaterWithNoDemand.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stillFiringWithTimerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_mainsToHWBrownWire.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.zoneValveDoesNotCloseButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headDoesNotSpringButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_headJammedHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headSpringBackButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_bodyStuckHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveHeadIsNotButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_hwNonRemoveHead.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.hotWaterValveClosedAndCylinderButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_inspectionCylinderThermostat.txt");

        ui.waitAndTap(page.correctlyPositionedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_hotWaterToHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.incorrectPositionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_hwToHot.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }
}
