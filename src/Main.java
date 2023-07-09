import Czas.Czas;
import Pojazdy.Amfibia;
import Pojazdy.Motocykl;
import Pojazdy.SamochodMiejski;
import Pojazdy.SamochodTerenowy;
import Pomieszczenia.Magazyn;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Osoby.Person;
import Pomieszczenia.MiejsceParkingowe;
import Pomieszczenia.Pomieszczenie;
import Pomieszczenia.Serwis;
import Przedmiot.Przedmiot;
import Wyjątki.TooManyThingsException;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
//Niestety nie wersja finalna, przesyłam tyle ile zdołałem zrobić. Pozdrawiam
public class Main extends Thread {
    public static void main(String[] args) throws Exception{
        List<Person> listaosob = new ArrayList<>();
        List<Magazyn> listamagazynow = new ArrayList<>();
        List<MiejsceParkingowe> miejscaparkingowe = new ArrayList<>();
        List<Serwis> serwisy = new ArrayList<>();
        Czas czas = new Czas();
        czas.start();
        int wybraneid = 0;
        int mag1 = 0;


        Person wynajmujacy1 = new Person("Marcin", "Kowalski", 980708, "Zielona 15", "08-07-98",
                0, 0, 0, 0);
        Person wynajmujacy2 = new Person("Zbyszek", "Mortka", 950508, "Ludowa 10", "08-05-95",
                0, 0, 0, 1000);
        Person wynajmujacy3 = new Person("Alicja", "Wiraszka", 900301, "Krajowa 13", "01-03-90",
                0, 0, 3, 4000);
        Person wynajmujacy4 = new Person("Magdalena", "Love", 890108, "Wozowa 1", "08-01-89",
                4, 0, 0, 2000);
        Person wynajmujacy5 = new Person("Jarosław", "Walczak", 870508, "Ludowa 10", "08-05-87",
                0, 0, 0, 1000);
        Person wynajmujacy6 = new Person("Wiktoria", "Witkowska", 850302, "Wojska Polskiego 3", "02-03-85",
                0, 0, 0, 5000);
        Person wynajmujacy7 = new Person("Wiktor", "Witkowski", 750202, "Wojska Polskiego 3", "02-02-75",
                0, 0, 0, 0);
        listaosob.add(wynajmujacy1);
        listaosob.add(wynajmujacy2);
        listaosob.add(wynajmujacy3);
        listaosob.add(wynajmujacy4);
        listaosob.add(wynajmujacy5);
        listaosob.add(wynajmujacy6);
        listaosob.add(wynajmujacy7);




        Magazyn magazyn1 = new Magazyn(10, 20, 500, true, czas);
        Magazyn magazyn2 = new Magazyn(15, 20, 500, false, czas);
        Magazyn magazyn3 = new Magazyn(8, 20, 500, true, czas);
        Magazyn magazyn4 = new Magazyn(10, 20, 500, false, czas);
        Magazyn magazyn5 = new Magazyn(7, 20, 500, false, czas);
        Magazyn magazyn6 = new Magazyn(8, 20, 500, false, czas);
        Magazyn magazyn7 = new Magazyn(10, 20, 500, false, czas);
        Magazyn magazyn8 = new Magazyn(11, 20, 500, true, czas);
        Magazyn magazyn9 = new Magazyn(12, 20, 500, true, czas);
        Magazyn magazyn10 = new Magazyn(13, 20, 500, false, czas);

        listamagazynow.add(magazyn1);
        listamagazynow.add(magazyn2);
        listamagazynow.add(magazyn3);
        listamagazynow.add(magazyn4);
        listamagazynow.add(magazyn5);
        listamagazynow.add(magazyn6);
        listamagazynow.add(magazyn7);
        listamagazynow.add(magazyn8);
        listamagazynow.add(magazyn9);
        listamagazynow.add(magazyn10);





        Serwis CarServiceSpot1 = new Serwis(0, 100);
        Serwis CarServiceSpot2 = new Serwis(0, 100);
        Serwis CarServiceSpot3 = new Serwis(0, 100);

        Serwis IndependentCarServiceSpot = new Serwis(10, 100);

        serwisy.add(CarServiceSpot1);
        serwisy.add(CarServiceSpot2);
        serwisy.add(CarServiceSpot3);
        serwisy.add(IndependentCarServiceSpot);

        MiejsceParkingowe mp1 = new MiejsceParkingowe(10, 200);
        MiejsceParkingowe mp2 = new MiejsceParkingowe(10, 200);
        MiejsceParkingowe mp3 = new MiejsceParkingowe(10, 200);
        MiejsceParkingowe mp4 = new MiejsceParkingowe(10, 200);
        MiejsceParkingowe mp5 = new MiejsceParkingowe(10, 200);
        MiejsceParkingowe mp6 = new MiejsceParkingowe(10, 200);

        miejscaparkingowe.add(mp1);
        miejscaparkingowe.add(mp2);
        miejscaparkingowe.add(mp3);
        miejscaparkingowe.add(mp4);
        miejscaparkingowe.add(mp5);
        miejscaparkingowe.add(mp6);


        Przedmiot p1 = new Przedmiot("rower", 2);
        Przedmiot p2 = new Przedmiot("piłka", 2);
        Przedmiot p3 = new Przedmiot("rura wydechowa", 2);
        Przedmiot p4 = new Przedmiot("telewizor", 2);
        Przedmiot p5 = new Przedmiot("łóżko", 2);
        Przedmiot p6 = new Przedmiot("skuter", 2);
        Przedmiot p7 = new Przedmiot("skrzynia", 10);
        Przedmiot p8 = new Przedmiot("walizka", 2);
        Przedmiot p9 = new Przedmiot("nadwozie", 15);

        Motocykl a1 = new Motocykl("Suzuki", 1, 1, "sportowy", "czterosuwowy", 2);
        Motocykl a3 = new Motocykl("Peugeot", 1, 0.4, "miejski", "czterosuwowy", 3);

        SamochodTerenowy t1 = new SamochodTerenowy("Jeep", 5, 3, "SUV", "diesel", false);
        SamochodTerenowy t2 = new SamochodTerenowy("Audi", 5, 3, "SUV", "benzyna", true);

        SamochodMiejski c1 = new SamochodMiejski("Toyota", 3, 2, "sedan", "benzyna", true);
        SamochodMiejski c2 = new SamochodMiejski("Hyundai", 2, 1.5, "", "diesel", false);

        Amfibia x1 = new Amfibia("Haaglund", 9, 10, "pancerny", "diesel", false);


        for (int i = 0; i < 14; i++) {
            System.out.println();
            menu();
            boolean exit = false;
            while (!exit) {
                System.out.println("        Jezeli chcesz zobaczyc menu jeszcze raz wpisz 14");
                System.out.println("        Jaki będzie Twój kolejny krok:");
                Scanner scanner = new Scanner(System.in);
                int end = scanner.nextInt();
                scanner.nextLine();

                switch (end) {
                    case 0:
                        System.out.println("Program zakończył działanie.");
                        exit = true;
                        System.exit(0);

                        break;
                    case 1:
                        System.out.println("Wybierz ID Person z ponizszych: ");
                        for(Person o : listaosob)
                            System.out.println(o.getId() + " ");
                        System.out.println();
                        int st = scanner.nextInt();
                        scanner.nextLine();
                        wybraneid = st;



                        odczekaj();
                        break;
                    case 2:
                        int mojeID = wybraneid;
                        for (int l=0; l < listaosob.size(); l++){
                            if (mojeID == l){
                                System.out.println(listaosob.get(mojeID-1));
                            }
                        }
                        break;
                    case 3:
                        for(Magazyn w: listamagazynow){
                            if(w.isCzyWynajmowany() == false){
                                System.out.println("Te magazyny są puste: " + w.getId());
                            }
                        }
                            break;
                    case 4:
                        System.out.println("Wybierz Magazyn: ");
                        for(Magazyn w : listamagazynow) {
                            System.out.println(w.getId() + " ");
                            System.out.println();
                        }
                            int mag = scanner.nextInt();
                            scanner.nextLine();
                            mag1 = mag;
                        for(Magazyn w : listamagazynow) {
                            for (int l = 0; l < listamagazynow.size(); l++) {
                                if (mag == l) {
                                    w.dodajWynajmujacego(listaosob.get(wybraneid-1), 1,mag);
                                }
                            }

                        }


                        break;
                    case 5:

                        for (int h = 1; h < listamagazynow.size(); h++) {
                            if (mag1 == h) {
                                System.out.println(listamagazynow.get(mag1-1));
                            }
                        }

                   break;

                    case 14:
                        menu();

                        break;
                }


            }
        }

    }

    private static void odczekaj() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    private static void menu() {
        System.out.println("        Program posiada takie rzeczy jak:");
        System.out.println("        0: Zamkniecie programu");
        System.out.println("        1: Którą Person jesteś");
        System.out.println("        2: Pokaż informacje o Person");
        System.out.println("        3: Wyświetl wolne pomieszczenia");
        System.out.println("        4: Wybierz pomieszczenie i wynajmij");
        System.out.println("        5: Wyświetl informacje na temat wynajmowanego pomieszczenia");
        System.out.println("        6: Dodaj Osobę do pomieszczenia");
        System.out.println("        7: Usuń Osobę z pomieszczenia");
        System.out.println("        8: Dodaj przedmiot do pomieszczenia");
        System.out.println("        9: Usuń przedmiot do pomieszczenia");
        System.out.println("        10: Dodaj auto do naprawy u mechanika");
        System.out.println("        11: Dodaj auto do naprawy samodzielnej");
        System.out.println("        12: Stan pomieszczeń");
        System.out.println("        13: Zapisz stan pomieszczeń");
    }
}
