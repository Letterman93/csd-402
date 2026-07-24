/*
 * Author:      Zak Nizam
 * Date:        July 23, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 7.2 Programming Assignment
 *
 * Purpose:
 *  This class represents a fan with speed, power, radius, and color values.
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
        this(STOPPED, false, 6.0, "white");
    }

    // Create a fan using the values sent to the constructor.
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Return a clear description of the fan's current state.
    @Override
    public String toString() {
        return "Fan state: "
                + "speed = " + this.speed
                + ", on = " + this.on
                + ", radius = " + this.radius
                + ", color = " + this.color;
    }
}
