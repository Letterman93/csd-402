/*
 * Author:      Zak Nizam
 * Date:        July 5, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 4.2 Programming Assignment
 *
 * Purpose:
 *  This program demonstrates overloaded methods that calculate the average
 *  of short, int, long, and double arrays of different sizes.
 */

import java.util.Arrays;

public class ArrayAverages {
    public static void main(String[] args) {
        // Create four arrays with different data types and sizes.
        short[] shortArray = {2, 4, 6};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display each original array and its calculated average.
        System.out.println("Array Average Results");
        System.out.println("---------------------");
        System.out.println("Short array:  " + Arrays.toString(shortArray));
        System.out.println("Average:      " + average(shortArray));
        System.out.println();

        System.out.println("Integer array: " + Arrays.toString(intArray));
        System.out.println("Average:       " + average(intArray));
        System.out.println();

        System.out.println("Long array:    " + Arrays.toString(longArray));
        System.out.println("Average:       " + average(longArray));
        System.out.println();

        System.out.println("Double array:  " + Arrays.toString(doubleArray));
        System.out.println("Average:       " + average(doubleArray));
    }

    // Calculate the average of the short array.
    public static short average(short[] array) {
        long sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    // Calculate the average of the integer array.
    public static int average(int[] array) {
        long sum = 0;

        for (int value : array) {
            sum += value;
        }

        return (int) (sum / array.length);
    }

    // Calculate the average of the long array.
    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Calculate the average of the double array.
    public static double average(double[] array) {
        double sum = 0.0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }
}
