package Seminars.Seminar12.Task1.unlocker;

public class FaceIDUnlocker implements Unlocker {

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован с помощью FaceID");
    }

}
