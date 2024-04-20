package com.syscho.dsa.datastructure.set;

import com.syscho.dsa.datastructure.list.MyList;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Consumer;

public class MySet<E> {

    static final Object PRESENT = new Object();

    private final HashMap<E, Object> elements = new HashMap<>();

    public boolean add(E e) {
        return elements.put(e, PRESENT) == null;
    }


    public boolean remove(E e) {
        return elements.remove(e) == null;
    }

    public boolean contains(E e) {
        return elements.containsKey(e);
    }

    public boolean addAll(Collection<? extends E> ele) {
        boolean modified = false;
        for (E e : ele) {
            if (add(e))
                modified = true;
        }
        return modified;
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        elements.clear();
    }

    public void forEach(Consumer<? super E> action) {
        elements.keySet().forEach(action);
    }
}
