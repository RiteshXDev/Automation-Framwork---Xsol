package core.config.web;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class WebConfigLoader
{
    private static final Logger log =
            LogManager.getLogger(
                    WebConfigLoader.class);

    /**
     * Load Web Configuration
     */
    public static WebConfig loadConfig()
    {
        try
        {
            // Create Jackson Object Mapper
            ObjectMapper mapper =
                    new ObjectMapper();

            // Locate Configuration File
            File file =
                    new File(
                            "src/main/resources/config/web-config.json");

            // Validate Configuration File
            if(!file.exists())
            {
                throw new RuntimeException(
                        "web-mobile-config.json not found");
            }

            // Read Configuration
            WebConfig config =
                    mapper.readValue(
                            file,
                            WebConfig.class);

            log.info(
                    "Web Configuration Loaded Successfully");

            return config;
        }
        catch (Exception e)
        {
            log.error(
                    "Failed To Load Web Configuration",
                    e);

            throw new RuntimeException(
                    "Failed To Load Web Configuration",
                    e);
        }
    }
}