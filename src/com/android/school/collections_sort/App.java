package com.android.school.collections_sort;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();
        Car car1 = new Car("Mercedes", 200, 2000);
        Car car2 = new Car("BMW", 210, 2001);
        Car car3 = new Car("Ford", 130, 1980);
        Car car4 = new Car("Opel", 150, 1970);
        Car car5 = new Car("Chevrolet", 250, 1970);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);

        for (int i = 0; i < carsList.size(); i++) {
            System.out.println(carsList.get(i));
        }


    }
}
