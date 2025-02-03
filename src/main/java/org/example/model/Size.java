package org.example.model;

public enum Size {
    SMALL("S", 9.99),
    LARGE("L", 12.99),
    MEDIUM("M", 11.99);

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
