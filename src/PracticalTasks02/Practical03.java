package PracticalTasks02;

import java.util.Scanner;

public class Practical03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int res1 = a + b;
        int res2 = a - b;
        int res3 = a * b;
        int res4 = a / b;
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);

    }
}
