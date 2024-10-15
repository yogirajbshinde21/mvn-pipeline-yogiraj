package com.example;

public class App {

    // Conversion factor can vary by institution, here we assume a factor of 9.5 for the conversion
    public static final double CONVERSION_FACTOR = 9.5;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Error: CGPA not provided. Please provide CGPA as a command-line argument.");
            return;
        }

        // Parse the CGPA from the command-line argument
        double cgpa = Double.parseDouble(args[0]);

        // Convert CGPA into percentage using the conversion factor
        double percentage = convertCgpaToPercentage(cgpa);

        // Display the percentage result
        System.out.printf("Your percentage is: %.2f%%\n", percentage);
    }

    // Method to convert CGPA into percentage
    public static double convertCgpaToPercentage(double cgpa) {
        return cgpa * CONVERSION_FACTOR;
    }
}
