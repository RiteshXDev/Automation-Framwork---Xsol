package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.DeleteFunctionalityPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class DeleteFunctionalityTest extends WebBaseTest
{
    @Test
    @StepTestDetails(desc = "Design Tool : Delete Functionality - Main Page")
    public void MainPageTest_Delete()
    {
        DeleteFunctionalityPage page = new DeleteFunctionalityPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.waitAndClick(page.checkBoxButton);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);

    }
}
