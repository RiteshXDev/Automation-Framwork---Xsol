package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.UsefulGuidesPage;
import core.annotations.StepTestDetails;
import core.manager.mobile.AppManager;
import org.testng.annotations.Test;

public class UsefulGuidesTest extends MobileBaseTest {
    private static final String SD_PATH = "xsol/diagnostics+/usefulGuides/";

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Servicing an Expansion Vessel ")
    public void testServicingVessel() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "00_usefulGuide.txt");

        ui.waitAndTap(page.servicingVesselButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_serivicingVessel.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Common Pump Failure Guide ")
    public void testPumpFailureGuide() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.commonPumpGuideButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "02_pumpfailureGuide.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Electrical Insulating Mat Advice ")
    public void testInsulatingMatAdvice() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.electricalAdviceButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_insulatingMatAdvice.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - What is a Hall Sensor ")
    public void testHallSensor() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.hallSensorButton);
        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Testing For External Mixing ")
    public void testExternalMixing() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.externalMixingButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "05_externalMixing.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Measuring a Flow Rate and Temperature Rate")
    public void testMeasuringRate() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.measuringTemperatureRiseButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "06_measuringRate.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Notes on Using Temperature Clamps")
    public void testTemperatureClamps() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.temperatureClampButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_temperatureClamp.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Information on Solar Assisted Hot Water")
    public void testInfoSolarAssistedHotWater() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.solarHotWaterButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "08_solarAsistedHotWater.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - STATIC! Read this before changing a PCB")
    public void testInfoBeforeChangingPCB() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.changingAPCBButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "09_readThisBeforeChangingPCB.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Before Ordering a PCB")
    public void testBeforeOrderingPCB() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.beforeOrderingPCBButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "10_orderingPCB.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - IDEAL Replacement PCB guide")
    public void testReplacementGuidePCB() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.replacementGuideButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "11_replacementPCB.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Using the Multimeter")
    public void testUsingTheMultimeter() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.usingMultimeterButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "12_usingMultimeter.txt");

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Service Kits Link")
    public void testServiceKitLink() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.serviceKitsLinkButton);

        AppManager.switchBackToApplication(MobileBaseTest.getDriver());

        ui.waitAndTap(page.homeButton);
    }

    @Test
    @StepTestDetails(desc = "Useful Guide Check - Useful Fault Finding Tools")
    public void testFaultFindingTools() {

        UsefulGuidesPage page = new UsefulGuidesPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.usefulGuidesButton);

        ui.waitAndTap(page.faultFindingToolsButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "13_faultFindingTools.txt");

        ui.waitAndTap(page.homeButton);
    }
}