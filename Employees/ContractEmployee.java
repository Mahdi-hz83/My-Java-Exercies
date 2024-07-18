package org.example.Employees;

public class ContractEmployee extends Employees {
    private final double hourRate;
    private final int hoursWorked;

    public ContractEmployee(String name, int id, int hoursWorked) {
        super(name, id);
        this.hourRate = 10;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary() {
        if (hoursWorked > 0) {
            return hourRate * hoursWorked;
        } else {
            throw new IllegalArgumentException("Not enough hours worked");
        }
    }
}
