package org.example;
import java.util.Scanner;
public class Fourth {
    public static int tellTheIndexOfSmallestElement(int[] array){
        int smallest = array[0], index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("====================Task2====================");
        System.out.println("Hi how are you. You need to enter 10 elements here");
        for(int i = 0; i < 10; i ++){
            System.out.print(i + 1 + "-> ");
            int data = input.nextInt();
            array[i] = data;
        }
        for(int i = 0; i < 10; i ++){
            System.out.print(array[i] + " ");
        }
        System.out.println("And The Index Of Smallest Element Is " + tellTheIndexOfSmallestElement(array));
    }
}
