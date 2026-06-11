/*
 * Author:      Zak Nizam
 * Date:        June 11, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 1.3 Programming Assignment
 *
 * Purpose:
 *  This program calculates the energy needed to heat water from an initial
 *  temperature to a final temperature.
 */

import java.util.Scanner;

public class WaterHeatingCalculator {
    private static final double SPECIFIC_HEAT_OF_WATER = 4184.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double energy = calculateEnergy(waterMass, initialTemperature, finalTemperature);

        System.out.printf("The energy needed is %.2f Joules.%n", energy);

        input.close();
    }

    public static double calculateEnergy(double waterMass, double initialTemperature, double finalTemperature) {
        return waterMass * (finalTemperature - initialTemperature) * SPECIFIC_HEAT_OF_WATER;
    }
}