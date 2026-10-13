package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFunctionalityPage extends WebBaseTest
{
    public DeleteFunctionalityPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//input[@placeholder='Node title, then press Enter']")
    public WebElement nodeTitleTextBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-3 py-1.5 bg-red-50 text-red-600 hover:bg-red-100 border border-red-100 rounded-lg text-sm font-medium transition-colors']")
    public WebElement moveToTrashButton;

    @FindBy(xpath = "//div[@class='bg-white rounded-xl p-6 w-[400px] shadow-xl']")
    public WebElement moveTrashDialogBox;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement moveToTrashPopUpButton;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-4 py-1.5 rounded-md text-sm font-medium transition-colors text-slate-500 hover:text-slate-700']")
    public WebElement tableButton;

    @FindBy(xpath = "//span[normalize-space()='Recently Deleted']")
    public WebElement recentlyDeletedButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement modelMainPageCheckBox_1;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement modelMainPageCheckBox_2;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-4 py-1.5 rounded-md text-sm font-medium transition-colors text-slate-500 hover:text-slate-700']")
    public WebElement boardButton;

    @FindBy(xpath = "(//button[@class='p-1 text-slate-400 hover:text-red-500'])[1]")
    public WebElement boardDeleteButton;

    @FindBy(xpath = "(//div[@class='flex items-center gap-1 opacity-0 group-hover:opacity-100 transition-opacity'])[1]")
    public WebElement boardHoverButtons;


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

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement deletePermanentlyPopUpButton;

    @FindBy(xpath = "(//button[@title='Delete permanently'])[1]")
    public WebElement deletePermanently_1;



}



