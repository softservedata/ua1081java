package Homework3.Homework2;

import java.util.Scanner;

public class SmallNum {
    private int num1;
    private int num2;
    private int num3;


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public int getSmallNum(){
        return Math.min(Math.min(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmallNum smallestnum = new SmallNum();
        System.out.print("Input the first number: ");
        smallestnum.setNum1(scanner.nextInt());
        System.out.print("Input the second number: ");
        smallestnum.setNum2(scanner.nextInt());
        System.out.print("Input the third number: ");
        smallestnum.setNum3(scanner.nextInt());
        System.out.println("The smallest number is " + smallestnum.getSmallNum());
    }
}
