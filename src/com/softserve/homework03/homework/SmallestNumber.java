package com.softserve.homework03.homework;

import java.util.Scanner;

public class SmallestNumber {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

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

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public int getSmallestNumber() {
        return Math.min(Math.min(getFirstNumber(), getSecondNumber()), getThirdNumber());
    }

    public static void main(String[] args) {
        SmallestNumber smallestNumber = new SmallestNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        smallestNumber.setFirstNumber(scanner.nextInt());
        System.out.print("Enter the second number: ");
        smallestNumber.setSecondNumber(scanner.nextInt());
        System.out.print("Enter the third number: ");
        smallestNumber.setThirdNumber(scanner.nextInt());

        System.out.println("The smallest number is : " + smallestNumber.getSmallestNumber());
    }
}
