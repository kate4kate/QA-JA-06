package com.academy.lesson09.HomeTask;

public class GenericArrayDemo {
    public static void main(String[] args) {
        String []strARr = {"1","2","3","4"};



        GenericArray<String> genStrArray =  new GenericArray<>(strARr);

        genStrArray.set(0,"1");
        String str = genStrArray.get(0);

        System.out.println(str);
        assert str.equals("");

//выводим массив на консоль (т.к. переопределилил метод toString  в дженерике
        System.out.println(genStrArray.toString());

    }

}
