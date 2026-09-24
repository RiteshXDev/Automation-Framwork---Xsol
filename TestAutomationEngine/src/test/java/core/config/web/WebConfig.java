package core.config.web;

import lombok.Data;

@Data
public class WebConfig
{
    private String environment;

    private String url;

    private String browser;

    private int implicitWait;

    private int explicitWait;

    private boolean useProfile;

    private String chromeUserDataDir;

    private String chromeProfileDirectory;

    private String edgeUserDataDir;

    private String edgeProfileDirectory;

    private String firefoxProfileDirectory;
}

