package base.mobile;

import core.controller.mobile.MobileUIController;
import core.controller.mobile.UIController;
import core.factory.mobile.AppiumServerFactory;
import core.factory.mobile.CapabilitiesFactory;
import core.listeners.mobile.TestListener;
import core.manager.mobile.AppManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.net.URI;
import java.time.Duration;

@Listeners(TestListener.class)
public class MobileBaseTest
{
    private static final Logger log =
            LogManager.getLogger(MobileBaseTest.class);

    // ThreadLocal Test Name
    public static ThreadLocal<String> testName =
            new ThreadLocal<>();

    // ThreadLocal Driver
    private static final ThreadLocal<AppiumDriver> driver =
            new ThreadLocal<>();

    // ThreadLocal Appium Service
    private static final ThreadLocal<AppiumDriverLocalService> service =
            new ThreadLocal<>();

    // ThreadLocal UI Controller
    private static final ThreadLocal<MobileUIController> uiThread =
            new ThreadLocal<>();

    protected UIController ui;

    /**
     * Get Current Driver
     */
    public static AppiumDriver getDriver()
    {
        return driver.get();
    }

    /**
     * Get Current UI Controller
     */
    public static MobileUIController getUI()
    {
        return uiThread.get();
    }

    /**
     * Get Current Appium Service
     */
    public static AppiumDriverLocalService getService()
    {
        return service.get();
    }

    /**
     * Configure Appium Driver
     */
    @Parameters({"platform"})
    @BeforeClass(alwaysRun = true)
    public void ConfigAppium(String platform)
            throws Exception
    {
        // Store Platform For Thread-Safe Logging
        ThreadContext.put(
                "platform",
                platform.toLowerCase());

        log.info("====================================");
        log.info("STARTING EXECUTION FOR {}", platform);
        log.info("====================================");

        // Select Appium Server Port
        int port =
                platform.equalsIgnoreCase("android")
                        ? 4723
                        : 4725;

        // Start Appium Server
        AppiumDriverLocalService appiumService =
                AppiumServerFactory.startServer(port);

        service.set(appiumService);

        // Load Desired Capabilities
        Object capabilities =
                CapabilitiesFactory.getCapabilities(platform);

        // Initialize Driver
        if(platform.equalsIgnoreCase("android"))
        {
            driver.set(
                    new AndroidDriver(
                            new URI(
                                    "http://127.0.0.1:" + port)
                                    .toURL(),
                            (UiAutomator2Options) capabilities));
        }
        else
        {
            driver.set(
                    new IOSDriver(
                            new URI(
                                    "http://127.0.0.1:" + port)
                                    .toURL(),
                            (XCUITestOptions) capabilities));
        }

        // Configure Implicit Wait
        getDriver().manage()
                .timeouts()
                .implicitlyWait(
                        Duration.ofSeconds(3));

        // Initialize UI Controller
        uiThread.set(
                new MobileUIController(
                        getDriver()));

        this.ui =
                uiThread.get();

        log.info("Driver Initialized Successfully");

        // Restart Application If Already Running
        AppManager.restartIfAppAlreadyRunning(
                getDriver());
    }

    /**
     * Driver & Appium Server Teardown
     */
    @AfterClass(alwaysRun = true)
    public void tearDown()
    {
        try
        {
            // Close Driver
            if(getDriver() != null)
            {
                getDriver().quit();

                log.info("Driver Closed");
            }

            // Stop Appium Server
            if(getService() != null
                    && getService().isRunning())
            {
                AppiumServerFactory.stopServer(
                        getService());

                log.info("Appium Server Stopped");
            }
        }
        catch (Exception e)
        {
            log.error(
                    "Error During TearDown",
                    e);
        }
        finally
        {
            // Clear ThreadLocal Resources
            ThreadContext.clearAll();

            driver.remove();
            service.remove();
            uiThread.remove();
            testName.remove();

            log.info(
                    "ThreadLocal Resources Cleared");
        }
    }

    /**
     * Initialize Mobile Page Elements
     */
    public static void initMobileElements(Object page)
    {
        PageFactory.initElements(
                new AppiumFieldDecorator(
                        getDriver(),
                        Duration.ofSeconds(10)),
                page);
    }
}