package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllManufactureCheckPage extends WebBaseTest
{
    public AllManufactureCheckPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "(//button[contains(@class,'border') and contains(@class,'rounded-lg') and ./*[name()='svg']])[3]")
    public WebElement allManufacturesButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/button")
    public WebElement allStatusDropDownButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement allStatusesButton;

    @FindBy(xpath = "//table/tbody")
    public WebElement table;

    @FindBy(xpath = "//button[@class='flex items-center gap-2 px-4 py-1.5 rounded-md text-sm font-medium transition-colors text-slate-500 hover:text-slate-700']")
    public WebElement boardButton;


    @FindBy(xpath = "(//div/div[2]/div)[5]")
    public WebElement board;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;
}
