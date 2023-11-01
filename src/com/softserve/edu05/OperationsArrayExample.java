package com.softserve.edu05;

import java.util.Arrays;

public class OperationsArrayExample {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 15, -3, 8, 4, 0};


        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int index = Arrays.binarySearch(nums,8);
        System.out.println(index);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum is " + sum);

        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product = product * nums[i];
            }
        }
        System.out.println("Product is " + product);

        int amount = 0;
        for (int a : nums) {
            if (a >= 5 && a <= 14) {
                amount++;
            }
        }
        System.out.println("Amount is " + amount);

    }
}
