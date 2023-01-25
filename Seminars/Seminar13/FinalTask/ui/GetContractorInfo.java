package Seminars.Seminar13.FinalTask.ui;

import java.util.List;
import java.util.Scanner;

import Seminars.Seminar13.FinalTask.model.Contractor;
import Seminars.Seminar13.FinalTask.service.DataService;

public class GetContractorInfo implements Menu {

    @Override
    public void showMenu(DataService service) {
        Scanner scanner = new Scanner(System.in);
        List<Contractor> list = service.getAllContractors();

        while (true) {
            System.out.println("Введите цифру, нужного действия:\n" +
                    "1. Показать список всех контрагентов\n" +
                    "2. Показать информацию о контрагенте\n" +
                    "3. Вернуться в предыдущее меню\n" +
                    "0. Выйти из программы");
            System.out.print("");
            String input = scanner.next();

            if (input.equals("1")) {
                System.out.println("Список всех контрагентов по именам:");
                for (Contractor contractor : list) {
                    System.out.printf("\t%s\n", contractor.getName());
                }
                System.out.println("");
                continue;
            }

            if (input.equals("2")) {
                while (true) {
                    System.out.println("Введите имя контрагента:");
                    System.out.print("");
                    input = scanner.next();
                    for (Contractor contractor : list) {
                        if (contractor.getName().equalsIgnoreCase(input)) {
                            System.out.println("");
                            System.out.println(contractor);
                            System.out.println("");
                        }
                    }
                    System.out.println(
                            "Чтобы показать информцию о другом контрагенте, введите Y.\nВведите любой другой символ, чтобы вернуться назад в меню.\n");
                    System.out.print("");
                    input = scanner.next();

                    if (input.equalsIgnoreCase("Y")) {
                        continue;
                    }
                    break;
                }
                break;
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

}
