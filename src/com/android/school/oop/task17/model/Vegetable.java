package com.android.school.oop.task17.model;

public class Vegetable extends Plant {

    public Vegetable(double weight, String color, boolean isRipe, String state, boolean isPeeled) {
        super(weight, color, isRipe, state, isPeeled);
    }

    @Override
    public double peel() {
        /*
        метод peel уменьшает вес фрукта после чистки на 5%
        */
        double oldWeight;
        double newWeight;

        oldWeight = getWeight();
        if (this.isPeeled() != true) {
            System.out.println("Before isPeeled=" + isPeeled());

            int percentLost = 5;//-5%

            newWeight = oldWeight - oldWeight * percentLost / 100;
            System.out.println("oldWeight=" + oldWeight);
            System.out.println("newWeight=" + newWeight);

            setWeight(newWeight);
            setPeeled(true);
            System.out.println("After isPeeled=" + isPeeled());

        } else {
            newWeight = oldWeight;
        }
        return newWeight;
    }
}
