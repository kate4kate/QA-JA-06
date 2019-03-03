package com.academy.lesson09.Class;

import java.util.Arrays;

public class PairArrContainer<P, S>  {
    private P [] arr1;
    private S [] arr2;

    public P[] getArr1() {
        return arr1;
    }

    public S[] getArr2() {
        return arr2;
    }


    public void setArr1(P[] arr1) {
        this.arr1 = arr1;
    }

    public void setArr2(S[] arr2) {
        this.arr2 = arr2;
    }

    //Переопределяем метод toString для того чтоб вывести наш массив
   /* @Override
    public String toString() {

     if (arr1.getClass().isArray()&&arr2.getClass().isArray())
         Object[] arr1AsArray = (Object[]) arr1;
        Object[] arr2AsArray =  (Object[]) arr2;

         for (int i = 0; i< (Object))



     else
         return arr1 + "==> " + arr2;

    }

*/

}
