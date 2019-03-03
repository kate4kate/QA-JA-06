package com.academy.lesson09.Class;

public class StringToIntToObject {
    public static void main(String[] args) {

//создаем массив строк (в каждой ячейке хранится число в виде строки)
        String [] strArr =  new String[]{"1", "5", "22","175"};
// выводим массив строк (просто для проверки)
        System.out.println("выведем массив строк: ");

        for (int i = 0; i<strArr.length;i++) {
            System.out.println(strArr[i]);
        }
// создаем массим чисел и резервируем под него память
        Integer [] intArr = new Integer[4];
// в цикле присваиваем каждому элементу массива чисел значение каждого элемента из массива строк
        System.out.println("выведем массив чисел: ");
        for (int i = 0; i<strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
            // выводим массив чисел(просто для проверки)
            System.out.println(intArr[i]);
        }



        for (int i = 0; i<strArr.length;i++) {
        }

        System.out.println("выведем массив объектов:");
// создаем массим объектов  и резервируем под него память
        Object [] objArr = new Object[4];

        // в цикле присваиваем каждому элементу массива объектов значение каждого элемента из массива чисел
        // для этого не нужно приведение типов, потому что класс Object является родителем класса Integer

        for (int i = 0; i<intArr.length;i++) {
            objArr[i] = intArr[i];
            // выводим массив чисел(просто для проверки)
            System.out.println(objArr[i]);
       }

        System.out.println("выведем массив чисел: ");

       Integer [] intArr2 = new Integer[4];

        for (int i = 0; i<objArr.length; i++) {
            intArr2[i] = (Integer) objArr[i];
        }

        for (int i = 0; i<objArr.length;i++) {
            objArr[i] = objArr[i];

            System.out.println(objArr[i]);
        }
   }


}
