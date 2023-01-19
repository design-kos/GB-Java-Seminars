package Seminars.Seminar12.Task1.phone;

import Seminars.Seminar12.Task1.unlocker.Unlocker;

public class Phone {

    private Unlocker phoneUnlocker;

    public Phone(Unlocker phoneUnlocker) {
        System.out.println("Разблокировка телефона");
        this.phoneUnlocker = phoneUnlocker;
    }

    public Unlocker getPhoneUnlocker() {
        return phoneUnlocker;
    }
}