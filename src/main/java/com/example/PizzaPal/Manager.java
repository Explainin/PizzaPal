package com.example.PizzaPal;
import org.springframework.core.annotation.Order;

import java.util.List;
import java.util.ArrayList;

public class Manager extends Employee {
    public Manager(String name, int employeeId){
        super(name, employeeId);
    }



    public void viewCustomerInfo(String phoneNumber, List<User> users ){
        User user = users.stream()
                .filter(u -> u.getPhoneNumber().equals(phoneNumber))
                .findFirst()
                .orElse(null);
        if(user != null){
            System.out.println("Customer Information: " + user.getFirstName() + user.getLastName() + ", Address" + user.getAddress());
        }
        else{
            System.out.println("Order not found/Does not exist");
        }
    }
//user has an edit payment, pass it null for first two values and then change last one,

    public void editOrderPaymentDetails(String phoneNumber, List<User> users, String newPaymentDetails){
       //would need to receive a user, if user is valid,  change details with given, else return user not found
        User user = users.stream()
                .filter(u -> u.getPhoneNumber().equals(phoneNumber))
                .findFirst()
                .orElse(null);
            if(user != null) {
                user.editDetails(null, null, newPaymentDetails);
                System.out.println("User payment details updated");
            }
            else{
                System.out.println("User does not exist");
            }



        /*
        //user.editDetails(null, null, newPaymentDetails);
        this.orderNumber = orderNumber;

        if(order != null) {
           user.editDetails(orderNumber, orders, newPaymentDetails);
            System.out.println("Payment details updated for Order #" + orderNumber );
        }
        else{
            System.out.println("Order not found/Does not exist");
        }

        */
    }



    //allows manager to edit menu offerings
    public void editMenu(Menu menu, MenuItem newItem, boolean addItem){
        if (addItem){
            menu.addMenuItem(newItem, this);
            System.out.println("Menu item added!");
        }
        else {
            menu.removeMenuItem(newItem, this);
            System.out.println("Menu item removed!");
        }
    }
    @Override
    public void performRoleSpecificTask(){
        System.out.println("Manager Performing task");
    }
}
