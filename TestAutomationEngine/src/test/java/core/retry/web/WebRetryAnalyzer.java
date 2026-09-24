package core.retry.web;

import base.web.WebBaseTest;
import core.config.web.WebConfigLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WebRetryAnalyzer implements IRetryAnalyzer
{
    private static final Logger log = LogManager.getLogger(WebRetryAnalyzer.class);
    private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 2;

    @Override
    public boolean retry(ITestResult result)
    {
        if (retryCount < MAX_RETRY_COUNT)
        {
            retryCount++;

            String testName =
                    result.getTestClass().getName()
                            + "."
                            + result.getName();

            log.warn("====================================");
            log.warn("RETRY ATTEMPT : {}", retryCount);
            log.warn("TEST NAME     : {}", testName);
            log.warn("REASON        :",
                    result.getThrowable());
            log.warn("====================================");

            System.out.println(
                    "RETRY EXECUTED : "
                            + testName
                            + " | Attempt : "
                            + retryCount);

            try
            {
                if (WebBaseTest.getDriver() != null)
                {
                    WebBaseTest.getDriver().get(
                            WebConfigLoader
                                    .loadConfig()
                                    .getUrl());

                    log.info("Navigated back to application URL before retry.");
                }
            }
            catch (Exception e)
            {
                log.error("Failed to navigate before retry.", e);
            }
            result.setAttribute("retryCount", retryCount);
            return true;
        }
        //log.error("====================================");
        log.error("MAX RETRIES REACHED");
        //log.error("TEST FAILED : {}",result.getName());
        //log.error("====================================");
        return false;
    }
}
