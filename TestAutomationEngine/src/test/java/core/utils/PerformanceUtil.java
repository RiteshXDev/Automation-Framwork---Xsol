package core.utils;

import core.performance.mobile.PerformanceLogger;

public class PerformanceUtil {

    public static void measureAndLog(String testName,
                                     String method,
                                     String element,
                                     Runnable loadAction,
                                     Runnable mainAction,
                                     String actionName) {

        long startTotal = System.currentTimeMillis();

        // 🔹 Screen Load
        long startLoad = System.currentTimeMillis();
        loadAction.run();
        long screenLoad = System.currentTimeMillis() - startLoad;

        // 🔹 Action
        long startAction = System.currentTimeMillis();
        mainAction.run();
        long actionTime = System.currentTimeMillis() - startAction;

        long totalTime = System.currentTimeMillis() - startTotal;

        PerformanceLogger.log(testName, method, element, "SCREEN_LOAD", screenLoad);
        PerformanceLogger.log(testName, method, element, actionName, actionTime);
        PerformanceLogger.log(testName, method, element, "TOTAL_ACTION", totalTime);
    }
}