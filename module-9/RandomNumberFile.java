/*
 * Author:      Zak Nizam
 * Date:        August 8, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 9.2 Programming Assignment - Program 2
 *
 * Purpose:
 *  This program creates or appends to data.file with 10 random integers,
 *  then reads the file and displays its contents.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberFile {
    public static void main(String[] args) throws IOException {
        File file = new File("module-9/data.file");
        Random random = new Random();

        // Append 10 random numbers to the file, creating it if needed.
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int count = 0; count < 10; count++) {
                writer.write(random.nextInt(100) + " ");
            }
        }

        System.out.println("Contents of data.file");
        System.out.println("---------------------");

        // Reopen the file and display everything stored in it.
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }
        }

        System.out.println();
    }
}
