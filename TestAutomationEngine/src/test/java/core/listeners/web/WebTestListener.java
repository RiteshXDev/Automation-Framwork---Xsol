package core.listeners.web;

import base.web.WebBaseTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import core.annotations.StepTestDetails;
import core.utils.web.WebScreenshotUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class WebTestListener implements ITestListener
{
    private static final Logger log =
            LogManager.getLogger(WebTestListener.class);

    private static final ThreadLocal<ExtentReports> extent =
            new ThreadLocal<>();

    private static final ThreadLocal<ExtentTest> test =
            new ThreadLocal<>();


    @Override
    public void onStart(ITestContext context)
    {
        try
        {
            System.out.println(
                    "====================================");

            System.out.println(
                    "WEB LISTENER STARTED");

            System.out.println(
                    "WORKING DIRECTORY : "
                            + System.getProperty(
                            "user.dir"));

            String browser =
                    context.getCurrentXmlTest()
                            .getParameter(
                                    "browser");

            if(browser == null)
            {
                browser = "unknown";
            }

            System.out.println(
                    "BROWSER : "
                            + browser);

            String reportFolder =
                    "reports/web/"
                            + browser.toLowerCase();

            File folder =
                    new File(
                            reportFolder);

            if(!folder.exists())
            {
                boolean created =
                        folder.mkdirs();

                System.out.println(
                        "REPORT FOLDER CREATED : "
                                + created);
            }

            System.out.println(
                    "REPORT FOLDER : "
                            + folder.getAbsolutePath());

            String reportPath =
                    reportFolder
                            + "/ExtentReport.html";

            System.out.println(
                    "REPORT PATH : "
                            + reportPath);

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(
                            reportPath);

            reporter.config()
                    .setReportName(
                            browser.toUpperCase()
                                    + " Automation Report");

            reporter.config()
                    .setDocumentTitle(
                            browser.toUpperCase()
                                    + " Execution Report");

            ExtentReports report =
                    new ExtentReports();

            report.attachReporter(
                    reporter);

            extent.set(
                    report);

            log.info(
                    "Extent Report Initialized For {}",
                    browser);

            System.out.println(
                    "EXTENT REPORT CREATED");

            System.out.println(
                    "====================================");
        }
        catch (Exception e)
        {
            e.printStackTrace();

            log.error(
                    "Failed To Initialize Extent Report",
                    e);
        }
    }


    @Override
    public void onTestStart(ITestResult result)
    {
        // Get Current Test Method Name
        String methodName =
                result.getMethod()
                        .getMethodName();

        // Store Test Name
        WebBaseTest.testName.set(
                methodName);

        // Read Step Details Annotation
        StepTestDetails step =
                result.getMethod()
                        .getConstructorOrMethod()
                        .getMethod()
                        .getAnnotation(
                                StepTestDetails.class);

        // Determine Display Name
        String testDisplayName;

        if(step != null)
        {
            testDisplayName =
                    step.desc();
        }
        else
        {
            testDisplayName =
                    methodName;
        }

        // Create Extent Test Using Step Description
        ExtentTest extentTest =
                extent.get()
                        .createTest(
                                testDisplayName);

        test.set(
                extentTest);

        test.get()
                .info(
                        "Test Method : "
                                + methodName);

        log.info(
                "========== TEST START ==========");

        log.info(
                "TEST METHOD : {}",
                methodName);

        log.info(
                "DISPLAY NAME : {}",
                testDisplayName);
    }


    @Override
    public void onTestSuccess(ITestResult result)
    {
        test.get()
                .pass(
                        "Test Passed");

        log.info(
                "TEST PASSED : {}",
                result.getName());
    }


    @Override
    public void onTestFailure(ITestResult result)
    {
        log.error(
                "TEST FAILED : {}",
                result.getName());

        test.get()
                .fail(
                        result.getThrowable());

        try
        {
            if(WebBaseTest.getDriver() != null)
            {
                String screenshotPath =
                        WebScreenshotUtil.capture(
                                WebBaseTest.getDriver(),
                                result.getName());

                if(screenshotPath != null)
                {
                    test.get()
                            .addScreenCaptureFromPath(
                                    screenshotPath);
                }
            }
        }
        catch (Exception e)
        {
            log.error(
                    "Failed To Capture Screenshot",
                    e);
        }
    }


    @Override
    public void onTestSkipped(ITestResult result)
    {
        test.get()
                .skip(
                        "Test Skipped");

        log.warn(
                "TEST SKIPPED : {}",
                result.getName());
    }


    @Override
    public void onFinish(ITestContext context)
    {
        try
        {
            System.out.println(
                    "FLUSHING EXTENT REPORT");

            if(extent.get() != null)
            {
                extent.get()
                        .flush();

                System.out.println(
                        "EXTENT REPORT FLUSHED");
            }

            log.info(
                    "Extent Report Generated");
        }
        catch (Exception e)
        {
            e.printStackTrace();

            log.error(
                    "Failed To Flush Extent Report",
                    e);
        }
        finally
        {
            extent.remove();
            test.remove();
        }
    }


    public static ExtentTest getTest()
    {
        return test.get();
    }
}