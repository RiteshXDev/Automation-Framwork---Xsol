package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.EditingModelPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class EditingModelTest extends WebBaseTest
{
    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Alerts")
    public void editingModelTest_partNumberEdit() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.refreshPage();
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);
        ui.waitAndClick(page.partNumberClickToAddButton);
        ui.waitAndType(page.partNumberTextBox, "2435546-EDITED");
        ui.pressKey(Keys.ENTER);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Instructions")
    public void editingModelTest_instruction() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);
        ui.waitAndJsClick(page.addInstructionButton);
        ui.waitAndType(page.addInstructionTextBox, "Updated - Inspect the component and verify the updated condition.");
        ui.waitAndJsClick(page.addInstructionDoneButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Setup")
    public void editingModelTest_setup() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);
        ui.waitAndClick(page.addStepButton);
        ui.waitAndType(page.addStepTextBox, "Updated - Remove the protective cover and inspect the connection.");
        ui.waitAndClick(page.addStepDoneButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Media")
    public void editingModelTest_media() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);
        ui.scrollToElement(page.connectionHeading);
        ui.waitAndClick(page.mediaEditButton);
        ui.scrollHorizontally(page.mediaBottomNavigationBar, 300);
        ui.waitAndJsClick(page.mediaTableBar);
        ui.waitAndJsClick(page.mediaTableBarDeleteButton);
        ui.waitAndJsClick(page.mediaTextBox);
        ui.waitAndJsClick(page.mediaTextBoxDeleteButton);
        ui.waitAndJsClick(page.mediaImageBox);
        ui.waitAndJsClick(page.mediaImageDeleteButton);
        ui.waitAndClick(page.uploadImageFromDatabaseButton);
        ui.waitAndClick(page.imageBox);
        ui.waitAndClick(page.imageInsertButton);
        ui.waitAndClick(page.addTextBoxButton);
        ui.waitAndClick(page.mediaTextBox);
        ui.typeUsingKeyboard("Updated - Component inspection area");
        ui.waitAndClick(page.addTableButton);
        ui.waitAndClick(page.mediaDoneButton);


    }

    @Test
    @StepTestDetails(desc = "Design Tool : Editing Model - Connections")
    public void editingModelTest_connection() {

        EditingModelPage page = new EditingModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);
        ui.scrollToElement(page.connectionHeading);
        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "Node 5");
        ui.waitAndClick(page.create1Button);
    }


}
