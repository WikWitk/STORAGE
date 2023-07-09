package Pojazdy;

public abstract class Pojazd {
    static int numbe= 10;
    int id;
    String nazwa;
    double objetosc;
    double pojemnoscSilnika;
    String typPojazdu;
    String typSilnika;

    public Pojazd(String nazwa,double objetosc,double pojemnoscSilnika, String typPojazdu, String typSilnika) {
        this.nazwa = nazwa;
        this.objetosc = objetosc;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typPojazdu = typPojazdu;
        this.typSilnika = typSilnika;
        numbe = numbe +1;
        this.id = numbe;
    }

    public double getObjetosc() {
        return objetosc;
    }

    public int getId() {
        return id;
    }
}
