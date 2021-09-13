package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class PasswordValidation
{
    public static void main( String[] args )
    {
        final String password = "ABDEF1";
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is the username? ");
        String userName = input.nextLine();  // Read user input
        System.out.print("What is the password ");
        String passwordIn = input.nextLine();  // Read user input
        if (passwordIn.equals(password)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I dont know you.");
        }
        input.close();
    }
}
