package com.softserve.edu.lesson_3_Enums.homework.hw_1;

import java.util.Scanner;

public class Main {
    //The numbers -5 and 5 are used directly in your code.
    // These are called "magic numbers" and it's generally a good practice
    // to declare them as constants with descriptive names.
    // This makes your code easier to maintain and understand.
    private static final float LOWER_BOUND = -5f;
    private static final float UPPER_BOUND = 5f;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//do it static
        System.out.println("Please enter first num");
        float first = sc.nextFloat();
        System.out.println("Please enter second num");
        float second = sc.nextFloat();
        System.out.println("Please enter third num");
        float third = sc.nextFloat();

        if ((range(first)) && (range(second)) && (range(third))) {
            System.out.println("All numbers belong to the range [-5, 5] ");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
        sc.close();//or don't forget to close scanner
    }

    private static boolean range(float num) {
        return ((num >= -5) && (num <= 5));
    }
//better

    /**
     * Returns true if the number is within the range [-5, 5].
     *
     * @param num
     * @return
     */
    private static boolean isWithinRange(float num) {
        return num >= LOWER_BOUND && num <= UPPER_BOUND;
    }
    //The method name is not very descriptive of what it does.
    // A more descriptive name like isWithinRange might be clearer for understanding the purpose
    // of the method.
}
