package core.utils.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandaloneTextExtractor
{
    static AppiumDriver driver;

    public static void main(String[] args)
    {
        try
        {
            connectToCurrentScreen();

            Thread.sleep(2000);

            String fullText =
                    getCurrentScrollableScreenText();

            System.out.println(
                    "\n=========== EXTRACTED TEXT ===========\n");

            System.out.println(fullText);

            saveToFile(
                    "current_screen_text.txt",
                    fullText);

            copyToClipboard(fullText);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(driver != null)
            {
                driver.quit();
            }
        }
    }

    /**
     * Connect To Current Android Screen
     */
    public static void connectToCurrentScreen()
            throws Exception
    {
        UiAutomator2Options options =
                new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("J6AAGF00H777WNM");
        options.setNoReset(true);

        driver =
                new AndroidDriver(
                        new URL(
                                "http://127.0.0.1:4723/"),
                        options);

        System.out.println(
                "\n✅ CONNECTED TO CURRENT SCREEN");
    }

    /**
     * Extract Text From Current Scrollable Screen
     */
    public static String getCurrentScrollableScreenText()
    {
        Set<String> uniqueTexts =
                new LinkedHashSet<>();

        try
        {
            extractTexts(
                    driver.getPageSource(),
                    uniqueTexts);

            boolean canScroll = true;

            while(canScroll)
            {
                int beforeScrollCount =
                        uniqueTexts.size();

                canScroll =
                        scrollDown();

                Thread.sleep(1000);

                extractTexts(
                        driver.getPageSource(),
                        uniqueTexts);

                int afterScrollCount =
                        uniqueTexts.size();

                if(beforeScrollCount ==
                        afterScrollCount)
                {
                    System.out.println(
                            "✅ No more new content found. Stopping scroll.");

                    break;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return String.join(
                " ",
                uniqueTexts);
    }

    /**
     * Extract Text From Page Source
     */
    public static void extractTexts(
            String pageSource,
            Set<String> uniqueTexts)
    {
        String[] patterns =
                {
                        "text=\"([^\"]*)\"",
                        "content-desc=\"([^\"]*)\"",
                        "label=\"([^\"]*)\"",
                        "name=\"([^\"]*)\"",
                        "value=\"([^\"]*)\""
                };

        for(String regex : patterns)
        {
            Pattern pattern =
                    Pattern.compile(regex);

            Matcher matcher =
                    pattern.matcher(pageSource);

            while(matcher.find())
            {
                String text =
                        matcher.group(1);

                addIfValid(
                        uniqueTexts,
                        text);
            }
        }
    }

    /**
     * Add Valid Text
     */
    public static void addIfValid(
            Set<String> uniqueTexts,
            String text)
    {
        if(text == null)
        {
            return;
        }

        text =
                normalizeText(text);

        if(text.isEmpty())
        {
            return;
        }

        uniqueTexts.add(text);
    }

    /**
     * Normalize Extracted Text
     */
    public static String normalizeText(
            String text)
    {
        return text
                .replaceAll(
                        "[\\uE000-\\uF8FF]",
                        " ")
                .replaceAll(
                        "[•▪●◆■▶►]",
                        " ")
                .replaceAll(
                        "[.,:;!()\"'-]",
                        " ")
                .replace(
                        "\n",
                        " ")
                .replace(
                        "\r",
                        " ")
                .replace(
                        "\t",
                        " ")
                .replaceAll(
                        "\\s+",
                        " ")
                .trim();
    }

    /**
     * Scroll Down
     */
    public static boolean scrollDown()
    {
        try
        {
            Object result =
                    ((JavascriptExecutor) driver)
                            .executeScript(
                                    "mobile: scrollGesture",
                                    Map.of(
                                            "left",
                                            350,

                                            "top",
                                            600,

                                            "width",
                                            100,

                                            "height",
                                            600,

                                            "direction",
                                            "down",

                                            "percent",
                                            1.0
                                    ));

            System.out.println(
                    "Scrolling... " + result);

            return Boolean.TRUE.equals(result);
        }
        catch(Exception e)
        {
            System.out.println(
                    "⚠️ Scroll failed");

            e.printStackTrace();

            return false;
        }
    }

    /**
     * Save Extracted Text To File
     */
    public static void saveToFile(
            String fileName,
            String text)
    {
        try
        {
            String folderPath =
                    "TextOutput";

            File folder =
                    new File(folderPath);

            if(!folder.exists())
            {
                boolean folderCreated =
                        folder.mkdirs();

                if(!folderCreated)
                {
                    System.out.println(
                            "⚠️ Unable to create output folder.");
                }
            }

            File outputFile =
                    new File(
                            folder,
                            fileName);

            try(FileWriter writer =
                        new FileWriter(outputFile))
            {
                writer.write(text);
            }

            System.out.println(
                    "\n✅ FILE SAVED: "
                            + outputFile.getAbsolutePath());
        }
        catch(Exception e)
        {
            System.out.println(
                    "⚠️ Failed to save text to file.");

            e.printStackTrace();
        }
    }

    /**
     * Copy Extracted Text To Mac Clipboard
     */
    public static void copyToClipboard(
            String text)
    {
        if(text == null ||
                text.trim().isEmpty())
        {
            System.out.println(
                    "⚠️ No text available to copy.");

            return;
        }

        Process process = null;

        try
        {
            process =
                    new ProcessBuilder(
                            "/usr/bin/pbcopy")
                            .start();

            try(OutputStream outputStream =
                        process.getOutputStream())
            {
                outputStream.write(
                        text.getBytes(
                                StandardCharsets.UTF_8));

                outputStream.flush();
            }

            int exitCode =
                    process.waitFor();

            if(exitCode == 0)
            {
                System.out.println();
                System.out.println(
                        "========================================");
                System.out.println(
                        "✅ TEXT COPIED TO MAC CLIPBOARD");
                System.out.println(
                        "✅ Press Command + V to paste");
                System.out.println(
                        "========================================");
            }
            else
            {
                System.out.println(
                        "⚠️ pbcopy failed with exit code: "
                                + exitCode);
            }
        }
        catch(Exception e)
        {
            System.out.println(
                    "⚠️ Failed to copy text to clipboard.");

            e.printStackTrace();
        }
        finally
        {
            if(process != null)
            {
                process.destroy();
            }
        }
    }
}