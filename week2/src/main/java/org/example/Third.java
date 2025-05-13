package org.example;

import java.util.Scanner;

public class Third {

    public static boolean tellUppercase(char character){
        int a = (int)character;
        return a >= 65 && a <= 90;
    }

    public static boolean tellLowercase(char character){
        int a = (int)character;
        return a >= 97 && a <= 122;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char character;
        int uppercase = 0, lowercase = 0, noLetters = 0, length;
        String word;

        System.out.println("====================Task2====================");

        System.out.print("Please enter the word: ");
        word = input.nextLine();

        length = word.length();

        for(int i = 0; i < length; i++){
            character = word.charAt(i);
            if(tellUppercase(character)){
                uppercase++;
            }else if(tellLowercase(character)){
                lowercase++;
            }
            else{
                noLetters++;
            }
        }

        System.out.println("Here you entered " + word + " and there are " + uppercase + " uppercases and " + lowercase + " lowercases " + noLetters + " no-letters(space included no letter)");



    }

}
