package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.SearchingForModelPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class SearchingForModelTest extends WebBaseTest
{
    @Test
    @StepTestDetails(desc = "Design Tool : Searching Model in the search Option")
    public void searchNewModelTest() {

        SearchingForModelPage page = new SearchingForModelPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.verifyElementTextFromFile(page.gcNumber);

    }

}
