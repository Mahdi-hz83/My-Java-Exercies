package org.example.Logs;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class Logs {
    private final double amount;
    private final LocalDateTime time;
    private final String accountNumber;
    private final String employeeName;
    private final int employeeId;


    public Logs(double amount , String accountNumber , String employeeName , int employeeId) {
        if (amount > 0){
            this.amount = amount;}
        else{throw new IllegalArgumentException("Amount must be greater than zero");}
        this.time = LocalDateTime.now();
        this.accountNumber = accountNumber;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }
    public double getAmount() {return amount;}
    public LocalDateTime getTime() {return time;}

    public LocalDateTime getDateTime() {
        return time;
    }

    public int getEmployeeId() {return employeeId;}

    public String getAccountNumber() {return accountNumber;}

    public String getEmployeeName() {return employeeName;}
}
