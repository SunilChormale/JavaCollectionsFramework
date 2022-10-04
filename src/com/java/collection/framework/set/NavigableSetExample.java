package com.java.collection.framework.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

    /**
     * NavigableSet is the child of the SortedSet Interface
     *
     * It defines the method for navigation purposes
     *
     */

    /**
     * Method are defined by NavigableSet are:
     * lower(Object o) --> returns the greatest element from the given set strictly less than o (ele < o)
     * floor(Object o) --> returns the greatest element from the given set less than or equal to o (ele <= o)
     * higher(Object o) --> returns the smallest element from the given set strictly greater than o (ele > 0)
     * ceiling(Object o) --> returns the smallest element from the given set greater than or equal to 0 (ele >= 0)
     * pollFirst() --> removes the first and return it
     * pollLast() --> removes the last and return it
     * descendingSet() --> returns the NavigableSet in reverse order
     */
    public static void main(String[] args) {

        NavigableSet<String> navigableSet = new TreeSet<>();
    }
}
