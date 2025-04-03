// Nilaris Roberts
// 7-3 Assignment
// Using Java API Documentation

import java.util.Scanner;

public class Paint2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0, wallWidth = 0.0, wallArea, gallonsPaintNeeded;
        int cansNeeded;
        final double squareFeetPerGallon = 350.0;

        // Get valid wall height
        wallHeight = getValidInput(scnr, "Enter wall height (feet): ");

        // Get valid wall width
        wallWidth = getValidInput(scnr, "Enter wall width (feet): ");

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint needed
        gallonsPaintNeeded = wallArea / squareFeetPerGallon;
        System.out.printf("Paint needed: %.2f gallons%n", gallonsPaintNeeded);

        // Calculate and output the number of cans needed (rounded up)
        cansNeeded = (int) Math.ceil(gallonsPaintNeeded); // ceil math method "Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer."
        System.out.println("Cans needed: " + cansNeeded + " can" + (cansNeeded == 1 ? "" : "s"));

        scnr.close();
    }

    // Method to get valid positive input
    public static double getValidInput(Scanner scnr, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scnr.hasNextDouble()) {  // Check if input is a number
                value = scnr.nextDouble();
                if (value > 0) {  // Check if number is positive
                    return value;
                } else {
                    System.out.println("Error: Value must be greater than zero.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scnr.next(); // Discard invalid input
            }
        }
    }
}