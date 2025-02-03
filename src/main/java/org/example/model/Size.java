package org.example.model;

public enum Size {
    SMALL("Small Fries", 9.99),
    LARGE("Large Fries", 12.99),
    MEDIUM("Medium Fries", 11.99);

    // fields
    private String title;
    private double price;
    // constructor

    Size(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // methods
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
