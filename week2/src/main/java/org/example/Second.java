package org.example;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("====================Task2====================");
        String word, character;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the word here: ");
        word = input.nextLine();

        System.out.print("Please enter the character here: ");
        character = input.nextLine();

        char ch = character.charAt(0);  // get the first character

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' appears " + count + " times in the word.");
    }
}
