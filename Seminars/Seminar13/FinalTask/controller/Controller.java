package Seminars.Seminar13.FinalTask.controller;

import java.util.Scanner;

import Seminars.Seminar13.FinalTask.service.DataService;
import Seminars.Seminar13.FinalTask.ui.CommunicationMenu;
import Seminars.Seminar13.FinalTask.ui.ContractorMenu;
import Seminars.Seminar13.FinalTask.ui.GetContractorInfo;
import Seminars.Seminar13.FinalTask.ui.Menu;

public class Controller {

    Menu[] view;
    DataService dataService;

    public Controller(DataService dataService) {
        this.dataService = dataService;
        view = new Menu[] { new ContractorMenu(), new CommunicationMenu(), new GetContractorInfo() };
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Выберите действие:\n" +
                    "1. Добавить/удалить контрагента\n" +
                    "2. Добавить/удалить способ связи с контрагентом\n" +
                    "3. Посмотреть информацию о контрагенте\n" +
                    "0. Выход из программы\n");
            System.out.print("");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 3) {
                view[input - 1].showMenu(dataService);
            }
            if (input == 0) {
                System.out.println("Завершение программы");
                break;
            }

        }

        scanner.close();
    }

}
