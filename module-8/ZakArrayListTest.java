/*
 * Author:      Zak Nizam
 * Date:        July 30, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 8.2 Programming Assignment
 *
 * Purpose:
 *  This program stores user-entered integers in an ArrayList and finds the
 *  largest value in the list using a separate max method.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ZakArrayListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;

        System.out.println("ArrayList Largest Value Test");
        System.out.println("----------------------------");
        System.out.println("Enter integers one at a time. Enter 0 to stop.");

        // Keep accepting integers until the user enters 0.
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            numbers.add(number);
        } while (number != 0);

        System.out.println();
        System.out.println("Numbers entered: " + numbers);
        System.out.println("Largest value: " + max(numbers));

        // Test the method with an empty ArrayList.
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println();
        System.out.println("Empty list test: " + emptyList);
        System.out.println("Largest value from empty list: " + max(emptyList));

        input.close();
    }

    // Return the largest Integer in the ArrayList, or 0 if the list is empty.
    @SuppressWarnings("rawtypes")
    public static Integer max (ArrayList list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (Object item : list) {
            Integer value = (Integer) item;

            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }
}
