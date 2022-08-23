package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        double milesDriven = input.nextDouble();
        System.out.println("Enter the amount of gallons used:");
        double gallonsUsed = input.nextDouble();
        double milesPerGallon = milesDriven / gallonsUsed;
        System.out.println("The miles-per-gallon is " + milesPerGallon);
    }
}
