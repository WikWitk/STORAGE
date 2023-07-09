package Pomieszczenia;
import Pojazdy.Pojazd;
import Osoby.Person;
import Wyjątki.NeverRentException;

import java.util.ArrayList;
import java.util.List;

public abstract class Pomieszczenie {

    double pojemnosc;

    int kwotaNajmu;
    int dataWynajecia;
    int czasNajmu;

    List<Person> osoby = new ArrayList<>();





     public Pomieszczenie(int pojemnosc, int kwotaNajmu){

         this.pojemnosc = pojemnosc;
         this.kwotaNajmu = kwotaNajmu;

     }








}

