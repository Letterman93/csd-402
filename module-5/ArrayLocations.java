/*
 * Author:      Zak Nizam
 * Date:        July 7, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 5.2 Programming Assignment
 *
 * Purpose:
 *  This program demonstrates overloaded methods that locate the largest
 *  and smallest values in two-dimensional int and double arrays.
 */

import java.util.Arrays;

public class ArrayLocations {
    public static void main(String[] args) {
        int[][] intArray = {
            {23, 14, 56, 8},
            {31, 67, 12, 44},
            {5, 29, 91, 36}
        };

        double[][] doubleArray = {
            {4.5, 9.2, 1.8},
            {7.4, 3.6, 8.9},
            {2.1, 6.7, 5.3},
            {10.5, 0.9, 4.4}
        };

        // Find the largest and smallest locations in each array.
        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);
        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        System.out.println("Array Location Results");
        System.out.println("----------------------");
        System.out.println("Integer array:");
        displayArray(intArray);
        displayLocation("Largest", intLargest, intArray[intLargest[0]][intLargest[1]]);
        displayLocation("Smallest", intSmallest, intArray[intSmallest[0]][intSmallest[1]]);
        System.out.println();

        System.out.println("Double array:");
        displayArray(doubleArray);
        displayLocation("Largest", doubleLargest, doubleArray[doubleLargest[0]][doubleLargest[1]]);
        displayLocation("Smallest", doubleSmallest, doubleArray[doubleSmallest[0]][doubleSmallest[1]]);
    }

    // Return the row and column of the largest value in a double array.
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Return the row and column of the largest value in an integer array.
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Return the row and column of the smallest value in a double array.
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Return the row and column of the smallest value in an integer array.
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Print each row of the integer array.
    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Print each row of the double array.
    public static void displayArray(double[][] array) {
        for (double[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Print the location and value in a clear format.
    public static void displayLocation(String label, int[] location, int value) {
        System.out.println(label + " value: " + value
                + " at row " + location[0] + ", column " + location[1]);
    }

    // Print the location and value in a clear format.
    public static void displayLocation(String label, int[] location, double value) {
        System.out.println(label + " value: " + value
                + " at row " + location[0] + ", column " + location[1]);
    }
}
