package org.example.model;

import java.time.LocalDate;
import java.util.UUID;

// The Car class serves as a template to create car objects
public class Car {

    // Fields: These store the data or state of each car object
    private String vin;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int mileage;

    private Person owner;


    // Constructors
    public Car(String brand, String model) {
        this(brand, model, LocalDate.now().getYear());
    }

    public Car(String brand, String model, int year) {
        this.vin = generateVIN();
        this.setBrand(brand);
        this.setModel(model);
        this.year = year;
    }

    // Methods, Getters & Setters
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand should not be null or empty.");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model should not be null or empty.");
        }
        this.model = model;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person getOwner() {
        return owner;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void move(int mileage) {
        if (mileage > 0) {
            this.mileage += mileage;
        }
    }

    public String getCarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car Info -> ")
                .append("VIN: ").append(vin)
                .append(" ,Brand: ").append(brand)
                .append(" ,Model: ").append(model)
                .append(" ,Year: ").append(year)
                .append(" ,Mileage: ").append(mileage);

        if (owner != null) {
            sb.append(" ,Owner: ").append(owner.getPersonInfo());
        } else {
            sb.append(" ,No owner assigned.");
        }

        return sb.toString();

    }

    private String generateVIN() {
        return UUID.randomUUID().toString();
    }
}
