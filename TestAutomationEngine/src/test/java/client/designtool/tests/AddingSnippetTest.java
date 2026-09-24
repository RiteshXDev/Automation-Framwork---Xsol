package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.AddingSnippetPage;
import core.annotations.StepTestDetails;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AddingSnippetTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : Adding snippet - Alerts")
    public void addingSnippetToModelTest_alerts() {

        AddingSnippetPage page = new AddingSnippetPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);

        ui.waitAndClick(page.alertSnippetButton);
        ui.waitAndType(page.alertSearchSnippetTextBox, "ALLDEMANDOFF");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(15);
        ui.waitAndJsClick(page.allDemandOffSnippetButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Adding snippet - Setup")
    public void addingSnippetToModelTest_setup() {

        AddingSnippetPage page = new AddingSnippetPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);

        ui.waitAndJsClick(page.setupSnippetButton);
        ui.waitAndType(page.alertSearchSnippetTextBox, "AFTERTESTREFIT");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(15);
        ui.waitAndJsClick(page.afterTestRefitSnippetButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Adding snippet - Setup")
    public void addingSnippetToModelTest_instruction() {

        AddingSnippetPage page = new AddingSnippetPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.typeValueFromFile(page.searchTextBox);
        ui.explicitWait(1);
        ui.verifyElementTextFromFile(page.gcNumber);
        ui.explicitWait(1);
        ui.waitAndClick(page.gcNumber);
        ui.waitAndClick(page.node3Button);

        ui.waitAndJsClick(page.instructionSnippetButton);
        ui.waitAndType(page.alertSearchSnippetTextBox, "BLRSTATMAX");
        ui.pressKey(Keys.ENTER);
        ui.explicitWait(15);
        ui.waitAndJsClick(page.blrStatMaxSnippetButton);
    }
}
