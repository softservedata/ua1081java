package Lesson5.HomeWork.HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sum5IfPosOr5Anoth {
    public static void sum5IfPosOr5Anoth() {

        int[] arr = new int[10];
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(20) -10  ;
//        }

        enterNumbers(arr);
        System.out.println("You enter this numbers: " + Arrays.toString(arr));

        int sumPos = 0;
        int sumAll = 0;
        boolean positive = true;

        for (int i = 0; i < arr.length; i++) {
            if (positive && arr[i] > 0 && i < 5 || (positive = false)) {

                sumPos += arr[i];

                if (i == 4) {
                    System.out.println("Sum of first 5 numbers: " + sumPos);
                    break;
                }

            } else if (i >= 5) {

                sumAll += arr[i];
                if (i == 9) {
                    System.out.println("Sum of last 5 numbers: " + sumAll);
                    break;
                }
            }
        }
    }

    public static void enterNumbers(int arr[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your " + (i + 1) + " number");
            arr[i] = scan.nextInt();
        }
    }
}
