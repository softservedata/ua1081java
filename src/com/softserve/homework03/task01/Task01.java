package com.softserve.homework03.task01;

import static com.softserve.homework03.HomeWork03Demo.scanner;//I moved scanner to HomeWork03Demo for all tasks

public class Task01 {
    public static void enterNumbers() {
        System.out.println("Enter three float numbers: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        if (num1 >= -5 && num2 >= -5 && num3 >= -5 && num1 <= 5 && num2 <= 5 && num3 <= 5) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
        scanner.nextLine(); // clear the scanner buffer
    }
}
//In this task, you had specific boundaries, but there is a practice of making your code more flexible.
//For example

//    public static void enterNumbers(int lowerBound, int upperBound) {
//            System.out.println("Enter three float numbers: ");
//            float num1 = scanner.nextFloat();
//            float num2 = scanner.nextFloat();
//            float num3 = scanner.nextFloat();
//
//            if (num1 >= lowerBound && num1 <= upperBound &&
//                    num2 >= lowerBound && num2 <= upperBound &&
//                    num3 >= lowerBound && num3 <= upperBound) {
//                System.out.println("All numbers belong to the range [" + lowerBound + ", " + upperBound + "]");
//            } else {
//                System.out.println("Not all numbers belong to the range [" + lowerBound + ", " + upperBound + "]");
//            }
//    }
//
//    public static void main(String[] args) {
//        float lowerBound = -5f; // min
//        float upperBound = 5f;  // max
//        enterNumbers(lowerBound, upperBound);
//    }
//but bound can be changed in runtime using Scanner
//}

