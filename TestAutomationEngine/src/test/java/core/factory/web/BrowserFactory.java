package core.factory.web;

import core.config.web.WebConfig;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory
{
    public static WebDriver getBrowser(
            String browser,
            WebConfig config)
    {
        switch(browser.toLowerCase())
        {
            case "chrome":

                ChromeOptions chromeOptions = new ChromeOptions();

                if(config.isUseProfile())
                {
                    chromeOptions.addArguments(
                            "--user-data-dir="
                                    + config.getChromeUserDataDir());

                    chromeOptions.addArguments(
                            "--profile-directory="
                                    + config.getChromeProfileDirectory());
                }

                return new ChromeDriver(chromeOptions);

            case "edge":

                EdgeOptions edgeOptions = new EdgeOptions();

                if(config.isUseProfile())
                {
                    edgeOptions.addArguments(
                            "--user-data-dir="
                                    + config.getEdgeUserDataDir());

                    edgeOptions.addArguments(
                            "--profile-directory="
                                    + config.getEdgeProfileDirectory());
                }

                return new EdgeDriver(edgeOptions);

            case "firefox":

                FirefoxOptions firefoxOptions = new FirefoxOptions();

                if(config.isUseProfile())
                {
                    firefoxOptions.addArguments(
                            "-profile");

                    firefoxOptions.addArguments(
                            config.getFirefoxProfileDirectory());
                }

                return new FirefoxDriver(firefoxOptions);

            default:

                throw new RuntimeException(
                        "Unsupported Browser : "
                                + browser);
        }
    }
}