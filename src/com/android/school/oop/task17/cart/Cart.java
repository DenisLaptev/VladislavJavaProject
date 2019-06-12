package com.android.school.oop.task17.cart;

import com.android.school.oop.task17.model.Fruit;
import com.android.school.oop.task17.model.Plant;
import com.android.school.oop.task17.model.Vegetable;

import java.util.ArrayList;
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

/*
    @Override
    public Plant extract(int plantIndex) {
        Iterator<Plant> iterator = this.plants.iterator();
        while(iterator.hasNext()){
            Plant plant = iterator.next();
            if(plant.)
                String s = i.next(); // must be called before you can call i.remove()
                // Do something
                i.remove();

        }
        return null;
    }
*/


    @Override
    public Plant extract(int plantIndex) {
        Plant plant = null;

        if (plantIndex > this.plants.size() - 1 || plantIndex < 0) {
            System.out.println("Error!");
        } else {
            plant = this.plants.get(plantIndex);
            if (plant != null) {
                this.plants.remove(plantIndex);
            }
        }

        return plant;
    }

    @Override
    public List<Plant> extractAll() {
        List<Plant> secondList = this.plants;
        this.plants = null;
        return secondList;
    }

    @Override
    public List<Fruit> extractAllFruits() {

        List<Fruit> fruitsList = new ArrayList<>();

        for (Plant plant : this.plants) {
            if(plant instanceof Fruit){
                fruitsList.add((Fruit) plant);
            }
        }

        this.plants.removeAll(fruitsList);

        return fruitsList;
    }

    @Override
    public List<Vegetable> extractAllVegetables() {
        List<Vegetable> vegetablesList = new ArrayList<>();

        for (Plant plant : this.plants) {
            if(plant instanceof Vegetable){
                vegetablesList.add((Vegetable) plant);
            }
        }

        this.plants.removeAll(vegetablesList);

        return vegetablesList;
    }

    @Override
    public double getWeight() {
        double cartWeight = 0.0;

        for (Plant plant : this.plants) {
            cartWeight += plant.getWeight();
        }

        return cartWeight;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
