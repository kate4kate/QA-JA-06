package com.academy.lesson09.HomeTask;

import java.util.Arrays;

public class GenericArray <T>{
    private T[] array ;


    public GenericArray(T[] array) {
        this.array = array;
    }




    public T get(int index){
      return array[index];
    }

    public void set(int index, T value){
        array[index] = value;
    }


    @Override
    public String toString() {
        return  Arrays.toString(array);
    }
}
