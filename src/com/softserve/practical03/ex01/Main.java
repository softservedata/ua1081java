package com.softserve.practical03.ex01;

import static com.softserve.practical03.ex01.MathOps.getNumber;

public class Main {
    public static void main(String[] args) {
        MathOps mathOps = new MathOps();
        double number1 = getNumber("Enter the first number: ");
        double number2 = getNumber("Enter the second number: ");
        mathOps.getTotal(number1, number2);
        mathOps.getAverage(number1, number2);
    }
}
