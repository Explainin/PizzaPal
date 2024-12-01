package com.example.PizzaPal;

public abstract class Employee {
    private String name;
    private int employeeId;


    //constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }



    //getters
    public String getName() {
        return name;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    //abstract method to allow specialized behaviors
    public abstract void performRoleSpecificTask();
}
