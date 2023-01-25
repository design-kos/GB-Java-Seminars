package Seminars.Seminar13.FinalTask.ui;

import java.util.List;
import java.util.Scanner;

import Seminars.Seminar13.FinalTask.data.DataReader;
import Seminars.Seminar13.FinalTask.model.Contractor;
import Seminars.Seminar13.FinalTask.service.DataService;

public class CommunicationMenu implements Menu {

    @Override
    public void showMenu(DataService service) {

        List<Contractor> list = DataReader.read();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Выберите действие:\n" +
                    "1. Добавить способ связи\n" +
                    "2. Удалить способ связи\n" +
                    "3. Вернуться в предыдущее меню\n" +
                    "0. Выйти из программы");
            System.out.print("");
            String input = scanner.next();

            if (input.equals("1")) {
                while (true) {
                    System.out.println("Введите имя контрагента:");
                    System.out.print("");
                    String name = scanner.next();

                    System.out.println("Введите способ связи:");
                    System.out.print("");
                    String comm = scanner.next();

                    service.addCommunicationToContractor(name, comm);

                    System.out.println(
                            "Чтобы добавить еще один способ связи, введите Y.\nВведите любой другой символ, чтобы завершить добавление способа связи.\n");
                    System.out.print("");
                    input = scanner.next();

                    if (input.equalsIgnoreCase("Y")) {
                        continue;
                    }
                    break;
                }

                continue;
            }

            if (input.equals("2")) {
                System.out.println("Введите имя контрагента:");
                System.out.print("");
                String name = scanner.next();

                System.out.println("Выберите способ связи, который нужно удалить:");
                String comm = chooseCommunication();

                service.removeCommunicationToContractor(name, comm);
                System.out.printf("Способ связи %s был успешно удален у контрагента %s\n", comm, name);
                continue;
            }

            if (input.equals("3")) {
                System.out.println("Выход в предыдущее меню");
                break;
            }

            if (input.equals("0")) {
                System.out.println("Завершение программы");
                System.exit(0);
            }
            System.out.println("Некорректный ввод, попробуйте еще раз");

        }

    }

    private String chooseCommunication() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Телефон\n2. Email\n3. VK\n4. Telegram\n5. Адрес\n");
        System.out.print(" ");
        String input = scanner.next();
        if (input.equals("1"))
            return "Phone";
        if (input.equals("2"))
            return "Email";
        if (input.equals("3"))
            return "VK";
        if (input.equals("4"))
            return "Telegram";
        if (input.equals("5"))
            return "Address";
        return null;

    }

}
