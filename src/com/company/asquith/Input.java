package com.company.asquith;

import java.util.*;

public class Input {

    public String promptString(String message) {
        String userInput;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            try {
                userInput = input.nextLine();
                System.out.println("String accepted!\n");
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
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
            } catch (Exception e) {
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
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
        return userInput;
    }
}
