package com.android.school.oop.task11.new_year_present;

import com.android.school.oop.task11.new_year_present.model.*;
import com.android.school.oop.task11.new_year_present.utils.ComparatorByWeight;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

import static com.android.school.oop.task11.new_year_present.utils.MyRandom.rnd;


public class Application {

    public static final int NUMBER_OF_SWEETS = 10;
    public static final int MIN_SUGAR = 0;
    public static final int MAX_SUGAR = 200;


    public static void main(String[] args) {
        Sweet[] sweetsArr = new Sweet[NUMBER_OF_SWEETS];
        sweetsArr = generateSweetsArray();

        System.out.println("Before sorting");
        printSweetsArray(sweetsArr);

        double resultWeight = calculateResultWeight(sweetsArr);
        System.out.println("resultWeight=" + resultWeight);

        sortSweetsByWeight(sweetsArr);

        System.out.println("After sorting");
        printSweetsArray(sweetsArr);

        System.out.println("Sweets with sugar in diapason: [" + MIN_SUGAR + ", " + MAX_SUGAR + "]");
        printSweetsWithMinMaxSugar(sweetsArr, MIN_SUGAR, MAX_SUGAR);

    }

    private static void printSweetsWithMinMaxSugar(Sweet[] sweetsArr, int minSugar, int maxSugar) {
        for (int i = 0; i < sweetsArr.length; i++) {
            if (sweetsArr[i].getMassOfSugar() > minSugar &&
                    sweetsArr[i].getMassOfSugar() < maxSugar) {
                System.out.println(sweetsArr[i]);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static void sortSweetsByWeight(Sweet[] sweetsArr) {
        Arrays.sort(sweetsArr, new ComparatorByWeight());
    }

    private static double calculateResultWeight(Sweet[] sweetsArr) {
        double resultWeight = 0;
        for (int i = 0; i < sweetsArr.length; i++) {
            resultWeight += sweetsArr[i].getWeight();
        }
        return resultWeight;
    }

    private static void printSweetsArray(Sweet[] sweetsArr) {
        for (int i = 0; i < sweetsArr.length; i++) {
            System.out.println(sweetsArr[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static Sweet[] generateSweetsArray() {
        Sweet[] sweetsArr = new Sweet[NUMBER_OF_SWEETS];

        sweetsArr[0] = new Caramel(rnd(100), rnd(1000));
        sweetsArr[1] = new Mars(rnd(100), rnd(1000));
        sweetsArr[2] = new Snikers(rnd(100), rnd(1000));
        sweetsArr[3] = new Rafaello(rnd(100), rnd(1000));
        sweetsArr[4] = new Caramel(rnd(100), rnd(1000));
        sweetsArr[5] = new Caramel(rnd(100), rnd(1000));
        sweetsArr[6] = new ChocolateSweet(rnd(100), rnd(1000));
        sweetsArr[7] = new Caramel(rnd(100), rnd(1000));
        sweetsArr[8] = new Mars(rnd(100), rnd(1000));
        sweetsArr[9] = new Caramel(rnd(100), rnd(1000));

        return sweetsArr;
    }
}
