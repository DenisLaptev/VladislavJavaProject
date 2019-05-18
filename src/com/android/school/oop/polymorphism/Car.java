package com.android.school.oop.polymorphism;

public class Car extends Transport{

    @Override
    public void move(){
        System.out.println("I can drive");
    }


    public void deliverPassenger(){
        System.out.println("Car can deliver passengers");
    }

}
