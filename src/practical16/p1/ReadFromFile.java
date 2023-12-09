package practical16.p1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ReadFromFile {

    public static void main(String[] args) {

        Path fileName = Paths.get( "./MyText.txt");
        List<String> text;

        try (Stream<String> lines = Files.lines(fileName)){
            text = lines.toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //1
        text.stream().map(String::length).forEach(System.out::println);

        //2
        String minLength = text.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(minLength);
        String maxLength = text.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(maxLength);

        //3
        text.stream().filter(s -> s.matches("^[^\\d]*$")).forEach(System.out::println);

    }
}