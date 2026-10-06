package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewModelPage extends  WebBaseTest
{
    public CreatingNewModelPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-4 py-2 bg-[#003366] border border-transparent rounded-lg text-sm font-semibold text-white hover:bg-[#002244] transition-colors shadow-sm']")
    public WebElement newModelButton;

    @FindBy(xpath = "//*[@id=\"tilesHolder\"]/div[1]/div/div[1]/div")
    public WebElement pickAccountButton;

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

    @FindBy(xpath = "//button[contains(normalize-space(.),'Alerts')]/ancestor::div[contains(@class,'flex-1')]/following-sibling::button[normalize-space(.)='Snippet']")
    public WebElement alertSnippetButton;

    @FindBy(xpath = "//input[@placeholder='Search snippets…']")
    public WebElement alertSearchSnippetTextBox;

    @FindBy(xpath = "//span[normalize-space()='CHDEMAND']")
    public WebElement chdemandButton;

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

    @FindBy(xpath = "//button[normalize-space()='Media']")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//button[@class='font-bold text-slate-900 hover:text-[#0084FF] transition-colors']")
    public WebElement gcNumber;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 px-3 py-2 text-[12px] font-medium text-emerald-600 hover:text-emerald-700 hover:bg-emerald-50 rounded-lg border border-dashed border-emerald-300 transition-colors mt-1']")
    public WebElement connectionHeading;



}
