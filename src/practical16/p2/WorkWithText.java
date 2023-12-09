package practical16.p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkWithText {

    public static void main(String[] args) {

        Path fileName = Paths.get("./MyText.txt");
        List<String> text;

        try (Stream<String> lines = Files.lines(fileName)) {
            text = lines.toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //1
        List<String> wordsFirstVowel = text.stream().flatMap(s -> Stream.of(s.split("[\\s,.;!?]+"))).toList();
        wordsFirstVowel.stream().filter(s -> s.matches("\\b[eyuioaEYUIOA][a-zA-Z]*\\b")).forEach(System.out::println);

        //2
        List<String> result = new ArrayList<>();
        for (int i = 0; i < wordsFirstVowel.size() - 2; i++) {

            String word1 = wordsFirstVowel.get(i);
            String word2 = wordsFirstVowel.get(i + 1);

            if (word1.length() < 1 || word2.length() < 1) {
                continue;
            }
            char lastCharWord1 = word1.charAt(word1.length() - 1);
            char firstCharWord2 = word2.charAt(0);

            if (lastCharWord1 == firstCharWord2) {
                result.add(word1);
                result.add(word2);
            }
        }
        System.out.println(result);
    }
}

