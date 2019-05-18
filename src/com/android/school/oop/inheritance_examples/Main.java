package com.android.school.oop.inheritance_examples;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        parent.doSomething();
        child1.doSomething();
        child2.doSomething();
    }
}
