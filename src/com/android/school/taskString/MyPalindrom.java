package com.android.school.taskString;

public class MyPalindrom {

    public static void main(String[] args) {
        //String testWord = "Android";
        String testWord = "AAABBBAAA";

        char[] charArr = testWord.toCharArray();
        char[] charArrReverse = generateCharArrayReversed(charArr);

        printArrays(charArr, charArrReverse);

        System.out.println("-------------");

        isPalindrome(charArr,charArrReverse,testWord);

    }

    public static char[] generateCharArrayReversed(char[] charArray){
        char[] charArrReverse = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            charArrReverse[charArrReverse.length - 1 - i] = charArray[i];
        }
        return charArrReverse;
    }

    public static void printArrays(char[] charArr, char[] charArrReverse){
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i] + ":" + charArrReverse[i]);
        }
    }

    public static boolean isPalindrome(char[] charArr, char[] charArrReverse, String testWord){
        boolean isPalindrome = true;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != charArrReverse[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome == true) {
            System.out.println("A word " + testWord + " is Palindrom");
        }else{
            System.out.println("A word " + testWord + " is NOT Palindrom");
        }
        return isPalindrome;
    }

}
