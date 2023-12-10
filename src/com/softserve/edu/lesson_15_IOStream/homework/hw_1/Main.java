package com.softserve.edu.lesson_15_IOStream.homework.hw_1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        String text = "I have a diverse career path that reflects my adaptability and skill set. Beginning my journey as a baker, I dedicated five years to mastering the art and science of creating delightful baked goods. During this time, I honed my precision, creativity, and attention to detail in the culinary world.\n" +
                "Transitioning to the logistics industry, I've spent the past 2.5 years as a broker in a dynamic and fast-paced environment. As a broker, I facilitate transactions within the logistics sector, leveraging my analytical skills and market knowledge. This role has allowed me to blend my expertise from the culinary field with the challenges and opportunities presented in the logistics industry.\n" +
                "My career path highlights my ability to navigate diverse professional landscapes and continuously learn and grow in various domains.";
        Path path1 = Paths.get("file1.txt");
        Path path2 = Paths.get("file2.txt");
        Files.write(path1, Collections.singleton(text), StandardCharsets.UTF_8);

        List<String> read = readFile(path1);

        writeFile(path2,
                "Numbers lines in file1 is " + read.size() + "\n" +
                        "Longest line in file1 is " + findLong(read) + "\n" +
                        "My name and birthday: Vitalii Bilobran , October 17, 1995"
        );


    }

    public static void writeFile(Path a, String t) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(a.toString()))) {
            bw.write(t);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> readFile(Path a) {
        try {
            return Files.readAllLines(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String findLong(List<String> list) {
        return list.stream().max(Comparator.comparingInt(String::length)).orElse("");
    }
}
