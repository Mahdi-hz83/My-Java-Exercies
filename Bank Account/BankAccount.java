package org.example;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
    public double withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        else{
            balance -= amount;
        }
        return balance;
    }
    public String displayInfo(){
        return "Account number: " + this.accountNumber + "\nBalance: " + balance;
    }
}
