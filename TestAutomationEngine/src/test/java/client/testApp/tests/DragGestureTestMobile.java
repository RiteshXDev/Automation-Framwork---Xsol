package client.testApp.tests;

import base.mobile.MobileBaseTest;

import client.testApp.pages.DragGesturePage;
import core.annotations.StepTestDetails;
import org.junit.Assert;
import org.testng.annotations.Test;

public class DragGestureTestMobile extends MobileBaseTest {

    //private static final Logger log = LogManager.getLogger(DragGestureTest.class);

    @Test
    @StepTestDetails(desc = "Draging Gesture Test")
    public void dragGestureTest() {
        DragGesturePage page = new DragGesturePage();
        ui.waitAndTap(page.views);
        ui.waitAndTap(page.dragAndDrop);
        ui.dragElement(page.source, 712, 728);
        String result = page.resultText.getText();
        Assert.assertEquals("Dropped!", result);

    }
}
