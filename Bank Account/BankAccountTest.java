package org.example;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount();
    }

    @Test
    public void testBankAccountInformation() {
        account.setAccount(1020 , 1000);
        assertEquals("Account number: 1020\nBalance: 1000.0" , account.displayInfo());
    }

    @Test
    public void testBankAccountDeposit() {
        account.setAccount(1020 , 1001);
        assertEquals(3001.0, account.deposit(2000));
    }

    @Test
    public void testBankAccountWithdraw() {
        account.setAccount(1020 , 1001);
        assertEquals(1000.0, account.withdraw(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBankAccountWithdrawAmountGreaterThanBalance() {
        account.setAccount(1020 , 1001);
        account.withdraw(2000);
    }
}