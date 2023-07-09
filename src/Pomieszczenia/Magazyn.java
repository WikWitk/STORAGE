package Pomieszczenia;

import Czas.Czas;
import Osoby.Person;
import Przedmiot.Przedmiot;
import Wyjątki.TooManyThingsException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import Wyjątki.TooManyThingsException;



public class Magazyn extends Pomieszczenie {
    static int num = 0;
    int id;

    int dzienNajmu = 0;
    int powNaOpony;
    int dodatkowaOplata;
    int doKiedyOplacone = 0;
    Czas czas;

    boolean czyWynajmowany = false;
    boolean czyZadluzony = false;
    boolean czyDodPowNaOpony;
    ArrayList<Person> listauprawnionych = new ArrayList<>();


    ArrayList<Przedmiot> przedmioty = new ArrayList<>();



    public Magazyn(int pojemnosc, int powNaOpony, int kwotaNajmu, boolean czyDodPowNaOpony, Czas czas) {
        super(pojemnosc, kwotaNajmu);
        num = num + 1;
        this.id = num;
        this.czyDodPowNaOpony = czyDodPowNaOpony;
        this.powNaOpony = powNaOpony;
        this.kwotaNajmu = kwotaNajmu;
        this.czas = czas;

    }


    public void dodatkowaPowNaKola() {
        if (czyDodPowNaOpony = true) {
            pojemnosc = pojemnosc + powNaOpony;
            kwotaNajmu = kwotaNajmu + 100;
            System.out.println("Dodatkowa powierzchnia do magazynu: " + getId() + " dodana.");
        }

    }

    public void dodajPrzedmiot(Przedmiot przedmiot, Person person) throws TooManyThingsException {
        if (listauprawnionych.contains(person)) {
            if (pojemnosc - przedmiot.getObjetosc() >= 0) {
                System.out.println("Przedmiot: " + przedmiot.getId() + " został dodany do magazynu: " + getId());
                przedmioty.add(przedmiot);
                pojemnosc -= przedmiot.getObjetosc();
            } else {
                System.out.println("Nie ma miejsca w magazynie: " + getId());
                new TooManyThingsException();
            }


        } else {
            System.out.println("Person: " + person.getId() + " nie ma uprawnień do magazynu: " + getId());

        }
    }

    public void wyjmijPrzedmiot(Przedmiot przedmiot) {
        System.out.println(przedmiot + " został usuniety.");
        przedmioty.remove(przedmiot);

    }

    public void dodajWynajmujacego(Person person, int dataWynajecia, int id) {
        if (person.getListaZadluzen() < 3) {
            if (listauprawnionych.isEmpty()) {
                if (person.getMaxKwota() - kwotaNajmu >= 0) {
                    System.out.println("Wynajmujący: " + person.getId() + " rozpoczął najem magazynu: " + id + " ,dnia: " + dataWynajecia);
                    person.setMaxKwota(person.getMaxKwota() - kwotaNajmu);
                    listauprawnionych.add(person);
                    this.dataWynajecia = dataWynajecia;
                    czyWynajmowany = true;
                    this.doKiedyOplacone += 30;
                    person.setIloscWynajmowanychPomieszczen(+1);
                    this.czyWynajmowany = true;


                }
            }

        }else {
            System.out.println("ZADŁUŻENIE !!");
        }
    }


    //?
    //kwestie uprawnien
    public boolean czyNajemca(Person person) {
        if (person.getId() == listauprawnionych.get(0).getId()) {
            System.out.println("Person: " + person.getId() + " jest najemcą magazynu: " + getId());
            return true;
        }
        System.out.println("Person: " + person.getId() + " nie jest najemcą, tylko wynajmującym magazyn: " + getId());
        return false;
    }

    public boolean czyMaUprawnienia(Person person) {
        if (listauprawnionych.contains(person)) {
            System.out.println("Person: " + person.getId() + " posiada uprawnienia do magazynu: " + getId());
            return true;

        }
        System.out.println("Person: " + getId() + " nie posiada uprawnień do magazynu: " + getId());
        return false;

    }




    public void Eksmisja() {
        System.out.println("Eksmisja i wyczyszcenie magazynu: " + getId());
        listauprawnionych.clear();
        przedmioty.clear();


    }

    public void dodajZadluzenieMagazynu() {
        czyZadluzony = true;
        listauprawnionych.get(0).dodajZadluzenie();


    }


    public void dodajOsobe(Person person) {
        if (person.getListaZadluzen() < 3) {
            System.out.println("Person: " + person.getId() + " został dodany do magazynu: " + getId());
            listauprawnionych.add(person);
            person.setIloscWynajmowanychPomieszczen(+1);
        } else {
            System.out.println("Person: " + person.getId() + " nie może korzystać z magazynu: " + getId() +
                        " ponieważ posiada zadłużenia: " + person.getListaZadluzen());
        }
    }


    public void usunOsobe(Person person) {
        if (czyNajemca(person)) {
            System.out.println("Person: " + person.getId() + " został usunięty z magazynu: " + getId());
            listauprawnionych.remove(person);
            person.setIloscWynajmowanychPomieszczen(-1);
        }
    }

    public int getId() {
        return id;
    }

    public boolean isCzyWynajmowany() {
        return czyWynajmowany;
    }

    public int getDzienNajmu() {
        return dzienNajmu;
    }

    public int getDoKiedyOplacone() {
        return doKiedyOplacone;
    }

    public boolean isCzyZadluzony() {
        return czyZadluzony;
    }


    public void setCzyZadluzony(boolean czyZadluzony) {
        this.czyZadluzony = czyZadluzony;
    }

    public String toString() {
        return "Id Magazynu: " + getId() + ", pojemność: " + pojemnosc + ", powierzchnia na Opony: " + getPowNaOpony() +
                    ", kwota najmu: " +kwotaNajmu;

    }

    public ArrayList<Person> getListauprawnionych() {
        return listauprawnionych;
    }

    public int getPowNaOpony() {
        return powNaOpony;
    }

}