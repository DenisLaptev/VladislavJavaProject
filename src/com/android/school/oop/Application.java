package com.android.school.oop;

public class Application {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0]= new Bird();
        animals[1]= new Dog();
        animals[2]= new Fish();
        animals[3]= new Bird();
        animals[4]= new SomeAnimal();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
    }
}
