package com.example.PizzaPal;
import java.util.ArrayList;
import java.util.List;


    public class User {

        private String firstName;
        private String lastName;
        private String address;
        private String phoneNumber;
        private String paymentDetails;
        private static List<User> users = new ArrayList<>();

        //Constructor
        public User(String firstName, String lastName, String address, String phoneNumber, String paymentDetails) {
            if (isValid(firstName, lastName, address, phoneNumber, paymentDetails)) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
                this.phoneNumber = phoneNumber;
                this.paymentDetails = paymentDetails;
                users.add(this);
                System.out.println("User created");
            }
            else{
            System.out.println("User not created");
            }
        }

        //Validate User input
        private boolean isValid(String firstName, String lastName, String address, String phoneNumber, String paymentDetails) {
            return !(firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() || paymentDetails.isEmpty());
        }

        //Find user by Name
        public static User findUser(String firstName, String lastName, String address, String phoneNumber, String paymentDetails) {
            return users.stream()
                    .filter(user -> user.firstName.equals(firstName) && user.lastName.equals(lastName))
                    .findFirst()
                    .orElse(null);
        }


       //Edit User Details
        public void editDetails(String address, String phoneNumber, String paymentDetails) {
            this.address = address != null ? address : this.address;
            this.phoneNumber = phoneNumber != null ? phoneNumber : this.phoneNumber;
            this.paymentDetails = paymentDetails != null ? paymentDetails : this.paymentDetails;
            System.out.println("Account details updated. ");
        }

        //getters
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getFullName(){return firstName + " " + lastName;}
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String getAddress() {return address;}
        public String getPaymentDetails() {return paymentDetails;}

    }
