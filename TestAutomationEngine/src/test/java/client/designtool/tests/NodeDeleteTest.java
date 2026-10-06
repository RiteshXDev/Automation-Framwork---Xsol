package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.DeleteFunctionalityPage;
import client.designtool.pages.NodeDeletePage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NodeDeleteTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : Node Deletion - Creating a model & deleting nodes ")
    public void NodeDelete_modelPage_node() {
        NodeDeletePage page = new NodeDeletePage();
        ui.refreshPage();
        ui.waitAndClick(page.newModelButton);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 3");
        ui.pressKey(Keys.ENTER);
        ui.waitUntilVisible(page.node2LeftSidePanelButton);
        ui.waitAndClick(page.node2LeftSidePanelButton);
        ui.explicitWait(5);
        ui.waitAndClick(page.deleteNodeButton);
        ui.waitAndClick(page.confirmDeleteButton);
        ui.waitAndClick(page.node3LeftSidePanelButton);
        ui.explicitWait(5);
        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "Node 4");
        ui.waitAndClick(page.create1Button);
        ui.waitAndClick(page.deleteNodeButton);
        ui.waitAndClick(page.confirmDeleteButton);
        ui.saveGCNumberToFile(page.modelNumberLocation);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Node Deletion - Searching a model and deleting it")
    public void NodeDelete_searchPage_model() {
        NodeDeletePage page = new NodeDeletePage();
        ui.refreshPage();
        ui.clickIfDisplayed(page.newModelTopButton);
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
    @StepTestDetails(desc = "Design Tool : Node Deletion - Creating a model and deleting node, Revisiting the model and checking if the node is still present")
    public void NodeDelete_revisitingDeleteNode()
    {
        NodeDeletePage page = new NodeDeletePage();
        ui.waitAndClick(page.newModelButton);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(5);
        ui.waitAndClick(page.addNodeButton);
        ui.waitAndType(page.nodeTitleTextBox,"Node 3");
        ui.pressKey(Keys.ENTER);
        ui.waitUntilVisible(page.node2LeftSidePanelButton);
        ui.waitAndClick(page.node2LeftSidePanelButton);
        ui.explicitWait(5);
        ui.waitAndClick(page.deleteNodeButton);
        ui.waitAndClick(page.confirmDeleteButton);
        ui.verifyContainsText(page.canvasInfo,"Node 2");
        ui.waitAndClick(page.newModelTopButton);
        ui.waitAndClick(page.firstModelInList);
        ui.verifyContainsText(page.canvasInfo,"Node 2");
        ui.waitAndClick(page.newModelTopButton);
    }


}
