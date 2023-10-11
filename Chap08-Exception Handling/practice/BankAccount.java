package com.alamin.practice;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in account.");
        }
        this.balance -= amount;
        System.out.println("After withdraw " + amount + " your account balance is " + this.balance);
    }

    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount account = new BankAccount(500.00);
        account.withdraw(100);

    }
}
class InsufficientFundsException extends Throwable {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
