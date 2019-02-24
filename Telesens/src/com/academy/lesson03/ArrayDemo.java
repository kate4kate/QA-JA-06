package com.academy.lesson03;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int number = inputNumberDialog();
        String strNumber = convertNumberToString(number);
        printReport(strNumber);
    }

    private static void printReport(String strNumber) {
        System.out.println("=> " + strNumber);
    }

    private static String convertNumberToString(int number) {
        String[] stringArray = {"zero", "one","two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        if (number >= 0 && number < stringArray.length)
            return stringArray[number];
        else
            return "wrong number";
    }

    private static int inputNumberDialog() {
        System.out.print("input number(int): ");
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        return number;
    }
}
