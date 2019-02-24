package com.academy.lesson08.calc;

public class Caclulator {
    public double div(double d1, double d2)
            throws DivisionByZero, AmbiguityDivision  {

        if (d1 == 0 && d2 == 0) {
            throw new AmbiguityDivision("Попытка поделить 0 на 0");
        }

        if (d2 == 0)
            throw new DivisionByZero("Нельзя делить на ноль");
        return d1/d2;
    }
}
