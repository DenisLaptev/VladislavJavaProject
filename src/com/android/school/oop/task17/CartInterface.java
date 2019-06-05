package com.android.school.oop.task17;

import com.android.school.oop.task17.model.Fruit;
import com.android.school.oop.task17.model.Plant;
import com.android.school.oop.task17.model.Vegetable;

import java.util.List;

public interface CartInterface {

    void put(Plant plant);

    void put(List<Plant> plantsList);

    void put(Cart cart);

    Plant extract(int plantIndex);

    List<Plant> extractAll();

    List<Fruit> extractAllFruits();

    List<Vegetable> extractAllVegetables();

    double getWeight();
}
