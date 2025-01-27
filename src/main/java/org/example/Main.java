package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car vw = new Car("VW", "ID4");
        System.out.println(vw.getCarInfo());

        Car bmw = new Car("BMW", "X6", 2022);
        bmw.move(100);
        System.out.println(bmw.getCarInfo());

        Person marcus = new Person("123456-1234", "Marcus", "marcus@lexicon.se");
        Person elnaz = new Person("654321-4321", "Elnaz", "elnaz@lexicon.se");

        vw.setOwner(elnaz);
        bmw.setOwner(marcus);

        System.out.println("-------------------");
        //System.out.println(vw.getOwner().getPersonInfo());
        System.out.println(vw.getCarInfo());
        System.out.println(bmw.getCarInfo());

    }
}