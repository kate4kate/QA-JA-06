package com.academy.lesson09.Class;


public class GenericDemo {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        container.setValue("Hello");

        String msg = container.getValue();
        System.out.println(msg);

     //  Container<Integer> integerContainer = new Container<>();

        Container<Object> containerObj = new Container<>();
        containerObj.setValue(1);
        //int m = (int)container;


        PairContainer<Integer, String> pair  = new PairContainer<>();
        pair.setFirstValue(2);
        pair.setSecondValue("5");
        System.out.println(pair.getFirstValue() + "==>" + pair.getSecondValue());



// создаем объект   типа парного контейнера
       PairArrContainer <Integer, String> pairArr  = new PairArrContainer<>();

        String [] arrStr = {"5", "6", "7"};

        pairArr.setArr1(new Integer[]{1,2,3});
        pairArr.setArr2(arrStr);

      //  System.out.println(pairArr.getArr1() + " \n" + pairArr.getArr2());

    }

}
