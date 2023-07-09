package Pomieszczenia;

import Pojazdy.Pojazd;
import Pomieszczenia.Pomieszczenie;
import Osoby.Person;
import java.util.ArrayList;

public class MiejsceParkingowe extends Pomieszczenie{
    static int numero = 200;
    int id;

    boolean czyZajete = false;
    boolean czyZadluzony = false;
    Pojazd pojazd;
    int dzienNajmu = 0;
    int doKiedyOplacone = 0;

    ArrayList<Pojazd> miejsce = new ArrayList<>();

    public MiejsceParkingowe( int pojemnosc, int kwotaNajmu ) {
        super(pojemnosc, kwotaNajmu);
        numero = numero +1;
        this.id = numero;

    }

    public void dodajAuto(){
        if(miejsce.isEmpty()){
            System.out.println("Pojazd: " +pojazd.getId()+ " został wstawiony na miejsce parkingowe: " +getId());
            miejsce.add(pojazd);
            if(pojemnosc < pojazd.getObjetosc()){
                System.out.println("Pojazd: " +pojazd.getId()+ " jest zbyt duży na miejsce parkingowe: " +getId());
            }
        } else {
            System.out.println("Miejsce parkingowe: " +getId()+ " jest zajęte! Spróbuj na inne.");


        }
    }

    public void usunAuto(){
        System.out.println("Pojazd: " +pojazd.getId()+ " został wyprowadzony z miejsca parkingowego: " +getId());
        miejsce.remove(pojazd);

    }

    public int getId() {
        return id;
    }

    public boolean isCzyZajete() {
        return isCzyZajete();
    }

    public boolean isCzyZadluzony() {
        return czyZadluzony;
    }

    public void setCzyZadluzony(boolean czyZadluzony) {
        this.czyZadluzony = czyZadluzony;
    }

    public int getDoKiedyOplacone() {
        return doKiedyOplacone;
    }

    public int getDzienNajmu() {
        return dzienNajmu;
    }

}


