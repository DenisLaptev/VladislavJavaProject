package com.android.school.oop.task11.new_year_present.model;

public class ChocolateSweet extends Sweet{

    public ChocolateSweet(double weight, double massOfSugar) {
        super(weight, massOfSugar);
    }

    @Override
    public String toString() {
        return "ChocolateSweet{" +
                "weight=" + weight +
                ", massOfSugar=" + massOfSugar +
                '}';
    }
}
