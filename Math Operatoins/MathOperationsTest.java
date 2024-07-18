package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    @Before
    public void setUp() {
        MathOperations m1 = new MathOperations();
    }

    @Test
    public void testAdd2Int() {
        assertEquals(5, MathOperations.add(2, 3));
    }

    @Test
    public void testAdd3Int(){
        assertEquals(15, MathOperations.add(3, 4,8));
    }

    @Test
    public void testAdd2Doubles(){
        assertEquals(10.45 , MathOperations.add(4.05, 6.4));
    }
}