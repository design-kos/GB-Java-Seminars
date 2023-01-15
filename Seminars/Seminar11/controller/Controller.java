package Seminars.Seminar11.controller;

import java.util.Scanner;

import Seminars.Seminar11.view.AttendanceView;
import Seminars.Seminar11.view.ShowAllAttendance;
import Seminars.Seminar11.view.SortedStudentByAttendanceDecrease;
import Seminars.Seminar11.view.SortedStudentByAttendanceUnder25Percent;

public class Controller {

    private AttendanceView[] attendanceViews = new AttendanceView[3];

    public Controller() {
        attendanceViews[0] = new ShowAllAttendance();
        attendanceViews[1] = new SortedStudentByAttendanceDecrease();
        attendanceViews[2] = new SortedStudentByAttendanceUnder25Percent();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: " +
                    "\n1. Вывести всех студентов и их посещаемость." +
                    "\n2. Отсортировать всех студентов по убыванию посещаемости." +
                    "\n3. Вывести стундентов, у которых посещаемость меньше 25%" +
                    "\n0. Выход из программы" +
                    "\n ");
            int i;
            try {
                i = scanner.nextInt();
                if (i == 0) {
                    System.out.println("Завершение программы.");
                    return;
                }
                attendanceViews[i - 1].showInfo();
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Число должно быть от 0 до 3.");
            }
        }
    }

}
