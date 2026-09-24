package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.MultimeterTutorialsPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class MultimeterTutorialsTest extends MobileBaseTest
{
    @Test
    @StepTestDetails(desc = "Multimeter Tutorials - Complete Check")
    public void testmultimetertutorials() {

        MultimeterTutorialsPage page = new MultimeterTutorialsPage();
        ui.waitAndTap(page.diagnosticsButton);
        ui.waitAndTap(page.multimeterTutorialsButton);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile("xsol/diagnostics+/multimeterTutorials/multimeterTutorials.txt");

        ui.waitAndTap(page.howToSetToFullRangeLink);

        ui.printAllViewXmlTexts();
        ui.compareViewXmlWithFile("xsol/diagnostics+/multimeterTutorials/someOfTheBasicSettings.txt");

        ui.waitAndTap(page.homeButton);

    }
}
