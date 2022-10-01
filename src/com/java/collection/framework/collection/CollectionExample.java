package com.java.collection.framework.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * COLLECTION INTERFACE IS THE ROOT INTERFACE OF THE COLLECTIONS FRAMEWORK
 */
public class CollectionExample {

    /**
     * 1. When we want to represent a group of individual object as a Single Entity
     * then we can use Collection
     *
     * 2. Collection Interface is generally considered as a root Interface of the
     * Collections Framework
     *
     * 3.Collection Interface defines most common method which are applicable for
     * most of the collection object
     */

    /**
     * Collection Interface is providing very common methods need by any Collection object.
     *
     * List Interface is extending the Collection Interface
     * So List will get all the Collection Interface method but List can define some more
     * method of it need.
     *
     * Now ArrayList is implementing the List interface so ArrayList has to provide the
     * implementation of the all the method which is coming from the Collection and List Interface
     *
     * Note: This two interface won't provide the data storing facility ArrayList has to give Data Store functionality.
     * ArrayList used array of object as a Data Store
     */

    public static void main(String[] args) {

        /**
         * Now here this ArrayList only contains the method provided by Collection Interface
         */
        Collection<String> collection = new ArrayList<>();
        //collection.set(0,"Data") //won't compile as not defined by the Collection Interface

        /**
         * Now here this ArrayList contains the method provided by Collection Interface
         * as well as List Interface
         */
        List<String> list = new ArrayList<>();
        list.set(0,"Data");

    }
}
