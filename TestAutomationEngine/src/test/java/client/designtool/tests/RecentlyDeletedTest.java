package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.NodeDeletePage;
import client.designtool.pages.RecentlyDeletedPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class RecentlyDeletedTest extends WebBaseTest {

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Creating a model")
    public void recentlyDeletedTest_creatingAModel() {

        RecentlyDeletedPage page = new RecentlyDeletedPage();
        //ui.waitAndClick(page.pickAccountButton);
        ui.waitAndClick(page.newModelButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("node1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("node2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("node3");
        ui.pressKey(Keys.ENTER);

        ui.waitAndClick(page.partNumberTextBox);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("H2K2V9");

        ui.waitAndClick(page.addAlertButton);
        ui.waitAndClick(page.editAlertTextBox);
        ui.waitAndType(page.editAlertTextBox, "Testing the Alert Text Box");
        ui.waitAndClick(page.alertDoneButton);
        ui.waitAndClick(page.alertSnippetButton);
        ui.waitAndType(page.alertSearchSnippetTextBox, "CHDEMAND");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);
        ui.waitAndClick(page.chdemandButton);


        ui.explicitWait(3);
        ui.waitAndClick(page.addInstructionButton);
        ui.waitAndType(page.addInstructionTextBox, "Testing the Add Instruction Text Box");
        ui.waitAndClick(page.addInstructionDoneButton);


        ui.waitAndClick(page.addStepButton);
        ui.waitAndType(page.addStepTextBox, "Testing the Add Step Text Box");
        ui.waitAndClick(page.addStepDoneButton);


        ui.explicitWait(3);
        ui.waitAndClick(page.mediaEditButton);

        ui.waitAndClick(page.uploadImageFromDatabaseButton);
        ui.waitAndClick(page.imageBox);
        ui.waitAndClick(page.imageInsertButton);

        ui.waitAndClick(page.addTextBoxButton);
        ui.waitAndClick(page.mediaTextBox);
        ui.typeUsingKeyboard("Testing Media Text Box");

        ui.waitAndClick(page.addTableButton);
        ui.waitAndClick(page.mediaDoneButton);
        ui.scrollToElement(page.connectionHeading);

        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "node4");
        ui.waitAndClick(page.create1Button);
        ui.saveElementValueToFile(page.modelNumberLocation, "createNewModelTest");

        //ui.waitAndClick(page.newModelTopButton);
        ui.waitAndClick(page.modelsButton);

        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Searching a model and deleting it")
    public void recentlyDeletedTest_searchingForAModel() {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.modelCheckBox);
        ui.explicitWait(2);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.recentlyDeletedButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Verifying the deleted model in recently deleted")
    public void recentlyDeletedTest_verifyingModelInRecentlyDeleted()
    {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        ui.waitAndClick(page.recentlyDeletedButton);
        ui.verifyElementTextFromFile(page.modelsTable);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Reinstate the model back to model page and verify it")
    public void recentlyDeletedTest_reinstateModelBack()
    {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        ui.waitAndClick(page.reinstateButton);
        ui.explicitWait(2);
        ui.waitAndClick(page.modelsButton);
        ui.explicitWait(2);
        ui.verifyElementTextFromFile(page.modelsTable);
    }


    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Deleting the model Permanently")
    public void recentlyDeletedTest_permanentlyDeletion()
    {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.modelCheckBox);
        ui.explicitWait(2);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.recentlyDeletedButton);
        ui.explicitWait(2);
        ui.waitAndClick(page.deletePermanentlyButton);
        ui.waitAndClick(page.deletePermanentlyPopUpButton);

    }

}