package org.example.A1;

public class Person {

    int age;

    double size;

    String name;

    public Person() {


    }

    public Person(String name, int age, double size) {
        this.age = age;
        this.name = name;
        this.size = size;

    }

    public void personenVorstellung() {

        System.out.println("Die Person heisst " + name + ". Die Person ist " + size + "m gross. Die Person ist " + age + " Jahre alt.");

    }


}




