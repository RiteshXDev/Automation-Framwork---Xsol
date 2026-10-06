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
    @StepTestDetails(desc = "Design Tool : Duplicate Models - Creating a Duplicate Model")
    public void MainPageTest_DuplicateModels_creating()
    {
        DuplicateModelPage page = new DuplicateModelPage();
        randomModelName = "4101911 - " + (1000 + new Random().nextInt(9000));
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.type(page.searchTextBox,"4101911");
        ui.explicitWait(3);
        ui.hoverAndClick(page.row,page.duplicateButton);
        ui.explicitWait(3);
        ui.waitAndType(page.manufacturerTextBox, randomModelName);
        ui.waitAndType(page.modelNameTextBox, randomModelName);
        ui.waitAndType(page.gcNumberTextBox, randomModelName);
        ui.explicitWait(3);
        ui.waitAndClick(page.duplicate_Button);
        ui.explicitWait(3);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
        ui.explicitWait(3);
        ui.verifyContainsText(page.completeTable, randomModelName);


    }

    @Test
    @StepTestDetails(desc = "Design Tool : Duplicate Models - Deleting the duplicate Model")
    public void MainPageTest_DuplicateModels_deleting()
    {
        DuplicateModelPage page = new DuplicateModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.type(page.searchTextBox,randomModelName);
        ui.explicitWait(3);
        ui.waitAndClick(page.checkBoxButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.moveToTrashButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.moveToTrashPopUpButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Duplicate Models - Deleting the duplicate Model Permanently")
    public void MainPageTest_DuplicateModels_deletingPermanently()
    {
        DuplicateModelPage page = new DuplicateModelPage();
        ui.explicitWait(2);
        ui.waitAndClick(page.recentlyDeletedButton);
         ui.explicitWait(3);
        ui.hoverAndClick(page.row_delete,page.deletePermanentlyButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.deletePermanentlyPopUpButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
    }

}
