package core.performance.mobile;

import base.mobile.MobileBaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PerformanceLogger
{
    private static Logger getPerfLog()
    {
        try
        {
            if(MobileBaseTest.getDriver() != null)
            {
                String platform =
                        MobileBaseTest.getDriver()
                                .getCapabilities()
                                .getPlatformName()
                                .toString();

                if(platform.equalsIgnoreCase("Android"))
                {
                    return LogManager.getLogger("ANDROID_PERF");
                }
                return LogManager.getLogger("IOS_PERF");
            }
        }
        catch (Exception ignored)
        {

        }
        return LogManager.getLogger("ANDROID_PERF");
    }

    private static String getPlatform()
    {
        try
        {
            if(MobileBaseTest.getDriver() != null)
            {
                return MobileBaseTest.getDriver()
                        .getCapabilities()
                        .getPlatformName()
                        .toString()
                        .toUpperCase();
            }
        }
        catch (Exception ignored)
        {

        }
        return "UNKNOWN";
    }

    public static void logSuiteStart(String suiteName)
    {
        getPerfLog().info("\n============================================================");
        getPerfLog().info("[{}] START OF TEST SUITE: {}", getPlatform(), suiteName);
        getPerfLog().info("============================================================\n");
    }

    public static void logTestStart(String testName)
    {
        getPerfLog().info(
                "\n-------------------- [{}] START OF TEST: {} --------------------\n",
                getPlatform(),
                testName
        );
    }

    public static void logTestSeparator(String testName)
    {
        getPerfLog().info(
                "\n==================== [{}] END OF TEST: {} ====================\n",
                getPlatform(),
                testName
        );
    }

    public static void logSuiteSeparator()
    {
        getPerfLog().info("\n============================================================");
        getPerfLog().info("[{}] END OF TEST SUITE", getPlatform());
        getPerfLog().info("============================================================\n");
    }

    public static void log(
            String test,
            String method,
            String element,
            String metric,
            long value)
    {
        getPerfLog().info(
                "{} | {} | {} | {} | {} | {} ms",
                getPlatform(),
                test,
                method,
                element,
                metric,
                value
        );
    }
}