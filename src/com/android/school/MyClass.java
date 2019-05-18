package com.android.school;

public class MyClass {
    MySecondClass msc = new MySecondClass();
    int i = 5;

    public static void main(String[] args) {
        int целоеЧисло = 4;
        final double PI = 3.14;
        //PI=3;
        System.out.println(PI);
        System.out.println(PI * 2);

        int mySum = sum(2, 3);
        System.out.println(mySum);

        myMethod(23);


        int myInt = 2000;
        int myInt2 = 1000;
        //int res = myInt*myInt2;
        long res = myInt*myInt2;
        System.out.println(res);

        byte b;
        short s = 1000;
        b = (byte)s;
        System.out.println(b);

        byte b1 = 100;
        short s1;
        s1 = b1;
        System.out.println(s1);
        System.err.println(s1);
        System.out.print(s1);
        System.out.printf("Это числа по порядку %2$s и %1$s ", 10, 2000);

    }

    static int sum(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    static int sum2(int a, int b, int c, int d, int e) {
        int result;
        result = a + b;
        return result;
    }



    static void myMethod(int parameter){
        System.out.println("Hello");
    }

    static void myMethod2(){
        System.out.println("Hello World");
    }
}

