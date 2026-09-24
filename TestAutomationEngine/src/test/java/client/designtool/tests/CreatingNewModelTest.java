package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.CreatingNewModelPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CreatingNewModelTest extends WebBaseTest {

    @Test
    @StepTestDetails(desc = "Design Tool : Creating a New Model")
    public void createNewModelTest() {

        CreatingNewModelPage page = new CreatingNewModelPage();
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
        ui.explicitWait(15);
        ui.waitAndClick(page.chdemandButton);


        ui.explicitWait(15);
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


    }


}

