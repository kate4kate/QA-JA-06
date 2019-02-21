package com.academy.lesson02;

public class VariableDemo {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int z = 5;
        int  result = z-x-y;
        // Вывод нескольких переменных за один вызов
        System.out.printf("x=%d, y=%d, z=%d %n", x, y, z);
        System.out.println(String.format("result = %d", result));
        System.out.println("------------");
        //====================
        long longNumber = 1000000000000000L;
        int intNumber = 10;

        int oct = 0144; // восьмеричное
        System.out.println(oct);
        System.out.println("------------");

//        longNumber = intNumber;
        intNumber = (int)longNumber;
        System.out.println(String.format("longNumber = %d, intNumber = %d",
                longNumber, intNumber));
        System.out.println("------------");

        int bigInt = Integer.MAX_VALUE + 1;
        System.out.println("bigInt = " + bigInt);
        System.out.println("------------");

        int divResult = 29/10;
        double divDoubleResult = 29/10.0;
        double divDoubleResult2 = 29/10D; // 2 способ
        System.out.println("divResult = " + divResult);
        System.out.println("divDoubleResult = " + divDoubleResult);
        System.out.println("------------");

        //=========================
        int m = 10;
        ++m;
        System.out.println("m = " + m);

        int m2 = 5;
        System.out.println(++m2);
        System.out.println("------------");

        // =================
        int k = 4;
        int k2 = 4;
        // 1 способ увеличить k
        k = k + 5;

        // 2
        k2 += 5;

        int 房子 = 34;
        System.out.println(房子);
    }
}
