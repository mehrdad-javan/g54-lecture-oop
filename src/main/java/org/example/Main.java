package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car vw = new Car("VW", "ID4");
        //vw.setModel("ID4");
        System.out.println(vw.getBrand()); // null
        System.out.println(vw.getCarInfo()); // Car Info -> VIN: null ,Brand: null ,Model: null ,Year: 0 ,Mileage: 0

        Car bmw = new Car("BMW", "X6", 2022);
        bmw.move(100);
        System.out.println(bmw.getCarInfo());




    }
}