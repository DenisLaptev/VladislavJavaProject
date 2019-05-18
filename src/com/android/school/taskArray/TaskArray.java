package com.android.school.taskArray;

import com.android.school.taskString.Task2;

public class TaskArray  {

    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("0" + "\t");
            }
            System.out.print("\n");//переход на новую строку.
        }
    }
}
