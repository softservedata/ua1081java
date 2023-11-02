package homework5.h1;

import java.util.Scanner;

public class Position {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];

        for (int i :number) {
            System.out.println("Input the number: ");
            number[i] = sc.nextInt();
        }

        int numberMin = number[0];
        int indexMin = 0;

        for (int i : number) {
            if (number[i] < numberMin) {
                numberMin = number[i];
                indexMin = i;
            }
        }
        System.out.println("Minimum number is: " + numberMin);
        System.out.println("It was entered " + (indexMin + 1));

        int sum = 0;
        for (int j : number) {
            sum +=number[j];
        }
        System.out.println("Sum of entered numbers is: " +sum);

        int product =1;
        for (int p : number) {
            if (number[p] > 0) {
                product = product * number[p];
            }
        }

        System.out.println("Product of entered numbers is: " +product);




    }
}
