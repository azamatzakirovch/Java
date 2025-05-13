package org.example;

public class Sixth {

    public static boolean isConsecutiveFour(int[] values){
        int length = values.length, count;
        for(int i = 0; i < length; i++){
            count = 0;
            for(int j = i + 1; j < length; j++){
                if(values[i] == values[j]){
                    count++;
                }
                if(count == 4){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("====================Task5====================");
        System.out.println(isConsecutiveFour(new int[]{3,4,5,5,5,5,4,5}));
    }
}
