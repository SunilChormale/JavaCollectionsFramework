package com.java.collection.framework.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableImpl implements Iterable<String>{

    private List<String> list = new ArrayList<>();

    public void setList(String data){
        this.list.add(data);
    }
    @Override
    public Iterator<String> iterator() {
        return this.list.iterator();
    }
}
