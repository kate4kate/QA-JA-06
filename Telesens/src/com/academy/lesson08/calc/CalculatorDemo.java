package com.academy.lesson08.calc;

public class CalculatorDemo {
    public static void main(String[] args) {
        Caclulator calc = new Caclulator();
        double result = 0;
        try {
            result = calc.div(5, 0);
        } catch (AmbiguityDivision exc) {
            System.out.println("0/0?: " + exc);
            System.err.println("Details: " + exc.getMessage());
            System.exit(1);

        } catch (DivisionByZero exc) {
            System.err.println("Division by zero. Details: " + exc.getMessage());
            System.exit(1);
        } catch (Exception exc) {
            System.out.println("Common error" + exc);
        }
        finally {
            System.out.println("Finish");
        }

        System.out.println(result);
//        System.out.println(1.0/0);
    }
}
