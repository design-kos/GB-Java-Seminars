package Seminars.Seminar8;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Float> students = new HashMap<>();
        students.put("Иван Иванов", 4.8f);
        students.put("Евгений Петров", 3.3f);
        students.put("Анна Михайлова", 5.0f);

        TxtWriter studentsAvgScoreTxt = new TxtWriter();
        studentsAvgScoreTxt.FileWriter("studentsAvgScore", students);

        JsonWriter studentsAvgScoreJson = new JsonWriter();
        studentsAvgScoreJson.FileWriter("studentsAvgScore", students);

        XmlWriter studentsAvgScoreXml = new XmlWriter();
        studentsAvgScoreXml.FileWriter("studentsAvgScore", students);

    }
}