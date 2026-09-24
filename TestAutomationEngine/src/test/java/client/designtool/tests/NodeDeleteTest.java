package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.DeleteFunctionalityPage;
import client.designtool.pages.NodeDeletePage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NodeDeleteTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : Node Deletion - Creating A Model ")
    public void NodeDelete_modelPage_node() {
        NodeDeletePage page = new NodeDeletePage();
        ui.waitAndClick(page.newModelButton);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node3");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.node3LeftSidePanelButton);
        ui.waitAndClick(page.nodeDeleteButton);
        ui.explicitWait(5);
        ui.waitAndClick(page.node2LeftSidePanelButton);
        ui.explicitWait(3);

        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "node4");
        ui.waitAndClick(page.create1Button);

        ui.explicitWait(2);
        ui.waitAndClick(page.node4RightSidePanelButton);
        ui.explicitWait(2);
        ui.waitAndClick(page.nodeDeleteButton);
        ui.saveElementValueToFile(page.modelNumberLocation, "createNewModelTest");
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Node Deletion - Searching A Model And Deleting it")
    public void NodeDelete_searchPage_model() {
        NodeDeletePage page = new NodeDeletePage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.modelCheckBox);
        ui.explicitWait(2);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Node Deletion - Deleting Model On The Main Page")
    public void NodeDelete_mainPage_model() {
        NodeDeletePage page = new NodeDeletePage();
        ui.waitAndClick(page.newModelButton);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(5);
        ui.typeUsingKeyboard("node3");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.saveElementValueToFile(page.modelNumberLocation, "createNewModelTest");
        ui.waitAndClick(page.mediaTopButton);
        ui.waitAndClick(page.newModelTopButton);
        ui.waitAndClick(page.modelMainPageCheckBox);
        ui.waitAndClick(page.moveToTrashButton);
        ui.waitAndClick(page.moveToTrashPopUpButton);
        ui.waitAndClick(page.newModelTopButton);
    }
}
