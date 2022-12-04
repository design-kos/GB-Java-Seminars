package Seminars.Seminar4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        LinkedList<Integer> arrayOfNums = getRandomArray(n);
        System.out.println("Изначальный массив: ");
        printArray(arrayOfNums);

        Iterator reverseArray = arrayOfNums.descendingIterator();
        System.out.println("Перевертнутый массив: ");
        printIterator(reverseArray);

    }

    public static void printArray(LinkedList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

        System.out.println("");
    }

    public static void printIterator(Iterator array) {
        while (array.hasNext()) {
            System.out.print(array.next() + " ");
        }

        System.out.println("");
    }

    public static LinkedList<Integer> getRandomArray(int n) {
        LinkedList<Integer> numbersArray = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numbersArray.add(random.nextInt(101) - 15);
        }

        return numbersArray;
    }

}
