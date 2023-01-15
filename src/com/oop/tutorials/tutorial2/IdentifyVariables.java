package com.oop.tutorial2;

public class IdentifyVariables {
    public static int x = 7;
    public int y = 3;

    public static void main(String[] args) {
        IdentifyVariables a = new IdentifyVariables();
        IdentifyVariables b = new IdentifyVariables();
        a.y = 5;
        b.y = 6;
        x = 1;
        x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + x);
        System.out.println("b.x = " + x);
        System.out.println("IdentifyVariables.x = " + IdentifyVariables.x);
    }
}
