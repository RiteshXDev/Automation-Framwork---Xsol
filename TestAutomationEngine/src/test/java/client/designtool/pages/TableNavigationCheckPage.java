package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TableNavigationCheckPage extends WebBaseTest {

    public TableNavigationCheckPage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//table/tbody")
    public WebElement mainPageTable;

    @FindBy(xpath = "(//div[2]/button)[4]")
    public WebElement nextButton;

    @FindBy(xpath = "(//div[2]/button)[3]")
    public WebElement previousButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[1]/button[1]")
    public WebElement tableSliderButton;


}
