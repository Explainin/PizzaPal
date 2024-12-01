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


    public void editOrderPaymentDetails(int orderNumber, List<Order> orders, String newPaymentDetails){
        Order order = orders.stream()
                .filter(o -> o.getOrderId() == orderNumber)
                .findFirst()
                .orElse(null);

        if(order != null) {
            order.getUser().editDetails(null, null, newPaymentDetails);
            System.out.println("Payment details updated for Order #" + orderNumber );
        }
        else{
            System.out.println("Order not found/Does not exist");
        }
    }



    //allows manager to edit menu offerings
    public void editMenu(Menu menu, MenuItem newItem, boolean addItem){
        if (addItem){
            menu.addMenuItem(newItem, this);
        }
        else {
            menu.removeMenuItem(newItem.getId(), this);
        }
    }
    @Override
    public void performRoleSpecificTask(){
        System.out.println("Manager Performing task");
    }
}
