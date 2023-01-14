package com.oop.mock;

public class Calculator {

    public static void main(String[] args) {
        calculator1 c1 = new calculator1();
        calculator2 c2 = new calculator2();

        c1.x = 0;
        c2.x = 0;

        c1.cal(2);
        c2.cal(2);

        System.out.print(c1.x + " " + c2.x);
    }
}

interface calculate {
    void cal(int item);
}

class calculator1 implements calculate {
    int x;

    public void cal(int item) {
        x = item * item;
    }
}

class calculator2 implements calculate {
    int x;

    public void cal(int item) {
        x = item / item;
    }
}