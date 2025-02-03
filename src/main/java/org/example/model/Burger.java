package org.example.model;

public class Burger extends FoodItem {

    // Fields: ?
    private String type; // Enumeration
    private boolean hasCheese;
    private boolean hasLettuce;


    public Burger(String name, double price, String type, boolean hasCheese, boolean hasLettuce) {
        super(name, price);
        this.type = type;
        this.hasCheese = hasCheese;
        this.hasLettuce = hasLettuce;
    }

    public Burger(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }


    /*
      Overriding a Method from the Parent Class:

      - Method overriding allows a subclass to provide its own implementation of a method
        that is already defined in the parent class.
      - To override a method, it must have:
        ✅ The same method name.
        ✅ The same parameters.
        ✅ The same return type.
        ✅ A different implementation (logic).
  */
    @Override
    public String getDescription() {
        return super.getDescription() + ", Type: " + this.type + ", Cheese: " + this.hasCheese;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", hasCheese=" + hasCheese +
                ", hasLettuce=" + hasLettuce +
                '}';
    }


}
