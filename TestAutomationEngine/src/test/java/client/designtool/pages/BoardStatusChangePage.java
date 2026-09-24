package client.designtool.pages;

import base.web.WebBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardStatusChangePage extends WebBaseTest {

    public BoardStatusChangePage()
    {
        PageFactory.initElements(
                WebBaseTest.getDriver(),
                this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/nav/button[1]")
    public WebElement newModelTopButton;

    @FindBy(xpath = "//span[text()='3158584']/ancestor::div[@role='button']")
    public WebElement draftCard;

    @FindBy(xpath = "(//button)[6]")
    public WebElement boardButton;

    @FindBy(xpath = "//div[@data-rfd-droppable-id='Ready for review']")
    public WebElement readyToReviewRow;
}
