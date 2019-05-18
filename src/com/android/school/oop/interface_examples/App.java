package com.android.school.oop.interface_examples;

public class App {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.drawSquare();
        myClass.makePhoto("Vasya");
        String str = myClass.playMusic("Luis Armstrong", "\"Wonderful World!\"");
        System.out.println(str);

        MyClass m1 = new MyClass();
        Parent m2 = new MyClass();
        MyInterface m3 = new MyClass();
        AnotherInterface m4 = new MyClass();
        //SomeBaseClass m5 = new MyClass();
    }
}
