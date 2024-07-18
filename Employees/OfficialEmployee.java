package org.example.Employees;

public class OfficialEmployee extends Employees{
    private final double baseSalary;

    public OfficialEmployee(String name , int id , double baseSalary){
        super(name, id);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(){
        double officialBonus = 4;
        if (baseSalary > 0){
        return baseSalary * officialBonus;
        }else{
            throw new IllegalArgumentException("baseSalary should be greater than 0");
        }
    }
}
