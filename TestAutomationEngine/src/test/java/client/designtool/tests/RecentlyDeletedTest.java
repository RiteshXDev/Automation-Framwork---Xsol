package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.NodeDeletePage;
import client.designtool.pages.RecentlyDeletedPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Random;

public class RecentlyDeletedTest extends WebBaseTest {


    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Creating a model")
    public void recentlyDeletedTest_creatingAModel() {

        RecentlyDeletedPage page = new RecentlyDeletedPage();
        //ui.waitAndClick(page.pickAccountButton);
        //ui.waitAndClick(page.pickAccountButton);
        ui.waitAndClick(page.newModelButton);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 3");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);

        ui.waitAndClick(page.partNumberClickToAddButton);
        ui.waitAndType(page.partNumberTextBox, "2435546");
        ui.pressKey(Keys.ENTER);

        ui.waitAndClick(page.addAlertButton);
        ui.waitAndClick(page.editAlertTextBox);
        ui.waitAndType(page.editAlertTextBox, "Warning: Verify all safety conditions before proceeding.");
        ui.waitAndClick(page.alertDoneButton);

        ui.explicitWait(1);
        ui.waitAndClick(page.addInstructionButton);
        ui.waitAndType(page.addInstructionTextBox, "Inspect the component for visible damage before proceeding.");
        ui.waitAndClick(page.addInstructionDoneButton);

        ui.waitAndClick(page.addStepButton);
        ui.waitAndType(page.addStepTextBox, "Remove the protective cover and inspect the connection.");
        ui.waitAndClick(page.addStepDoneButton);

        ui.scrollToElement(page.connectionHeading);
        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "Node 4");
        ui.waitAndClick(page.create1Button);
        ui.saveGCNumberToFile(page.modelNumberLocation);
        ui.waitAndClick(page.newModelTopButton);
        ui.explicitWait(5);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Searching a model and deleting it")
    public void recentlyDeletedTest_searchingForAModel() {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);

        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitUntilVisible(page.modelCheckBox);
        ui.waitAndClick(page.modelCheckBox);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitUntilVisible(page.moveToTrashPopUpButton);
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
        ui.waitUntilVisible(page.modelsTable);
        ui.verifyElementTextFromFile(page.modelsTable);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Reinstate the model back to model page and verify it")
    public void recentlyDeletedTest_reinstateModelBack()
    {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        ui.waitAndClick(page.recentlyDeletedButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.reinstateButton);
        ui.waitAndClick(page.modelsButton);
        ui.explicitWait(3);
        ui.verifyElementTextFromFile(page.modelsTable);
    }


    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Deleting the model Permanently")
    public void recentlyDeletedTest_permanentlyDeletion()
    {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        ui.refreshPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitUntilVisible(page.modelCheckBox);
        ui.waitAndClick(page.modelCheckBox);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.recentlyDeletedButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.deletePermanentlyButton);
        ui.waitAndClick(page.deletePermanentlyPopUpButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Creating a duplicate model, Deleting and reinstating it")
    public void recentlyDeletedTest_reinstate()
    {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        String randomModelName = "4101911 - " + (1000 + new Random().nextInt(9000));
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitUntilVisible(page.searchTextBox);
        ui.type(page.searchTextBox,"4101911");
        ui.explicitWait(3);
        ui.hoverAndClick(page.row,page.duplicateButton);
        ui.waitUntilVisible(page.duplicateModelPopUp);
        ui.waitAndType(page.manufacturerTextBox, randomModelName);
        ui.waitAndType(page.modelNameTextBox, randomModelName);
        ui.waitAndType(page.gcNumberTextBox, randomModelName);
        ui.waitAndClick(page.duplicate_Button);
        ui.explicitWait(3);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
        ui.waitUntilVisible(page.completeTable);
        ui.verifyContainsText(page.completeTable, randomModelName);

        ui.type(page.searchTextBox,randomModelName);
        ui.waitUntilVisible(page.checkBoxButton);
        ui.waitAndClick(page.checkBoxButton);

        ui.waitAndClick(page.moveToTrashButton);
        ui.waitUntilVisible(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);

        ui.waitAndClick(page.recentlyDeletedButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.deletePermanently_1);
        ui.waitAndClick(page.deletePermanentlyPopUpButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Recently Deleted - Reinstating model which already exist ")
    public void recentlyDeletedTest_reinstateExistModel()
    {
        RecentlyDeletedPage page = new RecentlyDeletedPage();
        String modelName = "4101911 - 1";
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitUntilVisible(page.searchTextBox);
        ui.type(page.searchTextBox,"4101911");
        ui.explicitWait(3);
        ui.hoverAndClick(page.row,page.duplicateButton);
        ui.waitUntilVisible(page.duplicateModelPopUp);
        ui.waitAndType(page.manufacturerTextBox, modelName);
        ui.waitAndType(page.modelNameTextBox, modelName);
        ui.waitAndType(page.gcNumberTextBox, modelName);
        ui.waitAndClick(page.duplicate_Button);
        ui.explicitWait(3);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
        ui.waitUntilVisible(page.completeTable);
        ui.verifyContainsText(page.completeTable, modelName);

        ui.type(page.searchTextBox,modelName);
        ui.waitUntilVisible(page.checkBoxButton);
        ui.waitAndClick(page.checkBoxButton);

        ui.waitAndClick(page.moveToTrashButton);
        ui.waitUntilVisible(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);


        ui.waitAndClick(page.newModelTopButton);
        ui.type(page.searchTextBox,"4101911");
        ui.explicitWait(3);
        ui.hoverAndClick(page.row,page.duplicateButton);
        ui.waitUntilVisible(page.duplicateModelPopUp);
        ui.waitAndType(page.manufacturerTextBox, modelName);
        ui.waitAndType(page.modelNameTextBox, modelName);
        ui.waitAndType(page.gcNumberTextBox, modelName);
        ui.waitAndClick(page.duplicate_Button);
        ui.explicitWait(3);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
        ui.waitUntilVisible(page.completeTable);
        ui.verifyContainsText(page.completeTable, modelName);

        ui.waitAndClick(page.recentlyDeletedButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.reinstateButton);
        ui.verifyContainsText(page.cannotReinstatePopUp,"This GC number and Model name already exist in active models. Please rename the GC number and Model name in the Active Models list before reinstating this model.");
        ui.waitAndClick(page.reinstateOkButton);
        ui.waitAndClick(page.deletePermanently_1);
        ui.waitAndClick(page.deletePermanentlyPopUpButton);

        ui.waitAndClick(page.newModelTopButton);
        ui.explicitWait(3);

        ui.type(page.searchTextBox,"4101911 - 1");

        ui.waitUntilVisible(page.checkBoxButton);
        ui.waitAndClick(page.checkBoxButton);

        ui.waitAndClick(page.moveToTrashButton);
        ui.waitUntilVisible(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);

        ui.waitAndClick(page.recentlyDeletedButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.deletePermanently_1);
        ui.waitAndClick(page.deletePermanentlyPopUpButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.newModelTopButton);
    }
}