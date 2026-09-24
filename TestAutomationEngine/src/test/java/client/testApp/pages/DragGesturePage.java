package client.testApp.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragGesturePage extends MobileBaseTest {


    public DragGesturePage() {
        initMobileElements(this);
    }

    @AndroidFindBy(accessibility = "Views")
    public WebElement views;

    @AndroidFindBy(accessibility = "Drag and Drop")
    public WebElement dragAndDrop;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement source;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
    public WebElement resultText;
}