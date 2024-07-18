package org.example;

import org.example.employee.AbstractionFullTimeEmployee;
import org.example.employee.AbstractionPartTimeEmployee;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AbstractionEmployeeTest {
    private AbstractionFullTimeEmployee fullTime;
    private AbstractionPartTimeEmployee partTime;

    @Before
    public void setUp() {
        this.fullTime = new AbstractionFullTimeEmployee("Alireza","A124",4000);
        this.partTime =  new AbstractionPartTimeEmployee("Mahdi","B128",3000);
    }

    @Test
    public void testFullTimeEmployee() {
        assertEquals(5000.0, fullTime.calculateSalary());
    }

    @Test
    public void testPartTimeEmployee() {
        assertEquals(3500.0, partTime.calculateSalary());
    }
}