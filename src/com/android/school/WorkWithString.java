package com.android.school;

public class WorkWithString {

    public static void main(String[] args) {
       String s1 = "abc";
       String s2 = "abc";
       String s3 = s1;
       String s4 = new String("abc");

       String s5 = new String("def");
       String s6 = new String("def");


        System.out.println("s1==s2:"+ (s1==s2));//true
        System.out.println("s1.equals(s2):"+ s1.equals(s2));//true

        System.out.println("s1==s3:"+ (s1==s3));//true
        System.out.println("s1.equals(s3):"+ s1.equals(s3));//true

        System.out.println("s1==s4:"+ (s1==s4));//false
        System.out.println("s1.equals(s4):"+ s1.equals(s4));//true

        System.out.println("s5==s6:"+ (s5==s6));//false
        System.out.println("s5.equals(s6):"+ s5.equals(s6));//true



        String string1 = "one";
        System.out.println(string1 + "two");
        System.out.println(string1.concat("two"));

        StringBuilder sb = new StringBuilder("newText");
        System.out.println(sb.append("secondPart"));

        StringBuffer sbuf = new StringBuffer("otherText");


        String initialString = "0";
        for (int i = 0; i < 1000000; i++) {
            initialString.concat(String.valueOf(i));
        }



        String initialString2 = "0";
        StringBuilder stringBuilder = new StringBuilder(initialString2);
        for (int i = 0; i < 1000000; i++) {
            //initialString.concat(String.valueOf(i));
            stringBuilder.append(i);
        }
        initialString2 = String.valueOf(stringBuilder);


        String[] strArray1;
        String array2[];










    }
}
