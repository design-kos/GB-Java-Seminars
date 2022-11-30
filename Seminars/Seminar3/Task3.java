package Seminars.Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> firstArray = getRandomArray(n);
        System.out.println("Изначальный массив: ");
        printArray(firstArray);

        System.out.println("Минимальное значение массива: ");
        System.out.println(getMinValue(firstArray));

        System.out.println("Максимальное значение массива: ");
        System.out.println(getMaxValue(firstArray));

        System.out.println("Средние арифметическое значение массива: ");
        System.out.println(getAverage(firstArray));

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

    public static int getMinValue(ArrayList<Integer> array) {
        int min = array.get(0);

        for (Integer value : array) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static int getMaxValue(ArrayList<Integer> array) {
        int max = array.get(0);

        for (Integer value : array) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int getAverage(ArrayList<Integer> array) {
        int avg = 0;
        int sum = 0;

        for (Integer value : array) {
            sum = sum + value;
        }

        avg = sum / array.size();

        return avg;
    }
}
