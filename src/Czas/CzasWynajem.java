package Czas;

import Pomieszczenia.Magazyn;
import Pomieszczenia.MiejsceParkingowe;
import Pomieszczenia.Serwis;
import Pojazdy.Pojazd;

import java.util.ArrayList;

public class CzasWynajem extends Thread {
    ArrayList<Magazyn> magazyny;
    ArrayList<MiejsceParkingowe> miejscaParkingowes;
    ArrayList<Serwis> serwisy;
    ArrayList<Pojazd> listaoczekujacych;
    Czas czas;

    public CzasWynajem(ArrayList<Magazyn> magazyny, ArrayList<MiejsceParkingowe> miejscaParkingowe, Czas czas) {
        this.magazyny = magazyny;
        this.miejscaParkingowes = miejscaParkingowe;
        this.czas = czas;
    }

    public void run() {
        while (true) {
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Magazyn mag : magazyny) {
                if (mag.isCzyWynajmowany()) {
                    if (mag.isCzyZadluzony()) {
                        if (mag.getDzienNajmu() + mag.getDoKiedyOplacone() + 30 <= czas.getDzien()) {
                            mag.Eksmisja();
                        }
                    } else {
                        if (mag.getDzienNajmu() + mag.getDoKiedyOplacone() <= czas.getDzien()) {
                            mag.dodajZadluzenieMagazynu();
                        }
                    }

                }
            }

            for (MiejsceParkingowe mpark : miejscaParkingowes) {
                if (mpark.isCzyZajete()) {
                    if (mpark.isCzyZadluzony()) {
                        if (mpark.getDzienNajmu() + mpark.getDoKiedyOplacone() + 14 <= czas.getDzien()) {
                            mpark.usunAuto();

                        }
                    } else {
                        if (mpark.getDzienNajmu() + mpark.getDoKiedyOplacone() <= czas.getDzien()) {
                            mpark.usunAuto();
                        }


                    }
                    while (true) {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            for(Serwis ser : serwisy){
                                if(ser.isCzyZajete()){
                                    ser.dodajDoOczekujacych();


                                }
                            }



                            }

                        }
                    }
                }
            }
        }
    }
