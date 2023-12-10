package com.softserve.edu.lesson_15_IOStream.practice.practice_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Read file and add to Array");
        List<String> text = new ArrayList<>();
        File file = new File("C://Users//User//Desktop//myText.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            text.add(line);
        }
        sc.close();
        System.out.println(text);
        System.out.println();

        System.out.println("Count and write symbols in each line");
        for (int i = 0; i < text.size(); i++) {
            System.out.println("Line" + (i + 1) + " " + text.get(i).length());
        }
        System.out.println();

        System.out.println("Longest and shortest lanes");
        String longest = text.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("The longest lane is ---- " + longest + " " + longest.length() + " symbols");

        String shortest = text.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("The shortest line is ---- " + shortest + " " + shortest.length() + " symbols");
        System.out.println();

        System.out.println("Lanes which contains word var");
        List<String> var = text.stream().filter(s -> s.contains("var")).toList();
        var.forEach(System.out::println);


    }

}

