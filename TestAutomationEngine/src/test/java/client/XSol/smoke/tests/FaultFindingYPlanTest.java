package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.FaultFindingYPlanPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class FaultFindingYPlanTest extends MobileBaseTest {

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve not stopping at mid position.. ")
    public void test_valveNotStopping_valveSpring_voltageAbsent() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/01_valveNotStoppingAtMid/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveNotStoppingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(479,680), //Android
                () -> ui.tapOnElement(182,291)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_isolatePower.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpringBackButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_voltageOnGreyTimer.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_voltageSupplyToCylinder.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_cylinderThermostatOpen.txt");

        ui.waitAndTap(page.closedCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_notMovingToHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_valveNotMovingToWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_yPlanNoHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve not stopping at mid position.. ")
    public void test_valveNotStopping_valveSpring_voltagePresent() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/01_valveNotStoppingAtMid/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveNotStoppingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(479,680), //Android
                () -> ui.tapOnElement(182,291)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_isolatePower.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpringBackButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_voltageOnGreyTimer.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_voltageSupplyToCylinder.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_yPlanNoHotWater_2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_cylinderThermostatClosed.txt");

        ui.waitAndTap(page.closedCircuitMeasuredButton);

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_isolateHwOff.txt");

        ui.waitAndTap(page.doNotStopMidPosition);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_notMovingHotWater_2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.stopMidPosition);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_valveNoBoth.txt");

        ui.waitAndTap(page.returnToHomeButton);

    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve not stopping at mid position.. ")
    public void test_valveNotStopping_valveClicking_voltagePresent() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/01_valveNotStoppingAtMid/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveNotStoppingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(479,680), //Android
                () -> ui.tapOnElement(182,291)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_isolatePower.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveClickingOrButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_voltageWhiteWire.txt");


        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_notStayingAtW.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_supplyVoltageToRoom.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_removeTimerAndRecheck.txt");

        ui.waitAndTap(page.mainVoltageStillPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_installationWiringShort.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageNowAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_valveInMOnWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_frostThermostatCheck.txt");

        ui.waitAndTap(page.noThermostatFittingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_notGoingToHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.tempAboveSetPointButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_heatingWithNoDemand.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    /* Expected Text File Numbers - 23 to 28 */
    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve not stopping at mid position.. ")
    public void test_valveNotStopping_valveDoesNotReturn() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/01_valveNotStoppingAtMid/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveNotStoppingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(479,680), //Android
                () -> ui.tapOnElement(182,291)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_isolatePower.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveDoesNotReturnButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_removeHeadFrom.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_inspectDiverterHead.txt");

        ui.waitAndTap(page.internalPartsOfValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_headStuckNoHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.evidenceOfInternalWearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_notGoingToW.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_valveJammed.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_noHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    /* Expected Text File Numbers - 29 to 38 */
    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve In Hot Water Position But.. ")
    public void test_valveInHotWater_pumpIsRunning() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/02_valveInhotWaterPosition/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveInHotWaterButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(418,883), //Android
                () -> ui.tapOnElement(166,360)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_pumpRunning.txt");

        ui.waitAndTap(page.pumpIsRunningButton);
        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_boilerRunning.txt");

        ui.waitAndTap(page.boilerLightingAndHeatingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_radiatorsHeatingWith.txt");

        ui.waitAndTap(page.radiatorsRemainCoolButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_inspectionCylinderThermostat.txt");

        ui.waitAndTap(page.correctlyPositionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_noHotWaterWith.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.incorrectlyPositionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_hotWaterNotHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.radiatorsHeatWithValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_poorhotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerNotRespondingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_voltageOnBoiler.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_yPlanBoilerNotFiring.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_yPlanNoHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    /* Expected Text File Numbers - 39 to 46 */
    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve In Hot Water Position But.. ")
    public void test_valveInHotWater_pumpIsNotRunning() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/02_valveInhotWaterPosition/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveInHotWaterButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(418,883), //Android
                () -> ui.tapOnElement(166,360)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_pumpRunning.txt");

        ui.waitAndTap(page.pumpIsNotRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "39_voltageSupplyToPump.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "40_yPlanPumpIsNotRunning.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "41_voltageSupplyToCylinder.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "42_waterOnNoPower_Present.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "43_waterOnNoPower_Absent.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "44_mainSupplyToProgrammer.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "45_mva_waterOn_present.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "46_mva_waterNotWorking_absent.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    /* Expected Text File Numbers - 47 to 62*/
    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Radiators heat with no demand or demand for hot water only.. ")
    public void test_radiatorsHeating_valveDoesNotReach_1() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/03_radiatorsHeatWithNoDemand/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.radiatorsHeatWithNoDemandButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(402,1003), //Android
                () -> ui.tapOnElement(153,406)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "47_radiatorsHeatingWithNoDemand.txt");

        ui.waitAndTap(page.valveDoesNotReachButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "48_resistanceWhiteWire.txt");

        //ui.waitAndTap(page.resistanceIsNotAsButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(432,1570), //Android
                () -> ui.tapOnElement(141,642)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "49_OnWithNoDemand.txt");

        ui.waitAndTap(page.backButton);
        //ui.waitAndTap(page.resistanceIsAsButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(411,1629), //Android
                () -> ui.tapOnElement(157,666)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "50_isolatePowerAndLook.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpringBackButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "51_voltageOnGreyTimer.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "52_yPlanNoHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "53_cylinderThermostatCommon.txt");

        ui.waitAndTap(page.closedCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "54_notMovingToHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "55_valveNotMovingToHot.txt");

        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "56_voltageSupplyToCylinder.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "57_yPlanNotHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "58_cylinderThermostatCommon.txt");

        ui.waitAndTap(page.closedCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "59_yPlanNoHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "60_isolateHwOff.txt");

        ui.waitAndTap(page.stopMidPosition);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "61_valveNoMBothDemands.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.doNotStopMidPosition);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "62_notMovingToHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Radiators heat with no demand or demand for hot water only.. ")
    public void test_radiatorsHeating_valveDoesNotReach_2() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/03_radiatorsHeatWithNoDemand/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.radiatorsHeatWithNoDemandButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(402,1003), //Android
                () -> ui.tapOnElement(153,406)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "47_radiatorsHeatingWithNoDemand.txt");

        ui.waitAndTap(page.valveDoesNotReachButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "48_resistanceWhiteWire.txt");

        //ui.waitAndTap(page.resistanceIsNotAsButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(432,1570), //Android
                () -> ui.tapOnElement(141,642)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "49_OnWithNoDemand.txt");

        ui.waitAndTap(page.backButton);
        //ui.waitAndTap(page.resistanceIsAsButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(411,1629), //Android
                () -> ui.tapOnElement(157,666)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "50_isolatePowerAndLook.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveClickingOrButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "63_voltageWhiteWire.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "68_voltageWhiteWire.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "64_supplyVoltageToRoom.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "65_removeTimerAndRecheck.txt");

        ui.waitAndTap(page.mainVoltageStillPresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "66_installationWiringShort.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageNowAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "67_valveInMOnWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "69_frostThermostatCheck.txt");

        ui.waitAndTap(page.noThermostatFittingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "70_notGoingToHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.tempAboveSetPointButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "71_heatingWithNoDemand.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "72_frostThermostatCheck.txt");

        ui.waitAndTap(page.noThermostatFittingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "73_notGoingToHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.tempAboveSetPointButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "74_heatingWithNoDemand.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Radiators heat with no demand or demand for hot water only.. ")
    public void test_radiatorsHeating_valveDoesNotReach_3() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/03_radiatorsHeatWithNoDemand/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.radiatorsHeatWithNoDemandButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(402,1003), //Android
                () -> ui.tapOnElement(153,406)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "47_radiatorsHeatingWithNoDemand.txt");

        ui.waitAndTap(page.valveDoesNotReachButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "48_resistanceWhiteWire.txt");

        //ui.waitAndTap(page.resistanceIsNotAsButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(432,1570), //Android
                () -> ui.tapOnElement(141,642)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "49_OnWithNoDemand.txt");

        ui.waitAndTap(page.backButton);
        //ui.waitAndTap(page.resistanceIsAsButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(411,1629), //Android
                () -> ui.tapOnElement(157,666)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "50_isolatePowerAndLook.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveDoesNotReturnButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "75_removeHeadFrom.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "76_inspectDiverterHead.txt");

        ui.waitAndTap(page.internalPartsOfValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "77_headStuckNoHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.evidenceOfInternalWearButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "78_notGoingToW.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "79_valveJammed.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "80_notHotWater.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve is not moving to the heating only position or heating is intermittent.. ")
    public void test_valveIsNotMoving_valveMoves_1() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/04_valveIsNotMoving/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveIsNotMovingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(393,1136), //Android
                () -> ui.tapOnElement(171,458)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_valveMovesToMid.txt");

        ui.waitAndTap(page.valveMovesToTheMButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_canTimerBeSet.txt");

        ui.waitAndTap(page.timerCanBeSetButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_voltageOnGreyTimer.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_cylinderThermostatSatisfied.txt");

        ui.waitAndTap(page.closedCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_cylStayToValve.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_noWaterOffSignal.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_voltageOnGreyCylinder.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);
        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_notHotWaterOff.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_isolatePowerAndLook.txt");

        ui.waitAndTap(page.valveSpringsBackToWButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_notMovingToH.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.valveRemainInTheMPositionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_notMovingToHEnd.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_noHeating2.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_notHeating2_1.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve is not moving to the heating only position or heating is intermittent.. ")
    public void test_valveIsNotMoving_valveMoves_2() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/04_valveIsNotMoving/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveIsNotMovingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(393,1136), //Android
                () -> ui.tapOnElement(171,458)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_valveMovesToMid.txt");

        ui.waitAndTap(page.valveMovesToTheMButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_canTimerBeSet.txt");


        ui.waitAndTap(page.theWaterComesOnButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_voltageOnGreyWire.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_cylinderThermostat.txt");

        ui.waitAndTap(page.closedCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_wiringFaultHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.openCircuitMeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_noOffFromTimer.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_isolatePowerAndLook.txt");

        ui.waitAndTap(page.valveSpringsBackToWButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_weakMotor.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.valveRemainInTheMPositionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "23_notMovingToH.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "24_notHeating3.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "25_noHeating3.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve is not moving to the heating only position or heating is intermittent.. ")
    public void test_valveIsNotMoving_valveDoesNotMove_1() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/04_valveIsNotMoving/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveIsNotMovingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(393,1136), //Android
                () -> ui.tapOnElement(171,458)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_valveMovesToMid.txt");

        ui.waitAndTap(page.valveDoesNotMoveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_voltageOnWhiteWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "27_resistanceWhiteWire.txt");

        ui.waitAndTap(page.resistanceNotAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "28_resistanceSynchronMotor.txt");

        ui.waitAndTap(page.resistanceAsAboveUIAButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "29_notMovingToM.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceNotAsAboveUIAButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "30_notHeatingMotorOL.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsAboveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "31_removeHeadFromValve.txt");

        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.spindleMovesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "32_mehanicalCheckSynchron.txt");

        ui.waitAndTap(page.motorRotatesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "33_notMovingToM.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.motorDoesNotRotateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "34_notHeatingPowerOK.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.valveSpindleIsStuckButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "35_valveJammedNoHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.headOfTheValveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "36_mechanicalCheckSynchron.txt");

        ui.waitAndTap(page.motorRotatesFreelyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "37_notMovingToHeating.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.motorDoesNotRotateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "38_noHeatingNonRemoveable.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve is not moving to the heating only position or heating is intermittent.. ")
    public void test_valveIsNotMoving_valveDoesNotMove_2() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/04_valveIsNotMoving/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.waitAndTap(page.valveIsNotMovingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(393,1136), //Android
                () -> ui.tapOnElement(171,458)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_valveMovesToMid.txt");

        ui.waitAndTap(page.valveDoesNotMoveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "26_voltageOnWhiteWire.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "39_supplyVoltageToRoom.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "40_linkOutRoom.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "41_yPlanRoomStat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "42_noHeatingRoomStat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "43_linkOutProgrammer.txt");

        ui.waitAndTap(page.diverterValveNowMovesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "44_noHeatingWithTimer.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.diverterDoesNotMoveButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "45_yPlanTimerToRoom.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve moves to the Heating Position but the radiators are not getting hot..")
    public void test_valveMovesToTheHeating_pumpIsRunning() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/05_valveMovingToTheHeating/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.scrollToText("VALVE MOVES TO THE HEATING POSITION BUT THE RADIATORS ARE NOT GETTING HOT");
        //ui.waitAndTap(page.valveMovesToTheHeatingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(402,1313), //Android
                () -> ui.tapOnElement(161,528)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_pumpRunning.txt");

        ui.waitAndTap(page.pumpIsRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_isBoilerReponding.txt");

        ui.waitAndTap(page.boilerLightingAndHeatingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_hotWaterHeatingWithNo.txt");

        ui.waitAndTap(page.diverterValveAtHAndTheHotWaterButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_heatingNotWorking.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.diverterValveAtHButHotWaterButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_passingToHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerNotRespondingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_voltageSupplyToBoilers.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_yPlanBoilerNotFiring.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_yPlanNoHeating.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve moves to the Heating Position but the radiators are not getting hot..")
    public void test_valveMovesToTheHeating_pumpIsNotRunning() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/05_valveMovingToTheHeating/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.scrollToText("VALVE MOVES TO THE HEATING POSITION BUT THE RADIATORS ARE NOT GETTING HOT");
        //ui.waitAndTap(page.valveMovesToTheHeatingButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(402,1313), //Android
                () -> ui.tapOnElement(161,528)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_pumpRunning.txt");

        ui.waitAndTap(page.pumpIsNotRunningButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_voltageSupplyToPump.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_yPlanPumpNotRunning.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_voltageOrangeWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_noPowerToPump.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_voltageOnWhiteWire.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_heatingEndSwitch.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_supplyVoltageToRoom.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_linkOutRoomThermostat.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_yPlanRoomStat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_noHeatingRoomStat.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_linkOutTimer.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "21_noHeatingWithTimer.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "22_yPlanTimerToRoom.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Valve working properly but hot water is getting too hot..")
    public void test_valveWorkingProperly() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/06_valveWorkingProperly/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_faultFindingGuide.txt");

        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.scrollToText("VALVE WORKING PROPERLY BUT HOT WATER IS GETTING TOO HOT");
        //ui.waitAndTap(page.valveWorkingProperlyButton);
        ui.scrollToBottom();
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(384,1439), //Android
                () -> ui.tapOnElement(169,595)   //iOS
        );

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_hotWaterGettingTooHot.txt");

        ui.waitAndTap(page.incorrectlyPositionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_hotWaterTooHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.correctlyPositionButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_hotWaterHeating.txt");

        ui.waitAndTap(page.diverterValveAtHAndTheHotWaterButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_hotWaterTooHot.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.diverterValveAtHButHotWaterButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_passingWaterTooHot.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Finding Fault Check - Y Plan : Pump and boiler do not respond to either demand..")
    public void test_pumpAndBoilerDoNotRespond() {
        final String SD_PATH = "xsol/diagnostics+/faultFinding/yPlan/SelectFromTheOutcome(7)/07_pumpAndBoilerDoNot/";
        FaultFindingYPlanPage page = new FaultFindingYPlanPage();

        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);
        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);
        ui.waitAndTap(page.faultFindingButton);
        //ui.waitAndTap(page.selectOutcome7Button);
        //ui.scrollToText("PUMP AND BOILER DO NOT RESPOND TO EITHER DEMAND");
        //ui.waitAndTap(page.pumpAndBoilerDoNotButton);

        ui.scrollToBottom();
        ui.waitAndTap(page.pumpAndBoilerDoNotlink);
        /*
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(409,1575), //Android
                () -> ui.tapOnElement(148,648)   //iOS
        );
        */
        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_mainSupplyToSystem.txt");

        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_noSupplyToSystem.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_mainSupplyToProgrammer.txt");

        ui.waitAndTap(page.mainVoltagePresentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_notHeatingNoHotWater.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.mainVoltageAbsentButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_installationWiringMain.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }
}