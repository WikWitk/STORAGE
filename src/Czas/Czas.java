package Czas;

public class Czas extends Thread {
    public static int dzien = 1;

    public void run() {
        while (true) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dzien = dzien + 1;

        }


    }

    public static int getDzien() {
        return dzien;
    }
}