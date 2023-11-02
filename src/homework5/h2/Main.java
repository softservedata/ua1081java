package homework5.h2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of numbers is: " + (a+b));
            System.out.println("Want to perform the operation again?");
            System.out.println("If answer is yes enter - 1, if not - 2" );

            x = sc.nextInt();

        }
        while (x<=1);
    }
}