package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    linkedList1.push(70);
    linkedList1.push(30);
    linkedList1.push(56);
    linkedList1.show();

    LinkedList<Integer> linkedList2 = new LinkedList<>();
    linkedList2.add(56);
    linkedList2.add(30);
    linkedList2.add(70);
    linkedList2.show();

    Integer poppedData1 = linkedList1.pop();
    if(poppedData1 == null)
        System.out.println("Linked List is Empty");
    else
        System.out.println("The Element Popped is => " + poppedData1);
    linkedList1.show();


    Integer poppedData2 = linkedList2.popLast();
        if(poppedData2 == null)
            System.out.println("Linked List is Empty");
        else
            System.out.println("The Element Popped is => " + poppedData2);
        linkedList2.show();

        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.push(70);
        linkedList3.push(30);
        linkedList3.push(56);
        linkedList3.show();
        Node<Integer> serchedData = linkedList3.serch(30);
        if (serchedData == null) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element Found");
        }

}

}

