package Seminars.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue()-помещает элемент в конец очереди,dequeue()-возвращает первый элемент из очереди и удаляет его,
// first()-возвращает первый элемент из очереди,не удаляя.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> llArray = new LinkedList<>();

        while (true) {
            System.out.println(
                    "Заполните массив, вводя значения в консоли по отдельности. Введите commands, чтобы увидеть дополнительные команды. Чтобы остановить ввод, введите quit.");
            String input = scanner.nextLine();

            if (input.equals("commands")) {
                System.out.println("Дополнтиельные команды:");
                System.out.println("quit - останавливает ввод и выводит текущий массив");
                System.out.println("enqueue - помещает последнее введеное занчение в конец массива");
                System.out.println("dequeue - возвращает первый элемент из массива и удаляет его");
                System.out.println("first - возвращает первый элемент из массива, не удаляя");
                continue;
            } else if (input.equals("quit")) {
                System.out.println("Конечный массив: ");
                System.out.println(llArray);
                break;
            } else if (input.equals("enqueue")) {
                enqueue(llArray, input);
                System.out.println(llArray);
            } else if (input.equals("dequeue")) {
                dequeue(llArray);
                System.out.println(llArray);
            } else if (input.equals("first")) {
                first(llArray);
            } else {
                llArray.add(input);
                System.out.println(llArray);
            }

        }

        scanner.close();

    }

    public static void enqueue(LinkedList<String> array, String value) {
        array.addLast(value);
    }

    public static void dequeue(LinkedList<String> array) {
        System.out.println("Первый элемент массива: " + array.getFirst() + ". Он будет удален");
        array.removeFirst();
    }

    public static void first(LinkedList<String> array) {
        System.out.println("Первый элемент массива: " + array.getFirst());
    }

}
