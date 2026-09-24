package client.XSol.smoke.tests;

import base.mobile.MobileBaseTest;
import client.XSol.smoke.pages.FeedbackPage;
import client.XSol.smoke.pages.LiteDiagnosticPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class FeedbackTest extends MobileBaseTest {
    @Test
    @StepTestDetails(desc = "Feedback")
    public void test_feedback()
    {
        final String SD_PATH = "xsol/feedback/";
        FeedbackPage page = new FeedbackPage();
        ui.waitAndTap(page.feedbackButton);
        ui.switchBackToApp();
        ui.verifyText(page.feedbackPopUp,"Thanks for your feedback!");
        ui.waitAndTap(page.okButton);
    }
}
