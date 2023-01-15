package Seminars.Seminar11.view;

import java.util.Collections;
import java.util.List;

import Seminars.Seminar11.model.Student;
import Seminars.Seminar11.service.AttendanceService;

public class SortedStudentByAttendanceDecrease extends AttendanceView {

    private final List<Student> studentList = new AttendanceService().getStudentList();

    @Override
    public void showInfo() {
        System.out.println(" ");
        System.out.println("Список всех студентов, отсортированный по убыванию посещаемости");
        System.out.println(" ");
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.printf(
                    "Имя: %s, Фамилия: %s, Курс: %d\nДаты посещения занятий:\n%s\nПроцент посещения: %d\n=======================\n",
                    student.getName(),
                    student.getSurname(),
                    student.getCourse(),
                    student.getAttendance(),
                    student.getAttendance().percentAttendance());
        }
        System.out.println(" ");
    }

}
