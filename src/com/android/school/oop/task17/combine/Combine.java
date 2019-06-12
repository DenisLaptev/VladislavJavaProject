package com.android.school.oop.task17.combine;

import com.android.school.oop.task17.combine.intefaces_functions.Cutter;
import com.android.school.oop.task17.combine.intefaces_functions.Peeller;
import com.android.school.oop.task17.combine.intefaces_functions.Slicer;
import com.android.school.oop.task17.model.Plant;

import java.util.List;

public class Combine implements Cutter, Peeller, Slicer {

    public final int percentLost = 2;//-2%


    @Override
    public double cut(Plant plant) {
        double oldWeight;
        double newWeight;

        if(plant.isPeeled()){
            oldWeight = plant.getWeight();
            newWeight = oldWeight - oldWeight * percentLost / 100;
        }else{
            throw new IllegalArgumentException();
        }
        return newWeight;
    }

    @Override
    public double cutAll(List<Plant> plantsList) {
        double totalWeight = 0.0;

        for (Plant plant : plantsList) {
            totalWeight+=cut(plant);
        }
        return totalWeight;
    }

    @Override
    public boolean peellItem(Plant plant) {

        boolean result = false;

        if(plant.isPeeled()){
            System.out.println("Plant is already peeled");
        }else{
            plant.peel();
            result = true;
        }
        return result;
    }

    @Override
    public void peellItems(List<Plant> plants) {

        for (Plant plant : plants) {
            plant.peel();
        }
    }

    @Override
    public double slice(Plant plant) {
        double oldWeight;
        double newWeight;

        if(plant.isPeeled()){
            oldWeight = plant.getWeight();
            newWeight = oldWeight - oldWeight * percentLost / 100;
        }else{
            throw new IllegalArgumentException();
        }
        return newWeight;
    }

    @Override
    public double sliceAll(List<Plant> plantsList) {
        double totalWeight = 0.0;

        for (Plant plant : plantsList) {
            totalWeight+=slice(plant);
        }
        return totalWeight;
    }
}
