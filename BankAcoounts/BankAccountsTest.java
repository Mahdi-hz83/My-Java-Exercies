package org.example.BankAcoounts;

import org.example.Logs.Logs;
import org.example.Logs.Filters;
import org.example.Employees.ContractEmployee;
import org.example.Employees.OfficialEmployee;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BankAccountsTest {
    private BankAccounts account;
    private OfficialEmployee official;
    private ContractEmployee contract;

    @Before
    public void setUp() {
        account = new BankAccounts("12345");
        official = new OfficialEmployee("Ali", 1, 2000);
        contract = new ContractEmployee("Hasan", 2, 100);
    }



    @Test
    public void testPositiveDeposit(){
        account.deposit(official.getSalary(),official.getName(),official.getId());
        assertEquals(1 , account.getLogs().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDeposit(){
        account.deposit(-1,official.getName(),official.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroDeposit(){
        account.deposit(0,official.getName(),official.getId());
    }

    @Test
    public void testFilterByDate(){
        account.deposit(official.getSalary(), official.getName(), official.getId());
        List<Logs> logs = Filters.filterByDate(account.getLogs(), LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));
        assertEquals(1, logs.size());
    }

    @Test
    public void testFilterByEmployee(){
        account.deposit(official.getSalary(), official.getName(), official.getId());
        account.deposit(contract.getSalary(), contract.getName(), contract.getId());
        List<Logs> logs = Filters.filterByEmployee(account.getLogs(), 1);
        assertEquals(1, logs.size());
        assertEquals("Ali", logs.get(0).getEmployeeName());
    }

    @Test
    public void testFilterByAccount() {
        account.deposit(1000, official.getName(), official.getId());
        List<Logs> logs = Filters.filterByAccount(account.getLogs(), "12345");
        assertEquals(1, logs.size());
    }
}



