package Homework13;

import java.util.Scanner;

import static java.lang.Character.*;

public class CodedString {

    private static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                char shiftChar = (char) ((c - 'a' + n) % 26 + 'a');
                encrypted.append(Character.isLowerCase(c) ? Character.toLowerCase(shiftChar) : shiftChar);
            } else if (Character.isLetter(c) && Character.isUpperCase(c)) {
                char shiftChar = (char) ((c - 'A' + n) % 26 + 'A');
                encrypted.append(Character.isUpperCase(c) ? Character.toUpperCase(shiftChar) : shiftChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    private static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = scanner.nextLine();

        System.out.println("Specify the encoding step: ");
        int shift = scanner.nextInt();

        String encrypt = encrypt(string, shift);
        String decrypt = decrypt(encrypt, shift);

        System.out.println("Original string: " + string);
        System.out.println("Encrypt: " + encrypt);
        System.out.println("Decrypt: " + decrypt);

        scanner.close();
    }
}
