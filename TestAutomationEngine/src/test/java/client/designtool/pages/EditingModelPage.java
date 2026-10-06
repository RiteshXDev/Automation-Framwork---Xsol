package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditingModelPage extends WebBaseTest
{

    public EditingModelPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-4 py-2 bg-[#003366] border border-transparent rounded-lg text-sm font-semibold text-white hover:bg-[#002244] transition-colors shadow-sm']")
    public WebElement newModelButton;

    @FindBy(xpath = "//button[@title='Create standalone node']//*[name()='svg']")
    public WebElement addNodeButton;

    @FindBy(xpath = "//span[@class='text-sm font-mono font-semibold flex-1 text-slate-300 italic font-normal cursor-text hover:bg-white rounded px-1 -mx-1 transition-colors']")
    public WebElement partNumberClickToAddButton;

    @FindBy(xpath = "//input[@class='flex-1 px-2 py-0.5 bg-white border border-emerald-300 rounded text-sm font-mono outline-none']")
    public WebElement partNumberTextBox;

    @FindBy(xpath = "//button[normalize-space()='Add step']")
    public WebElement addStepButton;

    @FindBy(xpath = "//p[@class='is-empty is-editor-empty']")
    public WebElement addStepTextBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-1 text-xs font-medium text-emerald-700 hover:text-emerald-800 transition-colors']")
    public WebElement addStepDoneButton;

    @FindBy(xpath = "//button[normalize-space()='Add instruction']")
    public WebElement addInstructionButton;

    @FindBy(xpath = "//p[@class='is-empty is-editor-empty']")
    public WebElement addInstructionTextBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-1 text-xs font-medium text-emerald-700 hover:text-emerald-800 transition-colors']")
    public WebElement addInstructionDoneButton;

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    public WebElement mediaEditButton;

    @FindBy(xpath = "//button[@title='Browse library']//*[name()='svg']")
    public WebElement uploadImageFromDatabaseButton;

    @FindBy(xpath = "//button[@title='Add text box']//*[name()='svg']")
    public WebElement addTextBoxButton;

    @FindBy(xpath = "//button[@title='Add table']//*[name()='svg']")
    public WebElement addTableButton;

    @FindBy(xpath = "(//img[@class='w-full h-full object-cover'])[1]")
    public WebElement imageBox;

    @FindBy(xpath = "//button[@class='rounded-lg bg-emerald-600 px-4 py-2 text-sm font-medium text-white hover:bg-emerald-700 disabled:opacity-50 disabled:cursor-not-allowed']")
    public WebElement imageInsertButton;

    @FindBy(xpath = "//textarea[@placeholder='Type here...']")
    public WebElement mediaTextBox;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    public WebElement mediaDoneButton;

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

    @FindBy(xpath = "(//div[@class='flex items-center py-1.5 px-2 cursor-pointer text-sm group whitespace-nowrap min-w-fit hover:bg-slate-50 text-slate-700'])[3]")
    public WebElement node3Button;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/aside[2]/div/div/div[2]/div/div/div[5]/div[2]/div[2]/div/div[3]")
    public WebElement mediaTableBar;

    @FindBy(xpath = "//button[@class='p-0.5 text-slate-400 hover:text-red-500 transition-colors']")
    public WebElement mediaTableBarDeleteButton;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 px-3 py-2 text-[12px] font-medium text-emerald-600 hover:text-emerald-700 hover:bg-emerald-50 rounded-lg border border-dashed border-emerald-300 transition-colors mt-1']")
    public WebElement connectionHeading;

    @FindBy(xpath="//div[contains(@class,'border-emerald-300') and contains(@class,'overflow-auto')]")
    public WebElement mediaBottomNavigationBar;

    @FindBy(xpath = "//button[@class='p-0.5 text-slate-400 hover:text-red-500 transition-colors']")
    public WebElement mediaTextBoxDeleteButton;

    @FindBy(xpath = "//button[@class='p-0.5 text-slate-400 hover:text-red-500 transition-colors']")
    public WebElement mediaImageDeleteButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/aside[2]/div/div/div[2]/div/div/div[5]/div[2]/div[2]/div/div/div[2]/div")
    public WebElement mediaImageBox;


}
