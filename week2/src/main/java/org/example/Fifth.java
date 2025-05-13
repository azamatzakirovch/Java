package org.example;
import java.util.Scanner;

public class Fifth {

    public static int[] sorter(int[] setOfIntegers){
        int length = setOfIntegers.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - 1 - i; j++){
                if(setOfIntegers[j] > setOfIntegers[j + 1]){
                    int temp = setOfIntegers[j];
                    setOfIntegers[j] = setOfIntegers[j + 1];
                    setOfIntegers[j + 1] = temp;
                }
            }
        }
        return setOfIntegers;
    }

    public static String sort(String word){
        int length = word.length();
        int[] ascii = new int[length];

        for(int i = 0; i < length; i++){
            ascii[i] = (int) word.charAt(i);
        }

        int[] sortedAscii = sorter(ascii);

        StringBuilder result = new StringBuilder();
        for (int code : sortedAscii) {
            result.append((char) code);
        }

        return result.toString();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("====================Task5====================");
        System.out.print("Enter the word: ");
        word = input.nextLine();

        String sorted = sort(word);
        System.out.println("Sorted characters: " + sorted);
    }
}
