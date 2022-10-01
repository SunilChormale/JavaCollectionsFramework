package com.java.collection.framework.iterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        //First Way
        /**
         * Here we can instead of iterable we can use list directly
         */
        //Internally it will do this
        Collection<String> collection = list;
        Iterable<String> iterable = collection;
        for(String ele : iterable){
            System.out.println(ele);
        }

        for(String ele : list){
            System.out.println(ele);
        }

        //Second Way
        Iterator<String> iterator = iterable.iterator();// or list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Third Way
        iterable.forEach((element) -> {
            System.out.println(element);
        });
        //or
        list.forEach((element) -> {
            System.out.println(element);
        });

        //Iterable Implementation Example

        IterableImpl iterableImpl = new IterableImpl();

        iterableImpl.setList("Sunil");
        iterableImpl.setList("Santosh");
        iterableImpl.setList("Chormale");

        for(String str: iterableImpl){
            System.out.println(str);
        }

        iterableImpl.forEach((str)->{
            System.out.println(str);
        });

        Iterator<String> iterator1 = iterableImpl.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}


/*
-extends -- implements

Iterable
    -Collection
        -List
            --ArrayList

IterableImpl is the custom implementation of the Iterable Interface
 */