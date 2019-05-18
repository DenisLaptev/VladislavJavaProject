package com.android.school.oop.oop_task_3;

public class MyClass {

    public static void main(String[] args) {
        Book book = new Book("my title", "Steve Jobs", 2000, "white");
        System.out.println("Hello world!");
        System.out.println(1000);
        System.out.println(book);
        System.out.println(book.color);
        book.giveKnowledge();
        System.out.println(book.author);
        book.author = "New Author";
        System.out.println(book.author);

    }
}
