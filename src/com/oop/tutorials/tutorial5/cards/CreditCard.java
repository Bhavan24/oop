package com.oop.tutorials.tutorial5.cards;

public class CreditCard extends Card {
    private final int pinNumber;
    private final int number;

    public CreditCard(String n, int pinNumber, int number) {
        super(n);
        this.pinNumber = pinNumber;
        this.number = number;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public String format() {
        return "Pin Number: " + pinNumber + " number: " + number;
    }
}
