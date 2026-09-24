package core.utils;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil
{
    public static String capture(AppiumDriver driver, String testName)
    {
        try
        {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss_SSS"));
            String platform = driver.getCapabilities()
                            .getPlatformName()
                            .toString()
                            .toLowerCase();

            String folderPath = System.getProperty("user.dir")
                            + File.separator
                            + "screenshots"
                            + File.separator
                            + platform;

            File folder = new File(folderPath);
            if(!folder.exists())
            {
                folder.mkdirs();
            }
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String fileName =
                    testName
                            + "_"
                            + timestamp
                            + ".png";

            String path = folderPath + File.separator + fileName;
            File dest = new File(path);
            FileUtils.copyFile(src, dest);
            return path;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}