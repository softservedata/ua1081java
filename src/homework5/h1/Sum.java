package homework5.h1;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input the number: ");
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int product = 1;
        for (int l = 0; l < numbers.length - 5; l++) {
            if (numbers[l] < 0) {
                continue;
            }
            sum += numbers[l];
        }


            for (int j = 5; j < numbers.length; j++) {
                if (numbers[j] < 0) {
                    continue;
                }
                product = product * numbers[j];
            }

            System.out.println("Sum is " + sum);
            System.out.println("Product is " + product);
        }
    }








