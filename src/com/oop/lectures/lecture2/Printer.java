package com.oop.lectures.lecture2;

public class Printer {
    int errorCode;

    // constructor 1
    public Printer() {
        System.out.println("Constructor with no arguments called!");
    }

    // constructor 2
    public Printer(int i) {
        errorCode = i;
        System.out.println("Constructor with an int argument called!");
    }

    public void display() {
        System.out.println(errorCode);
    }

    public void display(int i) {
        System.out.println(i);
    }

    public void display(String s) {
        System.out.println(s);
    }

    public void display(int i, String s) {
        System.out.println(i + s);
    }

    public void display(String s, int i) {
        System.out.println(i + s);
    }
}
