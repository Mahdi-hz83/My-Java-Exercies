package org.example.employee;

public abstract class AbstractionEmployee {
    protected String employeeName;
    protected String employeeID;

    public AbstractionEmployee(String employeeName, String employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }
    public abstract double calculateSalary();
}
