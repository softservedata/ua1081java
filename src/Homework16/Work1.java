package Homework16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Work1 {
    public static void main(String[] args) {
        String fileName = "./file1.txt";
        String filename2 = "./file2.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename2))) {
            writer.write("Number of lines in file1.txt.: " + numberOfLines(fileName) + "\n");
            writer.write("The longest line in file1.txt.: " + longestLine(fileName) + "\n");
            writer.write("My name is: Stanislav. My birthday date is: 09.08.1992");
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    private static List<String> readContext(String fileName) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return lines;
    }
    private static int numberOfLines (String fileName) {
       List<String> lines = readContext(fileName);
       return lines.size();
    }

    private static String longestLine (String fileName) {
        List<String> lines = readContext(fileName);
        String longestLine = lines.get(0);
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        return longestLine;
    }
}
