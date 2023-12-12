package com.softserve.homework12_FunctionalInterfaces_LocalDate;

import java.util.Scanner;

public class HomeWork12DemoCaesarCipher {
    public static void main(String[] args) {

//        Task 01  Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//        Method encrypt should take a string and return coded string where every letter is moved
//        on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
//        return decoded value

        Scanner scanner = new Scanner(System.in);
        int shift = 3;
        System.out.println("Entered string for encryption: ");
        String enteredString = scanner.nextLine();
        if (!enteredString.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid input. Please enter a string containing only letters.");
            return;
        }
        String encryptedString = encrypt(enteredString, shift);
        System.out.println("Encrypted: " + encryptedString);
        String decryptedString = decrypt(encryptedString, shift);
        System.out.println("Decrypted: " + decryptedString);
    }

    public static String encrypt(String s, int n) {
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base;

                if (Character.isUpperCase(currentChar)) {
                    base = 'A';
                } else {
                    base = 'a';
                }

                char encryptedChar = (char) (((currentChar - base + n) % 26 + 26) % 26 + base);
                encryptedString.append(encryptedChar);
            } else {
                encryptedString.append(currentChar);
            }

        }

        return encryptedString.toString();
    }


    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }
}
