package client.designtool.tests;


import base.web.WebBaseTest;
import client.designtool.pages.AllStatusCheckPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class AllStatusCheckTest extends WebBaseTest
{
    @Test
    @StepTestDetails(desc = "Design Tool : Main Page - All Status Check")
    public void allStatusCheckTest_MainPage() {

    AllStatusCheckPage page = new AllStatusCheckPage();
    ui.clickIfDisplayed(page.newModelTopButton);
    ui.explicitWait(1);
    ui.waitAndClick(page.allStatusDropDownButton);
    ui.waitAndClick(page.allStatusesButton);
    ui.waitAndClick(page.allStatusDropDownButton);
    ui.waitAndClick(page.draftButton);
    ui.explicitWait(2);
    ui.verifyContainsText(page.table,"DRAFT");

    ui.waitAndClick(page.allStatusDropDownButton);
    ui.waitAndClick(page.readyForReviewButton);
    ui.explicitWait(2);
    ui.verifyContainsText(page.table,"READY FOR REVIEW");

    ui.waitAndClick(page.allStatusDropDownButton);
    ui.waitAndClick(page.inReviewButton);
    ui.explicitWait(2);
    ui.verifyContainsText(page.table,"IN REVIEW");

    ui.waitAndClick(page.allStatusDropDownButton);
    ui.waitAndClick(page.readyForPublishButton);
    ui.explicitWait(2);
    ui.verifyContainsText(page.table,"READY FOR PUBLISH");

    ui.waitAndClick(page.allStatusDropDownButton);
    ui.waitAndClick(page.publishedButton);
    ui.explicitWait(2);
    ui.verifyContainsText(page.table,"PUBLISHED");
    }


}
