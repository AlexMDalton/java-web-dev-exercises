package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

import static java.lang.Double.isNaN;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

/*
        while(radius < 0 || isNaN(radius) || radius.isEmpty() ){
            System.out.println("Please enter a valid radius:");
            radius = input.nextDouble();
        }
*/
        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is: " + area);
    }
}