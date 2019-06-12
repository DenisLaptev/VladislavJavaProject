package com.android.school.oop.task17.combine.intefaces_functions;

import com.android.school.oop.task17.model.Plant;

import java.util.List;

public interface Slicer {

    double slice(Plant plant);

    double sliceAll(List<Plant> plantsList);
}
