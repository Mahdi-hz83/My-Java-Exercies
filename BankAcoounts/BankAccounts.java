package org.example.BankAcoounts;

import org.example.Logs.Logs;

import java.util.ArrayList;
import java.util.List;

public class BankAccounts {
    private final String accountNumber;
    private final List<Logs> Logs;

    public BankAccounts(String accountNumber) {
        this.accountNumber = accountNumber;
        this.Logs = new ArrayList<>();
    }

    public void deposit(double amount , String employeeName , int employeeId) {
        if (amount > 0) {
            Logs.add(new Logs(amount, accountNumber, employeeName, employeeId));
            System.out.println("Deposited " + amount + " to " + accountNumber + " , " + employeeName);
        }
        else{ throw new IllegalArgumentException("Amount must be greater than zero");}
    }

    public List<Logs> getLogs() {return Logs;}


    public String getAccountNumber() {return accountNumber;
    }
}
