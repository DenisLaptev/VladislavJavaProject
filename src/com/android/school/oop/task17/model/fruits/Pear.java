package com.android.school.oop.task17.model.fruits;

import com.android.school.oop.task17.model.Fruit;

public class Pear extends Fruit {

    public Pear(double weight, String color, boolean isRipe, String state, boolean isPeeled) {
        super(weight, color, isRipe, state, isPeeled);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isRipe=" + isRipe() +
                ", state='" + getState() + '\'' +
                ", isPeeled=" + isPeeled() +
                '}';
    }
}
