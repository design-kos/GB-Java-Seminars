package Seminars.Seminar13.FinalTask.data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import Seminars.Seminar13.FinalTask.model.Contractor;

public class DataWriter implements Data {

    public static void dataWrite(Contractor contractor) {

        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(contractor.getName());
            writer.write(",");
            for (Map.Entry<String, List<String>> entry : contractor.getCommunications().entrySet()) {
                if (entry.getValue() != null) {
                    for (String com : entry.getValue()) {
                        writer.write(com);
                        writer.write(",");
                    }
                }
            }
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void removeData(String name) {

        List<Contractor> list = DataReader.read();
        for (Contractor contractor : list) {
            if (contractor.getName().equalsIgnoreCase(name)) {
                list.remove(contractor);
                DataWriter.rewriteData(list);
                return;
            }
        }

    }

    public static void rewriteData(List<Contractor> list) {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (Contractor contractor : list) {
                writer.write(contractor.getName());
                writer.write(",");
                for (Map.Entry<String, List<String>> entry : contractor.getCommunications().entrySet()) {
                    if (entry.getValue() != null) {
                        for (String com : entry.getValue()) {
                            writer.write(com);
                            writer.write(",");
                        }
                    }
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
