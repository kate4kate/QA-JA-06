package com.academy.lesson08.calc;

public class AmbiguityDivision extends DivisionByZero {

    public AmbiguityDivision(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "Неопределена опереция для 0/0";
    }
}
