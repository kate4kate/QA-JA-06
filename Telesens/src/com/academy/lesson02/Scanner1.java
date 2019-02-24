package com.academy.lesson02;
import java.util.Scanner; //импорт сканнера
 public class Scanner1 {
    public static void main(String[] args) {
        System.out.println("> Введите Возраст: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Возраст: " + age);

    }
}