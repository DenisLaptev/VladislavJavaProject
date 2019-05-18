package com.android.school.oop.task11.new_year_present.model;

import java.util.Comparator;

public abstract class Sweet {
    double weight;
    double massOfSugar;

    public Sweet(double weight, double massOfSugar) {
        this.weight = weight;
        this.massOfSugar = massOfSugar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMassOfSugar() {
        return massOfSugar;
    }

    public void setMassOfSugar(double massOfSugar) {
        this.massOfSugar = massOfSugar;
    }
}


