package org.example;

public class Seventh {

    public static int doubled(int[] array){
        int sum = 0, length = array.length;

        for(int i = 0; i < length; i++){
            if(i % 2 == 0){
                int doubled_element = array[i] * 2;
                if(doubled_element > 9){
                    int mini_collector = 0;
                    mini_collector = mini_collector + doubled_element / 10 + doubled_element % 10;
                    doubled_element = mini_collector;
                }
                sum += doubled_element;
            }
        }
        return sum;
    }

    public static int nonDoubled(int[] array){
        int sum = 0, length = array.length;
        for(int i = 0; i < length; i++){
            if(i % 2 != 0){
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("====================Task7====================");
        int[] card = {4, 5, 5, 6, 7, 3, 7, 5, 8, 6, 8, 9, 9, 8, 5, 5};
        int[] reversed = new int[card.length];
        int length = reversed.length, j = 0;

        for(int i = length - 1; i > 0; i--){
            reversed[j] = card[i];
            j++;
        }

        int result;
        result = doubled(reversed) + nonDoubled(reversed);

        System.out.println(result % 10 == 0);
    }
}
