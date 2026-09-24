package core.factory.mobile;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class AppiumServerFactory
{
    private static final Logger log = LogManager.getLogger(AppiumServerFactory.class);
    private static final String APPIUM_JS_PATH = "/Users/Ritesh.Sharma/.npm-global/bin/appium";
    private static final String IP_ADDRESS = "127.0.0.1";

    /**
     * Start Appium Server
     */
    public static AppiumDriverLocalService startServer(int port)
    {
        AppiumDriverLocalService service = null;
        try
        {
            log.info("====================================");
            log.info("STARTING APPIUM SERVER");
            log.info("IP ADDRESS : {}", IP_ADDRESS);
            log.info("PORT       : {}", port);
            log.info("====================================");

            service =
                    new AppiumServiceBuilder()
                            .withAppiumJS(
                                    new File(APPIUM_JS_PATH)
                            )
                            .withIPAddress(IP_ADDRESS)
                            .usingPort(port)
                            .build();

            service.start();

            if(service.isRunning())
            {
                log.info("Appium Server Started Successfully : {}:{}", IP_ADDRESS, port);
            }
            else
            {
                throw new RuntimeException("Failed to Start Appium Server");
            }
            return service;
        }
        catch (Exception e)
        {
            log.error("Unable To Start Appium Server", e);
            throw new RuntimeException("Unable To Start Appium Server", e);
        }
    }

    /**
     * Stop Appium Server
     */
    public static void stopServer(AppiumDriverLocalService service)
    {
        try
        {
            if(service != null && service.isRunning())
            {
                log.info("====================================");
                log.info("STOPPING APPIUM SERVER");
                log.info("====================================");

                service.stop();
                log.info("Appium Server Stopped Successfully");
            }
        }
        catch (Exception e)
        {
            log.error("Failed To Stop Appium Server", e);
        }
    }

    /**
     * Check Server Status
     */
    public static boolean isServerRunning(AppiumDriverLocalService service)
    {
        try
        {
            return service != null && service.isRunning();
        }
        catch (Exception e)
        {
            return false;
        }
    }
}