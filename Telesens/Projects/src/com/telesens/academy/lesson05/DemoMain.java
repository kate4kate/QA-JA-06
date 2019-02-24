package com.telesens.academy.lesson05;

import com.telesens.academy.lesson05.exc.Date;
import com.telesens.academy.lesson05.exc.DateTime;

public class DemoMain {
    private String text;
    public static void main(String[] args) {
        System.out.println("lesson 05");

        DemoMain demoMain = new DemoMain();
        demoMain.printHelloWorld();
        System.out.println(demoMain.toString());
        System.out.println(demoMain);
//        demoMain.equals()

        //========================
        Integer n1 = 128;
        Integer n2 = 128;
        System.out.println(n1.equals(n2)); // true/false?

        // ===================
        System.out.println("Demo Date");
        Date date = new Date(); // 01/01/1970
        System.out.println(date);
        assert date.toString().equals("01/01/1970");

        System.out.println("Demo DateTime");
        DateTime dateTime = new DateTime();
        System.out.println(dateTime); // 01/01/1970 00:00:00
        assert dateTime.toString().equals("01/01/1970 00:00:00");

        System.out.println("Demo currentDateTime");
        DateTime dateTimeCurrent = new DateTime(11, 2, 2019, 20, 45, 0);
        System.out.println(dateTimeCurrent); // 11/02/2019 20:45:00
        assert dateTimeCurrent.toString().equals("11/02/2019 20:45:00");

        // ==================
        // 1 способ
        DateTime dateTime1 = new DateTime(11, 2, 2019, 20, 45, 0);

        // 2 способ
        DateTime dateTime2 = new DateTime();
        dateTime2.setDay(11);
        dateTime2.setMonth(2);
        dateTime2.setYear(2019);
        // ...

        // 3 способ
        Date dateTime3 = new DateTime()
                .withHour(20)
                .withMinute(58)
                .withSecond(35)
                .withDay(11)
                .withMonth(2)
                .withYear(2019);
        // ...
        System.out.println(dateTime3);
    }

    public void printHelloWorld() {
        System.out.println("Hello World!");
    }

    @Override
    public String toString() {
        return "Это главный класс из 5 занятия";
    }


}
