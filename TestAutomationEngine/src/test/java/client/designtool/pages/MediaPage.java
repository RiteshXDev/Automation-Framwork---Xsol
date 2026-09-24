package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaPage extends WebBaseTest {

    public MediaPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 h-16 px-2 border-b-2 text-sm font-medium transition-colors border-[#1E3A8A] text-slate-900 font-semibold']")
    public WebElement recentlyDeletedButton;

    @FindBy(xpath = "(//button[normalize-space()='Media'])[1]")
    public WebElement mediaButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement browserFilesBar;

    @FindBy(xpath = "//button[@class='rounded-lg bg-[#003366] px-4 py-2 text-sm font-semibold text-white hover:bg-[#002244] disabled:cursor-not-allowed disabled:opacity-50']")
    public WebElement uploadButton;

    @FindBy(xpath = "(//button[@class='group relative flex flex-col overflow-hidden rounded-xl border bg-white text-left transition-all cursor-pointer border-slate-200 hover:border-slate-300 hover:shadow-md'])[1]")
    public WebElement firstImageGrid;

    @FindBy(xpath = "//div[@class='grid grid-cols-[repeat(auto-fill,minmax(180px,1fr))] gap-3.5']")
    public WebElement imageGrid;

    @FindBy(xpath = "//div[@class='flex h-full w-full flex-col gap-6 overflow-y-auto px-12 py-8']")
    public WebElement collectionLocation;

    @FindBy(xpath = "//select[@class='ml-7 rounded-lg border border-slate-200 bg-white px-3 py-2 text-sm text-slate-900 outline-none focus:border-[#003366]']")
    public WebElement generalButton;

    @FindBy(xpath = "//select/option[text()='Test']")
    public WebElement TestButton;

    @FindBy(xpath = "//label[@class='flex cursor-pointer items-center gap-3 rounded-lg border px-3 py-2 border-slate-200 bg-white']//input[@type='radio']")
    public WebElement createNewCollectionButton;

    @FindBy(xpath = "//input[@placeholder='e.g. Schematics']")
    public WebElement createNewCollectionTextBox;

    @FindBy(xpath = "//div[@class='flex items-center justify-between gap-3 border-t border-slate-200 pt-4 text-sm text-slate-600']")
    public WebElement showingImageCountInfo;

    @FindBy(xpath = "//h1[@class='mb-2 text-3xl font-bold text-slate-900']")
    public WebElement mediaLibraryHeading;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//button[normalize-space()='Previous']")
    public WebElement previousButton;

    @FindBy(xpath = "//input[@placeholder='Search media…']")
    public WebElement searchTextBox;



}
