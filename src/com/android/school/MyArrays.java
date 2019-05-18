package com.android.school;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

        int[] array1;
        array1 = new int[5];
        array1[0] = 100;
        array1[1] = 500;
        array1[2] = -10;
        array1[3] = 70;
        array1[4] = 100;

        int[] array2 = new int[3];
        array2[0] = 0;
        array2[1] = 10;
        array2[2] = 20;

        //Arrays.sort(array2);

        int[] array3 = new int[]{23, 45, 65, -9, 1304};

        Car[] cars = new Car[10];

        System.out.println("array1[2]=" + array1[2]);

        System.out.println("-------------------");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("-------------------");

        for (int i = 0; i < array2.length; i++) {
            if(array2[i]>0) {
                System.out.println(array2[i]);
            }
        }

        System.out.println("-------------------");

        System.out.println(array2);

        System.out.println("-------------------");

        System.out.println(Arrays.toString(array2));

        System.out.println("-------------------");


        String[][] twoDimensionalArray = new String[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDimensionalArray[i][j] = "@";
                System.out.print(twoDimensionalArray[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("-------------------");

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = "@";
                System.out.print(twoDimensionalArray[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("-------------------");



        String[][] twoDimensionalArray2= new String[10][];
        for (int i = 0; i < twoDimensionalArray2.length; i++) {
            twoDimensionalArray2 = new String[10][i];
            for (int j = 0; j < twoDimensionalArray2[i].length; j++) {
                twoDimensionalArray2[i][j] = "@";
                System.out.print(twoDimensionalArray2[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("-------------------");

    }
}

class Car {
    private int color;
    private float price;
    private Motor motor;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}

class Motor{
    int year;
    String model;
}

