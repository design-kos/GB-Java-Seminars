package Seminars.Seminar2;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = getRandomNumber();
        }
        Date date = new Date();
        String[] header;
        header = new String[2];
        header[0] = "Время запуска программы";
        header[1] = date.toString();
        logDate(header);
        for (int i = 0; i < arr.length; i++) {
            logChanges(arr);
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

    public static void logDate(String[] header) throws Exception {
        String arrayString = Arrays.toString(header);
        System.out.print(arrayString);
        System.out.print("\n");
        try (FileWriter writer = new FileWriter("Seminars\\Seminar2\\Task2log.txt", true)) {
            writer.append(arrayString);
            writer.append("\n");
            writer.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void logChanges(int[] array) throws Exception {
        String arrayString = Arrays.toString(array);
        System.out.print(arrayString);
        System.out.print("\n");
        try (FileWriter writer = new FileWriter("Seminars\\Seminar2\\Task2log.txt", true)) {
            writer.append(arrayString);
            writer.append("\n");
            writer.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
