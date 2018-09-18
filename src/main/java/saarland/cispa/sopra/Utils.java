package saarland.cispa.sopra;

import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

    public static String convertFile(File file) {

        StringBuilder builder = new StringBuilder();
        if (file.isFile()) {
            try {
                BufferedReader bReader = Files.newBufferedReader(Paths.get(file.getPath()));
                String line = bReader.readLine();
                if (line == null) {
                    throw new IllegalArgumentException("Given path is empty");
                } else {
                    builder.append(line);
                    builder.append('\n');
                }
                while (true) {

                    line = bReader.readLine();
                    if (line == null) {
                        bReader.close();
                        break;
                    } else {
                        builder.append(line);
                        builder.append('\n');
                    }

                }
            } catch (IOException e) {
                LoggerFactory.getLogger("Invalid File");
            }
        } else {

            return file.toString();
        }

        return builder.toString();
    }
}
