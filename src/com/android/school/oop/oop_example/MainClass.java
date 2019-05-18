package com.android.school.oop.oop_example;

public class MainClass {

    public static void main(String[] args) {
        Car car1 = new Car(100, "red");
        Car car2 = new Car(300, "green");

        System.out.println(car1.getSpeed());
        System.out.println(car1.getColor());
        System.out.println(car2.getSpeed());
        System.out.println(car2.getColor());

        Car car3 = new Car();
        System.out.println(car3.getColor());
        System.out.println(car3.getSpeed());

        Car car4 = new Car(300.0);
        System.out.println(car4.getColor());
        System.out.println(car4.getSpeed());


        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());
        car1.setColor("blue");
        System.out.println(car1.getColor());

        if (car1.getColor().equals("blue")) {
            //if(car1.color.equals("blue")){
            System.out.println("It`s his car");
        } else {
            System.out.println("It`s her car");
        }


        System.out.println("---------------------");

        car1.move();
        car2.move();

        car1.makeSignal();
        car1.makeSignal("Hello");
        car1.makeSignal("Hello", "5");




        System.out.println("---------------------");
        double sum = Mathematics.calculateSum(car1.getSpeed(), car2.getSpeed());
        System.out.println(sum);
    }
}
