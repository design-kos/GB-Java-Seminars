package Seminars.Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая что один
// человек может иметь несколько телефонов.

public class Task1 {

    public static void main(String[] args) {

        Map<String, ArrayList<String>> phonebook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Введите имя. Если хотите остановить программу, введите quit");
            System.out.printf("\n");
            String name = scanner.nextLine();

            if (name.equals("quit")) {
                break;
            } else {
                while (true) {
                    System.out.println(
                            "Введите номера телефонов. Если хотите добавить новый контакт, введите back");
                    String number = scanner.nextLine();
                    if (number.equals("back")) {
                        break;
                    } else {
                        addPhoneNumbers(name, number, phonebook);
                    }
                }
            }
        }

        scanner.close();
        printPhonebook(phonebook);

    }

    public static void addPhoneNumbers(String name, String number, Map<String, ArrayList<String>> phonebook) {

        if (!phonebook.containsKey(name)) {
            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(number);
            phonebook.put(name, phoneNumbers);
        } else {
            ArrayList<String> phoneNumbers = phonebook.get(name);
            phoneNumbers.add(number);
            phonebook.put(name, phoneNumbers);
        }

    }

    public static void printPhonebook(Map<String, ArrayList<String>> phonebook) {

        for (var data : phonebook.entrySet()) {
            System.out.printf("%s %s\n", data.getKey(), data.getValue().toString());
        }

    }

}
