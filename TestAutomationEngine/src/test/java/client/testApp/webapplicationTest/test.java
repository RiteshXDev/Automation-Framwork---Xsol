package client.testApp.webapplicationTest;

import base.web.WebBaseTest;
import org.testng.annotations.Test;

public class test extends WebBaseTest

{
    @Test
    public void test()
    {
        testPage page = new testPage();
        ui.waitAndType(page.textSearchBox, "anime");
        ui.waitAndClick(page.searchButton);




    }

}
