package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpanablePanelsPage extends WebBaseTest
{
    public ExpanablePanelsPage() {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//button[normalize-space()='Models']")
    public WebElement modelsButton;

    @FindBy(xpath = "(//button[@class='font-bold text-slate-900 hover:text-[#0084FF] transition-colors'])[1]")
    public WebElement firstModelButton;

    @FindBy(xpath = "//aside[@class='flex flex-col bg-white shrink-0 z-10 h-full']")
    public WebElement leftPanelInfo;

    @FindBy(xpath = "//button[@title='Expand node tree']//*[name()='svg']")
    public WebElement leftPanelExpandButton;

    @FindBy(xpath = "//button[@title='Restore node tree']//*[name()='svg']")
    public WebElement leftPanelRestoreButton;

    @FindBy(xpath = "(//div[@class='flex items-center py-1.5 px-2 cursor-pointer text-sm group whitespace-nowrap min-w-fit hover:bg-slate-50 text-slate-700'])[1]")
    public WebElement leftPanelFirstNode;

    @FindBy(xpath = "//aside[@class='bg-white flex flex-col shrink-0 z-10 h-full overflow-hidden']")
    public WebElement rightPanelInfo;

    @FindBy(xpath = "//button[contains(@title,'Expand node properties')]//*[name()='svg']")
    public WebElement rightPanelExpandButton;

    @FindBy(xpath = "//button[contains(@title,'Restore node properties')]//*[name()='svg']")
    public WebElement rightPanelRestoreButton;

}
