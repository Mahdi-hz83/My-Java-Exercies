package org.example.Employees;


import org.example.BankAcoounts.BankAccounts;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeesTest {
    private OfficialEmployee official;
    private ContractEmployee contract;

    @Before
    public void setUp(){
        this.official = new OfficialEmployee("Mammad",1,400);
        this.contract = new ContractEmployee("Moz",5,50);
    }

    @Test
    public void testOfficialSalary(){
        assertEquals(1600.0 , official.getSalary());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeBaseSalary(){
        this.official = new OfficialEmployee("Mammad",1,-400);
        official.getSalary();
    }

    @Test
    public void testContractSalary(){
        assertEquals(500.0 , contract.getSalary());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeContractHours(){
        this.contract = new ContractEmployee("Moz",5,-10);
        contract.getSalary();
    }

    @Test
    public void testAddAccount(){
        BankAccounts account = new BankAccounts("12345");
        BankAccounts account2 = new BankAccounts("54321");
        official.addAccount(account);
        official.addAccount(account2);
        assertEquals(2 , official.getBankAccounts().size());
        assertEquals("54321", official.getBankAccounts().get(1).getAccountNumber());
    }
}