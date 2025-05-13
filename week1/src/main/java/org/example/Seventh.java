package org.example;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        System.out.println("===============TASK7===============");
        double distance, price, gallonPerKilometer, cost;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter The Distance: ");
        distance = input.nextDouble();

        System.out.print("Please Enter The Kilometres Per Gallon: ");
        gallonPerKilometer = input.nextDouble();

        System.out.print("Please Enter The Price Per Gallon: ");
        price = input.nextDouble();

        cost = (distance / gallonPerKilometer) * price;

        System.out.printf("If you want to drive %.2f km, you need to spend $%.2f%n", distance, cost);

    }
}
