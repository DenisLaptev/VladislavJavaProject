package com.android.school.oop.task11.new_year_present.model;

public class Mars extends ChocolateSweet{

    public Mars(double weight, double massOfSugar) {
        super(weight, massOfSugar);
    }

    @Override
    public String toString() {
        return "Mars{" +
                "weight=" + weight +
                ", massOfSugar=" + massOfSugar +
                '}';
    }
}
