package org.example;


import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class StackTest {
    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack(5);
    }

    @Test
    public void testPushAndPop() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(3 , stack.size());
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.peek());
    }

    @Test(expected = StackOverflowError.class)
    public void testFullStackPush() throws StackOverflowError {
        for (int i = 0 ; i < 6 ; i++){
            stack.push(i);
        }
    }

    @Test(expected = EmptyStackException.class)
    public void testEmptyStackPush() throws EmptyStackException {
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void testEmptyStackPeek() throws EmptyStackException {
        stack.peek();
    }

}