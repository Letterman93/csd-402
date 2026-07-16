/*
 * Author:      Zak Nizam
 * Date:        July 16, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 6.2 Programming Assignment
 *
 * Purpose:
 *  This program creates a Fan class with fields, constants, constructors,
 *  getter and setter methods, and a toString method to describe the fan.
 */

public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Create a fan using the default values.
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
    }

    // Create a fan using the values sent to the constructor.
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Return a clear description of the fan's current state.
    public String toString() {
        return "Fan state: "
                + "speed = " + speedToString(speed)
                + ", on = " + on
                + ", radius = " + radius
                + ", color = " + color;
    }

    // Convert the speed number into a word for easier reading.
    private String speedToString(int speed) {
        switch (speed) {
            case STOPPED:
                return "STOPPED";
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }

    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(FAST, true, 10.0, "blue");

        System.out.println("Fan Class Test");
        System.out.println("--------------");
        System.out.println("Default fan created with no-argument constructor:");
        System.out.println(defaultFan);
        System.out.println();

        System.out.println("Custom fan created with argument constructor:");
        System.out.println(customFan);
        System.out.println();

        // Change the default fan to show the setter methods work.
        defaultFan.setSpeed(MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(8.5);
        defaultFan.setColor("black");

        System.out.println("Default fan after using setter methods:");
        System.out.println(defaultFan);
        System.out.println();

        // Display individual values to show the getter methods work.
        System.out.println("Custom fan values from getter methods:");
        System.out.println("Speed: " + customFan.speedToString(customFan.getSpeed()));
        System.out.println("On: " + customFan.isOn());
        System.out.println("Radius: " + customFan.getRadius());
        System.out.println("Color: " + customFan.getColor());
    }
}
