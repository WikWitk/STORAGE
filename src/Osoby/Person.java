package Osoby;

import Pomieszczenia.Magazyn;

import java.util.ArrayList;
import java.util.List;

public  class Person {
    static int number = 0;
    int id;

    private String imie;
    //private
    private String nazwisko;
    private int pesel;
    private String adres;
    private String dataUrodzin;
    private int dataPierwszegoNajmu;
    private int iloscWynajmowanychPomieszczen;
    private int listaZadluzen = 0;
    private double wysokoscZadluzenia;
    int maxKwota= 1250;
    List<Person> osoby = new ArrayList<>();



    public Person(String imie, String nazwisko, int pesel, String adres, String dataUrodzin,
                  int iloscWynajmowanychPomieszczen, int dataPierwszegoNajmu, int listaZadluzen, double wysokoscZadluzenia) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.adres = adres;
        this.dataUrodzin = dataUrodzin;
        this.dataPierwszegoNajmu = dataPierwszegoNajmu;
        this.iloscWynajmowanychPomieszczen = iloscWynajmowanychPomieszczen;
        this.listaZadluzen = listaZadluzen;
        number = number + 1;
        this.id = number;
        this.wysokoscZadluzenia=wysokoscZadluzenia;
        maxKwota = getMaxKwota();


    }



    public void dodajUprawnienia(Magazyn magazyn, Person person) {
        if (magazyn.czyNajemca(this)) {
            System.out.println("Uprawnienia zostały przyznane");
            magazyn.dodajOsobe(person);
        }

    }
    public void zabierzUprawnienia(Magazyn magazyn, Person person){
        if(magazyn.czyNajemca(this)){
            System.out.println("Uprawnienia zostały zabrane");
            magazyn.usunOsobe(person);
        }
    }

    public void dodajZadluzenie(){
        listaZadluzen++;
    }

    public void zdejmijZadluzenie(){
        if(listaZadluzen > 0){
            listaZadluzen--;
        }
    }



    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }
    public int getPesel(){
        return pesel;
    }

    public String getDataUrodzin() {
        return dataUrodzin;
    }

    public String getAdres() {
        return adres;
    }

    public int getDataPierwszegoNajmu() {
        return dataPierwszegoNajmu;
    }

    public int getIloscWynajmowanychPomieszczen() {
        return iloscWynajmowanychPomieszczen;
    }

    public int getListaZadluzen() {
        return listaZadluzen;
    }

    public double getWysokoscZadluzenia() {
        return wysokoscZadluzenia;
    }

    public void setMaxKwota(int maxKwota) {
        this.maxKwota = maxKwota;
    }

    public int getMaxKwota(){
        return maxKwota;
    }

    public int getId() {
        return id;
    }

    public List<Person> getOsoby() {
        return osoby;
    }

    public void setIloscWynajmowanychPomieszczen(int iloscWynajmowanychPomieszczen) {
        this.iloscWynajmowanychPomieszczen = iloscWynajmowanychPomieszczen;
    }

    public String toString(){
        return "Id Osoby: " + getId() + ", imie: " + getImie() + ", nazwisko: " +getNazwisko()+", pesel: " +getPesel()+
                ", data ur: " + getDataUrodzin() +  ", ilosc wynajmowanych pomieszczen: " +getIloscWynajmowanychPomieszczen()+
                ", ilosc zadluzen: " +getListaZadluzen()+ ", wysokosc zadluzenia: " +getWysokoscZadluzenia();

    }


}



