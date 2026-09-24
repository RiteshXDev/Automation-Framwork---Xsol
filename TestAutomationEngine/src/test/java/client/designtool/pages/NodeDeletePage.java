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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/button")
    public WebElement newModelButton;

    @FindBy(xpath = "//*[@id=\"tilesHolder\"]/div[1]/div/div[1]/div")
    public WebElement pickAccountButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/aside[1]/div[3]/div[1]/div/button[1]")
    public WebElement addNodeButton;

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

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[2]")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/input")
    public WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[2]/button")
    public WebElement gcNumber;

    @FindBy(xpath = "//button[@title='Delete node']//*[name()='svg']")
    public WebElement nodeDeleteButton;

    @FindBy(xpath = "//span[@class='text-sm leading-snug text-blue-600 font-medium']")
    public WebElement node3LeftSidePanelButton;

    @FindBy(xpath = "(//div[.//span[normalize-space()='node2']])[8]")
    public WebElement node2LeftSidePanelButton;

    @FindBy(xpath = "//span[@class='text-[13px] font-semibold text-slate-800 group-hover/conn:text-emerald-700 transition-colors flex-1 truncate']")
    public WebElement node4RightSidePanelButton;

    @FindBy(xpath = "//td[@class='py-3 px-6']//input[@type='checkbox']")
    public WebElement modelCheckBox;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-3 py-1.5 bg-red-50 text-red-600 hover:bg-red-100 border border-red-100 rounded-lg text-sm font-medium transition-colors']")
    public WebElement moveToTrashButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement moveToTrashPopUpButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
    public WebElement modelMainPageCheckBox;
}
