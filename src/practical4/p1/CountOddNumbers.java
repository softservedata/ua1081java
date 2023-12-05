package practical4.p1;

import java.util.Scanner;

class CountOddNumbers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        int count = 0;
        if (firstNumber%2 !=0){
            count++;
        }
        if (secondNumber%2 !=0){
            count++;
        }
        if (thirdNumber%2 !=0){
            count++;
        }
        System.out.println("Count of odd numbers: " + count);
        scanner.close();
    }
}