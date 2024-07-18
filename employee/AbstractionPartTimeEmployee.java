package org.example.employee;

public class AbstractionPartTimeEmployee extends AbstractionEmployee{
    private final double bonus;
    public AbstractionPartTimeEmployee(String employeeName, String employeeID, double bonus) {
        super(employeeName, employeeID);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = 500;
        return baseSalary + bonus;
    }
}
