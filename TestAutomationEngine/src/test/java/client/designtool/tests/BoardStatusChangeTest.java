package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.BoardStatusChangePage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class BoardStatusChangeTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : ")
    public void boardStatusChangeTest()
    {
        BoardStatusChangePage page = new BoardStatusChangePage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.boardButton);
        ui.explicitWait(2);
        ui.dragUsingRobot(page.draftCard,page.readyToReviewRow);
    }
}
