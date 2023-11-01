package com.softserve.edu.lesson_4_Arrays.practice.practice_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"hello", "misha", "ball", "color", "room", "ball"};

        // Manual sorting
        String tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i].compareTo(arr[j]) < 0)) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        // Sorting with the sort method
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        for (String s : arr) {
            if (s.equals(word)) {
                System.out.println("This value " + word + " is present in our list");
                break;
            }
        }
    }
}

