package core.factory.mobile;

import core.config.mobile.ConfigLoader;
import core.config.mobile.UserConfigurations;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;

public class CapabilitiesFactory
{
    private static final Logger log = LogManager.getLogger(CapabilitiesFactory.class);
    public static Object getCapabilities(String platform)
    {
        UserConfigurations config = ConfigLoader.loadConfig();
        log.info("Loading Capabilities For Platform : {}", platform);

        if(platform.equalsIgnoreCase("android"))
        {
            UserConfigurations.DeviceCapabilities caps = config.getAndroid();
            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName(caps.getPlatformName());
            options.setAutomationName(caps.getAutomationName());
            options.setDeviceName(caps.getDeviceName());
            options.setPlatformVersion(caps.getPlatformVersion());
            options.setApp(caps.getApp());
            options.setAppPackage(caps.getAppPackage());
            options.setAppActivity(caps.getAppActivity());
            options.setNoReset(caps.isNoReset());
            options.setFullReset(caps.isFullReset());
            options.setNewCommandTimeout(Duration.ofSeconds(caps.getNewCommandTimeout()));
            log.info("Android Capabilities Loaded Successfully");
            return options;
        }

        if(platform.equalsIgnoreCase("ios"))
        {
            UserConfigurations.DeviceCapabilities caps = config.getIos();
            XCUITestOptions options = new XCUITestOptions();

            options.setPlatformName(caps.getPlatformName());
            options.setAutomationName(caps.getAutomationName());
            options.setDeviceName(caps.getDeviceName());
            options.setPlatformVersion(caps.getPlatformVersion());
            options.setUdid(caps.getUdid());

            // options.setApp(caps.getApp());
            options.setShowXcodeLog(true);
            options.setBundleId(caps.getBundleId());
            options.setNoReset(caps.isNoReset());
            options.setFullReset(caps.isFullReset());
            options.setNewCommandTimeout(Duration.ofSeconds(caps.getNewCommandTimeout()));
            options.setUseNewWDA(false);
            options.setUpdatedWdaBundleId(caps.getSetUpdatedWdaBundleId());
            log.info("IOS Capabilities Loaded Successfully");
            return options;
        }
        throw new RuntimeException("Invalid Platform : " + platform);
    }
}