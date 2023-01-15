package com.oop.lectures.lecture2;

import java.awt.*;

public class MoveTester {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        // Move the rectangle
        box.translate(15, 25);
        // Print information about the moved rectangle
        System.out.println("After moving, the top-left corner is:");
        System.out.println(box.getX() + ", " + box.getY());
    }

}
