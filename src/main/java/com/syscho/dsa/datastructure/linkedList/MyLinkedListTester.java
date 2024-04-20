package com.syscho.dsa.datastructure.linkedList;

import java.util.LinkedList;
import java.util.Stack;

public class MyLinkedListTester {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println("Size of list: " + myList.size());
        System.out.println("Is list empty? " + myList.isEmpty());
        System.out.println("Elements of list:");
        System.out.println("First Element :" + myList.getFirst());
        System.out.println("Last Element :" + myList.getLast());
        System.out.println("Get by index:" + myList.get(2));
        System.out.println("Remove Index Element :" + myList.remove(1));
        System.out.println("Remove LAST Element :" + myList.removeLast());
        System.out.println("Remove FIRST Element :" + myList.removeFirst());
        MyLinkedList<Integer> temp2 = new MyLinkedList<>();
        temp2.add(33);
        System.out.println("Add ALL Element :" + myList.addAll(temp2));
        myList.addFirst(99);
        System.out.println("ADD LAST Element :");

        myList.addLast(988);
        myList.printList();

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println();
        System.out.println("----------------");
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Is list empty? " + linkedList.isEmpty());
        System.out.println("Elements of list:");
        System.out.println("First Element :" + linkedList.getFirst());
        System.out.println("Last Element :" + linkedList.getLast());
        System.out.println("Get by index:" + linkedList.get(2));
        System.out.println("Remove Index Element :" + linkedList.remove(1));
        LinkedList<Integer> temp = new LinkedList<>();
        temp.add(33);
        System.out.println("Remove LAST Element :" + linkedList.removeLast());
        System.out.println("Remove FIRST Element :" + linkedList.removeFirst());
        System.out.println("Add ALL Element :" + linkedList.addAll(temp));
        linkedList.addFirst(99);
        System.out.println("ADD LAST Element :");
        linkedList.addLast(988);

        linkedList.forEach(x -> System.out.print(x + "->"));

    }
}
