package com.softserve.edu05;

import java.util.Arrays;

public class LoopsExample {
    public static void main(String[] args) {
        String text = "Hello";
        char[] chars = text.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0, j = chars.length - 1;
             i < j;
             i++, j--) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
        String reversText = new String(chars);
        System.out.println(reversText);
    }
}
