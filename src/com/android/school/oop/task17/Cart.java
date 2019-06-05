package com.android.school.oop.task17;

import com.android.school.oop.task17.model.Fruit;
import com.android.school.oop.task17.model.Plant;
import com.android.school.oop.task17.model.Vegetable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart implements CartInterface {

    List<Plant> plants = new ArrayList<>();

    public Cart() {
    }

    public Cart(List<Plant> plants) {
        this.plants = plants;
    }

    @Override
    public void put(Plant plant) {
        this.plants.add(plant);
    }

    @Override
    public void put(List<Plant> plantsList) {
        this.plants.addAll(plantsList);
    }

    @Override
    public void put(Cart cart) {
        this.plants.addAll(cart.plants);
    }

    @Override
    public Plant extract(int plantIndex) {
        Iterator iterator = this.plants.iterator();
        while(iterator.hasNext()){

        }
        return null;
    }

    @Override
    public List<Plant> extractAll() {
        return null;
    }

    @Override
    public List<Fruit> extractAllFruits() {
        return null;
    }

    @Override
    public List<Vegetable> extractAllVegetables() {
        return null;
    }

    @Override
    public double getWeight() {
        return 0;
    }
}
