package com.softserve.homework03.practicaltask.pt01;

import java.util.Scanner;

public class SomeCalculations {

    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public int getTotal() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getAverage() {
        return (getFirstNumber() + getSecondNumber()) / (double) 2;
    }
}
