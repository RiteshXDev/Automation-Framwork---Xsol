package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.DeleteFunctionalityPage;
import client.designtool.pages.DuplicateModelPage;
import client.designtool.pages.RecentlyDeletedPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

import java.util.Random;

public class DuplicateModelTest extends WebBaseTest
{
    String randomModelName;
    @Test
    @StepTestDetails(desc = "Design Tool : Duplicate Models - Creating a duplicate model and deleting it")
    public void MainPageTest_DuplicateModels_creatingAndDeleting()
    {
        DuplicateModelPage page = new DuplicateModelPage();
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
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Duplicate Models - Deleting the duplicate Model Permanently")
    public void MainPageTest_DuplicateModels_deletingPermanently()
    {
        DuplicateModelPage page = new DuplicateModelPage();
        ui.waitAndClick(page.recentlyDeletedButton);
         ui.explicitWait(3);
        ui.hoverAndClick(page.row_delete,page.deletePermanentlyButton);
        ui.waitUntilVisible(page.deletePermanentlyDialogBox);
        ui.waitAndClick(page.deletePermanentlyPopUpButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
    }

}
