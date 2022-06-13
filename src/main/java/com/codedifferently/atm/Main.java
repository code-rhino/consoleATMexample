package com.codedifferently.atm;

import com.codedifferently.atm.users.User;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private User createNewUser(){
        System.out.println("Enter firstname:");
        String firstName = scanner.next();
        System.out.println("Enter lastname:");
        String lastName = scanner.next();
        System.out.println("Enter accessCode:");
        String accessCode = scanner.next();
        return new User(firstName, lastName, accessCode);
    }

    public void start(){
        boolean continueFlag = true;
        while(continueFlag){
            String output = "Welcome to Da Bank \n " +
                            "Please enter a selection from menu";
            System.out.println(output);
            output = "Press 1 to create new Account \n"
                    +"Press 0 to exit";
            System.out.println(output);
            Integer input = scanner.nextInt();
            switch (input){
                case 1:
                    User user = createNewUser();
                    System.out.println(user.toString());
                    break;
                case 0:
                    continueFlag = false;
                    break;
                default:
                    System.out.println("Unknown selection");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new Main().start();
        //Main main = new Main();
        //main.start();
    }
}
