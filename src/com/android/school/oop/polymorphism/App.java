package com.android.school.oop.polymorphism;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] myIntegers = new int[5];
        myIntegers[0] = 23;
        myIntegers[1] = 9;
        myIntegers[2] = -923;
        myIntegers[3] = 3;
        myIntegers[4] = 23;

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println(myIntegers[i]);
        }

        System.out.println("---------------------------");

        Transport[] myTransport = new Transport[5];
        myTransport[0] = new Car();
        myTransport[1] = new Car();
        myTransport[2] = new Plane();
        myTransport[3] = new Car();
        myTransport[4] = new Car();

        for (int i = 0; i < myTransport.length; i++) {
            System.out.println(myTransport[i]);
        }

        System.out.println("---------------------------");

        for (int i = 0; i < myTransport.length; i++) {
            myTransport[i].move();
        }

        //myTransport[1].deliverPassenger(); набор методов берём из родительского класса.

        Car myCar = new Car();
        myCar.move();
        myCar.deliverPassenger();

    }
}
