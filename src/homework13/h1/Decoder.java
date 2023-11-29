package homework13.h1;

import java.util.Scanner;



public class Decoder {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        String text = scanner.nextLine();
        System.out.println("Enter your key: ");
        int step = scanner.nextInt();

        System.out.println(encrypt(text, step));

        System.out.println(decrypt(encrypt(text, step), step));
    }

    public static String encrypt(String s, int n){
        StringBuilder encrypt = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int originalCode = s.charAt(i);
            int newCode = originalCode + n;
            encrypt.append((char) newCode);
        }
        return encrypt.toString();
    }

    public static String decrypt(String s, int n){
        StringBuilder decrypt = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int originalCode = s.charAt(i);
            int newCode = originalCode - n;
            decrypt.append((char) newCode);
        }
        return decrypt.toString();
    }
}