package Seminars.Seminar12.Task1.unlocker;

public class WithoutPasswordUnlocker implements Unlocker {

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован без проверки");
    }

}
