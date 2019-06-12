package com.android.school.oop.task17.model.fruits;

import com.android.school.oop.task17.model.Fruit;

public class Banana extends Fruit {

    public Banana(double weight, String color, boolean isRipe, String state, boolean isPeeled) {
        super(weight, color, isRipe, state, isPeeled);
    }

    @Override
    public String toString() {
        return "Banana{" +
                "weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isRipe=" + isRipe() +
                ", state='" + getState() + '\'' +
                ", isPeeled=" + isPeeled() +
                '}';
    }
}
