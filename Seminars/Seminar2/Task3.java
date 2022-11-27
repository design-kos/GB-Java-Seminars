package Seminars.Seminar2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) throws Exception {
        String templateQuery = "Студент ";
        String fileName = "Seminars\\Seminar2\\Task3.json";
        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat).replaceAll("[\"\\s{]", "")
                .replaceAll("},", "!")
                .replaceAll("}", "");
        String[] lines = content.split("!");
        for (String line : lines) {
            System.out.println(line);
            String query = new StringBuilder(templateQuery).append(parseLines(line)).toString();
            System.out.println(query);
        }
    }

    public static String parseLines(String filter) {
        String[] criteries = filter.substring(0, filter.length()).split(",");
        StringBuilder where = new StringBuilder();
        for (String criterion : criteries) {
            String[] keyValue = criterion.split(":");
            if (keyValue[0].equals("фамилия")) {
                where.append(keyValue[1].substring(0, keyValue[1].length()));
                where.append(" получил ");
            }
            if (keyValue[0].equals("оценка")) {
                where.append("оценку ");
                where.append(keyValue[1].substring(0, keyValue[1].length()));
            }
            if (keyValue[0].equals("предмет")) {
                where.append(" по предмету ");
                where.append(keyValue[1].substring(0, keyValue[1].length()));
            }
        }
        return where.toString();
    }
}
