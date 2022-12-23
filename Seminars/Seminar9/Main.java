package Seminars.Seminar9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Иванов Иван", LocalDate.of(2002, 01, 19), 4.7f));
        listStudents.add(new Student("Петров Петр", LocalDate.of(2000, 05, 07), 5.0f));
        listStudents.add(new Student("Сидоров Сидр", LocalDate.of(2002, 11, 14), 3.6f));
        StudentGroup studentGroup = new StudentGroup(listStudents);

        StudentGroupListIterator groupListIterator = new StudentGroupListIterator(0, studentGroup);

        System.out.println("Работа итератора слева направо");
        while (groupListIterator.hasNext()) {
            System.out.println(groupListIterator.next());
        }

        System.out.println("\nРабота итератора справа налево");
        while (groupListIterator.hasPrevious()) {
            System.out.println(groupListIterator.previous());
        }

        System.out.println("\nРабота ReverseIterator");
        StudentGroupReverseIterator revIt = new StudentGroupReverseIterator(studentGroup);
        while (revIt.hasNext()) {
            System.out.println(revIt.nextIndex());
            System.out.println(revIt.next());
        }
    }
}
