package com.telesens.academy.lesson06;

import com.telesens.academy.lesson06.model.Abonent;

public class PolymorfismDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Abonent abonent = new Abonent("Helen", "ivanova", 28, 'f', "0501234567");
        Object abonent2 = new Abonent("Helen", "ivanova", 28, 'f', "0501234567");
        Object abonent3 = new Object();
        abonent.getPhoneNumber(); // Abonent
        abonent.toString(); // Object

        abonent3.toString();
        Abonent abonent4 = (Abonent)abonent2; // ?
        String phoneNumber = abonent4.getPhoneNumber();
        System.out.println(phoneNumber);

        // Abonent abonent5 = new Object();

        // Еще примеры
        Integer[] array = new Integer[]{1, 2, 3, 5, 6};
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        String[] arrayStr = new String[] {"One", "Two", "Hello", "Bye"};
        for (int i = 0; i < arrayStr.length; i++)
            System.out.println(arrayStr[i]);

        System.out.println("***Common array***");
        Object[] arrayCommon = {1, 5, "Hello", "two", 3, abonent};
        for (int i = 0; i < arrayCommon.length; i++)
            System.out.println(arrayCommon[i]);
    }


}
