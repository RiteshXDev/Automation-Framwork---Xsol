package core.controller.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public interface UIController {

    // BASIC MOBILE ACTIONS

    void tap(WebElement element);

    void type(WebElement element, String text);

    void waitAndTap(WebElement element);

    void waitAndType(WebElement element, String text);

    void dragElement(WebElement source, int endX, int endY);

    void switchToWebView();

    void switchToNative();

    void switchBackToApp();

    boolean clickIfDisplayed(WebElement element);

    void tapOnElement(int x, int y);

    void tapOnElementWithFallback(int x1, int y1, int x2, int y2);

    void tapOnElementWithFallbackAndZoomHandling(int firstX, int firstY, int secondX, int secondY, int zoomOutX, int zoomOutY);

    void performBasedOnPlatform(Runnable androidAction, Runnable iosAction);

    void performOnAndroid(Runnable androidAction);

    void explicitWait(int seconds);

    // ELEMENT VALIDATION

    boolean verifyText(WebElement element, String expectedText);

    boolean verifyContainsText(WebElement element, String expectedText);

    boolean verifyElementDisplayed(WebElement element);

    // SCROLL ACTIONS

    void scrollToText(String text);

    void scrollToBottom();

    void scrollToTop();

    // SCROLLABLE TEXT VALIDATION

    List<String> getAllScrollableTexts();

    void printAllScrollableTexts();

    String getFullScreenText();

    boolean verifyTextOnScreen(String expectedText);

    boolean compareScreenWithFile(String fileName);

    // VIEW XML VALIDATION

    List<String> getAllViewXmlTexts();

    void printAllViewXmlTexts();

    String getFullViewXmlText();

    boolean verifyTextInViewXml(String expectedText);

    boolean compareViewXmlWithFile(String fileName);
}