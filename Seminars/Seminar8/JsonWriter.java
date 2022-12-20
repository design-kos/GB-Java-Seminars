package Seminars.Seminar8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JsonWriter extends BaseWriter {

    @Override
    public void FileWriter(String fileName, Map<String, Float> args) {

        try (FileWriter writer = new FileWriter(fileName + ".json", false)) {
            writer.append("{\n");
            int count = 1;
            for (Map.Entry<String, Float> entry : args.entrySet()) {
                if (count < args.size()) {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "," + "\n");
                } else {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "\n");
                }
                count++;
            }
            writer.append("}\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
