package com.telesens.academy.lesson06.tests;

import com.telesens.academy.lesson06.model.Abonent;

public class AbonentTests {
    private static final String REGEX_FOR_PHONENUMBER = "^\\d{10}$";

    public static void main(String[] args) {
        String someMessage = (String)readTestData("string");// ?
        // if string
        assert someMessage.equals("Hello World");

        // if Integer
        Integer number = (Integer)readTestData("number");// ?
        assert number.equals(10);

        // Здесь напишем тест
        Abonent abonent = (Abonent)readTestData("abonent");// ?


        // Проверить 1 Имя и Фамилия в верхнем регистре
        String firstName = abonent.getFirstName();
        char firstLetter = firstName.charAt(0);
        assert Character.isUpperCase(firstLetter);

        String lastname = abonent.getLastName();
        //System.out.println("Lastname :" + lastname);
        firstLetter = lastname.charAt(0);
//        if (Character.isUpperCase(firstLetter))
//            System.out.println("First letter in upper case");
//        else
//            System.out.println("First letter in lower case");

        if (!Character.isUpperCase(firstLetter)) {
            System.out.println(
                    String.format("First letter in the last name '%s' in lower case", lastname));
            assert false;
        }

        // Проверить возраст > 1 < 130
        int age = abonent.getAge();
        assert age > 1 && age < 130;

        // Пол 'f' либо 'm'
        assert (abonent.getGender()=='f') || (abonent.getGender()=='m');

        // Телефонный номер состоит только из цифр

        String phoneNumber = abonent.getPhoneNumber();
        assert phoneNumber.matches(REGEX_FOR_PHONENUMBER);

        // Получаем массив разношерстных тестовых данных
        Object[] testData = dataProvider();

        for(int i = 0; i < testData.length; i++ ) {
            // string
            if (testData[i] instanceof String) {
                String messageFromArray = (String)testData[i];
                assert messageFromArray.equals("Hello World");
            } else if (testData[i] instanceof Integer) {
                Integer numberFromArray = (Integer) testData[i];
                assert numberFromArray.equals(10);
            } else if (testData[i] instanceof Abonent) {
                Abonent abonentFromArray = (Abonent)testData[i];
                // Полный тест для абонента
                // ...
            }
        }
    }

    // Можем вернуть любой ТИП данных
    private static Object readTestData(String type) {
        if (type.equals("string"))
            return "Hello World";

        if (type.equals("abonent"))
            return new Abonent("Helen", "Ivanova", 28, 'f', "0501234567");

        if (type.equals("number"))
            return 10;

        return null;
    }

    private static Object[] dataProvider() {
        return new Object[] {
                10,
                "Hello World",
                new Abonent("Helen", "Ivanova", 28, 'f', "0501234567")};
    }
}