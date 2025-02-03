package org.example.model;

public class Fries extends FoodItem {

    private boolean isSweetPotato;
    private boolean isSalty;
    private Size size; // SMALL, LARGE or MEDIUM

    public Fries(boolean isSweetPotato, boolean isSalty, Size size) {
        super(size.getTitle(), size.getPrice());
        this.size = size;
        this.isSweetPotato = isSweetPotato;
        this.isSalty = isSalty;
    }

    public Fries() {
        super(Size.MEDIUM.getTitle(), Size.MEDIUM.getPrice());
        this.size = Size.MEDIUM;
        this.isSweetPotato = false;
        this.isSalty = false;
    }



    @Override
    public String getDescription() {
        return super.getDescription() + ", size:" + size;
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * 0.2;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "isSweetPotato=" + isSweetPotato +
                ", isSalty=" + isSalty +
                ", size=" + size +
                '}';
    }

}
