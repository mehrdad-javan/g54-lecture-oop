package org.example.model;

import java.util.Objects;

public class FoodItem {

    private String name;
    private final double price;

    public FoodItem(String name, double price) {
        this.setName(name);
        this.price = price;
    }

    public void setName(String name) {
        //if (name == null) throw new IllegalArgumentException("name should not be null.");
        Objects.requireNonNull(name, "name should not be null."); // it throws NullPointerException
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Item: " + name + " , Price: " + price;
    }

}
