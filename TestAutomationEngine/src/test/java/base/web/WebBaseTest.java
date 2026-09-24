package base.web;

import core.config.web.WebConfig;
import core.config.web.WebConfigLoader;
import core.controller.web.WebController;
import core.controller.web.WebUIController;
import core.factory.web.BrowserFactory;
import core.listeners.web.WebTestListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.*;

import java.time.Duration;

@Listeners(WebTestListener.class)
public class WebBaseTest
{
    /**
     * Load Log4j2 Configuration
     */
    static
    {
        System.setProperty(
                "log4j.configurationFile",
                "src/main/resources/log4j2-web.xml");
    }

    private static final Logger log =
            LogManager.getLogger(WebBaseTest.class);

    // ThreadLocal Test Name
    public static ThreadLocal<String> testName =
            new ThreadLocal<>();

    // ThreadLocal WebDriver
    private static final ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    // ThreadLocal Web Controller
    private static final ThreadLocal<WebController> uiThread =
            new ThreadLocal<>();

    protected WebController ui;

    /**
     * Get Current Driver
     */
    public static WebDriver getDriver()
    {
        return driver.get();
    }

    /**
     * Get Current Web Controller
     */
    public static WebController getUI()
    {
        return uiThread.get();
    }

    /**
     * Browser Setup
     */
    @Parameters({"browser"})
    @BeforeTest(alwaysRun = true)
    public void setup(String browser)
    {
        try
        {
            // Store Browser Name For Thread-Safe Logging
            ThreadContext.put(
                    "platform",
                    browser.toLowerCase());

            log.info("====================================");
            log.info("STARTING WEB EXECUTION");
            log.info("BROWSER : {}", browser);
            log.info("====================================");

            // Load Web Configuration
            WebConfig config =
                    WebConfigLoader.loadConfig();

            // Initialize Browser
            driver.set(
                    BrowserFactory.getBrowser(browser,config));

            if(getDriver() == null)
            {
                throw new RuntimeException(
                        "Failed To Initialize Browser : "
                                + browser);
            }

            // Configure Browser Window
            getDriver().manage()
                    .window()
                    .maximize();

            // Configure Implicit Wait
            getDriver().manage()
                    .timeouts()
                    .implicitlyWait(
                            Duration.ofSeconds(
                                    config.getImplicitWait()));

            // Launch Application
            getDriver().get(
                    config.getUrl());

            // Initialize Web UI Controller
            uiThread.set(
                    new WebUIController(
                            getDriver()));

            this.ui =
                    uiThread.get();

            log.info("====================================");
            log.info("WEB DRIVER INITIALIZED SUCCESSFULLY");
            log.info("BROWSER : {}", browser);
            log.info("URL : {}", config.getUrl());
            log.info("====================================");
        }
        catch (Exception e)
        {
            log.error(
                    "FAILED TO INITIALIZE WEB DRIVER",
                    e);

            throw new RuntimeException(
                    "FAILED TO INITIALIZE WEB DRIVER",
                    e);
        }
    }

    /**
     * Browser Teardown
     */
    @AfterTest(alwaysRun = true)
    public void tearDown()
    {
        try
        {
            // Close Browser
            if(getDriver() != null)
            {
                log.info("Closing Browser");

                //getDriver().quit();

                log.info("Browser Closed Successfully");
            }
        }
        catch (Exception e)
        {
            log.error(
                    "Error During Browser Teardown",
                    e);
        }
        finally
        {
            // Clear ThreadLocal Resources
            ThreadContext.clearAll();

            driver.remove();
            uiThread.remove();
            testName.remove();

            log.info(
                    "ThreadLocal Resources Cleared");
        }
    }

    /**
     * Initialize Web Page Elements
     */
    public void initializePage(Object page)
    {
        PageFactory.initElements(
                getDriver(),
                page);
    }

    @BeforeClass(alwaysRun = true)
    public void initializeUI()
    {
        this.ui = getUI();
    }
}