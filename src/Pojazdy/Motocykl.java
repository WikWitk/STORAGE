package Pojazdy;

public class Motocykl extends Pojazd {
    int ileKol;
    public Motocykl(String nazwa, double objetosc, double pojemnoscSilnika, String typPojazdu, String typSilnika,int ileKol){
        super(nazwa, objetosc,pojemnoscSilnika, typPojazdu, typSilnika);
        this.ileKol = ileKol;
    }

    @Override
    public String toString() {
        return "nazwa Pojazdu: " + nazwa+
                ", pojemnosc Silnika: " + pojemnoscSilnika+
                ", typ Pojazdu: " + typPojazdu+
                ", typ Silnika: " +typSilnika+
                ", ile ma kół?: " +ileKol;
    }
}



