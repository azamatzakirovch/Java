package org.example.METHODS;

import org.example.ENUM.CARD_INFO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CREATE_ACCOUNT {

    public static String generateCardNumber() {
        Random rand = new Random();
        int[] digits = new int[16];

        // Generate first 15 digits randomly
        for (int i = 0; i < 15; i++) {
            digits[i] = rand.nextInt(10); // 0–9
        }

        // Compute Luhn checksum digit for the 16th digit
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            int val = digits[14 - i];
            if (i % 2 == 0) { // Double every 2nd digit from right
                val *= 2;
                if (val > 9) val -= 9;
            }
            sum += val;
        }

        digits[15] = (10 - (sum % 10)) % 10;

        // Build the card number as a String
        StringBuilder card = new StringBuilder();
        for (int digit : digits) {
            card.append(digit);
        }

        return card.toString();
    }



    public static boolean accountCreation() {
        Scanner input = new Scanner(System.in);
        long cardNumber = 0, pin = 0;
        long balance;
        String passport, pnfl, expiration = "12/2050", phoneNumber, status = "USABLE", generatedCard = generateCardNumber();

        System.out.println("========================= CARD CREATION =========================");
        System.out.println("Your Current Card Number: " + generatedCard);
        while (true) {
            System.out.print("Enter PIN (4-digit): ");
            pin = input.nextLong();
            if (pin >= 1000 && pin <= 9999) break;
            System.out.println("❌ PIN must be 4 digits.");
        }


        System.out.print("Enter Passport: ");
        passport = input.next();

        System.out.print("Enter PNFL: ");
        pnfl = input.next();

        System.out.print("Enter Phone Number: ");
        phoneNumber = input.next();


        String[] newCard = new String[8];
        newCard[CARD_INFO.CARD_NUMBER.getIndex()] = generatedCard;
        newCard[CARD_INFO.PIN.getIndex()] = String.valueOf(pin);
        newCard[CARD_INFO.BALANCE.getIndex()] = 0.0 + " UZS";
        newCard[CARD_INFO.PASSPORT.getIndex()] = passport;
        newCard[CARD_INFO.PINFL.getIndex()] = pnfl;
        newCard[CARD_INFO.CARDEXPIRATIONDATE.getIndex()] = expiration;
        newCard[CARD_INFO.PHONENUMBER.getIndex()] = phoneNumber;
        newCard[CARD_INFO.STATUS.getIndex()] = status;

        String row = String.join(",", newCard);
        String filePath = "/Users/macbook/Desktop/exampreparation/week4/src/main/java/org/example/ATM/src/main/java/org/example/USER_DATA/ATMDATA.csv";

        // Write to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(row);
            bw.newLine();

            System.out.println("Processing card...");
            int total = 50;
            for (int i = 1; i <= total; i++) {
                System.out.print("\r[");
                for (int j = 1; j <= i; j++) System.out.print("#");
                for (int j = i + 1; j <= total; j++) System.out.print(" ");
                System.out.print("] " + (i * 2) + "%");
                Thread.sleep(30);
            }

            System.out.println("\n✅ Card created successfully. Please take your card.");
            System.out.println("Your Card Number is: " + generatedCard);
            System.out.println("Your Password is: " + pin);
            System.out.println("Your Balance is: " + 0.0);
            System.out.println("Your Passport is: " + passport);
            System.out.println("Your PNFL is: " + pnfl);
            System.out.println("Your Expiration Date is: " + expiration);
            System.out.println("Your Phone Number is: " + phoneNumber);
            System.out.println("Your Status is: " + status);
            return true;
        } catch (IOException | InterruptedException e) {
            System.out.println("❌ Failed to save card: " + e.getMessage());
        }
        return false;
    }

}
