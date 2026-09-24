package core.listeners.mobile;

import base.mobile.MobileBaseTest;
import core.annotations.StepTestDetails;
import core.performance.mobile.PerformanceLogger;
import core.utils.ComparisonMetricsUtil;
import core.utils.ScreenshotUtil;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestListener implements ITestListener
{
    private static final Logger log = LogManager.getLogger(TestListener.class);
    private static ThreadLocal<ExtentReports> extent = new ThreadLocal<>();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();


    /**
     * Initialize Extent Report Before Suite Execution
     */
    @Override
    public void onStart(ITestContext context)
    {
        // Log Test Suite Start In Performance Report
        PerformanceLogger.logSuiteStart(context.getName());

        // Get Platform From TestNG XML
        String platform = context.getCurrentXmlTest().getParameter("platform");

        if(platform == null)
        {
            platform = "unknown";
        }

        // Create Platform Specific Report Folder
        ExtentSparkReporter reporter =
                new ExtentSparkReporter(
                        "reports/"
                                + platform.toLowerCase()
                                + "/ExtentReport.html");

        // Configure Report Name
        reporter.config()
                .setReportName(
                        platform.toUpperCase()
                                + " Automation Report");

        // Configure Report Title
        reporter.config()
                .setDocumentTitle(
                        platform.toUpperCase()
                                + " Execution Report");

        // Create Extent Report Instance
        ExtentReports report =new ExtentReports();

        // Attach Reporter To Extent Report
        report.attachReporter(reporter);

        // Store Report Using ThreadLocal For Parallel Execution
        extent.set(report);

        log.info("Extent Report Initialized For {}", platform);
    }

    /**
     * Execute Before Every Test Method
     */
    @Override
    public void onTestStart(ITestResult result)
    {
        // Get Current Test Method Name
        String methodName =
                result.getMethod()
                        .getMethodName();

        // Store Test Name For Performance Logging
        MobileBaseTest.testName.set(
                methodName);

        // Log Test Start In Performance Report
        PerformanceLogger.logTestStart(
                methodName);

        // Read Custom Step Annotation
        StepTestDetails step =
                result.getMethod()
                        .getConstructorOrMethod()
                        .getMethod()
                        .getAnnotation(
                                StepTestDetails.class);

        // Determine Display Name For Extent Report
        String testDisplayName;

        if(step != null)
        {
            testDisplayName = step.desc();
        }
        else
        {
            testDisplayName = methodName;
        }

        // Create Test Entry In Extent Report
        ExtentTest extentTest =
                extent.get()
                        .createTest(
                                testDisplayName);

        test.set(extentTest);

        // Log Test Method Name
        test.get()
                .info("Test Method : " + methodName);

        // Capture Device Information
        if(MobileBaseTest.getDriver() != null)
        {
            try
            {
                String platform =
                        MobileBaseTest.getDriver()
                                .getCapabilities()
                                .getPlatformName()
                                .toString();

                Object device =
                        MobileBaseTest.getDriver()
                                .getCapabilities()
                                .getCapability(
                                        "deviceName");

                test.get().info("Platform : " + platform);
                test.get().info("Device : " + device);
            }
            catch(Exception e)
            {
                log.warn("Unable To Capture Platform Or Device Information");
            }
        }

        // Framework Logs
        log.info("========== TEST START ==========");

        log.info("TEST METHOD : {}", methodName);

        log.info("DISPLAY NAME : {}", testDisplayName);
    }

    /**
     * Execute After Successful Test Execution
     */
    @Override
    public void onTestSuccess(ITestResult result)
    {
        // Get Overall XML/Screen Comparison Statistics
        double averageSimilarity = ComparisonMetricsUtil.getAverageSimilarity();

        int totalComparisons = ComparisonMetricsUtil.getComparisonCount();

        // Log Comparison Metrics In Extent Report
        test.get()
                .info(
                        "Total Screens Compared : "
                                + totalComparisons);

        test.get()
                .info(
                        "Overall Average Similarity : "
                                + String.format(
                                "%.2f",
                                averageSimilarity)
                                + "%");

        // Check Whether Test Passed After Retry
        Object retryCount =
                result.getAttribute(
                        "retryCount");

        if(retryCount != null)
        {
            test.get()
                    .pass(
                            "Test Passed After Retry ("
                                    + retryCount
                                    + ")");
        }
        else
        {
            test.get().pass("Test Passed");
        }

        // Framework Log
        log.info("TEST PASSED : {}", result.getName());

        // Log Test Completion In Performance Report
        PerformanceLogger.logTestSeparator(result.getMethod().getMethodName());

        // Clear Comparison Metrics For Next Test
        ComparisonMetricsUtil.clear();
    }


    /**
     * Execute After Failed Test Execution
     */
    @Override
    public void onTestFailure(ITestResult result)
    {
        // Log Failure In Framework Log
        log.error("TEST FAILED : {}", result.getName());

        // Log Exception In Extent Report
        test.get().fail(result.getThrowable());

        // Get Overall XML/Screen Comparison Statistics
        double averageSimilarity = ComparisonMetricsUtil.getAverageSimilarity();

        int totalComparisons = ComparisonMetricsUtil.getComparisonCount();

        // Log Comparison Metrics In Extent Report
        test.get()
                .info(
                        "Total Screens Compared : "
                                + totalComparisons);

        test.get()
                .info(
                        "Overall Average Similarity : "
                                + String.format(
                                "%.2f",
                                averageSimilarity)
                                + "%");

        // Log Retry Count If Test Was Retried
        Object retryCount = result.getAttribute("retryCount");

        if(retryCount != null)
        {
            test.get().info("Retry Attempts : " + retryCount);
        }

        // Capture Screenshot On Failure
        if(MobileBaseTest.getDriver() != null)
        {
            String path =
                    ScreenshotUtil.capture(
                            MobileBaseTest.getDriver(),
                            result.getName());

            if(path != null)
            {
                try
                {
                    test.get().addScreenCaptureFromPath(path);
                }
                catch(Exception e)
                {
                    log.error("Failed To Attach Screenshot", e);
                }
            }
        }

        // Log Test Completion In Performance Report
        PerformanceLogger.logTestSeparator(
                result.getMethod()
                        .getMethodName());

        // Clear Comparison Metrics For Next Test
        ComparisonMetricsUtil.clear();
    }

    /**
     * Execute After Skipped Test Execution
     */
    @Override
    public void onTestSkipped(ITestResult result)
    {
        // Log Skip In Framework Log
        log.warn(
                "TEST SKIPPED : {}",
                result.getName());

        // Log Skip Status In Extent Report
        test.get().skip("Test Skipped");

        // Get Overall XML/Screen Comparison Statistics
        double averageSimilarity = ComparisonMetricsUtil.getAverageSimilarity();

        int totalComparisons = ComparisonMetricsUtil.getComparisonCount();

        // Log Comparison Metrics In Extent Report
        test.get()
                .info(
                        "Total Screens Compared : "
                                + totalComparisons);

        test.get()
                .info(
                        "Overall Average Similarity : "
                                + String.format(
                                "%.2f",
                                averageSimilarity)
                                + "%");

        // Capture Screenshot For Skipped Test
        if(MobileBaseTest.getDriver() != null)
        {
            String path =
                    ScreenshotUtil.capture(
                            MobileBaseTest.getDriver(),
                            result.getName());

            if(path != null)
            {
                try
                {
                    test.get().addScreenCaptureFromPath(path);
                }
                catch(Exception e)
                {
                    log.error("Failed To Attach Screenshot", e);
                }
            }
        }

        // Log Test Completion In Performance Report
        PerformanceLogger.logTestSeparator(result.getMethod().getMethodName());

        // Clear Comparison Metrics For Next Test
        ComparisonMetricsUtil.clear();
    }

    /**
     * Execute After Test Suite Completion
     */
    @Override
    public void onFinish(ITestContext context)
    {
        // Flush Extent Report To Generate HTML Report
        if(extent.get() != null)
        {
            extent.get().flush();
        }

        // Log Report Generation
        log.info("Extent Report Generated");

        // Log Test Suite Completion In Performance Report
        PerformanceLogger.logSuiteSeparator();

        // Clear ThreadLocal Resources
        extent.remove();

        test.remove();
    }

    public static ExtentTest getTest()
    {
        return test.get();
    }
}