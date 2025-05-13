package org.example;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("===============TASK1===============");
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your First Name: ");
        String firstname = input.nextLine();

        System.out.print("Please Enter Your Last Name: ");
        String lastname = input.nextLine();

        System.out.print("Please Enter Your Email Address: ");
        String emailaddress = input.nextLine();

        String[] userdata = {firstname, lastname, emailaddress};

        System.out.println("Wait! Your Data is Saving to Database");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // wait 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("#");
        }

        System.out.println(" 100%");


        System.out.println("\n✅ Your data has been saved successfully!");
    }
}
