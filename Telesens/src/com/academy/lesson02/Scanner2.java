package com.academy.lesson02;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        System.out.println("Моя первая программа!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер: ");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(String.format("%." + i + "s", "********"));
            //System.out.println(String.format("%03d" ,12).replace(target: "0")+ i + "d", "*
        }
    }
}