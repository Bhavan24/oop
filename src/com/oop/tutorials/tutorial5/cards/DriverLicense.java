package com.oop.tutorials.tutorial5.cards;

public class DriverLicense extends Card {
    private int expirationYear;

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public String format() {
        return "expirationYear: " + expirationYear;
    }
}
