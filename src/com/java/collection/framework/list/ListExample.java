package com.java.collection.framework.list;

import java.util.*;

public class ListExample {

    /**
     * List Interface represents the ordered list of Object
     * List can have duplicate element
     * List element can be access through indexes
     */

    /**
     * List Interface is implemented by
     * 1.ArrayList
     * 2.LinkedList
     * 3.Vector <-- Stack
     */

    /**
     * ArrayList and Vector are the same except all the method in vector are synchronised
     * vector is useful when we have multithreaded application
     */

    public static void main(String[] args) {

        //ARRAYLIST
        /**
         * ArrayList is not memory efficient as
         * once we reach the max capacity we have to create a new list with size greater than the original one
         * and copy all the element from the original list to the newly created list which is a time-consuming
         * also if all the places are not filled then some places remains empty thus acquiring space.
         */
        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        int data = (int) list.get(0); // This line is buggy as List is raw type if we add string in 0 index then this will fail
        System.out.println(data);

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        int data1 = list1.get(0);//now this is safe as always int is coming from the List
        System.out.println(data1);
        //This is Generic List with List type as Integer
        //This applies for all the Implementation

        //VECTOR
        List<String> vector = new Vector<>();

        vector.add("Sunil");

        String vData = vector.get(0);
        System.out.println(vData);

        //STACK
        /**
         * Stack extends Vector Implements List
         */
        Vector<String> stack = new Stack<>();
        List<String> stack1 = new Stack<>();

        //LINKEDLIST
        /**
         * LinkedList overcome on the issue with ArrayList but again in the LinkedList to access random element
         * we have to visit all its previous element which is not good in terms of Time Complexity
         */
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Sunil");

        String linkedListData =  linkedList.get(0);
        System.out.println(linkedListData);
    }
}
