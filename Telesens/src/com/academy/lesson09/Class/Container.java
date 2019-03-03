package com.academy.lesson09.Class;

public class Container <T> {

    private T value;

    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }

}