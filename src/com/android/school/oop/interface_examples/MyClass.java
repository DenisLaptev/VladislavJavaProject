package com.android.school.oop.interface_examples;

public class MyClass extends Parent implements ChildInterface{//implements MyInterface, AnotherInterface {
    @Override
    public void drawSquare() {
        System.out.println("I can draw a Square!");
    }

    @Override
    public void makePhoto(String name) {
        System.out.println("I make a picture of " + name);
    }

    @Override
    public String playMusic(String singer, String song) {
        String result = "";
        result = "I play song " + song + " of singer " + singer;
        return result;
    }

    @Override
    public void someMethod() {

    }
    /*
     * Класс должен
     * 1) Рисовать квадрат
     * 2) Делать фото
     * 3) Играть музыку
     *
     *
     * */
}
