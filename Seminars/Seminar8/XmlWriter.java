package Seminars.Seminar8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class XmlWriter extends BaseWriter {

    @Override
    public void FileWriter(String fileName, Map<String, Float> args) {

        try (FileWriter writer = new FileWriter(fileName + ".xml", false)) {
            writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root>\n");
            for (Map.Entry<String, Float> entry : args.entrySet()) {
                writer.append("  <Student>\n");
                writer.append("    <name>" + entry.getKey() + "</name>\n");
                writer.append("    <score>" + entry.getValue() + "</score>\n");
                writer.append("  </Student>\n");
            }
            writer.append("</root>\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
