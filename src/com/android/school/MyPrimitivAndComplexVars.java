package com.android.school;

public class MyPrimitivAndComplexVars {
    public static void main(String[] args) {

        int myInt =10;
        Animal myAnimal = new Animal("Cat", 1);

        System.out.println("Before Loop");

        System.out.println("myInt="+myInt);
        System.out.println("myAnimal="+myAnimal);

        System.out.println("---------------------------------");

        for (int i = 0; i < 5; i++) {
            int newInt = myInt;
            Animal newAnimal = myAnimal;

            newInt = -100;
            newAnimal.setAge(10);
        }

        System.out.println("After Loop");

        System.out.println("myInt="+myInt);
        System.out.println("myAnimal="+myAnimal);
    }


}

class Animal {
    String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
