package com.android.school.oop.polymorphism;

public class Ship extends Transport{

    @Override
    public void move(){
        System.out.println("I can swim");
    }
}
