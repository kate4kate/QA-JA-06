package com.telesens.academy.lesson04;

public class MainSomeNumber {

    public static void main(String[] args) {
        //создаем объект с именем someNumber используя передачу параметра '5' в конструктор
        SomeNumber someNumber = new SomeNumber(5);

//устанавливаю значение для переменной n с помощью метода-сеттера
        someNumber.setN(-18);
        // вывожу установленное в сеттере значение на экран с помощью метода-геттера
        System.out.println(someNumber.getN());

//вызываю метод принт, который выведет текст на экран
        someNumber.print(someNumber.getN());

        // вызываю метод isPositive с помощью которого проверяю передаваемое число на положительное.отрицательное значение
        System.out.println(someNumber.isPositive(someNumber.getN()));

    }

}