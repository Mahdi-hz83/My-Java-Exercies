package org.example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class QueueTest {
    private Queue queue;

    @Before
    public void setUp() {
        this.queue = new Queue(5);
    }

    @Test
    public void testAddAndRemove() {
        queue.add(10);
        queue.add(20);
        assertEquals(10, queue.remove());
        assertEquals(20, queue.remove());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsFullAndIsEmpty() {
        assertTrue(queue.isEmpty());
        assertFalse(queue.isFull());
        queue.add(10);
        assertFalse(queue.isEmpty());
        queue.add(20);
        assertFalse(queue.isEmpty());
        queue.add(30);
        assertFalse(queue.isEmpty());
        queue.add(40);
        assertFalse(queue.isEmpty());
        queue.add(50);
        assertTrue(queue.isFull());
        assertFalse(queue.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testAddToFullQueue() {
        for (int i = 0; i < 6; i++) {
            queue.add(i);
        }
    }


    @Test(expected = IllegalStateException.class)
    public void testRemoveFromEmptyQueue() {
        queue.remove();
    }


}