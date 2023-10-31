package Homework_01_Ivan.Practical_Task01.three_nums_IY.src;

import java.util.Scanner;

public class Threenums {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Input your first number: ");
        double fNum = sc.nextDouble();
    System.out.println("Input your second number: ");
        double sNum = sc.nextDouble();
    System.out.println("Input your third number: ");
        double thNum = sc.nextDouble();

    System.out.println("Average number is: " + (fNum + sNum + thNum) / 3);

    }
}