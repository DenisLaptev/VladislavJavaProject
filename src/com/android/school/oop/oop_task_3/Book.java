package com.android.school.oop.oop_task_3;

public class Book {
    String title;
    String author;
    int year;
    String color;

    public Book(String title, String author, int year, String color) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.color = color;
    }

    public void giveKnowledge() {
        System.out.println("2+2=4");
    }

    @Override
    public String toString() {
        return "Book{" +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}'+ "Hello world!";
    }
}
