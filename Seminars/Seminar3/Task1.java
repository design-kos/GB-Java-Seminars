package Seminars.Seminar3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] firstArray = getRandomArray(n);
        System.out.println("Изначальный массив: ");
        printArray(firstArray);

        int[] secondArray = mergeSort(firstArray, n);
        System.out.println("Результирующий массив: ");
        printArray(secondArray);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int[] getRandomArray(int n) {
        int[] numbersArray = new int[n];
        Random random = new Random();

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(101) - 15;
        }

        return numbersArray;
    }

    public static int[] mergeSort(int[] array, int n) {
        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, n - mid);

        mergeSort(left, mid);
        mergeSort(right, n - mid);

        return merge(array, left, right);
    }

    public static int[] merge(int[] array, int[] left, int[] right) {
        int k = 0, i = 0, j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }

        return array;
    }

}