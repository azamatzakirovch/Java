package org.example;

import java.util.Random;

public class Third {

    private long startTime, endTime;

    private Third(){
        startTime = System.currentTimeMillis();
    }

    private void start(){
        startTime = System.currentTimeMillis();
    }

    private void end(){
        endTime = System.currentTimeMillis();
    }

    private long getTimeDuration(){
        return endTime - startTime;
    }

    private long getStartTime(){
        return startTime;
    }

    private long getEndTime(){
        return endTime;
    }

    public static void main(String[] args){
        Third Start = new Third();
        Start.start();
        int[] array = new int[100_000];  // 1 million elements
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;  // generates number from 1 to 100
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                System.out.print(array[j] + " ");
            }
        }

        Start.end();

        System.out.println(Start.getTimeDuration());
    }

}
