package com.softserve.homework03.practicaltask.pt01;

public class Main {
    public static void main(String[] args) {
        SomeCalculations calc = new SomeCalculations();
        String firstPrompt = "Enter the first number: ";
        String secondPrompt = "Enter the second number: ";

        int firstNumber = SomeCalculations.getNumber(firstPrompt);
        calc.setFirstNumber(firstNumber);

        int secondNumber = SomeCalculations.getNumber(secondPrompt);
        calc.setSecondNumber(secondNumber);

        int total = calc.getTotal();
        double average = calc.getAverage();

        System.out.print("The sum of " + firstNumber + " and " + secondNumber + " is " + total +
                "\nThe average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
}
