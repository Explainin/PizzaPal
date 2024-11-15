package com.example.PizzaPal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
    @RequestMapping("/Users")
    public class userController{

       public userMaker() {
           String userFirstName;
           String userLastName;
           String userPhone;
           String userPassword;
           String paymentDetails;
       }
       public userMaker(String userFirstName, String userLastName, String userPhone, String userPassword, String paymentDetails) {
           this.userFirstName = userFirstName;
           this.userPhone = userPhone;
           this.userPassword = userPassword;
           this.paymentDetails = paymentDetails;

       }

       @GetMapping("/User")
       public getUser(){

       }

       @PostMapping

    }
