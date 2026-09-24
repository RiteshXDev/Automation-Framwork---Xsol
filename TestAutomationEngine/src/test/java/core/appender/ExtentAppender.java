package core.appender;

import com.aventstack.extentreports.ExtentTest;
import core.listeners.web.WebTestListener;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.plugins.*;

import java.io.Serializable;

@Plugin(
        name = "ExtentAppender",
        category = Core.CATEGORY_NAME,
        elementType = Appender.ELEMENT_TYPE,
        printObject = true
)
public class ExtentAppender extends AbstractAppender
{

    protected ExtentAppender(
            String name,
            Filter filter,
            Layout<? extends Serializable> layout)
    {
        super(name, filter, layout, true, Property.EMPTY_ARRAY);
    }

    @PluginFactory
    public static ExtentAppender createAppender(
            @PluginAttribute("name") String name)
    {
        ExtentAppender appender =
                new ExtentAppender(
                        name,
                        null,
                        null);

        appender.start();

        return appender;
    }

    @Override
    public void append(LogEvent event)
    {
        ExtentTest test =
                WebTestListener.getTest();

        if(test == null)
        {
            return;
        }

        String message =
                event.getMessage().getFormattedMessage();

        if(event.getLevel() == Level.ERROR)
        {
            test.fail(message);
        }
        else if(event.getLevel() == Level.WARN)
        {
            test.warning(message);
        }
        else
        {
            test.info(message);
        }
    }
}