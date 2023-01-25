package Seminars.Seminar13.FinalTask.ui;

import java.util.Scanner;

import Seminars.Seminar13.FinalTask.model.Contractor;
import Seminars.Seminar13.FinalTask.service.DataService;

public class ContractorMenu implements Menu {

    @Override
    public void showMenu(DataService service) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите цифру, нужного действия:\n" +
                    "1. Добавить контрагента\n" +
                    "2. Удалить контрагента\n" +
                    "3. Вернуться в предыдущее меню\n" +
                    "0. Выйти из программы");
            System.out.print("");
            String input = scanner.next();

            if (input.equals("1")) {
                Contractor contractor = new Contractor();

                System.out.println("Введите имя контрагента:");
                System.out.print("");
                String name = scanner.next();
                contractor.setName(name);

                while (true) {
                    System.out.println("Добавьте способ связи:\n" +
                            "Электронная почта: user@gmail.com\n" +
                            "Телефон: +79876543210\n" +
                            "Telegram: @user\n" +
                            "ВКонтакте: https://vk.com/username\n" +
                            "Адрес нахождения: Tverskaya-10");
                    System.out.print("");
                    String comm = scanner.next();
                    contractor.setCommunications(comm);

                    System.out.println(
                            "Чтобы добавить еще один способ связи, введите Y.\nВведите любой другой символ, чтобы завершить добавление способа связи.\n");
                    System.out.print("");
                    input = scanner.next();

                    if (input.equalsIgnoreCase("Y")) {
                        contractor.setCommunications(input);
                        continue;
                    }
                    break;
                }

                service.addContractor(contractor);

                System.out.printf("Контрагент %s успешно добавлен.\n\n", name);
                break;
            }
            if (input.equals("2")) {
                System.out.println("Введите имя контрагента:");
                System.out.print("");
                String name = scanner.next();
                service.removeContractor(name);
                System.out.printf("Контрагент %s успешно удален\n", name);
                break;
            }
            if (input.equals("3")) {
                System.out.println("Выход в предыдущее меню");
                break;
            }
            if (input.equals("0")) {
                System.out.println("Завершение программы");
                return;
            }
            System.out.println("Некорректный ввод, попробуйте еще раз");
        }

    }

}