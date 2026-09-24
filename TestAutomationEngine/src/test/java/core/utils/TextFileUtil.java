package core.utils;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFileUtil {

    // Base folder path
    private static final String BASE_PATH =
            "src/main/resources/expectedtexts/";

    // Read text file
    public static String readTextFile(String fileName) {

        try {

            String fullPath =
                    BASE_PATH + fileName;

            return Files.readString(
                    Paths.get(fullPath)
            );

        } catch (Exception e) {

            throw new RuntimeException(
                    "Failed to read text file: " + fileName,
                    e
            );
        }
    }
}