package org.example;

public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    protected int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty");
        }
        else {
            head = head.next;
            size--;
        }
    }

    public void deleteLast(){
        if (head == null || head.next == null){
            System.out.println("List is empty");
        }else{
            Node current = head;
            while (current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }
}
