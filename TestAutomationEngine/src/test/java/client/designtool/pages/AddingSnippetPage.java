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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/aside[2]/div/div/div[2]/div/div/div[6]/div[2]/div/div[1]/input")
    public WebElement alertSearchSnippetTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[2]")
    public WebElement mediaTopButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/input")
    public WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[2]/button")
    public WebElement gcNumber;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/aside[1]/div[3]/div[2]/div[3]/div[1]/div[2]/div/span")
    public WebElement node3Button;

    @FindBy( xpath = "//*[@id=\"root\"]/div/div/div/div/aside[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div")
    public WebElement alertAddedMessageBox;

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

}
