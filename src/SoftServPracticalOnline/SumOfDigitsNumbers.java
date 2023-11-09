package SoftServPracticalOnline;

import java.util.Scanner;

public class SumOfDigitsNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
            try {
                int sum = calculateDigitSum(number);
                System.out.println("The sum of positive digits of " + number + " is " + sum);
            }catch (IllegalAccessError e){
                System.out.println(e.getMessage());
            }


    }
    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
        } else {
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
        int sum = 0;
        int temp = number;
        while (temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }



}
