package com.softserve.homework13.homework;

import java.util.Scanner;

public class CaesarCipher {

    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String password, int offsetValue)  {
        password = password.toLowerCase();
        String encryptedString = "";
        for (int i = 0; i < password.length(); i++) {
            int charPosition = alphabet.indexOf(password.charAt(i));
            int replacementValuePosition = (offsetValue + charPosition) % 26;
            char replacementValue = alphabet.charAt(replacementValuePosition);
            encryptedString += replacementValue;
        }
        return encryptedString;
    }

    public static String decrypt(String password, int offsetValue) {
        password = password.toLowerCase();
        String decryptedString = "";
        for (int i = 0; i < password.length(); i++) {
            int charPosition = alphabet.indexOf(password.charAt(i));
            int replacementValuePosition = (charPosition - offsetValue) % 26;
            if (replacementValuePosition < 0) {
                replacementValuePosition = alphabet.length() + replacementValuePosition;
            }
            char replacementValue = alphabet.charAt(replacementValuePosition);
            decryptedString += replacementValue;
        }
        return decryptedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Encrypt
        System.out.print("Please enter the password to be encrypted: ");
        String password = scanner.next();

        System.out.print("Please enter an offset value:");
        int offsetValue = scanner.nextInt();
        String encryptedString = encrypt(password, offsetValue);
        System.out.println("\nEncrypted password: " + encryptedString);

        //Decrypt
        String decryptedString = decrypt(encryptedString, offsetValue);
        System.out.println("\nDecrypted password: " + decryptedString);
    }
}
