package com.softserve.edu.lesson_12_functInterfaceAndDate.homework.hw_1;

public class Main {
    public static void main(String[] args) {

        System.out.println(encrypt("abc", 3));
        System.out.println(decrypt("abc" ,3));
    }

    static String encrypt(String s, int n) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            int charPos = ALPHABET.indexOf(s.charAt(i));
            int key = (n + charPos) % 26;
            char replace = ALPHABET.charAt(key);
            a += replace;
        }
        return a;
    }

    static String decrypt(String s, int n) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            int pos = ALPHABET.indexOf(s.charAt(i));
            int key = (pos - n) % 26;
            if (key < 0) {
                key = ALPHABET.length() + key;
            }
            char repl = ALPHABET.charAt(key);
            a += repl;
        }
        return a;


    }

}
