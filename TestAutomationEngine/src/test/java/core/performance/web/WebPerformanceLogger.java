package core.performance.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class WebPerformanceLogger
{
    private static Logger getPerfLog()
    {
        String browser =
                ThreadContext.get("platform");

        if(browser == null)
        {
            browser = "chrome";
        }

        switch(browser.toLowerCase())
        {
            case "chrome":
                return LogManager.getLogger(
                        "CHROME_PERF");

            case "firefox":
                return LogManager.getLogger(
                        "FIREFOX_PERF");

            case "edge":
                return LogManager.getLogger(
                        "EDGE_PERF");

            default:
                return LogManager.getLogger(
                        "CHROME_PERF");
        }
    }

    private static String getBrowser()
    {
        String browser =
                ThreadContext.get("platform");

        if(browser == null)
        {
            return "UNKNOWN";
        }

        return browser.toUpperCase();
    }

    public static void logSuiteStart(
            String suiteName)
    {
        getPerfLog().info(
                "\n============================================================");

        getPerfLog().info(
                "[{}] START OF TEST SUITE : {}",
                getBrowser(),
                suiteName);

        getPerfLog().info(
                "============================================================\n");
    }

    public static void logTestStart(
            String testName)
    {
        getPerfLog().info(
                "\n-------------------- [{}] START OF TEST : {} --------------------\n",
                getBrowser(),
                testName);
    }

    public static void logTestSeparator(
            String testName)
    {
        getPerfLog().info(
                "\n==================== [{}] END OF TEST : {} ====================\n",
                getBrowser(),
                testName);
    }

    public static void logSuiteSeparator()
    {
        getPerfLog().info(
                "\n============================================================");

        getPerfLog().info(
                "[{}] END OF TEST SUITE",
                getBrowser());

        getPerfLog().info(
                "============================================================\n");
    }

    public static void log(
            String testName,
            String methodName,
            String elementName,
            String metric,
            long value)
    {
        getPerfLog().info(
                "{} | {} | {} | {} | {} | {} ms",
                getBrowser(),
                testName,
                methodName,
                elementName,
                metric,
                value);
    }
}