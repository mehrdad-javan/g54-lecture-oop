package org.example;

import org.example.model.Burger;

public class Main {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger("CheeseBurger", 12.99, "Beef", true, true);
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "chicken", false, true);
        System.out.println(cheeseBurger);
        System.out.println(chickenBurger);


    }
}