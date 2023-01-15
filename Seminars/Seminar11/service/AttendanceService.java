package Seminars.Seminar11.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Seminars.Seminar11.model.Attendance;
import Seminars.Seminar11.model.Student;

public class AttendanceService {

    public final String path = "students.txt";
    private final List<Student> studentList;

    public AttendanceService() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return new ArrayList<>(dataRead());
    }

    private List<Student> dataRead() {
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = bf.readLine()) != null) {
                Attendance attendance = new Attendance();
                String[] array = str.split(",");
                for (int i = 3; i < array.length; i += 4) {
                    attendance.addDateVisit(LocalDate.of(Integer.parseInt(array[i]), Integer.parseInt(array[i + 1]),
                            Integer.parseInt(array[i + 2])), Boolean.parseBoolean(array[i + 3]));
                }
                Student student = new Student(array[0], array[1], Integer.parseInt(array[2]), attendance);
                studentList.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return studentList;
    }

}
