package org.example.A1;

public class Main {

    public static void main(String[] args) {
        Person erstePerson = new Person();
        erstePerson.name = "Tom";
        erstePerson.age = 40;
        erstePerson.size = 1.8;

        Person zweitePerson = new Person();
        zweitePerson.name = "Tim";
        zweitePerson.age = 30;
        zweitePerson.size = 1.7;

Person drittePerson = new Person("Luca", 50, 1.9);

        zweitePerson.personenVorstellung();
        erstePerson.personenVorstellung();
        drittePerson.personenVorstellung();
    }

}
