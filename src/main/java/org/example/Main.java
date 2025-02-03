package org.example;

import org.example.model.Burger;
import org.example.model.FoodItem;
import org.example.model.Fries;
import org.example.model.Size;

public class Main {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger("CheeseBurger", 12.99, "Beef", true, true);
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "chicken", false, true);
        System.out.println(cheeseBurger);
        System.out.println(chickenBurger);

        Fries smallFries = new Fries(false, true, Size.SMALL);
        Fries largeFries = new Fries(false, true, Size.LARGE);
        Fries mediumFries = new Fries();

        System.out.println(smallFries.getDescription());
        System.out.println(mediumFries.getDescription());
        System.out.println(largeFries.getDescription());

    }
}