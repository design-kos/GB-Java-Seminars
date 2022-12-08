package Seminars.Seminar5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Пусть дан список сотрудников:Иван,Пётр,Антон и так далее.
// Написать программу,которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

public class Task2 {

    public static void main(String[] args) {

        String[] employeeNames = new String[] {
                "Иван",
                "Пётр",
                "Антон",
                "Евгения",
                "Вячеслав",
                "Иван",
                "Александр",
                "Евгений",
                "Пётр",
                "Артем",
                "Артем",
        };

        showSortedNames(employeeNames);

    }

    public static void showSortedNames(String[] array) {

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            map.putIfAbsent(array[i], count);
            count = 0;
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

}
