package com.softserve.homework11_exeption.task01;

public class ArithmeticOperation {
    public static double div(double numerator, double denominator) {
        try {
            if (denominator == 0) {
                throw new ArithmeticException();
            } else {
                return numerator / denominator;
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            return 0;
        } catch (Exception e) {
            System.out.println("Error massage: " + e.getMessage());
            return 0;
        }
    }


}
