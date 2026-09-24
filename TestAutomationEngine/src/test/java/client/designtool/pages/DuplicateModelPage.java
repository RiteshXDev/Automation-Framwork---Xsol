package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuplicateModelPage extends WebBaseTest
{
    public DuplicateModelPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recently Deleted']")
    public WebElement recentlyDeletedButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[2]")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/input")
    public WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[2]/button")
    public WebElement gcNumber;

    @FindBy(xpath = "//button[@title='Duplicate']")
    public WebElement duplicateButton;

    @FindBy(xpath = "//tr[.//td[contains(normalize-space(),'British Gas 330+ Open Vented')]]")
    public WebElement row;

    @FindBy(xpath = "(//tr[@class='border-b border-slate-50 hover:bg-slate-50 transition-colors group bg-white'])[1]")
    public WebElement row_delete;

    @FindBy(xpath = "(//button[@title='Delete permanently'])[1]")
    public WebElement deletePermanentlyButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement deletePermanentlyPopUpButton;

    @FindBy(xpath = "//input[@placeholder='e.g. Vaillant']")
    public WebElement manufacturerTextBox;

    @FindBy(xpath = "//input[@placeholder='e.g. ecoTEC plus 24']")
    public WebElement modelNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Enter GC number']")
    public WebElement gcNumberTextBox;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-[#003366] hover:bg-[#002244] rounded-lg transition-colors']")
    public WebElement duplicate_Button;

    @FindBy(xpath = "//tbody[@class='text-slate-700']")
    public WebElement completeTable;

    @FindBy(xpath = "(//input[@class='rounded border-slate-300 text-[#003366] focus:ring-[#003366] w-4 h-4 cursor-pointer'])[2]")
    public WebElement checkBoxButton;

    @FindBy(xpath = "//tr[@class='border-b border-slate-50 hover:bg-slate-50 transition-colors group bg-white']//button[@title='Move to Trash']//*[name()='svg']")
    public WebElement delete_button;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-3 py-1.5 bg-red-50 text-red-600 hover:bg-red-100 border border-red-100 rounded-lg text-sm font-medium transition-colors']")
    public WebElement moveToTrashButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement moveToTrashPopUpButton;
}
