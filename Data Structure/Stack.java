package org.example;

import java.util.EmptyStackException;

public class Stack {
    private int[] items;
    private int top;

    public Stack(int capacity) {
        items = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }
    public void push(int data) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        items[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items[top--];
    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items[top];
    }
    public int size() {
        return top + 1;
    }
}

