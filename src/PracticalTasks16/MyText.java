package PracticalTasks16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyText {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "./mytext.txt";

        List<String> lines = readContext(fileName);

        System.out.println("Number of symbols in every line: ");
        countNumbersOfSymbols(lines);

        longestAndShortestLine(lines);

        linesConsistVar(lines, "var");
    }

    private static List<String> readContext(String fileName) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    private static void countNumbersOfSymbols(List<String> lines) {
        for (String line : lines) {
            System.out.println("Line: " + line + "\n Number of symbols: " + line.length());
        }
    }

    private static void longestAndShortestLine(List<String> lines) {
        String longestLine = lines.get(0);
        String shortestLine = lines.get(0);

        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        for (String line : lines) {
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
        }
        System.out.println("The longest line is: " + longestLine);
        System.out.println("The shortest line is: " + shortestLine);
    }

    private static void linesConsistVar(List<String> lines, String word) {
        for (String line : lines) {
            if (line.contains(word)) {
                System.out.println(line);
            } else {
                System.out.println("line don't contains the word 'var'.");
            }
        }
    }
}
