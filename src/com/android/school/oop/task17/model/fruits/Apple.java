package com.android.school.oop.task17.model.fruits;

import com.android.school.oop.task17.model.Fruit;

public class Apple extends Fruit {

    public Apple(double weight, String color, boolean isRipe, String state, boolean isPeeled) {
        super(weight, color, isRipe, state, isPeeled);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isRipe=" + isRipe() +
                ", state='" + getState() + '\'' +
                ", isPeeled=" + isPeeled() +
                '}';
    }
}
