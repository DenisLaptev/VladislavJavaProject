package com.android.school.oop.task11.new_year_present.model;

public class Caramel extends Sweet{

    public Caramel(double weight, double massOfSugar) {
        super(weight, massOfSugar);
    }

    @Override
    public String toString() {
        return "Caramel{" +
                "weight=" + weight +
                ", massOfSugar=" + massOfSugar +
                '}';
    }
}
