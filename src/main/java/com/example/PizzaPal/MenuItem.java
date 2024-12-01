package com.example.PizzaPal;

public class MenuItem {
    private int id;
    private String name;
    private double price;


    //menu item constructor
    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getters
    public int getId() {return id;}
    public String getName() {return name;}
    public double getPrice() {return price;}
}
