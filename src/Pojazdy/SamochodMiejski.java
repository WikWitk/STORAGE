package Pojazdy;

import Pojazdy.Pojazd;

public class SamochodMiejski extends Pojazd {
    boolean czyHybryda;
    public SamochodMiejski(String nazwa,double objetosc, double pojemnoscSilnika, String typPojazdu, String typSilnika,boolean czyHybryda){
        super(nazwa,objetosc, pojemnoscSilnika, typPojazdu, typSilnika);
        this.czyHybryda = czyHybryda;
    }

    @Override
    public String toString() {
        return "nazwa Pojazdu: " + nazwa+
                ", pojemnosc Silnika: " + pojemnoscSilnika+
                ", typ Pojazdu: " + typPojazdu+
                ", typ Silnika: " +typSilnika+
                ", czy naped jest Hybrydowy?: " +czyHybryda;
    }
}

