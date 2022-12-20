package Seminars.Seminar8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class TxtWriter extends BaseWriter {

    @Override
    public void FileWriter(String fileName, Map<String, Float> args) {

        try (FileWriter writer = new FileWriter(fileName + ".txt", false)) {
            for (Map.Entry<String, Float> entry : args.entrySet()) {
                writer.append(entry + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
