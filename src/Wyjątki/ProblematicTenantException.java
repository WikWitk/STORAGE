package Wyjątki;

import Osoby.Person;

public class ProblematicTenantException extends Exception{
    public ProblematicTenantException(Person person){
        super(person.getImie() + person.getNazwisko() + "posiada już najem pomieszczeń: Pomieszczenie 1 -  "  );
    }
}
