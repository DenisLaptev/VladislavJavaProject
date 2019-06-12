package com.android.school.oop.task17.combine.intefaces_functions;

import com.android.school.oop.task17.model.Plant;

import java.util.List;

public interface Cutter {

    double cut(Plant plant);

    double cutAll(List<Plant> plantsList);
}
