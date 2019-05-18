package com.android.school.oop.static_example;

public class Main {

    public static void main(String[] args) {
        MyClass object1 = new MyClass();
        MyClass object2 = new MyClass();
        MyClass object3 = new MyClass();

        object1.myMethod();
        object2.myMethod();
        object3.myMethod();

        MyClass.myStaticMethod();
        System.out.println(Math.cos(Math.PI));
    }
}
