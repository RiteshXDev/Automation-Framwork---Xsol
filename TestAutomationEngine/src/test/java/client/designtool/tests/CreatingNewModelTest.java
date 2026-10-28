package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.CreatingNewModelPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CreatingNewModelTest extends WebBaseTest
{
    @Test
    @StepTestDetails(desc = "Design Tool : Creating a New Model")
    public void createNewModelTest()
    {
        CreatingNewModelPage page = new CreatingNewModelPage();
        ui.waitAndClick(page.pickAccountButton);
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
        ui.waitAndClick(page.alertSnippetButton);

        ui.executeOptionalSteps(() ->
                {
                    ui.waitAndType(page.alertSearchSnippetTextBox, "CHDEMAND");
                    ui.pressKey(Keys.ENTER);
                    ui.explicitWait(3);
                    ui.waitAndClickUntilClickable(page.chdemandButton);
                });

        ui.pressKey(Keys.ESCAPE);
        ui.explicitWait(1);
        ui.waitAndClick(page.addInstructionButton);
        ui.waitAndType(page.addInstructionTextBox, "Inspect the component for visible damage before proceeding.");
        ui.waitAndClick(page.addInstructionDoneButton);

        ui.waitAndClick(page.addStepButton);
        ui.waitAndType(page.addStepTextBox, "Remove the protective cover and inspect the connection.");
        ui.waitAndClick(page.addStepDoneButton);

        ui.waitAndClick(page.mediaEditButton);
        ui.waitAndClick(page.uploadImageFromDatabaseButton);
        ui.waitAndClick(page.imageBox);
        ui.waitAndClick(page.imageInsertButton);

        ui.waitAndClick(page.addTextBoxButton);
        ui.waitAndClick(page.mediaTextBox);
        ui.typeUsingKeyboard("Component inspection area");

        ui.waitAndClick(page.addTableButton);
        ui.waitAndClick(page.mediaDoneButton);
        ui.scrollToElement(page.connectionHeading);

        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "Node 4");
        ui.waitAndClick(page.create1Button);
        ui.saveGCNumberToFile(page.modelNumberLocation);
        ui.waitAndClick(page.newModelTopButton);
    }
}

