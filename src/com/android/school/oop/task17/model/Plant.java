package com.android.school.oop.task17.model;

public abstract class Plant implements Peelable{

    private double weight;
    private String color;
    private boolean isRipe;
    private String state;
    private boolean isPeeled;


    public Plant() {
    }

    public Plant(double weight, String color, boolean isRipe, String state, boolean isPeeled) {
        this.weight = weight;
        this.color = color;
        this.isRipe = isRipe;
        this.state = state;
        this.isPeeled = isPeeled;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isPeeled() {
        return isPeeled;
    }

    public void setPeeled(boolean peeled) {
        isPeeled = peeled;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", isRipe=" + isRipe +
                ", state='" + state + '\'' +
                ", isPeeled=" + isPeeled +
                '}';
    }
}
