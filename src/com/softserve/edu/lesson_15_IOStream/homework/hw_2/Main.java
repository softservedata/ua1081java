package com.softserve.edu.lesson_15_IOStream.homework.hw_2;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String input = "Code.txt";
        String output = "CodeDupl.txt";

        String read = readFile(input);
        String repl = repl(read);
        writeFile(output,repl);

    }

    static String readFile(String fil) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fil))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    static void writeFile(String a, String content){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(a))) {
            bw.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String repl(String a){
        return a.replace("public", "private");
    }
}
