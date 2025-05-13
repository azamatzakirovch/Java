package org.example;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        double meal_price, tax, tip, total;
        Scanner input = new Scanner(System.in);

        System.out.println("===============TASK6===============");

        System.out.print("Please Enter The Price Of Meal: ");
        meal_price = input.nextDouble();

        tax = meal_price * 0.12;
        tip = meal_price * 0.18;
        total = meal_price + tax + tip;

        System.out.printf("Actual Price Of Meal: %.2f%n", meal_price);
        System.out.printf("Tax: %.2f%n", tax);
        System.out.printf("Tip: %.2f%n", tip);
        System.out.printf("Total: %.2f%n", total);
    }
}
