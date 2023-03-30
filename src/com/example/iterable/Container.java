package com.example.iterable;

import java.util.Iterator;

public interface Container<T> extends Iterable<T> {
    boolean isEmpty();
    int size();
    void add(T item);
}
