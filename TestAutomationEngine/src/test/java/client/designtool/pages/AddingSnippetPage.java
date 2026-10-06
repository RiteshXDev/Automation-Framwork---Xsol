package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingSnippetPage extends WebBaseTest
{
    public AddingSnippetPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }



    @FindBy(xpath = "(//button[.//*[contains(@class,'lucide-braces')]])[1]")
    public WebElement alertSnippetButton;

    @FindBy(xpath = "//input[@placeholder='Search snippets…']")
    public WebElement alertSearchSnippetTextBox;

    @FindBy(xpath = "(//button[.//*[contains(@class,'lucide-braces')]])[2]")
    public WebElement setupSnippetButton;

    @FindBy(xpath = "(//button[.//*[contains(@class,'lucide-braces')]])[3]")
    public WebElement instructionSnippetButton;

    @FindBy(xpath = "//button[.//span[normalize-space()='NOTE']]")
    public WebElement allDemandOffSnippetButton;

    @FindBy(xpath = "//div[contains(text(),\"After test don't forget\")]")
    public WebElement afterTestRefitSnippetButton;

    @FindBy(xpath = "//span[text()='BLRSTATMAX']")
    public WebElement blrStatMaxSnippetButton;

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

    @FindBy(xpath = "(//div[@class='flex items-center py-1.5 px-2 cursor-pointer text-sm group whitespace-nowrap min-w-fit hover:bg-slate-50 text-slate-700'])[3]")
    public WebElement node3Button;

    @FindBy(xpath = "//button[@class='flex items-center gap-1.5 px-3 py-2 text-[12px] font-medium text-emerald-600 hover:text-emerald-700 hover:bg-emerald-50 rounded-lg border border-dashed border-emerald-300 transition-colors mt-1']")
    public WebElement connectionHeading;



}
