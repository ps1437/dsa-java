package com.syscho.dsa.datastructure.list;

import java.util.Arrays;
import java.util.function.Consumer;

public class MyList<E> {
    private final int DEFAULT_CAPACITY = 5;
    private Object[] elements;

    private int size = 0;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Invalid initial capacity: " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
    }

    public E remove(int index) {
        checkIndex(index);
        E removedElement = get(index);
        int numMoved = size - index - 1;

        if (numMoved > 0) {
            int nextElementAfterIndex = index + 1;
            System.arraycopy(elements, nextElementAfterIndex, elements, index, numMoved);
        }
        elements[--size] = null; // clear to let GC do its work
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

    public boolean addAll(MyList<? extends E> otherList) {
        int otherListSize = otherList.size;
        if (otherListSize == 0)
            return false;

        ensureCapacity(size + otherListSize);

        System.arraycopy(otherList.elements, 0, elements, size, otherListSize);
        size += otherList.size;
        return true;
    }


    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void removeAll() {
        Arrays.fill(elements, null);
        size = 0;
    }

    public void forEach(Consumer<? super E> action) {
        for (int i = 0; i < size; i++) {
            action.accept(get(i));
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

}
