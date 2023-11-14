package Lesson5.HomeWork.HomeWork2;


import java.util.Scanner;

public class Sum2Num {
    public static void main(String[] args) {
        double num1;
        double num2;
        String answer;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter 1 num: ");
            num1 = scan.nextDouble();
            System.out.println("Enter 2 num: ");
            num2 = scan.nextDouble();
            System.out.println("Sum of this numbers: " + (num1 + num2));
            System.out.println("Do you want to try again (yes/no)");
            scan.nextLine();
            answer = scan.nextLine().toLowerCase();
        } while (answer.equals("yes"));
    }
}
