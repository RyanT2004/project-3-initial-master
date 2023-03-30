package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<a> implements Container<a> {

    protected List<a> Containers;
    public Bag() {this.Containers = new ArrayList<>();}


    public void forEach(Consumer<? super a> action){
        this.Containers.forEach(action);
    }

    public Spliterator spliterator(){
        return this.Containers.spliterator();
    }

    @Override
    public boolean isEmpty() {
        return this.Containers.isEmpty();
    }

    @Override
    public int size() {
        return this.Containers.size();
    }
    @Override
    public void add(a item) { this.Containers.add(item);
    }

    @Override
    public Iterator iterator() {
        return this.Containers.iterator();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bag{");
        sb.append("Containers=").append(Containers);
        sb.append('}');
        return sb.toString();
    }
}
