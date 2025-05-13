package org.example;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("====================Task1====================");

        System.out.print("Please enter an integer: ");
        number = input.nextInt();

        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("You entered " + number + " and the sum of digits " + sum);
    }
}
