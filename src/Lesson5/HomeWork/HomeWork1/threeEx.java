package Lesson5.HomeWork.HomeWork1;

import java.util.Arrays;
import java.util.Scanner;


public class threeEx {
    public static void threeEx() {
        int[] arr = new int[5];
        int min;
        int IDmin = 0;
        int sum = 0;
        int secondPosNum = 0;
        int IDSecondPosNum = 0;

        enterNumbers(arr);
        min = arr[0];
        System.out.println("Your entered numbers: " + Arrays.toString(arr));

        for (int i = 0, j = 0; i < arr.length; i++) {

            //second positive number
            if (arr[i] > 0) {
                j++;
                if (j == 2) {
                    secondPosNum = arr[i];
                    IDSecondPosNum = i;
                }
            }

            //minimum value
            if (min > arr[i]) {
                min = arr[i];
                IDmin = i;
            }

            //product of even numbers
            if ((arr[i] % 2 == 0) && (arr[i] != 0)) {
                sum += arr[i];
            }

        }
        System.out.println("Second positive number is: " + secondPosNum + " and it's id: " + IDSecondPosNum);
        System.out.println("Minimum number is: " + min + " and it's id: " + IDmin);
        System.out.println("Product of even numbers is: " + sum);


    }

    public static void enterNumbers(int arr[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your " + (i + 1) + " number");
            arr[i] = scan.nextInt();
        }
    }
}
