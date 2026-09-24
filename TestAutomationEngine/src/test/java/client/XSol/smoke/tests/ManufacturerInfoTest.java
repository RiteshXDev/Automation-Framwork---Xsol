package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.ManufacturerInfoPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class ManufacturerInfoTest extends MobileBaseTest
{
    private static final String SD_PATH = "xsol/diagnostics+/manufacturerInfo/";

    @Test
    @StepTestDetails(desc = "Manufacturer Info - Complete check")
    public void testManufacturerInfo() {

        ManufacturerInfoPage page = new ManufacturerInfoPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.manufacturerInfoButton);

        ui.waitAndTap(page.baxiLogo);
        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "01_baxi.txt");

        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.aristonLogo);
        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "02_ariston.txt");

        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.kestonLogo);
        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "03_keston.txt");

        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.worcesterLogo);
        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "04_worcester.txt");

        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.pottertonLogo);
        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "05_potterton.txt");

        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.vaillantLogo);
        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "06_vaillant.txt");

        ui.waitAndTap(page.backButton);

        ui.waitAndTap(page.glowwormLogo);
        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile(SD_PATH + "07_glowworm.txt");

        ui.waitAndTap(page.homeButton);
    }

}
