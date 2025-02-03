package org.example.model;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class OrderItems implements IOrderItems {

    private String orderId;
    private LocalDateTime orderDate;
    private FoodItem[] orderItems;

    public OrderItems() {
        this.orderId = UUID.randomUUID().toString();
        this.orderDate = LocalDateTime.now();
        this.orderItems = new FoodItem[0];
    }

    // methods to manipulate the items

    @Override
    public void addItem(FoodItem item) {
        Objects.requireNonNull(item, "Item should not be null.");
        FoodItem[] newItems = new FoodItem[orderItems.length + 1]; // [null]
        System.arraycopy(orderItems, 0, newItems, 0, orderItems.length); // [item]
        newItems[newItems.length - 1] = item;
        orderItems = newItems;
    }

    @Override
    public void removeItem(FoodItem item) {
        // todo: implement the logic

    }

    @Override
    public FoodItem[] getItems() {
        return Arrays.copyOf(orderItems, orderItems.length);
    }


    public void displayItems() {
        System.out.println("Order Id: " + orderId);
        for (FoodItem foodItem : orderItems) {
            System.out.println("      " + foodItem.getDescription());
        }
        System.out.println("Total Price: " + calculateTotal());

    }

}
