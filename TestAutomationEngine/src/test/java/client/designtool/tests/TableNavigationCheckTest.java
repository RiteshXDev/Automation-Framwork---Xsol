package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.TableNavigationCheckPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class TableNavigationCheckTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : Main Page Table Next Button Check")
    public void TableNavigationCheckTest_next() {

        TableNavigationCheckPage page = new TableNavigationCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        //ui.clickIfDisplayed(page.tableSliderButton);

        String before = ui.getTableText(page.mainPageTable);
        ui.waitAndClick(page.nextButton);
        ui.explicitWait(2);
        String after = ui.getTableText(page.mainPageTable);

        ui.verifyTableChanged(before, after);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Main Page Table Previous Button Check")
    public void TableNavigationCheckTest_previous() {

        TableNavigationCheckPage page = new TableNavigationCheckPage();
        //ui.clickIfDisplayed(page.newModelTopButton);

        String before = ui.getTableText(page.mainPageTable);
        ui.waitAndClick(page.previousButton);
        ui.explicitWait(2);
        String after = ui.getTableText(page.mainPageTable);

        ui.verifyTableChanged(before, after);

    }
}
