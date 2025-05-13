package org.example;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===============TASK3===============");
        System.out.print("Please Enter The Height Of Rectangle: ");
        double height = input.nextDouble();

        System.out.print("Please Enter The Width Of Rectangle: ");
        double width = input.nextDouble();

        double area = height * width;
        double perimeter = 2 * (height + width);

        System.out.println("The Area of the Rectangle is " + area);
        System.out.println("The Perimeter of the Rectangle is " + perimeter);
    }
}
