package core.factory.mobile;


import base.mobile.MobileBaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerFactory
{
    public static Logger getLogger(Class<?> clazz)
    {
        try
        {
            String platform =
                    MobileBaseTest.getDriver()
                            .getCapabilities()
                            .getPlatformName()
                            .toString();

            if(platform.equalsIgnoreCase("Android"))
            {
                return LogManager.getLogger("ANDROID");
            }
            return LogManager.getLogger("IOS");
        }
        catch (Exception e)
        {
            return LogManager.getLogger(clazz);
        }
    }
}

