package com.academy.lesson06.tests;

import com.academy.lesson06.model.Abonent;
import com.academy.lesson08.ParseAbonentException;
import com.academy.lesson08.ParseAbonentGenderException;
import com.academy.lesson08.ParseAbonentNameException;
import com.academy.lesson08.ParseAgeException;

public class AbonentTestsDemo2 {
    public static void main(String[] args) throws ParseAbonentException,ParseAbonentNameException,ParseAgeException,ParseAbonentGenderException {
        String abonentRawString = "  heLen iVanova 35 f 0501234567";
        // Parse abonent
        // Парсим абонента и результат записываем в поля класса
        Abonent abonent = new Abonent();
        abonent.setFirstName(parseFirstName(abonentRawString));
        abonent.setLastName(parseLastName(abonentRawString));
        abonent.setAge(parseAge(abonentRawString));
        abonent.setGender(parseGender(abonentRawString));
        abonent.setPhoneNumber(parsePhoneNumber(abonentRawString));

        // LOG
        // Выводим данные абонента (теперь в одну строку)
        System.out.println("Abonent: " + abonent);

        // Test
        // Теперь проверка в одну строку
        Abonent expectedAbonent = new Abonent("Helen", "Ivanova", 35, 'f', "0501234567");
        assert abonent.equals(expectedAbonent);
    }

    // Извлекаем номер телефона как строку
    public static String parsePhoneNumber(String abonentRawString) {
        String[] parts = abonentRawString.trim().split(" ");
        String phoneNumber = parts[4];
        return phoneNumber;
    }

    // Извлекаем пол как символ
    public static char parseGender(String abonentRawString) throws ParseAbonentGenderException {
        if (!(abonentRawString.equals("f")||abonentRawString.equals("m"))) {
            throw  new ParseAbonentGenderException();

        }

        String[] resultString = abonentRawString.trim().split(" ");
        char gender=resultString[3].charAt(0);
        return gender;
    }

    // Извлекаем возраст как число
    public static int parseAge(String abonentRawString) throws ParseAbonentException,ParseAgeException {
        if (abonentRawString.isEmpty()){
            throw new ParseAbonentException();
        }

        if (abonentRawString.equals(" "))
            throw new ParseAbonentException();


        if (abonentRawString.length() >=4)
            throw new ParseAgeException();



        String noSpaces = abonentRawString.trim();
        String[] parts = noSpaces.split(" ");
        String age = parts[2];
        return Integer.parseInt(age);
    }


    // Извлекаем фамилию  как строку
    public static String parseLastName(String abonentRawString) throws ParseAbonentException, ParseAbonentNameException {

        if (abonentRawString.isEmpty()  )
            throw new ParseAbonentException();

        if (abonentRawString.equals(" "))
            throw new ParseAbonentException();

        if (abonentRawString.length() <3)
            throw new ParseAbonentNameException();



        String noSpaces = abonentRawString.trim(); //вернули точно такую же строку, но без начальных и конечных пробелов!!!
        String [] parts = noSpaces.split(" "); // разбили нашу строку по пробелам на отдельные части
        String rawLastName = parts[1]; // iVanova
        // 1 способ 'iVanova' => 'Ivanova'
//        String lastName = rawLastName.substring(0, 1).toUpperCase() + rawLastName.substring(1).toLowerCase();
        String lastName = Character.toString(rawLastName.charAt(0)).toUpperCase() + rawLastName.substring(1).toLowerCase();
        return lastName; // вернули конкретный элемент из массива отдельных слов, которые получились из нашей строки
    }

    // Извлекаем имя как строку
    // (аналогично фамилии - для одинаковой логики нужно создать общий метод)
    public static String parseFirstName(String abonentRawString) throws ParseAbonentException,ParseAbonentNameException {

        if (abonentRawString.isEmpty()  )
            throw new ParseAbonentException();

        if (abonentRawString.equals(" "))
            throw new ParseAbonentException();

        if (abonentRawString.length() <3)
            throw new ParseAbonentNameException();


        String noSpaces = abonentRawString.trim(); //вернули точно такую же строку, но без начальных и конечных пробелов!!!
        String [] parts = noSpaces.split(" "); // разбили нашу строку по пробелам на отдельные части
        String rawFirstName = parts[0]; // 'heLen'
        // 'heLen' => 'Helen'
        String firstName = Character.toString(rawFirstName.charAt(0)).toUpperCase() + rawFirstName.substring(1).toLowerCase();

        //если строка пустая, бросаем ParseAbonentException



        return firstName; // вернули конкретный элемент из массива отдельных слов, которые получились из нашей строки



        }

    }