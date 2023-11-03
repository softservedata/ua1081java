package practical5.p2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = sc.nextInt();

        if(number == 0) {
            System.out.println(number + " not prime");
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " prime ");
        }else {
            System.out.println(number + " not prime ");
        }
    }
}