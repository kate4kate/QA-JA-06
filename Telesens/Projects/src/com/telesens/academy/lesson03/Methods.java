package com.telesens.academy.lesson03;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
       int number =  inputNumberDialog ();
       String strNumber = convertNumberToString(number);
       printReport(strNumber);
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");
        int num = scanner.nextInt();
        String [] array = {"Zero", "One", "Two","Three", "For","Five","Six","Seven", "Eight", "Nine","Ten"};
        if (num>=0&&num<array.length)
            System.out.println("item in array - " + array[num]);
        else
            System.out.println("Wrong number");*/
       }

    private static void printReport(String strNumber) {
        System.out.println(strNumber);
    }

    private static String convertNumberToString(int num) {
        String [] array = {"Zero", "One", "Two","Three", "For","Five","Six","Seven", "Eight", "Nine","Ten"};
        if (num>=0&&num<array.length)
            return array[num];
        else
            return "Wrong number";
           }

    private static int inputNumberDialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");
        int num = scanner.nextInt();
        return num;
        }

    }
