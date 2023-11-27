package com.softserve.Homework11.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter sentence: ");
        String string = scanner.nextLine();
        String[] strings = string.split(" ");

        int indexMax=0;
        int max=0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length()>max){
                indexMax=i;
                max=strings[i].length();
            }
        }

        System.out.println(" The longest word: "+strings[indexMax]+"\n has "+strings[indexMax].length()+" characters");
        StringBuilder stringBuilder = new StringBuilder(strings[1]);
        System.out.println(" Reversed second word: "+stringBuilder.reverse());
    }
}


