package com.oop.tutorials.tutorial5;

public class Letter implements Printable {
    private String text;

    @Override
    public void print() {
        System.out.printf("Text: %s", text);
    }
}
