package com.academy.lesson08.calc;

public class DivisionByZero extends Exception {

    public DivisionByZero() {
    }

    public DivisionByZero(String msg) {
        super(msg);
    }
}
