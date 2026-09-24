package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.EditingModelPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class EditingModelTest extends WebBaseTest
{
    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Alerts")
    public void editingModelTest_partNumberEdit() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);

        ui.waitAndClick(page.partNumberTextBox);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("Updated");
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Instructions")
    public void editingModelTest_instruction() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);

        ui.explicitWait(2);
        ui.waitAndJsClick(page.addInstructionButton);
        ui.waitAndType(page.addInstructionTextBox, " - Updated add instruction text box");
        ui.waitAndJsClick(page.addInstructionDoneButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Setup")
    public void editingModelTest_setup() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);

        ui.waitAndClick(page.addStepButton);
        ui.waitAndType(page.addStepTextBox, " - Updated add step text box");
        ui.waitAndClick(page.addStepDoneButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Media")
    public void editingModelTest_media() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);

        ui.waitAndClick(page.node3Button);
        ui.scrollToElement(page.connectionHeading);

        ui.waitAndClick(page.mediaEditButton);

        ui.scrollHorizontally(page.mediaBottomNavigationBar, 300);
        ui.explicitWait(3);
        ui.waitAndJsClick(page.mediaTableBar);
        ui.explicitWait(3);
        ui.waitAndJsClick(page.mediaTableBarDeleteButton);

        ui.waitAndJsClick(page.mediaTextBox);
        ui.explicitWait(1);
        ui.waitAndJsClick(page.mediaTextBoxDeleteButton);

        ui.waitAndJsClick(page.mediaImageBox);
        ui.waitAndJsClick(page.mediaImageDeleteButton);


        ui.waitAndClick(page.uploadImageFromDatabaseButton);
        ui.waitAndClick(page.imageBox);
        ui.waitAndClick(page.imageInsertButton);

        ui.waitAndClick(page.addTextBoxButton);
        ui.waitAndClick(page.mediaTextBox);
        ui.typeUsingKeyboard(" Testing Media TextBox - updated");

        ui.waitAndClick(page.addTableButton);
        ui.waitAndClick(page.mediaDoneButton);


    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Connections")
    public void editingModelTest_connection() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);

        ui.waitAndClick(page.node3Button);

        ui.scrollToElement(page.connectionHeading);

        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "node5");
        ui.waitAndClick(page.create1Button);
    }


}
