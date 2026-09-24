package core.manager.mobile;

import core.config.mobile.ConfigLoader;
import core.config.mobile.UserConfigurations;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.List;

public class AppManager
{
    private static final Logger log = LogManager.getLogger(AppManager.class);

    /**
     * Restart App Only If Already Running
     */
    public static void restartIfAppAlreadyRunning(AppiumDriver driver)
    {
        try
        {
            UserConfigurations config = ConfigLoader.loadConfig();

            String platform = driver.getCapabilities()
                            .getPlatformName()
                            .toString()
                            .toLowerCase();

            String appId;
            if(platform.contains("android"))
            {
                appId = config.getAndroid().getAppPackage();
            }
            else
            {
                appId = config.getIos().getBundleId();
            }

            log.info("Checking if application is already running");
            boolean appWasRunning = ((InteractsWithApps) driver).terminateApp(appId);
            if(appWasRunning)
            {
                log.info("Application was already running");
                ((InteractsWithApps) driver).activateApp(appId);
                log.info("Fresh application launched successfully");
            }
            else
            {
                log.info("Application was not already running");
            }
        }
        catch (Exception e)
        {
            log.error("Failed To Verify Application State", e);
        }
    }

    /**
     * Force Stop All Android Applications
     */
    public static void forceStopAllApplications(AppiumDriver driver)
    {
        try
        {
            String platform =
                    driver.getCapabilities()
                            .getPlatformName()
                            .toString();

            if(platform.equalsIgnoreCase("iOS"))
            {
                log.info("Force Stop Applications Not Supported On IOS");
                return;
            }
            log.info("Force Stopping All User Applications");

            Process process = Runtime.getRuntime().exec("adb shell pm list packages -3");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while((line = reader.readLine()) != null)
            {
                String packageName =
                        line.replace(
                                "package:",
                                "").trim();

                if(packageName.contains("io.appium")
                        || packageName.contains("uiautomator")
                        || packageName.contains("settings")
                        || packageName.contains("launcher")
                        || packageName.contains("systemui")
                        || packageName.contains("vending"))
                {
                    continue;
                }
                try
                {
                    Runtime.getRuntime().exec("adb shell am force-stop " + packageName);
                }
                catch (Exception ignored)
                {

                }
            }

            Thread.sleep(3000);
            log.info("All User Applications Force Stopped");
        }
        catch (Exception e)
        {
            log.error("Failed To Force Stop Applications", e);
        }
    }

    /**
     * Clear Recent Apps
     */
    public static void clearRecentApps(AppiumDriver driver)
    {
        try
        {
            String platform =
                    driver.getCapabilities()
                            .getPlatformName()
                            .toString();

            if(platform.equalsIgnoreCase("iOS"))
            {
                log.info("Clear Recent Apps Not Supported On IOS");
                return;
            }

            log.info("Opening Recent Applications Screen");
            ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
            Thread.sleep(2000);

            List<WebElement> clearAllButtons = driver.findElements(AppiumBy.xpath("//*[contains(@text,'Clear')]"));
            if(!clearAllButtons.isEmpty())
            {
                clearAllButtons.get(0).click();

                log.info("Recent Applications Cleared Successfully");
            }
            else
            {
                log.warn("Clear All Button Not Found");
            }
        }
        catch (Exception e)
        {
            log.error("Failed To Clear Recent Applications", e);
        }
    }

    /**
     * Switch Back To AUT
     */
    public static void switchBackToApplication(AppiumDriver driver)
    {
        try
        {
            String platform =
                    driver.getCapabilities()
                            .getPlatformName()
                            .toString()
                            .toLowerCase();

            log.info("Detected Platform : {}", platform);
            if(platform.contains("android"))
            {
                UserConfigurations config = ConfigLoader.loadConfig();
                String appPackage = config.getAndroid().getAppPackage();
                ((InteractsWithApps) driver).activateApp(appPackage);
                log.info("Switched Back To Android AUT");
            }
            else if(platform.contains("ios"))
            {
                UserConfigurations config = ConfigLoader.loadConfig();
                String bundleId = config.getIos().getBundleId();
                ((InteractsWithApps) driver).activateApp(bundleId);
                log.info("Switched Back To IOS AUT");
            }
            else
            {
                throw new RuntimeException("Unsupported Platform : " + platform);
            }
        }
        catch (Exception e)
        {
            log.error("Failed To Switch Back To AUT", e);
        }
    }
}