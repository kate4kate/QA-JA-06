package com.academy.lesson02;

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int sum = n1+n2+n3;
        System.out.println("Сумма чисел "+n1 + ", " +n2 + ", "+n3 + " = " + sum);


    }
}
