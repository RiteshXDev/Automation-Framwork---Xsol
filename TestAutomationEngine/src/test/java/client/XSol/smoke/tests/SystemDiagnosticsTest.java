package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.SystemDiagnostcisPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;


public class SystemDiagnosticsTest extends MobileBaseTest
{
    private static final String SD_PATH = "xsol/diagnostics+/systemDiagnostics/";
    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for Y-Plan system")
    public void testWiringDiagram_YPlanSystem() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_welcomeToDiagnostics.txt");

        ui.waitAndTap(page.welcomeToXsolContinueButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "02_xsolSystemDiagnotics.txt");

        ui.waitAndTap(page.systemDiagnosticsContinueButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_warningImportantNotice.txt");

        ui.waitAndTap(page.warningImportantNoticeRejectButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "04_selectFromList_YPlanSystem.txt");

        ui.waitAndTap(page.yPlanSystemDotButton);
        ui.waitAndTap(page.yPlanStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_yPlanWiringDiagram/01_theYPlanSystem.txt");

        ui.waitAndTap(page.yPlanWiringDiagramButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_yPlanWiringDiagram/02_yPlanWiring.txt");

        ui.waitAndTap(page.heatingOnlyDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_yPlanWiringDiagram/03_heatingOnlyWiring.txt");

        ui.waitAndTap(page.hotWaterOnlyDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_yPlanWiringDiagram/04_hotWaterOnlyWiring.txt");

        ui.waitAndTap(page.heatingAndHotWaterDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_yPlanWiringDiagram/05_heatingAndHotWater.txt");

        ui.waitAndTap(page.heatingOnHotWaterSatisfiedDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_yPlanWiringDiagram/06_heatingOnHotWaterSatisfied.txt");

        ui.waitAndTap(page.homeButton);


    }

    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for S-Plan system")
    public void testWiringDiagram_SPlanSystem() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);


        ui.waitAndTap(page.sPlanSystemDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "02_sPlanWiringDiagram/01_selectFromList.txt");

        ui.waitAndTap(page.sPlanStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "02_sPlanWiringDiagram/02_theSPlanSystem.txt");

        ui.waitAndTap(page.sPlanWiringDiagramButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "02_sPlanWiringDiagram/03_sPlanWiringDiagram.txt");

        ui.waitAndTap(page.heatingDemandDotButton);
        ui.printAllViewXmlTexts();

        ui.compareViewXmlWithFile(SD_PATH + "02_sPlanWiringDiagram/04_heatingDemand.txt");

        ui.waitAndTap(page.hotWaterDemandDotButton);
        ui.waitAndTap(page.homeButton);


    }

    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for Gravity system")
    public void testWiringDiagram_GravitySystem() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);

        ui.waitAndTap(page.gravitySystemDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_gravitySystemWiringDiagram/01_selectFromList.txt");

        ui.waitAndTap(page.gravitySystemStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_gravitySystemWiringDiagram/02_theGravitySystem.txt");

        ui.waitAndTap(page.gravityWiringDiagramButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_gravitySystemWiringDiagram/03_gravityWiring.txt");

        ui.waitAndTap(page.heatingAndHotWaterDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_gravitySystemWiringDiagram/04_heatingAndHotWater.txt");

        ui.waitAndTap(page.gravity_hotWaterDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_gravitySystemWiringDiagram/05_hotWaterDemand.txt");

        ui.waitAndTap(page.homeButton);

    }

    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for C - Plan system")
    public void testWiringDiagram_CPlanSystem() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);

        ui.waitAndTap(page.cPlanSystemDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "04_cPlanWiringDiagram/01_selectFromList.txt");

        ui.waitAndTap(page.cPlanStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "04_cPlanWiringDiagram/02_theCPlanSystem.txt");

        ui.waitAndTap(page.cPlanWiringButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "04_cPlanWiringDiagram/03_CPlanWiring.txt");

        ui.waitAndTap(page.cPlan_heatingDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "04_cPlanWiringDiagram/04_heatingDemand.txt");

        ui.waitAndTap(page.cPlan_hotWaterDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "04_cPlanWiringDiagram/05_hotWaterDemand.txt");

        ui.waitAndTap(page.homeButton);

    }

    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for C - Plan Plus system")
    public void testWiringDiagram_CPlanPlusSystem() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);

        ui.waitAndTap(page.cPlanPlusSystemDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "05_cPlanPlusWiringDiagram/01_selectFromList.txt");

        ui.waitAndTap(page.cPlanPlusStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "05_cPlanPlusWiringDiagram/02_theCPlanPlusSystem.txt");

        ui.waitAndTap(page.cPlanPlusWiringButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "05_cPlanPlusWiringDiagram/03_CPlanPlusWiring.txt");

        ui.waitAndTap(page.cPlanPlus_heatingDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "05_cPlanPlusWiringDiagram/04_heatingDemand.txt");

        ui.waitAndTap(page.cPlanPlus_hotWaterDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "05_cPlanPlusWiringDiagram/05_hotWaterDemand.txt");

        ui.waitAndTap(page.homeButton);

    }

    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for M - Plan system")
    public void testWiringDiagram_MPlanSystem() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);

        ui.waitAndTap(page.mPlanSystemDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "06_mPlanWiringDiagram/01_selectFromList.txt");

        ui.waitAndTap(page.mPlanStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "06_mPlanWiringDiagram/02_theMPlanSystem.txt");

        ui.waitAndTap(page.mPlanWiringButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "06_mPlanWiringDiagram/03_MPlanWiring.txt");

        ui.waitAndTap(page.mPlan_heatingDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "06_mPlanWiringDiagram/04_heatingDemand.txt");

        ui.waitAndTap(page.mPlan_hotWaterDemandDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "06_mPlanWiringDiagram/05_hotWaterDemand.txt");

        ui.waitAndTap(page.homeButton);

    }

    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for W - Plan system")
    public void testWiringDiagram_WPlanSystem() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);

        ui.waitAndTap(page.wPlanSystemDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_wPlanWiringDiagram/01_selectFromList.txt");

        ui.waitAndTap(page.wPlanStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_wPlanWiringDiagram/02_theWPlanSystem.txt");

        ui.waitAndTap(page.wPlanWiringButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_wPlanWiringDiagram/03_wPlanWiring.txt");

        ui.waitAndTap(page.wPlan_heatingOnHotWaterDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_wPlanWiringDiagram/04_heatingOnHotWater.txt");

        ui.waitAndTap(page.wPlan_hotWaterSatisfiedDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_wPlanWiringDiagram/05_hotWaterSatisfied.txt");

        ui.waitAndTap(page.wPlan_hotWaterOnlyDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_wPlanWiringDiagram/06_hotWaterOnly.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "System Diagnostics check - Verify wiring diagram for W - Plan system with Priority Switch")
    public void testWiringDiagram_WPlanSystemWithPrioritySwitch() {
        SystemDiagnostcisPage page = new SystemDiagnostcisPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.systemDisagnosticsButton);
        ui.waitAndTap(page.welcomeToXsolContinueButton);
        ui.waitAndTap(page.systemDiagnosticsContinueButton);
        ui.waitAndTap(page.warningImportantNoticeAcceptButton);

        ui.waitAndTap(page.wPlanSystemWithPrioritySwitchDotButton);

        ui.printAllScrollableTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_wPlanSystemWithPrioritySwitch/01_selectFromList.txt");

        ui.waitAndTap(page.wPlanPriorityStartButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_wPlanSystemWithPrioritySwitch/02_theWPlanSystemPriority.txt");

        ui.waitAndTap(page.wPlanPriorityWiringButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_wPlanSystemWithPrioritySwitch/03_wPlanSystemPriority.txt");

        ui.waitAndTap(page.wPlanPriority_heating_HotWaterCallingDotButton);

        ui.printAllScrollableTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_wPlanSystemWithPrioritySwitch/04_heating_waterCalling.txt");

        ui.waitAndTap(page.wPlanPriority_heating_hotWaterSatisfiedDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_wPlanSystemWithPrioritySwitch/05_heating_waterSatisfied.txt");

        ui.waitAndTap(page.wPlanPriority_hot_hotWaterCallingDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_wPlanSystemWithPrioritySwitch/06_hot_waterCalling.txt");

        ui.waitAndTap(page.wPlanPriority_hot_hotWaterSatisfiedDotButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_wPlanSystemWithPrioritySwitch/07_hot_waterSatisfied.txt");

        ui.waitAndTap(page.homeButton);
    }
}
