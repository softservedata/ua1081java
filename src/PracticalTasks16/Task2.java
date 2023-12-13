package PracticalTasks16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "./mytext.txt";

        findAndPrintWithVowel(fileName);

        findAnrPrintWithMatchesLetters(fileName);
    }

    private static List<String> readWords(String fileName) throws FileNotFoundException {
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words.add(word);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return words;
    }

    private static boolean startWithVowel(String words) {
        Pattern pattern = Pattern.compile("^[aeiouAEIOU].*");
        Matcher matcher = pattern.matcher(words);
        return matcher.matches();
    }

    private static void findAndPrintWithVowel(String fileName) throws FileNotFoundException {
        List<String> words = readWords(fileName);

        System.out.println("Words starting with a vowel:");
        for (String word : words) {
            if (startWithVowel(word)) {
                System.out.print("" + word + ", ");
            }
        }
    }

    private static boolean endWithMatchesLetters(String word1, String word2) {
        char lastLetters = word1.charAt(word1.length() - 1);
        char firstLetters = word2.charAt(0);
        return Character.toLowerCase(lastLetters) == Character.toLowerCase(firstLetters);
    }

    private static void findAnrPrintWithMatchesLetters(String fileName) throws FileNotFoundException {
        List<String> words = readWords(fileName);

        System.out.println("\nAll words for which the last letter of one word matches the first letter of the next word: ");
        for (int i = 0; i < words.size() - 1; i++) {
            String word1 = words.get(i);
            String word2 = words.get(i + 1);
            if (endWithMatchesLetters(word1, word2)) {
                System.out.print(word1 + " " + word2 + ", ");
            }

        }
    }
}
