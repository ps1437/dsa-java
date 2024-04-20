package com.syscho.dsa.datastructure.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.function.Consumer;

public class MyStack<E> {
    private final int DEFAULT_CAPACITY = 5;
    private Object[] elements;

    private int size = 0;

    public MyStack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyStack(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Invalid initial capacity: " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    public void push(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
    }


    public E pop() {
        E e = peek();
        int len = size();
        remove(len - 1);
        return e;
    }

    public E peek() {
        int len = size();
        return (E) elements[len - 1];
    }


    private E remove(int index) {
        checkIndex(index);
        E removedElement = (E) elements[index];
        elements[--size] = null;
        return removedElement;
    }


    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public boolean addAll(MyStack<? extends E> otherList) {
        int otherListSize = otherList.size;
        if (otherListSize == 0)
            return false;

        ensureCapacity(size + otherListSize);

        System.arraycopy(otherList.elements, 0, elements, size, otherListSize);
        size += otherList.size;
        return true;
    }


    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    public void forEach(Consumer<? super E> action) {
        for (int i = size - 1; i >= 0; i--) {
            action.accept((E) elements[i]);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    public E search(E searchElement) {
        return Arrays.stream(elements).filter(ele -> ele.equals(searchElement))
                .map(x -> (E) x)
                .findFirst().orElseThrow(() -> new RuntimeException("No element Found " + searchElement));
    }
}
