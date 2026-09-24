package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.LiteDiagnosticPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class LiteDiagnosticTest extends MobileBaseTest
{
    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : Investigate Blank Display ")
    public void test_liteDiagnostic_investigateBlankDisplay()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(156, 687), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : Investigate Pump Not Running ")
    public void test_liteDiagnostic_investigatePumpNotRunning()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(241, 757), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : Investigate Fan Not Running ")
    public void test_liteDiagnostic_investigateFanNotRunning()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(238, 813), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : Investigate Burner Ignition")
    public void test_liteDiagnostic_investigateBurnerIgnition()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(282, 935), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : Investigate CH Operation")
    public void test_liteDiagnostic_investigateCHOperation()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(245, 991), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : System Diagnostics")
    public void test_liteDiagnostic_systemDiagnostics()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(304, 1436), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : Investigate Why A Fuse May Have Blown")
    public void test_liteDiagnostic_investigateWhyAFuseMayHaveBlown()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(330, 1562), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = "Diagnostics Type Selection - Lite Diagnostic : Investigate A Overheat Situation")
    public void test_liteDiagnostic_investigateAOverheatSituation()
    {
        LiteDiagnosticPage page = new LiteDiagnosticPage();
        ui.clickIfDisplayed(page.homeButton);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4101911");
        ui.waitAndTap(page.Gas330OpenButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.continueButton);
        ui.scrollToBottom();

        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(323, 1154), //Lite Diagnostics - Android
                () -> ui.tapOnElement(84,396)   //Lite Diagnostics - iOS
        );
        ui.scrollToBottom();
        ui.explicitWait(1);
        ui.performBasedOnPlatform(
                () -> ui.tapOnElement(330, 1692), //Investigate Blank Display - Android
                () -> ui.tapOnElement(84,396)   //Investigate Blank Display - iOS
        );

        ui.explicitWait(1);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.returnToHomeButton);
    }
}
