package com.android.school.collections_examples;

import com.android.school.collections_sort.Car;

import java.util.*;

public class MyMap {


    public static void main(String[] args) {
        Map<String,String> myHashMap = new HashMap<>();
        //Map<String,String> myLinkedHashMap = new LinkedHashMap<>();
        Map<String,String> myTreeMap = new TreeMap<>();

        myHashMap.put("Grate Britain", "London");
        myHashMap.put("France", "Paris");
        myHashMap.put("Ukraine", "Kiev");
        myHashMap.put("Belgium", "Brussels");
        //myHashMap.put("Belgium", "Amsterdam");

        for (Map.Entry<String, String> entry : myHashMap.entrySet()) {
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }
        System.out.println("----------------------------------------");

        myTreeMap.put("Grate Britain", "London");
        myTreeMap.put("France", "Paris");
        myTreeMap.put("Ukraine", "Kiev");
        myTreeMap.put("Belgium", "Brussels");

        for (Map.Entry<String, String> entry : myTreeMap.entrySet()) {
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }

        System.out.println("keySet:");
        System.out.println(myHashMap.keySet());

        System.out.println("values:");
        System.out.println(myHashMap.values());

        System.out.println("entrySet:");
        System.out.println(myHashMap.entrySet());

        System.out.println("----------------------------------------");


        Car car1 = new Car("Mercedes", 200, 2000);
        Car car2 = new Car("BMW", 210, 2001);
        Car car3 = new Car("Ford", 130, 1980);
        Car car4 = new Car("Opel", 150, 1970);
        Car car5 = new Car("Chevrolet", 250, 1970);

        Map<String,Car> myLinkedHashMap = new LinkedHashMap<>();
        myLinkedHashMap.put("Grate Britain", car1);
        myLinkedHashMap.put("France", car2);
        myLinkedHashMap.put("Ukraine", car3);
        myLinkedHashMap.put("Belgium", car3);


        System.out.println("keySet:");
        System.out.println(myLinkedHashMap.keySet());

        System.out.println("values:");
        System.out.println(myLinkedHashMap.values());

        System.out.println("entrySet:");
        System.out.println(myLinkedHashMap.entrySet());

    }
}
