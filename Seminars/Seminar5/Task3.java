package Seminars.Seminar5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Укажите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] firstArray = getRandomArray(n);
        System.out.println("Изначальный массив: ");
        printArray(firstArray);

        System.out.println("Результирующий массив: ");
        sort(firstArray);
        printArray(firstArray);

    }

    public static int[] getRandomArray(int n) {
        int[] numbersArray = new int[n];
        Random random = new Random();

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(101) - 15;
        }

        return numbersArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("");
    }

    public static void sort(int array[]) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);

        }
    }

    private static void heapify(int array[], int n, int i) {
        int top = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[top])
            top = left;
        if (right < n && array[right] > array[top])
            top = right;
        if (top != i) {
            int swap = array[i];
            array[i] = array[top];
            array[top] = swap;

            heapify(array, n, top);
        }
    }

}
