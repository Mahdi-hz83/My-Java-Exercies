package org.example;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LinkedListTest {
    private LinkedList list;

    private int listSize(){
        return list.size;
    }


    private String stringList(LinkedList list) {
        StringBuilder sb = new StringBuilder();
        LinkedList.Node current = list.head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }

    @Before
    public void setUp() {
        this.list = new LinkedList();
    }

    @Test
    public void testInsertFirst() {
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(15);
        assertEquals(3,listSize());
        assertEquals("15 -> 5 -> 10 -> ", stringList(list));
    }

    @Test
    public void testInsertLast() {
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(15);
        assertEquals(3, listSize());
        assertEquals("10 -> 20 -> 15 -> ", stringList(list));
    }

    @Test
    public void testDeleteFirst() {
        list.insertLast(10);
        list.insertLast(20);
        list.deleteFirst();
        assertEquals(1, listSize());
        assertEquals("20 -> ", stringList(list));
    }

    @Test
    public void testDeleteLast() {
        list.insertLast(10);
        list.insertLast(20);
        list.deleteLast();
        assertEquals(1, listSize());
        assertEquals("10 -> ", stringList(list));
    }

}