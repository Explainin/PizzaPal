package com.example.PizzaPal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class PizzaPalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaPalApplication.class, args);
		Scanner in = new Scanner(System.in);
		boolean done = false;
		System.out.println("Welcome to the Pizza Pal app!");
		do {
			System.out.println("Main Menu: ");
			System.out.println("1: Create New Customer");
		}
		while (!done);

		switch (in.nextInt()) {
			case 1:
				/* prompts user to enter account creation information for new account, will return an error if accunt
					if account not created successfully
				*/
				System.out.println("Please enter your first name: );
					String firstName = in.next();
				System.out.println("Please enter your last name: ");
					String lastName = in.next();
				System.out.println("Please enter your phone number: ");
					String phoneNumber = in.next();
				Sy
		}
	}

}
