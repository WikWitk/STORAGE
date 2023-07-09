package Przedmiot;

public class Przedmiot {
    static int numbe = 20;
    int id;
    private String nazwa;
    private int objetosc;

    public Przedmiot(String nazwa, int objetosc) {
        this.nazwa = nazwa;
        this.objetosc = objetosc;
        numbe = numbe +1;
        this.id = numbe;
    }




    public int getObjetosc() {
        return objetosc;
    }
    public String getNazwa(){
        return nazwa;
    }

    public int getId() {
        return id;
    }
}
