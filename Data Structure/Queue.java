package org.example;

import java.util.EmptyStackException;

public class Queue {
    private int[] items;
    private int front, rear, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        items = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int add(int item) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        items[++rear] = item;
        return item;
    }

    public int remove() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow");
        }
        int item = items[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return item;
    }
}
