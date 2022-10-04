package com.java.collection.framework.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    /**
     * Set Interface represents the un-ordered list of unique elements
     * Set can't contains the duplicate elements and Set are like maths set
     */

    /**
     * Why Set Interface does not guarantee the insertion order of the elements?// here sorting is of no concern
     * Answer:
     * As Internally HashSet which is an implementation of the Set Interface
     * uses HashMap as a Data Store facility and due to Map Interface values will be store as Key,Value pair
     * Here Looking at internal Implementation in HashSet
     * They Store the values like this let's say you added the value to set as follows:
     * Set<String> set = new HashSet<String>();
     * set.add("Sunil");
     * then internally they add this value as in HashMap
     * new HashMap<String>().put("Sunil"==e, PRESENT);
     * here "Sunil"== e, means that they make a map of your values provided in the set
     * as a Key and Value is fixed object as PRESENT
     * and that's why Key hashcode is not fixed, and it can be generated to have any index
     * and that's why Set Interface does not guarantee of the Element order.
     */
    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(3);
        intSet.add(2);
        intSet.add(4);
        intSet.add(5);
        intSet.add(5);

        System.out.println(intSet);

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Sunil");
        stringSet.add("Santosh");
        stringSet.add("Chormale");
        stringSet.add("A");

        System.out.println(stringSet);

        Set<String> set = new HashSet<>();

        boolean added = set.add("Hello"); //true
        boolean added1 = set.add("Hello"); //false as Hello us already present

        //We have created the set using Collection object which is again a set
        Set<String> set2 = new HashSet<>(set);

        System.out.println(set2);
    }
}
