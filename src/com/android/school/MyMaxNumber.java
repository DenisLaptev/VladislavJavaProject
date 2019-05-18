package com.android.school;

public class MyMaxNumber {

    public static void main(String[] args) {

        int[] numbers = new int[]{3, 1, 6, 9, 2, 8, 4, 5, 0, 7};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max=" + max);
    }

}
