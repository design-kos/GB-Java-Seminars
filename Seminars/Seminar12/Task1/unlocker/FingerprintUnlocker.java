package Seminars.Seminar12.Task1.unlocker;

public class FingerprintUnlocker implements Unlocker {

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован с помощью отпечатка пальца");
    }

}
