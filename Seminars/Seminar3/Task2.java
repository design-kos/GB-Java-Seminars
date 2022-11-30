package Seminars.Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> firstArray = getRandomArray(n);
        System.out.println("Изначальный массив: ");
        printArray(firstArray);

        ArrayList<Integer> secondArray = removeEven(firstArray);
        System.out.println("Результирующий массив: ");
        printArray(secondArray);

    }

    public static void printArray(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

        System.out.println("");
    }

    public static ArrayList<Integer> getRandomArray(int n) {
        ArrayList<Integer> numbersArray = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numbersArray.add(random.nextInt(101) - 15);
        }

        return numbersArray;
    }

    public static ArrayList<Integer> removeEven(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }

        return array;
    }
}
