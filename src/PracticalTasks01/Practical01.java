package PracticalTasks01;

import java.util.Scanner;

public class Practical01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String t1 = scanner.next();
        String t2 = scanner.next();
        String t3 = scanner.next();
        System.out.println("Output text:");
        System.out.println(t3 + "\n" + t2 + "\n" + t1);

    }
}
