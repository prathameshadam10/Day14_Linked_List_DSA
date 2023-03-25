package com.bridgelabz;

public class SortedLinkedList<T extends  Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public void addData(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void deleteAnyElement(T delete) {
        if (head == null) {
            return;
        }
        if (head.data.equals(delete)) {
            head = head.next;
            return;
        }
        Node<T> prev = head;
        Node<T> current = head.next;
        while (current != null) {
            if (current.data.equals(delete)) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void search(T search) {
        Node<T> temp = head;
        boolean flag = false;
        while (temp != null) {
            if (temp.data.equals(search)) {
                flag = true;
                deleteAnyElement(search);
            }
            temp = temp.next;
        }
        if (!flag) {
            addData(search);
            System.out.println("Data Added successfully");
        }

    }

    public void sort() {
        Node<T> temp1 = head;
        Node<T> temp2 = head;
        T temp3;
        if (head != null) {
            while (temp1 != null) {
                temp2 = temp1.next;
                while (temp2 != null) {
                    if ((temp1.data.compareTo(temp2.data)) > 0) {
                        temp3 = temp1.data;
                        temp1.data = temp2.data;
                        temp2.data = temp3;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
    }
}
