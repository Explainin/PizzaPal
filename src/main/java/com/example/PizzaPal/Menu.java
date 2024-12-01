package com.example.PizzaPal;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> menuItems = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
//
     //Need to match order to user somehow

    //Constructor (including some defaults)
    public Menu(){
       /* menuItems.add(new MenuItem(1, "Burger", 5.99));
        menuItems.add(new MenuItem(2, "Pizza", 8.99));
       menuItems.add(new MenuItem(3, "Fries", 2.99));
       */
    }


    //method to display the menu to user
    public void displayMenu() {
        System.out.println("Todays Menu: ");
        menuItems.forEach(item ->
                System.out.println(item.getId() + ": " + item.getName() + " - $" + item.getPrice());
    }

    //allow managers to add items
    public void addMenuItem(MenuItem item, Employee employee){
        if (employee instanceof Manager){
            menuItems.add(item);
            System.out.println("Item added to the menu");
        }
        else{
            System.out.println("Access Denied: Employee is not Manager");
        }
    }

    public void removeMenuItem(MenuItem item, Employee employee) {
        if (employee instanceof Manager){
            menuItems.remove(item);
        }
        else{
            System.out.println("Access Denied: Employee is not Manager");
        }
    }

    //Place an order (Takes User as parameter, creates an account if null)
    public int placeOrder(User user, List<Integer> itemIds){
        if (user == null){
            createNewUser();
        }


        Order order = new Order(user);
        for (int Id: itemIds){
            MenuItem item = menuItems.get(Id);
            if(item != null) {
                order.addItem(item);
            }
            else{
                System.out.println("Item " + Id + " wasn't found in the menu");
            }
        }
        orders.add(order);
        System.out.println("Order Placed Successfully. Here is your order number: " + order.getOrderId());
        return order.getOrderId();
    }


    public Order getUserOrder(int orderNumber){
        return orders.stream()
                .filter(o -> Order.getOrderId() == orderNumber)
                .findFirst()
                .orElse(null);
    }


    private User createNewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to our store! It looks like you dont have an account yet, thats alright lets get started.");
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Now last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Great! Next lets do the address: ");
        String address = scanner.nextLine();
        System.out.println("Almost Done, now enter your phone number for me: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Last step, how are we going to be paying today (enter fake card type) ");
        String paymentDetails = scanner.nextLine();
        return new User (firstName, lastName, address, phoneNumber, paymentDetails);
    }


    private MenuItem getMenuItemById (int id){
        return menuItem.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }
}