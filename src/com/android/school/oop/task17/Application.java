package com.android.school.oop.task17;

import com.android.school.oop.task17.cart.Cart;
import com.android.school.oop.task17.combine.Combine;
import com.android.school.oop.task17.model.Plant;
import com.android.school.oop.task17.model.fruits.Apple;
import com.android.school.oop.task17.model.fruits.Banana;
import com.android.school.oop.task17.model.fruits.Orange;
import com.android.school.oop.task17.model.fruits.Pear;
import com.android.school.oop.task17.model.vegetables.Carrot;
import com.android.school.oop.task17.model.vegetables.Celery;
import com.android.school.oop.task17.model.vegetables.Onion;
import com.android.school.oop.task17.model.vegetables.Potato;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Cart cart = new Cart();

        List<Plant> plantsList = generatePlantsList();

        double cartWeight = 0.0;
        System.out.println("Cart weight = " + cartWeight);
        System.out.println("--------Begin to add plants---------");

        for (int i = 0; i < plantsList.size(); i++) {
            cart.put(plantsList.get(i));
            cartWeight = cart.getWeight();
            System.out.println("Iteration " + i + "--->Cart weight = " + cartWeight);
        }

        Combine combine = new Combine();

        System.out.println("-----------Plants in the Cart----------");
        List<Plant> plantsInTheCart = cart.getPlants();
        System.out.println(plantsInTheCart);


        System.out.println("-----------Combine peels plants from Cart----------");
        for (Plant plant : plantsInTheCart) {
            combine.peellItem(plant);
        }

        System.out.println("-----------Combine peels plants from Cart again----------");
        for (Plant plant : plantsInTheCart) {
            combine.peellItem(plant);
        }

        System.out.println("Cart weight after peel= " + cart.getWeight());


    }

    public static List<Plant> generatePlantsList() {
        List<Plant> plantsList = new ArrayList();

        Plant plant1 = new Apple(10, "red", true, "good", false);
        Plant plant2 = new Banana(20, "yellow", true, "good", false);
        Plant plant3 = new Orange(15, "orange", false, "bad", false);
        Plant plant4 = new Pear(10, "red", true, "good", true);
        Plant plant5 = new Carrot(5, "orange", true, "good", false);
        Plant plant6 = new Celery(10, "green", false, "bad", false);
        Plant plant7 = new Onion(7, "green", true, "good", false);
        Plant plant8 = new Potato(6, "yellow", true, "good", true);
        Plant plant9 = new Apple(10, "green", true, "good", true);
        Plant plant10 = new Apple(12, "yellow", true, "bad", false);
        Plant plant11 = new Apple(9, "red", true, "good", false);

        plantsList.add(plant1);
        plantsList.add(plant2);
        plantsList.add(plant3);
        plantsList.add(plant4);
        plantsList.add(plant5);
        plantsList.add(plant6);
        plantsList.add(plant7);
        plantsList.add(plant8);
        plantsList.add(plant9);
        plantsList.add(plant10);
        plantsList.add(plant11);

        return plantsList;
    }
}
