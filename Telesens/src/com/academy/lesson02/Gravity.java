package com.academy.lesson02;
/*5)
        Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая
        вычислила бы ваш вес на Луне.
        - запросить земной вес с консоли
        - вывести ваш вес на Земле
        - вывести ваш вес на Луне */

import java.util.Scanner;
public class Gravity {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите ваш земной вес в кг: ");
        Scanner scanner = new Scanner(System.in);
        double earth = scanner.nextDouble();
        System.out.println("Ваш земной вес составляет " + earth + " кг");
        System.out.println("Ваш вес на Луне составит " + earth*17/100 + " кг");


    }
}
