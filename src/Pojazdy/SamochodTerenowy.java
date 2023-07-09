package Pojazdy;

import Pojazdy.Pojazd;

public class SamochodTerenowy extends Pojazd {
    boolean napedNaCztery;

    public SamochodTerenowy(String nazwa,double objetosc, double pojemnoscSilnika, String typPojazdu, String typSilnika,boolean napedNaCztery){
        super(nazwa,objetosc, pojemnoscSilnika, typPojazdu, typSilnika);
        this.napedNaCztery = napedNaCztery;
    }

    @Override
    public String toString() {
        return "nazwa Pojazdu: " + nazwa+
                ", pojemnosc Silnika: " + pojemnoscSilnika+
                ", typ Pojazdu: " + typPojazdu+
                ", typ Silnika: " +typSilnika+
                ", czy naped jest  na cztery?: " +napedNaCztery;
    }
}



