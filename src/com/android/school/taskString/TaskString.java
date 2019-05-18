package com.android.school.taskString;

import java.util.Arrays;
import java.util.Scanner;

public class TaskString {

    public static void main(String[] args) {

        String textTest = "Художественный стиль – это особый стиль речи, " +
                "который получил широкое распространение как в мировой " +
                "художественной литературе в целом, так и в копирайтинге " +
                "в частности. Он характеризуется высокой эмоциональностью, " +
                "прямой речью, богатством красок, эпитетов и метафор," +
                " а также призван воздействовать на воображение читателя " +
                "и выступает в роли спускового крючка для его фантазии. " +
                "Итак, сегодня мы подробно и на наглядных примерах " +
                "рассматриваем художественный стиль текстов и его применение " +
                "в копирайтинге. Четвёртое предложение nnnnnnnnnnnnnnnnnnnn.";
/*
        //создаём объект Scanner scanner для ввода текста с славиатуры.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст : ");

        //Сохраняем введённый текст в переменную String text
        String text = scanner.nextLine();
*/

        String text = textTest;

        //Разбиваем текст на предложения и записываем их в массив строк String[] sentences
        String[] sentences = text.split("\\. ");

        System.out.println("Введённый текст состоит из " + sentences.length + " предложений");

        int[] numberOfWordsInSentences = new int[sentences.length];

        int maxNumberOfWords = 0;
        int indexOfSentenceWithMaxNumberOfWords = 0;

        int maxNumberOfLetters = 0;
        int indexOfSentenceWithWordWithMaxNumberOfLetters = 0;
        String wordWithMaxNumberOfLetters = "";


        for (int i = 0; i < sentences.length; i++) {

            String[] words = sentences[i].split(" ");
            int[]numberOfLettersInWord = new int[words.length];
            numberOfWordsInSentences[i] = words.length;

            for (int i1 = 0; i1 < words.length; i1++) {
                if (words[i1].charAt(words[i1].length() - 1) == ','
                        ||words[i1].charAt(words[i1].length() - 1) == '.') {
                    words[i1] = words[i1].substring(0, words[i1].length() - 1);
                }
            }

            for (int i1 = 0; i1 < words.length; i1++) {
                numberOfLettersInWord[i1] = words[i1].length();

                if(numberOfLettersInWord[i1] > maxNumberOfLetters){
                    maxNumberOfLetters = numberOfLettersInWord[i1];
                    indexOfSentenceWithWordWithMaxNumberOfLetters = i;
                    wordWithMaxNumberOfLetters = words[i1];
                }
            }


            if(words.length > maxNumberOfWords){
                maxNumberOfWords = words.length;
                indexOfSentenceWithMaxNumberOfWords = i;
            }


        }

        for (int i = 0; i < sentences.length; i++) {
            System.out.println("Sentence №" + i + " has " + numberOfWordsInSentences[i] + " words");
        }

        System.out.println("maxNumberOfWords =" + maxNumberOfWords);
        System.out.println("indexOfSentenceWithMaxNumberOfWords =" + indexOfSentenceWithMaxNumberOfWords);

        System.out.println("wordWithMaxNumberOfLetters =" + wordWithMaxNumberOfLetters);
        System.out.println("maxNumberOfLetters =" + maxNumberOfLetters);
        System.out.println("indexOfSentenceWithWordWithMaxNumberOfLetters =" + indexOfSentenceWithWordWithMaxNumberOfLetters);
    }
}


