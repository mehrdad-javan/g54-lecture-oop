package org.example.model;

public interface IOrderItems {

    int MAX_ITEMS = 10;

    void addItem(FoodItem item);
    void removeItem(FoodItem item);
    FoodItem[] getItems();

   default double calculateTotal(){
       double total = 0;
       for (FoodItem item : getItems()){
           total += item.getPrice();
       }
       return total;
   }



}
