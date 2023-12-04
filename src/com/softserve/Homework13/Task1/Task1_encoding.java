package com.softserve.Homework13.Task1;

public class Task1_encoding {
    public static void main(String[] args) {
        String test = "Hello world";
        int n = 3;
        System.out.println("Origin: " + test);
        test = encrypt(test, n);
        System.out.println("Coded: " + test);
        test = decrypt(test, n);
        System.out.println("Decoded: " + test);
    }

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append((char) (s.charAt(i) + n));
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append((char) (s.charAt(i) - n));
        }
        return result.toString();
    }
}
