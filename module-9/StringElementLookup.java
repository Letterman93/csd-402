/*
 * Author:      Zak Nizam
 * Date:        August 8, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 9.2 Programming Assignment - Program 1
 *
 * Purpose:
 *  This program stores Strings in an ArrayList, displays them with a for-each
 *  loop, and uses try/catch to handle an invalid element selection.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StringElementLookup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("HTML");
        words.add("CSS");
        words.add("JavaScript");
        words.add("SQL");
        words.add("GitHub");
        words.add("ArrayList");
        words.add("Scanner");
        words.add("Exception");

        System.out.println("String ArrayList Elements");
        System.out.println("-------------------------");

        // Print the collection using a for-each loop.
        Integer displayIndex = 0;
        for (String word : words) {
            System.out.println(displayIndex + ": " + word);
            displayIndex++;
        }

        System.out.println();
        System.out.print("Enter the index number of the element to see again: ");
        String userChoice = input.nextLine();

        try {
            // parseInt returns an int, which is autoboxed into an Integer.
            Integer selectedIndex = Integer.parseInt(userChoice);

            // The Integer is auto-unboxed when used as an ArrayList index.
            System.out.println("Selected element: " + words.get(selectedIndex));
        } catch (Exception ex) {
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}
