package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class FeedbackPage extends MobileBaseTest
{
    public FeedbackPage()
    {
        initMobileElements(this);

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search Appliance\"]")
    @iOSXCUITFindBy(accessibility = "\uF55F, Search Appliance")
    public WebElement searchApplianceButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(20)")
    @iOSXCUITFindBy(accessibility = "\uF215, Feedback, Share your thoughts with the team")
    public WebElement feedbackButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Thanks for your feedback!\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Thanks for your feedback!\"`][2]")
    public WebElement feedbackPopUp;

    @AndroidFindBy(accessibility = "OK")
    @iOSXCUITFindBy(accessibility = "OK")
    public WebElement okButton;


}
