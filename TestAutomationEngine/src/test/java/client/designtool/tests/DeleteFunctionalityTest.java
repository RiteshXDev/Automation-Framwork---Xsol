package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.DeleteFunctionalityPage;
import client.designtool.pages.NodeDeletePage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class DeleteFunctionalityTest extends WebBaseTest
{
    @Test
    @StepTestDetails(desc = "Design Tool : Delete Functionality - Creating and deleting model from the Main Page")
    public void deleteFunctionality_mainPage() {
        DeleteFunctionalityPage page = new DeleteFunctionalityPage();
        ui.refreshPage();
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
        ui.saveGCNumberToFile(page.modelNumberLocation);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.modelMainPageCheckBox_1);
        ui.explicitWait(3);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitUntilVisible(page.moveTrashDialogBox);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Delete Functionality - Creating, Searching and deleting the model")
    public void deleteFunctionality_SearchPage() {
        NodeDeletePage page = new NodeDeletePage();
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
        ui.saveGCNumberToFile(page.modelNumberLocation);
        ui.waitAndClick(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(3);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(3);
        ui.waitAndClick(page.modelCheckBox);
        ui.explicitWait(3);
        ui.waitAndClick(page.moveToTrashButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Delete Functionality - Creating and deleting multiple model from the Main Page")
    public void deleteFunctionality_multiple_mainPage()
    {
        DeleteFunctionalityPage page = new DeleteFunctionalityPage();
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
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);

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
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);

        ui.explicitWait(3);
        ui.waitAndClick(page.modelMainPageCheckBox_1);
        ui.waitAndClick(page.modelMainPageCheckBox_2);
        ui.explicitWait(3);
        ui.waitAndClick(page.moveToTrashButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Delete Functionality - Creating and deleting model from the Board Page")
    public void deleteFunctionality_boardPage()
    {
        DeleteFunctionalityPage page = new DeleteFunctionalityPage();
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
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);

        ui.waitAndClick(page.boardButton);
        ui.hoverAndClick(page.boardHoverButtons,page.boardDeleteButton);
        ui.explicitWait(3);
        ui.verifyElementDisplayed(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.newModelTopButton);
        ui.waitAndClick(page.tableButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Delete Functionality - Delete multiple models permanently")
    public void deleteFunctionality_multipleModels()
    {
        DeleteFunctionalityPage page = new DeleteFunctionalityPage();
        ui.waitAndClick(page.recentlyDeletedButton);
        for (int i = 0; i < 2; i++) {
            ui.waitAndClick(page.deletePermanently_1);
            ui.waitAndClick(page.deletePermanentlyPopUpButton);
            ui.explicitWait(3);
        }
    }
}

