package com.softserve.edu.lesson_15_IOStream.practice.practice_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "C://Users//User//Desktop//myText.txt";
        System.out.println("All words with first vowel");
        vowel(filePath);
        System.out.println();
        System.out.println("The last word and first next eql");
        theLastAndFirstEql(filePath);


    }

    public static void vowel(String a) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(a));
        String line;
        while ((line = bf.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                char ch = word.charAt(0);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(word);
                }
            }
        }

    }

    public static void theLastAndFirstEql(String a) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(a));
        String line;
        while ((line = bf.readLine()) != null) {
            String[] w = line.toLowerCase().split(" ");
            if (w.length < 2) {
                System.out.println("At least 2 words");
            }
            for (int i = 0; i < w.length - 1; i++) {
                String firstW = w[i].trim();
                char firstLastW = firstW.charAt(firstW.length() - 1);
                String secondW = w[i + 1].trim();
                char secondFirstW = secondW.charAt(0);
                if (firstLastW == secondFirstW) {
                    System.out.println(firstW + " = " + secondW);
                }
            }
        }
    }
}
