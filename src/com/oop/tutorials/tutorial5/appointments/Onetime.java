package com.oop.tutorials.tutorial5.appointments;

import java.util.Date;

public class Onetime extends Appointment {

    public Onetime(String description, Date date) {
        super(description, date);
    }

    @Override
    protected boolean occursOn(int year, int month, int day) {
        return super.occursOn(year, month, day);
    }
}
