package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.EndPointPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class EndPointTest extends WebBaseTest
{

    @Test
    @StepTestDetails(desc = "EndPoint : Creating a model with end points ")
    public void endPointTest()
    {
        EndPointPage page = new EndPointPage();
        //ui.waitAndClick(page.pickAccountButton);
        ui.waitAndClick(page.newModelButton);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("node1");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("node2");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(3);
        ui.waitAndClick(page.addNodeButton);
        ui.explicitWait(3);
        ui.typeUsingKeyboard("node3");
        ui.pressKey(Keys.ENTER);
        ui.waitAndClick(page.node3Button);
        ui.waitAndClick(page.endPointTickBox);
        ui.scrollToElement(page.connectionHeading);
        ui.waitAndClick(page.addConnectionButton);
        ui.waitAndType(page.addConnectionTextBox, "node4");
        ui.waitAndClick(page.create1Button);
        ui.waitAndClick(page.node4Button);
        ui.waitAndClick(page.endPointTickBox);
        ui.verifyContainsText(page.node4_leftPanel,"END POINT");
        ui.saveElementValueToFile(page.modelNumberLocation, "createNewModelTest");

    }
}
