package com.example.PizzaPal;
import java.util.List;
import java.util.ArrayList;

public class Order {
    private static int nextOrderId = 1;
    private int orderId;
    private User user;
    private List <MenuItem> items = new ArrayList <> ();

    //constructor
    public Order(User user){
        this.orderId = nextOrderId++;
        this.user = user;
    }


    public void addItem(MenuItem item){
        items.add(item);
    }

    //getters
    public Order getOrderId(User user) {return ;}
    public List <MenuItem> getItems() {return items;}
}
