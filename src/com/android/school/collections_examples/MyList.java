package com.android.school.collections_examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {


    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();

        myArrayList.add("World!");
        myArrayList.add("Hello");
        myArrayList.add("Java");
        myArrayList.add("Android");
        myArrayList.add("Python");
        myArrayList.add("WordPress");

        myArrayList.add(4, "Ruby");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("---------------");
        myArrayList.remove("Hello");
        myArrayList.remove(1);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("---------------");


        myArrayList.set(3,"New Word");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("---------------");



    }
}
