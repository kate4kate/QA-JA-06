package com.academy.lesson02;
import java.util.Scanner;
/*В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
	Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
	21 / 8 = 2 и 5 в остатке
		- прочитать число q c консоли
		- прочитать число w c консоли
		- вывести число q
		- вывести число w
		- вывести результат целочисленного деления
		- вывести остаток от деления
			Пример:
			q = 21;
			w = 8;
			q/w = 2;
			r = 5 (остаток)*/
public class Module {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число здесь: ");
        int q = scanner.nextInt();
        System.out.println("Введите второе число здесь: ");
        int w = scanner.nextInt();
        int x = q/w;
        int z = q%w;

        System.out.println("Вы ввели число " + q);
        System.out.println("Вы ввели число " + w);
        System.out.println("Результат целочисленного деления ваших чисел: " + x);
        System.out.println("Остаток от деления ваших чисел: " + z);


    }
}
