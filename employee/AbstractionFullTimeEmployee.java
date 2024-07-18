package org.example.employee;

public class AbstractionFullTimeEmployee extends AbstractionEmployee{
    private final double bonus;
    public AbstractionFullTimeEmployee(String employeeName, String employeeID, double bonus) {
        super(employeeName,employeeID);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = 1000;
        return bonus + baseSalary;
    }
}
