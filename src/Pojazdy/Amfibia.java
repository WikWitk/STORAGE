package Pojazdy;

public class Amfibia extends Pojazd {
    boolean dzialko;
    public Amfibia(String nazwa,double objetosc, double pojemnoscSilnika, String typPojazdu, String typSilnika,boolean dzialko){
        super(nazwa,objetosc, pojemnoscSilnika, typPojazdu, typSilnika);
        this.dzialko = dzialko;
    }

    @Override
    public String toString() {
        return "nazwa Pojazdu: " + nazwa+
                "; objetość pojazdu: " +objetosc+
                ", pojemnosc Silnika: " + pojemnoscSilnika+
                ", typ Pojazdu: " + typPojazdu+
                ", typ Silnika: " +typSilnika+
                ", czy ma działko?: " +dzialko;
    }

    public boolean isDzialko() {
        return dzialko;
    }

}



