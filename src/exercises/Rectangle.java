package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int rectangleLength = input.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int rectangleWidth = input.nextInt();
        int rectangleArea = rectangleWidth * rectangleLength;
        System.out.println("The area of the rectangle is " + rectangleArea);
    }
}