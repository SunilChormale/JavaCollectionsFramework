package com.java.collection.framework.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    /**
     * 1.SortedSet is Child Interface of Set Interface
     *
     * 2.If you want to represent the  group of individual objects
     *  according to some sorting order (here sorting order is not an insertion order its simple a natural sorting order)
     *  and don't want any duplicate in it then one can use SortedSet Interface
     */

    /**
     * SortedSet Specific Methods
     * first() --> returns the first element in the Set
     * last() --> returns the last element in the Set
     * headSet(Object o) --> return the elements are strictly less than o (ele < o)
     * tailSet(Object o) --> return the elements are greater than or equal to o (ele >= o)
     * subSet(Object a, Object b) --> returns the elements are less than b (ele < b) and greater than or equal to a (ele >= a)
     * comparator() --> returns the comparator object that describes the underlying sorting technique (for default is null)
     */
    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<>();
    }
}
