package com.android.school.oop.task17.model;

public class Fruit extends Plant {

    @Override
    public double peel() {
        /*
        метод peel уменьшает вес фрукта после чистки на 2%
        */

        System.out.println("Before isPeeled=" + isPeeled());

        int percentLost = 2;//-2%
        double oldWeight = getWeight();
        double newWeight = oldWeight - oldWeight * percentLost / 100;
        System.out.println("oldWeight=" + oldWeight);
        System.out.println("newWeight=" + newWeight);


        setWeight(newWeight);
        setPeeled(true);
        System.out.println("After isPeeled=" + isPeeled());

        return newWeight;
    }
}
