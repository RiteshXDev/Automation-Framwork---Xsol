package core.listeners.web;

import core.retry.web.WebRetryAnalyzer;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class WebRetryListener
        implements IAnnotationTransformer
{
    @Override
    public void transform(
            ITestAnnotation annotation,
            Class testClass,
            Constructor testConstructor,
            Method testMethod)
    {
        annotation.setRetryAnalyzer(
                WebRetryAnalyzer.class);
    }
}
