package com.android.school.collections_examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<>();
        Set<String> myLinkedHashSet = new LinkedHashSet<>();
        Set<String> myTreeSet = new TreeSet<>();

        myHashSet.add("Bill");
        myHashSet.add("Andrey");
        myHashSet.add("James");
        myHashSet.add("Nick");
        myHashSet.add("Tom");


        myLinkedHashSet.add("Bill");
        myLinkedHashSet.add("Andrey");
        myLinkedHashSet.add("James");
        myLinkedHashSet.add("Nick");
        myLinkedHashSet.add("Tom");


        myTreeSet.add("Bill");
        myTreeSet.add("Andrey");
        myTreeSet.add("James");
        myTreeSet.add("Nick");
        myTreeSet.add("Tom");


        System.out.println("-----------------------");
        for (String name : myTreeSet) {
            System.out.println(name);
        }
        //HashSet myHashSet = new HashSet();
    }
}
