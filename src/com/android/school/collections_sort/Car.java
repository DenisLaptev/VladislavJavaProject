package com.android.school.collections_sort;

import java.util.Objects;

public class Car {

    String model;
    int speed;
    int year;

    public Car(String model, int speed, int year) {
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed &&
                year == car.year &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, speed, year);
    }
}
