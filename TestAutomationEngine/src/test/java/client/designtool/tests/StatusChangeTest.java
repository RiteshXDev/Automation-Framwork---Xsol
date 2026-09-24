package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.AllStatusCheckPage;
import client.designtool.pages.StatusCycleCheckPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class StatusChangeTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : Model Page - Ready For Review")
    public void statusCycleCheckTest_readyForReview() {
        StatusCycleCheckPage page = new StatusCycleCheckPage();
        //ui.waitAndClick(page.pickAccountButton);
        ui.waitAndClick(page.newModelButton);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node3");
        ui.pressKey(Keys.ENTER);

        ui.waitAndClick(page.partNumberTextBox);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("H2K2V9");

        ui.waitAndClick(page.addAlertButton);
        ui.waitAndClick(page.editAlertTextBox);
        ui.waitAndType(page.editAlertTextBox, "Testing Model : Alert Text Box");
        ui.waitAndClick(page.alertDoneButton);
        ui.waitAndClick(page.alertSnippetButton);
        ui.waitAndType(page.alertSearchSnippetTextBox, "CHDEMAND");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.chdemandButton);


        ui.explicitWait(5);
        ui.waitAndClick(page.addInstructionButton);
        ui.waitAndType(page.addInstructionTextBox, "Testing Model : Add Instruction Text Box");
        ui.waitAndClick(page.addInstructionDoneButton);


        ui.waitAndClick(page.addStepButton);
        ui.waitAndType(page.addStepTextBox, "Testing Model : Add Setup Text Box");
        ui.waitAndClick(page.addStepDoneButton);


        ui.explicitWait(5);
        ui.waitAndClick(page.mediaEditButton);

        ui.waitAndClick(page.uploadImageFromDatabaseButton);
        ui.waitAndClick(page.imageBox);
        ui.waitAndClick(page.imageInsertButton);

        ui.waitAndClick(page.addTextBoxButton);
        ui.waitAndClick(page.mediaTextBox);
        ui.typeUsingKeyboard("Testing Model : Media Text Box");

        ui.waitAndClick(page.addTableButton);
        ui.waitAndClick(page.mediaDoneButton);
        ui.scrollToElement(page.connectionHeading);

        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "node4");
        ui.waitAndClick(page.create1Button);
        //ui.saveElementValueToFile(page.modelNumberLocation);
        //ui.waitAndClick(page.newModelTopButton);

        ui.waitAndClick(page.statusChangeDropDownMenu);
        //ui.waitAndClick(page.statusChangeDropDownMenu);
        ui.waitAndClick(page.readyForReviewButton);
        ui.waitAndClick(page.sendForReviewButton);
        ui.waitAndClick(page.continueViewingButton);
        ui.verifyContainsText(page.waitingForReviewYellowBar, "waiting review.");
        ui.saveElementValueToFile(page.modelNumberLocation,"createNewModelTest");
        ui.waitAndClick(page.newModelTopButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Model Page - In Review")
    public void statusCycleCheckTest_inReview() {
        StatusCycleCheckPage page = new StatusCycleCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);

        ui.waitAndClick(page.statusChangeDropDownMenu);
        ui.waitAndClick(page.inReviewButton);
        ui.verifyContainsText(page.waitingForReviewYellowBar, "Model in review.");
        ui.saveElementValueToFile(page.modelNumberLocation,"createNewModelTest");
        ui.waitAndClick(page.newModelTopButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Model Page - Ready for Publish")
    public void statusCycleCheckTest_readyForPublish() {
        StatusCycleCheckPage page = new StatusCycleCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);

        ui.waitAndClick(page.statusChangeDropDownMenu);
        ui.waitAndClick(page.readyForPublishButton);
        ui.verifyContainsText(page.waitingForReviewYellowBar, "Model Ready for Publishing.");

        ui.saveElementValueToFile(page.modelNumberLocation,"createNewModelTest");
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Model Page - Published")
    public void statusCycleCheckTest_published() {
        StatusCycleCheckPage page = new StatusCycleCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);

        ui.waitAndClick(page.statusChangeDropDownMenu);
        ui.waitAndClick(page.publishedButton);
        //ui.verifyContainsText(page.waitingForReviewYellowBar, "Model Ready for Publishing.");

        ui.saveElementValueToFile(page.modelNumberLocation,"createNewModelTest");
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Search Page - Draft")
    public void allStatusCheckTest_searchPage_draft() {
        AllStatusCheckPage page = new AllStatusCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.checkBoxButton);
        ui.waitAndClick(page.changeStatusButton);
        ui.waitAndClick(page.newStatusList_draftButton);
        ui.waitAndClick(page.updateStatusButton);
        ui.verifyContainsText(page.table, "DRAFT");
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Search Page - Ready For Review")
    public void allStatusCheckTest_searchPage_readyForReview() {
        AllStatusCheckPage page = new AllStatusCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.checkBoxButton);
        ui.waitAndClick(page.changeStatusButton);
        ui.waitAndClick(page.newStatusList_readyForReviewButton);
        ui.waitAndClick(page.updateStatusButton);
        ui.verifyContainsText(page.table, "READY FOR REVIEW");
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Search Page - In Review")
    public void allStatusCheckTest_searchPage_inReview() {
        AllStatusCheckPage page = new AllStatusCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.checkBoxButton);
        ui.waitAndClick(page.changeStatusButton);
        ui.waitAndClick(page.newStatusList_inReviewButton);
        ui.waitAndClick(page.updateStatusButton);
        ui.verifyContainsText(page.table, "IN REVIEW");
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Search Page - Ready For Publish")
    public void allStatusCheckTest_searchPage_readyForPublish() {
        AllStatusCheckPage page = new AllStatusCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);

        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.checkBoxButton);
        ui.waitAndClick(page.changeStatusButton);
        ui.waitAndClick(page.newStatusList_readyForPublishButton);
        ui.waitAndClick(page.updateStatusButton);
        ui.verifyContainsText(page.table, "READY FOR PUBLISH");
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Search Page - Published")
    public void allStatusCheckTest_searchPage_published() {
        AllStatusCheckPage page = new AllStatusCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.checkBoxButton);
        ui.waitAndClick(page.changeStatusButton);
        ui.waitAndClick(page.newStatusList_PublishedButton);
        ui.waitAndClick(page.updateStatusButton);
        ui.verifyContainsText(page.table,"PUBLISHED");
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);

    }

}
