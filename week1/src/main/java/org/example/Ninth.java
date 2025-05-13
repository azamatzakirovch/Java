package org.example;

import java.util.Scanner;

public class Ninth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3]; // create array with 3 elements

        System.out.print("Enter the 1st number: ");
        numbers[0] = input.nextInt();

        System.out.print("Enter the 2nd number: ");
        numbers[1] = input.nextInt();

        System.out.print("Enter the 3rd number: ");
        numbers[2] = input.nextInt();

        // Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Output sorted array
        System.out.println("Sorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
