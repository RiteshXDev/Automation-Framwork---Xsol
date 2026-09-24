package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllStatusCheckPage extends WebBaseTest
{
    public AllStatusCheckPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/button")
    public WebElement allStatusDropDownButton;

    @FindBy(xpath = "//button[@class='hover:text-slate-900 transition-colors']")
    public WebElement mediaButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement allStatusesButton;

    @FindBy(xpath = "//table/tbody")
    public WebElement table;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//button[normalize-space()='Draft']")
    public WebElement draftButton;

    @FindBy(xpath = "//button[normalize-space()='Ready for review']")
    public WebElement readyForReviewButton;

    @FindBy(xpath = "//button[normalize-space()='In review']")
    public WebElement inReviewButton;

    @FindBy(xpath = "//button[normalize-space()='Ready for publish']")
    public WebElement readyForPublishButton;

    @FindBy(xpath = "//button[normalize-space()='Published']")
    public WebElement publishedButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[2]")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/input")
    public WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[2]/button")
    public WebElement gcNumber;

    @FindBy(xpath = "(//input[@class='rounded border-slate-300 text-[#003366] focus:ring-[#003366] w-4 h-4 cursor-pointer'])[2]")
    public WebElement checkBoxButton;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-3 py-1.5 bg-slate-50 text-slate-700 hover:bg-slate-100 border border-slate-200 rounded-lg text-sm font-medium transition-colors']")
    public WebElement changeStatusButton;

    @FindBy(xpath = "//select[@class='w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#003366] focus:border-transparent text-sm bg-white']")
    public WebElement newStatusList;

    @FindBy(xpath = "//option[@value='Draft']")
    public WebElement newStatusList_draftButton;

    @FindBy(xpath = "//option[@value='Ready for review']")
    public WebElement newStatusList_readyForReviewButton;

    @FindBy(xpath = "//option[@value='In review']")
    public WebElement newStatusList_inReviewButton;

    @FindBy(xpath = "//option[@value='Ready for publish']")
    public WebElement newStatusList_readyForPublishButton;

    @FindBy(xpath = "//option[@value='Published']")
    public WebElement newStatusList_PublishedButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-[#003366] hover:bg-[#002244] rounded-lg transition-colors']")
    public WebElement updateStatusButton;


}
