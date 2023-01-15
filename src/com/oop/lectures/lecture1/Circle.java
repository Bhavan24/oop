package com.oop.lectures.lecture1;

//Revision on Constructor and Static
public class Circle {

    private static int count = 0; //using static variable
    //Default Constructor
    private double radius = 0;

    // Parameterized Constructor
    public Circle(double radius) {
        this.setRadius(radius);
        count++;

    }

    //instance
    public static int getCount() {
        return count;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius must be greater than 0");
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}
