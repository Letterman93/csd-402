/*
 * Author:      Zak Nizam
 * Date:        June 22, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 3.2 Programming Assignment
 *
 * Purpose:
 *  This program uses nested for loops to display a formatted pattern of
 *  powers of two with an @ symbol at the end of each line.
 */

public class PowerPattern {
    public static void main(String[] args) {
        final int rows = 7;
        final int lineWidth = 31;

        for (int row = 0; row < rows; row++) {
            String line = "";

            for (int space = 0; space < rows - row - 1; space++) {
                line += "  ";
            }

            for (int power = 0; power <= row; power++) {
                line += (int) Math.pow(2, power) + " ";
            }

            for (int power = row - 1; power >= 0; power--) {
                line += (int) Math.pow(2, power) + " ";
            }

            for (int space = line.length(); space < lineWidth; space++) {
                line += " ";
            }

            System.out.println(line + "@");
        }
    }
}

