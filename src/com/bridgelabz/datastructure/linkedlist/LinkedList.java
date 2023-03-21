package com.bridgelabz.datastructure.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        }

        }

    public void show() {
        Node<T> temp = head;
        System.out.print(temp.data + " -> ");
        System.out.println("NULL");

    }
}
