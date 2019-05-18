package com.android.school.oop.oop_example;

public class Car extends Transport {

    private double speed;
    private String color;


    //перегруженные конструкторы.
    public Car() {
    }

    public Car(double speed) {
        this.speed = speed;
    }

    public Car(double speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //переопределение метода.
    //Класс Car наследуется от класса Transport и наследует его метод makeSignal().
    //При этом он его переопределяет, т.е. меняет реализацию этого метода на свою.
    @Override
    public void makeSignal() {
        System.out.println("bi-biiii!");
    }

    //происходит перегрузка метода.
    //В одном и том же классе Car у нас есть несколько методов makeSignal,
    //которые отличаются типом и количеством входных параметров.
    public void makeSignal(String signal) {
        System.out.println("My signal:" + signal);
    }

    public void makeSignal(String signal1, String signal2) {
        System.out.println("My signal:" + signal1 + signal2);
    }

    public void makeSignal(String signal1, String signal2, float myFloat) {
        System.out.println("My signal:" + signal1 + signal2);
        System.out.println(myFloat * 2);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
