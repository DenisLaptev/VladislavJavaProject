package com.android.school.oop.task17.model.vegetables;

import com.android.school.oop.task17.model.Vegetable;

public class Celery extends Vegetable {

    public Celery(double weight, String color, boolean isRipe, String state, boolean isPeeled) {
        super(weight, color, isRipe, state, isPeeled);
    }

    @Override
    public String toString() {
        return "Celery{" +
                "weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isRipe=" + isRipe() +
                ", state='" + getState() + '\'' +
                ", isPeeled=" + isPeeled() +
                '}';
    }
}
