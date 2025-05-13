package org.example;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============TASK4===============");

        System.out.print("Please Enter The Height Of Cylinder: ");
        double height = scanner.nextDouble();

        System.out.print("please Enter The Radius Of Cylinder: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double volume = area * height;

        System.out.println("The Volume of Cylinder is: " + volume);
        System.out.println("The Area of Cylinder is: " + area);
    }
}
