package com.softserve.homework03.task01;

import java.util.Scanner;

public class Task01 {
    static Scanner scanner = new Scanner(System.in);

    public static void enterNumbers() {
        System.out.println("Enter three float numbers: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        if (num1 >= -5 && num2 >= -5 && num3 >= -5 && num1 <= 5 && num2 <= 5 && num3 <= 5 ){
            System.out.println("All numbers belong to the range [-5, 5]");
        }else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }
}
