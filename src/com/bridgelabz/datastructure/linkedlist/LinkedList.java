package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }

    }


    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            Node<T> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }

    }

    public void show(){
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public T pop() {
        if(head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }
}

