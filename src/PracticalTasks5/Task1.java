package PracticalTasks5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {9, 1, 7, 4, 12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int amount = 0;
        for (int a = 0; a < arr.length; a++) {
            amount = a + 1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avgValue = (double) sum / amount;
        System.out.println("Average value of arrays is: " + avgValue);


        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i : arr) {
            if (arr[i] == num) {
                System.out.println("Array contains the value " + num);
                break;
            } else {
                System.out.println("Array not contains the value " + num);
                break;
            }
        }
    }
}