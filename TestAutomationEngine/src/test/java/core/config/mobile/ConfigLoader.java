package core.config.mobile;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * ConfigLoader
 * ------------
 * Utility class for loading user-defined configurations from a JSON file.
 * Responsibilities:
 * - Locate and read mobile-config.json from resources
 * - Deserialize JSON into UserConfigurations object using Jackson
 * - Provide logging for success/failure
 */
public class ConfigLoader {

    // Logger for tracking configuration loading process
    private static final Logger log = LogManager.getLogger(ConfigLoader.class);

    /**
     * Loads configuration from mobile-config.json file.
     *
     * @return UserConfigurations object containing environment and device capabilities
     */
    public static UserConfigurations loadConfig() {
        try {
            log.info("Loading configuration file...");

            // Jackson ObjectMapper for JSON parsing
            ObjectMapper mapper = new ObjectMapper();

            // Path to mobile-config.json file
            File file = new File("src/main/resources/config/mobile-config.json");

            // Validate file existence
            if (!file.exists()) {
                log.error("Config file NOT found at path: {}", file.getAbsolutePath());
                throw new RuntimeException("mobile-config.json not found");
            }

            log.info("Config file found at: {}", file.getAbsolutePath());

            // Deserialize JSON into UserConfigurations object
            UserConfigurations config = mapper.readValue(file, UserConfigurations.class);

            log.info("Configuration loaded successfully. Environment: {}", config.getEnvironment());

            return config;

        } catch (Exception e) {
            // Log error and rethrow as runtime exception
            log.error("Failed to load mobile-config.json", e);
            throw new RuntimeException("Failed to load mobile-config.json", e);
        }
    }
}
