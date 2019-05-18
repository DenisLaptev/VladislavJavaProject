package com.android.school.taskString;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        String word = "programming";

        char[] allLetters = word.toCharArray();

        String uniqueLetters = "";

        for (int i = 0; i < allLetters.length; i++) {
            if (!uniqueLetters.contains(String.valueOf(allLetters[i]))) {
                uniqueLetters += String.valueOf(allLetters[i]);
            }
        }

        System.out.println(Arrays.toString(allLetters));
        System.out.println(uniqueLetters);
        System.out.println("Word: " + word +
                " consists of " + uniqueLetters.length() +
                " unique symbols");
    }
}
