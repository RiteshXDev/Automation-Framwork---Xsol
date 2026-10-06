package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.EndPointPage;
import client.designtool.pages.ExpanablePanelsPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class ExpandablePanelsTest extends WebBaseTest
{

    @Test
    @StepTestDetails(desc = "Expandable Panel : Left Panel Verification ")
    public void ExpandablePanelsTest_leftPanel()
    {
        ExpanablePanelsPage page = new ExpanablePanelsPage();
        ui.clickIfDisplayed(page.modelsButton);
        ui.waitAndClick(page.firstModelButton);
        ui.verifyPanelExpanded(page.leftPanelInfo,page.leftPanelExpandButton);
        ui.waitAndClick(page.leftPanelRestoreButton);
    }

    @Test
    @StepTestDetails(desc = "Expandable Panel : Left Panel Verification ")
    public void ExpandablePanelsTest_rightPanel()
    {
        ExpanablePanelsPage page = new ExpanablePanelsPage();
        ui.clickIfDisplayed(page.modelsButton);
        ui.waitAndClick(page.firstModelButton);
        ui.waitAndClick(page.leftPanelFirstNode);
        ui.verifyPanelExpanded(page.rightPanelInfo,page.rightPanelExpandButton);
        ui.waitAndClick(page.rightPanelRestoreButton);

    }

    @Test
    @StepTestDetails(desc = "Expandable Panel : left panel hide button check ")
    public void ExpandablePanelsTest_hideButton()
    {
        ExpanablePanelsPage page = new ExpanablePanelsPage();
        ui.clickIfDisplayed(page.modelsButton);
        ui.waitAndClick(page.firstModelButton);
        ui.verifyPanelExpanded(page.leftPanelInfo,page.leftPanelExpandButton);
        ui.waitAndClick(page.hidePanelButton);
        ui.waitAndClick(page.hidePanelButton_1);
    }
}
