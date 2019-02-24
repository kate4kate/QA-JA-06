package com.telesens.academy.lesson08.calc;

public class CalculatorDemo {
    public static void main(String[] args) {
        Caclulator calc = new Caclulator();
        double result = 0;
        try {
            result = calc.div(0, 0);
        } catch (AmbiguityDivision exc) {
            System.out.println("0/0?: " + exc);
            System.out.println("Details: " + exc.getMessage());
            System.exit(1);

        } catch (DivisionByZero exc) {
            System.out.println("Division by zero. Details: " + exc);
            System.exit(1);
        } catch (Exception exc) {
            System.out.println("Common error" + exc);
        }

        System.out.println(result);
//        System.out.println(1.0/0);
    }
}
