package com.softserve.homework13.ex01;

public class Cypher {
    static String encrypt(String s, int n) {
        return cypher(s, n);
    }

    static String decrypt(String s, int n) {
        return cypher(s, -n);
    }

    static String cypher(String s, int n) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        int oldPos;
        int newPos;

        if (s.isEmpty()) return "There is no string";

        for (int i = 0; i < s.length(); i++) {
            //if a symbol is not from the alphabet
            if (alphabet.indexOf(s.toLowerCase().charAt(i)) < 0) {
                result.append(s.charAt(i));
                continue;
            }

            oldPos = alphabet.indexOf(s.toLowerCase().charAt(i));
            newPos = oldPos + n;
            if (newPos > alphabet.length() - 1) {
                newPos = newPos % alphabet.length();
            }
            //allows negative values:
            if (newPos < 0) {
                newPos = alphabet.length() + newPos;
            }
            //restores uppercase:
            if (s.split("")[i].equals(s.split("")[i].toLowerCase())) {
                result.append(alphabet.split("")[newPos]);
            } else {
                result.append(alphabet.split("")[newPos].toUpperCase());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Converter<String, String, Integer> converterCypher = Cypher::encrypt;
        Converter<String, String, Integer> converterDecypher = Cypher::decrypt;
        System.out.println(converterCypher.convert("Hello WOrldaaaxyz!abc", 3));
        System.out.println(converterDecypher.convert("Khoor ZRuogdddabc!def", 3));
        System.out.println(converterDecypher.convert("", 3));

    }
}
