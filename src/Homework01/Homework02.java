package Homework01;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String ans1 = scanner.next();
        System.out.println("Where do you live, " + ans1);
        String ans2= scanner.next();
        System.out.println(ans1 + " from " + ans2);
    }
}
