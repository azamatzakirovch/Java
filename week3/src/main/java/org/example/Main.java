package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static String errorTeller(String errorType){
        if(Objects.equals(errorType, "Task Number")){
            return "Please Enter Available Task Number";
        }
        else if(Objects.equals(errorType, "Operation Number")){
            return "Please Enter Available Operation Number";
        }
        return "Something Went Wrong. Please Try Again";
    }

    static void printTotalAvailableTasks(String[] tasks){
        int length = tasks.length;
        for(int i = 0; i < length; i++){
            System.out.println(i + 1 + " : " + tasks[i]);
        }
    }

    static void tellPossibleOperations(){
        System.out.println("""
                1 - See Total Available Tasks
                2 - Exit
                """);
        System.out.print("Please Enter Only Possible Operation: ");
    }

    static void taskImporter(int taskNumber){
        switch (taskNumber) {
            case 1 -> First.main(new String[]{});
            case 2 -> Second.main(new String[]{});
            case 3 -> Third.main(new String[]{});
            case 4 -> Fourth.main(new String[]{});
        }
    }

    static boolean checkAvailabilityOfUsersTaskInput(int total, int taskNumber){
        return taskNumber <= total && taskNumber > 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] finishedTasks = {
                "First Task",
                "Second Task",
                "Third Task",
                "Fourth Task"
        };

        while (true){
            System.out.println("=============================");
            System.out.println("Welcome To Lab 3 Task Answers");
            tellPossibleOperations();

            int operation = input.nextInt();

            if(operation == 1){
                while (true){
                    printTotalAvailableTasks(finishedTasks);
                    System.out.print("Please Enter Task Number: ");
                    int taskNumber = input.nextInt();
                    if(checkAvailabilityOfUsersTaskInput(finishedTasks.length, taskNumber)){
                        taskImporter(taskNumber);
                        System.out.println("Task Imported Successfully\n");
                        break;
                    } else {
                        System.out.println(errorTeller("Task Number"));
                    }
                }
            } else if (operation == 2) {
                System.out.println("App is closed. Thanks");
                break;
            } else {
                System.out.println(errorTeller("Operation Number"));
            }
        }
    }
}
