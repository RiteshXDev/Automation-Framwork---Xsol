package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.QuickAccessDataPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class QuickAccessDataTest extends MobileBaseTest {
    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Quick Access Data / Information ")
    public void test_quickAccessDataInformation() {
        QuickAccessDataPage page = new QuickAccessDataPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(178, 1451), //Fault Code Link - Android
                () -> ui.tapOnElement(84, 396)   //Fault Code Link - iOS
        );

        ui.waitAndTap(page.returnToHomeButton);
    }
}
