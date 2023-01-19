package Seminars.Seminar12.Task2;

import Seminars.Seminar12.Task2.lists.ImmutableList;
import Seminars.Seminar12.Task2.lists.MutableList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Неизменяемый список:");
        ImmutableList immutableList = new ImmutableList();
        immutableList.showList();
        System.out.println("Получение элемента по индексу:");
        immutableList.getElementByIndex(3);
        System.out.println("Получение длинны списка:");
        immutableList.getSize();
        System.out.println("---------------------");
        System.out.println("");

        System.out.println("Изменяемый список:");
        MutableList<Double> mutableList = new MutableList<>();
        mutableList.addToList(4.0);
        mutableList.addToList(3.9);
        mutableList.showList();
        System.out.println("Получение длинны списка:");
        mutableList.getSize();
        System.out.println("Получение элемента по индексу:");
        mutableList.getElementByIndex(1);
        mutableList.removeFromList(3.9);
        System.out.println("Вывод измененного списка и его длины после удаления элемента:");
        mutableList.showList();
        mutableList.getSize();
    }

}
