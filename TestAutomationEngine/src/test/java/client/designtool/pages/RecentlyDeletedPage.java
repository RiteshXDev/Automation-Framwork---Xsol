package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecentlyDeletedPage extends  WebBaseTest {
    public RecentlyDeletedPage() {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//button[normalize-space()='Models']")
    public WebElement modelsButton;

    @FindBy(xpath = "//span[normalize-space()='Recently Deleted']")
    public WebElement recentlyDeletedButton;

    @FindBy(xpath = "//table[@class='w-full text-left text-sm']")
    public WebElement modelsTable;

    @FindBy(xpath = "(//button[@title='Reinstate'])[1]")
    public WebElement reinstateButton;

    @FindBy(xpath = "//div[@class='bg-white rounded-xl p-6 w-[440px] shadow-xl']")
    public WebElement cannotReinstatePopUp;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-[#003366] hover:bg-[#002244] rounded-lg transition-colors']")
    public WebElement reinstateOkButton;

    @FindBy(xpath = "(//button[@title='Delete permanently'])[1]")
    public WebElement deletePermanentlyButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement deletePermanentlyPopUpButton;

    @FindBy(xpath = "//td[@class='py-3 px-6']//input[@type='checkbox']")
    public WebElement modelCheckBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-3 py-1.5 bg-red-50 text-red-600 hover:bg-red-100 border border-red-100 rounded-lg text-sm font-medium transition-colors']")
    public WebElement moveToTrashButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement moveToTrashPopUpButton;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-4 py-2 bg-[#003366] border border-transparent rounded-lg text-sm font-semibold text-white hover:bg-[#002244] transition-colors shadow-sm']")
    public WebElement newModelButton;

    @FindBy(xpath = "//button[@title='Create standalone node']//*[name()='svg']")
    public WebElement addNodeButton;

    @FindBy(xpath = "//input[@placeholder='Node title, then press Enter']")
    public WebElement nodeTitleTextBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 px-3 py-2 text-[12px] font-medium text-emerald-600 hover:text-emerald-700 hover:bg-emerald-50 rounded-lg border border-dashed border-emerald-300 transition-colors mt-1']")
    public WebElement addConnectionButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement addConnectionTextBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-1 px-3 py-1.5 bg-emerald-600 text-white text-xs font-semibold rounded-md hover:bg-emerald-700 disabled:opacity-40 disabled:cursor-not-allowed transition-colors']")
    public WebElement create1Button;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/aside[1]/div[1]/div/div[2]/input[3]")
    public WebElement modelNumberLocation;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//span[@class='text-sm font-mono font-semibold flex-1 text-slate-300 italic font-normal cursor-text hover:bg-white rounded px-1 -mx-1 transition-colors']")
    public WebElement partNumberClickToAddButton;

    @FindBy(xpath = "//input[@class='flex-1 px-2 py-0.5 bg-white border border-emerald-300 rounded text-sm font-mono outline-none']")
    public WebElement partNumberTextBox;

    @FindBy(xpath = "//button[normalize-space()='Add alert']")
    public WebElement addAlertButton;

    @FindBy(xpath = "//p[@class='is-empty is-editor-empty']")
    public WebElement editAlertTextBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-1 text-xs font-medium text-emerald-700 hover:text-emerald-800 transition-colors']")
    public WebElement alertDoneButton;


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

    @FindBy(xpath = "//button[normalize-space()='Media']")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//button[@class='font-bold text-slate-900 hover:text-[#0084FF] transition-colors']")
    public WebElement gcNumber;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 px-3 py-2 text-[12px] font-medium text-emerald-600 hover:text-emerald-700 hover:bg-emerald-50 rounded-lg border border-dashed border-emerald-300 transition-colors mt-1']")
    public WebElement connectionHeading;


    @FindBy(xpath = "//button[@title='Duplicate']")
    public WebElement duplicateButton;

    @FindBy(xpath = "//tr[.//td[contains(normalize-space(), '4101911')]]")
    public WebElement row;

    @FindBy(xpath = "(//tr[@class='border-b border-slate-50 hover:bg-slate-50 transition-colors group bg-white'])[1]")
    public WebElement row_delete;

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

    @FindBy(xpath = "(//button[@title='Delete permanently'])[1]")
    public WebElement deletePermanently_1;

    @FindBy(xpath = "//div[@class='bg-white rounded-xl p-6 w-[400px] shadow-xl']")
    public WebElement duplicateModelPopUp;
}