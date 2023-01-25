package Seminars.Seminar13.FinalTask;

import Seminars.Seminar13.FinalTask.controller.Controller;
import Seminars.Seminar13.FinalTask.service.DataService;

public class Main {
    public static void main(String[] args) {

        new Controller(new DataService()).run();

    }
}
