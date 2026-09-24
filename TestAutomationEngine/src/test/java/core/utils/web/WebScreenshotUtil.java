package core.utils.web;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

import java.text.SimpleDateFormat;

import java.util.Date;

public class WebScreenshotUtil
{
    public static String capture(
            WebDriver driver,
            String testName)
    {
        try
        {
            String timestamp =
                    new SimpleDateFormat(
                            "yyyyMMdd_HHmmss")
                            .format(
                                    new Date());

            String directory =
                    "screenshots/web/";

            File folder =
                    new File(directory);

            if(!folder.exists())
            {
                folder.mkdirs();
            }

            String filePath =
                    directory
                            + testName
                            + "_"
                            + timestamp
                            + ".png";

            File source =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(
                                    OutputType.FILE);

            File destination =
                    new File(filePath);

            FileUtils.copyFile(
                    source,
                    destination);

            return destination.getAbsolutePath();
        }
        catch (Exception e)
        {
            e.printStackTrace();

            return null;
        }
    }
}