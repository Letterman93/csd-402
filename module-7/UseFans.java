/*
 * Author:      Zak Nizam
 * Date:        July 23, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 7.2 Programming Assignment
 *
 * Purpose:
 *  This program creates a collection of Fan instances and displays each fan
 *  without using the Fan class toString method.
 */

import java.util.ArrayList;
import java.util.Collection;

public class UseFans {
    public static void main(String[] args) {
        Collection<Fan> fans = new ArrayList<>();

        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 7.5, "black"));
        fans.add(new Fan(Fan.MEDIUM, true, 9.0, "silver"));
        fans.add(new Fan(Fan.FAST, true, 12.0, "blue"));

        System.out.println("Fan Collection Test");
        System.out.println("-------------------");
        displayFans(fans);

        Fan updatedFan = new Fan();
        updatedFan.setSpeed(Fan.FAST);
        updatedFan.setOn(true);
        updatedFan.setRadius(10.5);
        updatedFan.setColor("green");

        System.out.println();
        System.out.println("Single Fan Test After Setter Methods");
        System.out.println("------------------------------------");
        displayFan(updatedFan);
    }

    // Display every fan in the collection without using toString.
    public static void displayFans(Collection<Fan> fans) {
        int fanNumber = 1;

        for (Fan fan : fans) {
            System.out.println("Fan " + fanNumber + ":");
            displayFan(fan);
            System.out.println();
            fanNumber++;
        }
    }

    // Display one fan without using toString.
    public static void displayFan(Fan fan) {
        System.out.println("Speed:  " + speedToString(fan.getSpeed()));
        System.out.println("On:     " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color:  " + fan.getColor());
    }

    // Convert the speed number into a word for easier reading.
    public static String speedToString(int speed) {
        switch (speed) {
            case Fan.STOPPED:
                return "STOPPED";
            case Fan.SLOW:
                return "SLOW";
            case Fan.MEDIUM:
                return "MEDIUM";
            case Fan.FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }
}
