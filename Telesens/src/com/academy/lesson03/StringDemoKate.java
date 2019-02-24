package com.academy.lesson03;

public class StringDemoKate {

    public static void main(String[] args) {
        String str1 = "Demo";
        String str2 = new String( "Dem"+"o");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2)  );
        /*------------------------------*/
        System.out.println();

        Integer x1= 250;
        Integer x2= 250;

        System.out.println(x1);
        System.out.println(x1);
        System.out.println(x1 == x2);
        //вернёт false

        /*------------------------------*/
        System.out.println();

        int z1= 250;
        int z2= 250;

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z1 == z2);
        //вернёт true

    }
}
