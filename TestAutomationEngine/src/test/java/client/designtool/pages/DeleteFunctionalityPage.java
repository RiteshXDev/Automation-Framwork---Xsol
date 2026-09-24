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

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[2]")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/input")
    public WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[2]/button")
    public WebElement gcNumber;

    @FindBy(xpath = "(//input[@class='rounded border-slate-300 text-[#003366] focus:ring-[#003366] w-4 h-4 cursor-pointer'])[2]")
    public WebElement checkBoxButton;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-3 py-1.5 bg-red-50 text-red-600 hover:bg-red-100 border border-red-100 rounded-lg text-sm font-medium transition-colors']")
    public WebElement moveToTrashButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-sm font-semibold text-white bg-red-600 hover:bg-red-700 rounded-lg transition-colors']")
    public WebElement moveToTrashPopUpButton;


}



