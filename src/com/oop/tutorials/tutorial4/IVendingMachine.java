package com.oop.tutorials.tutorial4;

public interface IVendingMachine {
    void fillUp(int cans);

    void insertToken();

    int getCanCount();

    int getTokenCount();
}
