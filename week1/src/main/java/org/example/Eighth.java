package org.example;

import java.util.Scanner;

public class Eighth {
    public static void main (String[] args) {
        System.out.println("===============TASK7===============");
        Scanner input = new Scanner(System.in);
        int number, sumOfDigits = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();

        while (number != 0) {
            sumOfDigits = sumOfDigits + number % 10;
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sumOfDigits);
    }
}
