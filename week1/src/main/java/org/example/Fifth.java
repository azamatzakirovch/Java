package org.example;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        System.out.println("===============TASK5===============");
        double area, volume, side, length;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Side Of Triangle: ");
        side = input.nextDouble();

        System.out.print("Enter The Length Of Triangle: ");
        length = input.nextDouble();

        area = (Math.sqrt(3)/4) * Math.pow(side,2);
        volume = area * length;

        System.out.println("The Volume of the Triangle is: " + volume);
        System.out.println("The Area of the Triangle is: " + area);
    }
}
