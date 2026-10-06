package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NodeDeletePage extends WebBaseTest
{
    public NodeDeletePage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//*[@id=\"tilesHolder\"]/div[1]/div/div[1]/div")
    public WebElement pickAccountButton;

    @FindBy(xpath = "//input[@placeholder='Node title, then press Enter']")
    public WebElement nodeTitleTextBox;

    @FindBy(xpath = "(//div[@class='flex items-center py-1.5 px-2 cursor-pointer text-sm group whitespace-nowrap min-w-fit hover:bg-slate-50 text-slate-700'])[2]")
    public WebElement node2LeftSidePanelButton;

    @FindBy(xpath = "(//div[@class='flex items-center py-1.5 px-2 cursor-pointer text-sm group whitespace-nowrap min-w-fit hover:bg-slate-50 text-slate-700'])[2]")
    public WebElement node3LeftSidePanelButton;

    @FindBy(xpath = "//button[@title='Delete node']//*[name()='svg']")
    public WebElement deleteNodeButton;

    @FindBy(xpath = "//button[@class='w-full py-2.5 px-4 bg-red-600 text-white rounded-lg font-semibold hover:bg-red-700 transition-colors']")
    public WebElement confirmDeleteButton;

    @FindBy(xpath = "//td[@class='py-3 px-6']//input[@type='checkbox']")
    public WebElement modelCheckBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-3 py-1.5 bg-red-50 text-red-600 hover:bg-red-100 border border-red-100 rounded-lg text-sm font-medium transition-colors']")
    public WebElement moveToTrashButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement moveToTrashPopUpButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
    public WebElement modelMainPageCheckBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-4 py-2 bg-[#003366] border border-transparent rounded-lg text-sm font-semibold text-white hover:bg-[#002244] transition-colors shadow-sm']")
    public WebElement newModelButton;

    @FindBy(xpath = "//button[@title='Create standalone node']//*[name()='svg']")
    public WebElement addNodeButton;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 px-3 py-2 text-[12px] font-medium text-emerald-600 hover:text-emerald-700 hover:bg-emerald-50 rounded-lg border border-dashed border-emerald-300 transition-colors mt-1']")
    public WebElement addConnectionButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement addConnectionTextBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-1 px-3 py-1.5 bg-emerald-600 text-white text-xs font-semibold rounded-md hover:bg-emerald-700 disabled:opacity-40 disabled:cursor-not-allowed transition-colors']")
    public WebElement create1Button;

    @FindBy(xpath = "//input[@placeholder='GC number']")
    public WebElement modelNumberLocation;

    @FindBy(xpath = "//button[normalize-space()='Models']")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//button[normalize-space()='Media']")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//button[@class='font-bold text-slate-900 hover:text-[#0084FF] transition-colors']")
    public WebElement gcNumber;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 px-3 py-2 text-[12px] font-medium text-emerald-600 hover:text-emerald-700 hover:bg-emerald-50 rounded-lg border border-dashed border-emerald-300 transition-colors mt-1']")
    public WebElement connectionHeading;

    @FindBy(xpath = "//div[@class='flex-1 relative bg-[#f8f9fa]']")
    public WebElement canvasInfo;

    @FindBy(xpath = "(//button[@class='font-bold text-slate-900 hover:text-[#0084FF] transition-colors'])[1]")
    public WebElement firstModelInList;

}



