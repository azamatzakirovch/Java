package org.example;

import org.example.ENUM.ATM_OPTIONS;

import java.util.Scanner;

import org.example.METHODS.checkAvailabilityOfCard;

import org.example.METHODS.GET_BALANCE;

import org.example.METHODS.GET_CASH;

import org.example.METHODS.CREATE_ACCOUNT;

public class Main {

    public static void atmOptions() {
        int count = 0;
        for (ATM_OPTIONS option : ATM_OPTIONS.values()) {
            System.out.printf("%-2d: %-25s", option.getValue(), option.getDescription());
            count++;
            if (count % 2 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean checkAvailabilityOfOption(int option, int start, int stop) {
        return option >= start && option <= stop;
    }


    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int optionForEnter, optionOperation, balance;
        double amount;
        String cardNumber, password;
        while (true) {
            System.out.println("------------------Vertex Pay-------------------");
            System.out.println(" ");
            System.out.println("1: Insert Card                2: Create Card                3: Exit");
            System.out.println(" ");
            optionForEnter = input.nextInt();

            if (checkAvailabilityOfOption(optionForEnter, 1, 3)) {
                if (optionForEnter == 1) {
                    while (true) {
                        System.out.println("------------------Vertex Pay-------------------");
                        System.out.println("---------------Assalamu Alaykum----------------");
                        System.out.println(" ");

                        System.out.print("Please enter the operation number: ");
                        cardNumber = input.next();

                        System.out.print("Please enter the password: ");
                        password = input.next();

                        if (checkAvailabilityOfCard.check(cardNumber, password)) {
                            System.out.println("------------------Vertex Pay-------------------");
                            System.out.println("       You have successfully entered card");
                            while (true) {
                                System.out.println("------------------Vertex Pay-----------------");
                                atmOptions();
                                System.out.println(" ");
                                System.out.print("Please enter the card number: ");
                                optionOperation = input.nextInt();
                                if (checkAvailabilityOfOption(optionOperation, 1, 5)) {
                                    System.out.println("------------------Vertex Pay-----------------");
                                    if (optionOperation == 5) {
                                        System.out.println("bye");
                                        return;
                                    }else if (optionOperation == 1) {
                                        while (true) {
                                            System.out.println("------------------Vertex Pay-----------------");
                                            System.out.print("Your Current Balance is " + GET_BALANCE.getBalance(cardNumber, password));
                                            System.out.println(" ");
                                            System.out.print("1 : Back:   ");
                                            balance = input.nextInt();
                                            if (checkAvailabilityOfOption(balance, 1, 1)) {
                                                break;
                                            }else {
                                                System.out.println("You Entered Incorrect Operation");
                                            }
                                        }
                                    }else if (optionOperation == 2) {
                                        while (true) {
                                            String cashAmount = GET_BALANCE.getBalance(cardNumber, password);
                                            System.out.println("------------------Vertex Pay---------------");
                                            System.out.print("Your Current Balance is " + cashAmount );
                                            System.out.println(" ");
                                            System.out.print("Please Enter The Amount: ");
                                            amount = input.nextDouble();

                                            double currentAmount = Double.parseDouble(cashAmount.split(" ")[0]);

                                            if(currentAmount > amount) {
                                                GET_CASH.writeToDatabase(cardNumber, password, Double.toString(currentAmount - amount) + "UZS");
                                                System.out.println("In Process...");

                                                int total = 50; // total length of the progress bar
                                                for (int i = 1; i <= total; i++) {
                                                    // Print progress
                                                    System.out.print("\r[");
                                                    for (int j = 1; j <= i; j++) {
                                                        System.out.print("#");
                                                    }
                                                    for (int j = i + 1; j <= total; j++) {
                                                        System.out.print(" ");
                                                    }
                                                    System.out.print("] " + (i * 2) + "%"); // Optional percentage

                                                    Thread.sleep(50); // slow down to simulate upload
                                                }

                                                System.out.println("\n✅ Finished. Please Get Your Cash!");
                                                break;
                                            }else{
                                                System.out.println("Incorrect Amount");
                                            }
                                        }
                                    } else if (optionOperation == 3) {
                                        System.out.println("Currently Unavailable In Your Country");
                                    }else if (optionOperation == 4) {
                                        while (true) {
                                            System.out.println("------------------Vertex Pay---------------");
                                            boolean finalResult =  CREATE_ACCOUNT.accountCreation();

                                            if(finalResult){
                                                break;
                                            }else{
                                                System.out.println("You Entered Incorrect Operation");
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("Please choose only valid options");
                                }
                            }
                        } else {
                            System.out.println("You have not successfully entered card");
                        }
                    }
                } else if (optionForEnter == 3) {
                    System.out.println("Thanks For Choosing Vertex Pay");
                    return;
                } else if(optionForEnter == 2) {
                    while (true) {
                        System.out.println("------------------Vertex Pay---------------");
                        boolean finalResult =  CREATE_ACCOUNT.accountCreation();

                        if(finalResult){
                            break;
                        }else{
                            System.out.println("You Entered Incorrect Operation");
                        }
                    }
                } else {
                    System.out.println("Invalid Option");
                }
            }

        }
    }
}
