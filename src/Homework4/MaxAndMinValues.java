package Homework4;

import java.util.Scanner;

public class MaxAndMinValues {
    static Scanner scanner = new Scanner(System.in);
    static int num1;
    static int num2;
    static int num3;

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int num1) {
        MaxAndMinValues.num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        MaxAndMinValues.num2 = num2;
    }

    public static int getNum3() {
        return num3;
    }

    public static void setNum3(int num3) {
        MaxAndMinValues.num3 = num3;
    }

    public static void main(String[] args) {
        System.out.println("Please enter three numbers:");
        MaxAndMinValues.setNum1(scanner.nextInt());
        MaxAndMinValues.setNum2(scanner.nextInt());
        MaxAndMinValues.setNum3(scanner.nextInt());
        int maxValues = getNum1();
        if (getNum2() > getNum1() ) {
            maxValues = getNum2();
        }
        if (getNum3() > getNum2()) {
            maxValues = getNum3();
        }
        int minValues = getNum1();
        if (getNum2() < getNum1()) {
            minValues = getNum2();
        }
        if (getNum3() < getNum2()) {
            minValues = getNum3();
        }
        System.out.println("The maximum value among all entered numbers is: " + maxValues);
        System.out.println("The minimum value among all entered numbers is: " + minValues);
    }
}
