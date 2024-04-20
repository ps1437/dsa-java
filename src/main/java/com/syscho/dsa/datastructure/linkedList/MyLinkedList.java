package com.syscho.dsa.datastructure.linkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {

    private Node<E> head;
    private int size;

    public E get(int index) {

        checkElementIndex(index);

        Node<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        return currentNode.data;
    }

    public E removeLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        Node<E> current = head;
        Node<E> previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        if (previous == null) { // Only one element in the list
            head = null;
        } else {
            previous.next = null;
        }

        return current.data;
    }

    public E removeFirst() {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            Node<E> firstElement = head;
            head = null;
            return firstElement.data;
        }
        Node<E> firstElement = head;

        head = head.next;
        return firstElement.data;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    public E remove(int index) {
        checkElementIndex(index);

        if (index == 0) {  // Handle removal of the first element
            Node<E> removedElement = head;
            head = head.next;
            return removedElement.data;
        }

        int currentIndex = 0;
        Node<E> t = head;

        while (currentIndex < index - 1 && t.next != null) {
            t = t.next;
            currentIndex++;
        }
        if (currentIndex != index - 1 || t.next == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }


        Node<E> removedElement = t.next;
        t.next = removedElement.next;  // Update the next reference to skip over removedElement


        return removedElement.data;
    }

    public boolean addAll(MyLinkedList<E> elements) {

        Node<E> currentNode = head;
        if (currentNode == null) {
            head = elements.head;
            size = elements.size;
            return true;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        while (elements.head != null) {
            currentNode.next = elements.head;

            elements.head = elements.head.next;
            size++;
        }
        return true;

    }

    static class Node<E> {

        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            next = null;
        }
    }

    MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {

            Node<E> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }


    public void addFirst(E element) {

        Node<E> newNode = new Node<>(element);

        newNode.next = head;

        head = newNode;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

    }

    public E getFirst() {
        return head.data;
    }

    public E getLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }


        Node<E> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }


    public void printList() {

        Node<E> currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}

