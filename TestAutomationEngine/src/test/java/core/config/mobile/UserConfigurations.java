package core.config.mobile;
import lombok.Data;

@Data
public class UserConfigurations {

    private String environment;
    private DeviceCapabilities android;
    private DeviceCapabilities ios;

    @Data
    public static class DeviceCapabilities {
        private String platformName;
        private String automationName;
        private String deviceName;
        private String platformVersion;
        private String app;
        private String appPackage;
        private String appActivity;
        private String bundleId;
        private String setUpdatedWdaBundleId;
        private boolean noReset;
        private boolean fullReset;
        private int newCommandTimeout;
        private String udid;
    }
}
