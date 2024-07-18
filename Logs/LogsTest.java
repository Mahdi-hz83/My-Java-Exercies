package org.example.Logs;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LogsTest {
    private Logs log1;
    private Logs log2;

    @Before
    public void setUp(){
        log1 = new Logs(500,"54321","Ali",1);
        log2 = new Logs(100,"12345","Moz",2);
    }

    @Test
    public void testLogDateTimeIsAdded(){
        assertNotNull(log1.getDateTime());
        assertNotNull(log2.getDateTime());
    }

    @Test
    public void testLogEquality() {
        Logs sameLog1 = new Logs(500, "54321", "Ali", 2);
        assertNotEquals(log1, sameLog1);

        Logs identicalLog2 = new Logs(log2.getAmount(), log2.getAccountNumber(), log2.getEmployeeName(), log2.getEmployeeId());
        assertNotEquals(log2, identicalLog2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeAmount(){
        Logs newLog = new Logs(-500, "20254", "Mahdi", 8);
    }
}
