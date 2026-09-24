package core.retry.mobile;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import core.listeners.mobile.TestListener;

/**
 * RetryAnalyzer:
 * This class handles automatic retry of failed test cases in TestNG.
 *
 * Features:
 * - Retries only when test fails
 * - Retries only for specific (flaky) exceptions
 * - Logs retry attempts using Log4j
 * - Logs retry details into Extent Report
 * - Stores retry count in ITestResult for reporting
 */
public class RetryAnalyzer implements IRetryAnalyzer {

    // Logger instance for logging retry activity
    private static final Logger log = LogManager.getLogger(RetryAnalyzer.class);

    // Counter to track how many times the test has been retried
    private int retryCount = 0;

    // Maximum number of retry attempts
    private static final int MAX_RETRY = 2;

    /**
     * This method is automatically called by TestNG when a test fails.
     * Returning true → TestNG retries the test
     * Returning false → TestNG stops retrying and marks test as FAILED
     */
    @Override
    public boolean retry(ITestResult result) {

        // Retry only if test FAILED and retry count is within limit
        if (result.getStatus() == ITestResult.FAILURE && retryCount < MAX_RETRY) {

            // Retry only for specific exceptions (to avoid retrying real bugs)
            if (isRetryable(result.getThrowable())) {

                // Increment retry counter
                retryCount++;

                // Get full test name (ClassName.MethodName)
                String testName = result.getTestClass().getName() + "." + result.getName();

                // Log retry attempt in Log4j
                log.warn("Retrying test: {} | Attempt: {}", testName, retryCount);

                // Log failure reason
                log.warn("Failure Reason: {}", result.getThrowable());

                // Log retry info into Extent Report (via your TestListener)
                if (TestListener.getTest() != null) {
                    TestListener.getTest().info(
                            "Retrying: " + testName + " | Attempt: " + retryCount
                    );
                }

                // Store retry count in test result (used later in reporting)
                result.setAttribute("retryCount", retryCount);

                return true; // Tell TestNG to retry the test
            }
        }

        // If max retries reached OR not retryable → mark test as failed
        log.error("Test failed after retries: {}", result.getName());

        return false; // No more retries
    }

    /**
     * Determines whether a failure is retryable.
     *
     * We retry only for flaky/infrastructure-related issues like:
     * - WebDriver crashes
     * - Timeouts
     * - Network issues
     *
     * We DO NOT retry assertion failures (real bugs).
     */
    private boolean isRetryable(Throwable cause) {

        if (cause == null) return false;

        return cause instanceof org.openqa.selenium.WebDriverException
                || cause instanceof org.openqa.selenium.TimeoutException
                || cause instanceof java.net.SocketException
                || cause instanceof java.io.IOException;
    }
}