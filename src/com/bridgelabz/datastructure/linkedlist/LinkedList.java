package com.bridgelabz;

import com.sun.source.tree.BreakTree;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }


    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }

    }

    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public T pop() {
        if (head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public T popLast() {
        if (head == null)
            return null;
        T popData = tail.data;
        if (head == tail) {
            head = null;
            return popData;
        }
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;

        }
        temp.next = null;
        tail = temp;
        return popData;
    }

    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;

    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> serchedNode = search(searchData);
        if (serchedNode != null) {
           newNode.next = serchedNode.next;
            serchedNode.next = newNode;
            return true;
        }
            return false;
    }

}
