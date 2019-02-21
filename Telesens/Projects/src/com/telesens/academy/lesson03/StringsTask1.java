package com.telesens.academy.lesson03;

    /* 1) Напишите программу, которая:
     - считывает строку
     - выводит исходную строку
     - выводит количество и список слов, которые начинаются на букву 'd'*/

import java.util.Scanner;
public class StringsTask1 {
    public static void main(String[] args){
    String readLine = inputText(); //вводим строку
    PrintReport (readLine); // печатаем строку
    splitWords (readLine);
  //  calculateWords(words);

    }

        private static String inputText() {
            System.out.println("Напишите любое выражение и нажимите \"Enter\" ");
            Scanner scanner = new Scanner(System.in);
            String readLine = scanner.nextLine();
            return readLine;
        }

    private static void PrintReport(String readLine){
        System.out.println(readLine);
            }

    private static String[] splitWords(String readLine){
   String  [] words =  readLine.split(" ");
   for (int i =0; i<words.length;i++){
   System.out.println(words[i]);}
        return words;
    }
    private static void  calculateWords (String[] words){
for (int i=0;i<words.length;i++){

    //не дописала код(((
}

    }
}

