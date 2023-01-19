package Seminars.Seminar12.Task1;

import Seminars.Seminar12.Task1.phone.Phone;
import Seminars.Seminar12.Task1.unlocker.FaceIDUnlocker;
import Seminars.Seminar12.Task1.unlocker.FingerprintUnlocker;
import Seminars.Seminar12.Task1.unlocker.PinUnlocker;
import Seminars.Seminar12.Task1.unlocker.Unlocker;
import Seminars.Seminar12.Task1.unlocker.WithoutPasswordUnlocker;

public class Main {

    public static void main(String[] args) {

        Unlocker[] phoneUnlockers = { new FaceIDUnlocker(), new PinUnlocker(), new FingerprintUnlocker(),
                new WithoutPasswordUnlocker() };

        for (Unlocker phoneUnlocker : phoneUnlockers) {
            new Phone(phoneUnlocker).getPhoneUnlocker().unlock();
            System.out.println(" ");
        }
    }

}
