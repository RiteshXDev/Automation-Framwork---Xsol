package client.testApp.webapplicationTest;


import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testPage extends WebBaseTest
{
    public testPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//*[@id='APjFqb']")
    public WebElement textSearchBox;

    @FindBy(name = "btnK")
    public WebElement searchButton;

}
