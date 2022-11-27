package Seminars.Seminar2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Task1 {

    public static void main(String[] args) throws Exception {
        String templateQuery = "select * from students where ";
        String fileName = "Seminars\\Seminar2\\Task1.json";
        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat).replaceAll("[\"\\s{]", "");
        String[] lines = content.split("}");
        for (String line : lines) {
            System.out.println(line);
            String query = new StringBuilder(templateQuery).append(parseLines(line)).toString();
            System.out.println(query);
        }
    }

    public static String parseLines(String filter) {
        String[] criteries = filter.substring(0, filter.length()).split(",");
        StringBuilder where = new StringBuilder();
        boolean flag = true;
        for (String criterion : criteries) {
            String[] keyValue = criterion.split(":");
            if (!keyValue[1].equals("null")) {
                if (flag) {
                    flag = false;
                } else {
                    where.append(" and ");
                }
                where.append(keyValue[0].substring(0, keyValue[0].length()));
                where.append(" = '");
                where.append(keyValue[1].substring(0, keyValue[1].length()));
                where.append("'");
            }
        }
        return where.toString();
    }
}
