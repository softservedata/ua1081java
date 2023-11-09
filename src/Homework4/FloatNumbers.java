package Homework4;

import java.util.Scanner;

public class FloatNumbers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter three numbers:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        FloatNumbers fallInRange;
        if ((num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5)) {
            System.out.println("All entered numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all entered numbers belong to the range [-5, 5]");

        }
    }
}

