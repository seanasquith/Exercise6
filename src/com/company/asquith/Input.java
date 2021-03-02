package com.company.asquith;

import java.util.*;

public class Input {


    public String promptString(String message) {
        String userInput;
        while (true) { //Loops forever until break statement
            Scanner input = new Scanner(System.in); //Creates new Scanner on each loop
            System.out.println(message);
            userInput = input.nextLine();
            try {
                Double.parseDouble(userInput); //If string is a number
                System.out.println("Invalid input!");
            } catch (NumberFormatException e) {
                System.out.println("String Accepted!\n"); // If string isn't a number
                break; //Breaks from loop
            }
        }
        return userInput;
    }

    public int promptInt(String message) {
        int userInput;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            try {
                userInput = input.nextInt();
                System.out.println("Integer accepted!\n");
                break;
            } catch (Exception e) { //If user inputs a string
                System.out.println("Invalid input!");
            }
        }
        return userInput;
    }


    public double promptDouble(String message) {
        double userInput;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            try {
                userInput = input.nextDouble();
                System.out.println("Double accepted!\n");
                break;
            } catch (Exception e) { //If user inputs a string
                System.out.println("Invalid Input!");
            }
        }
        return userInput;
    }
}
