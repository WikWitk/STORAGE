package Pomieszczenia;
import Osoby.Person;
import Pojazdy.Pojazd;
import Pojazdy.Amfibia;
import Pojazdy.Motocykl;
import Pojazdy.SamochodMiejski;
import Pojazdy.SamochodTerenowy;
import Pomieszczenia.MiejsceParkingowe;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Serwis extends Pomieszczenie{
    static int numeros = 300;
    int id;
    int czasTrwaniaNaprawy;
    boolean czyZajete;
    Pojazd pojazd;
    MiejsceParkingowe miejsceParkingowe;
    ArrayList<Pojazd> naprawa = new ArrayList<>();
    ArrayList<Pojazd> listaoczekujacyh;





    public Serwis( int pojemnosc,int kwotaNajmu){
        super(pojemnosc,kwotaNajmu);
        numeros = numeros +1;
        this.id = numeros;
        this.czasTrwaniaNaprawy = ThreadLocalRandom.current().nextInt(1, 5);


    }


    public void dodajAuto(Pojazd pojazd) {
        if (naprawa.isEmpty()) {
            System.out.println("Pojazd: " +pojazd.getId()+ " został wprowadzony do serwisu: " +getId());
            naprawa.add(pojazd);
        }else {
            System.out.println("Serwis: " +getId()+ " przeprowadza naprawę.");
        }
    }

    public boolean czyAutoWNaprawie(Pojazd pojazd) {
        if (pojemnosc + pojazd.getObjetosc() > 0)
            if (naprawa.contains(pojazd)) {
                czyZajete = true;
                return true;
        }
        return false;

    }

    public void usunAuto(Pojazd pojazd,MiejsceParkingowe miejsceParkingowe){
        System.out.println("Auto: " +pojazd.getId()+ " zakończyło naprawę w serwisie: " +getId());
        naprawa.remove(pojazd);
        miejsceParkingowe.miejsce.add(pojazd);

    }
    public void dodajDoOczekujacych(){
        if(czyZajete = true){
            listaoczekujacyh.add(pojazd);
            miejsceParkingowe.miejsce.add(pojazd);
        }
    }

    public int getId() {
        return id;
    }

    public boolean isCzyZajete() {
        return czyZajete;
    }

    public void setCzyZajete(boolean czyZajete) {
        this.czyZajete = czyZajete;
    }
}
// serwis na podobnej zasadzie co magazyn
// losowanie liczby dni
//