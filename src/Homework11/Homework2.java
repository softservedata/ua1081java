package Homework11;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Іnput a sentence that contains words separated by more than one space on the console:");
        String sentence = scanner.nextLine();
        System.out.println("Edited sentence: " + sentence.replaceAll("\\s+", " "));
        scanner.close();
    }
}
