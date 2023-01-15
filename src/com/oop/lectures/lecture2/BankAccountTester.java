package com.oop.lectures.lecture2;

/**
 * A class to test the BankAccount class.
 */
public class BankAccountTester {
    /**
     * Tests the methods of the BankAccount class.
     */
    public static void main(String[] args) {
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(2000);
        harrysChecking.withdraw(500);
        System.out.println(harrysChecking.getBalance());
        BankAccount harrysSavings = new BankAccount(100);
        harrysSavings.withdraw(30);
        harrysSavings.withdraw(10);
        harrysSavings.deposit(20);
        double balance = harrysSavings.getBalance();
        System.out.println("Savings account balance: " + balance);
    }
}