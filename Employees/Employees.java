package org.example.Employees;

import java.util.ArrayList;
import java.util.List;
import org.example.BankAcoounts.BankAccounts;


public abstract class Employees {
    private String name;
    private int id;
    private List<BankAccounts> bankAccounts;

    public Employees(String name , int id) {
        this.name = name;
        this.id = id;
        bankAccounts = new ArrayList<>();
    }

    public abstract double getSalary();

    public void addAccount(BankAccounts account) {
        this.bankAccounts.add(account);
    }

    public String getName(){return name;}
    public int getId(){return id;}
    public List<BankAccounts> getBankAccounts(){return bankAccounts;}
}
