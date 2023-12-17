package com.softserve.homework16.ex01;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Career {

    public static void main(String[] args) {
        Path career = Paths.get("C://Users//Administrator//IdeaProjects//ua1081java//src//com//softserve//homework16//ex01//file1.txt");
        Path result = Paths.get("C://Users//Administrator//IdeaProjects//ua1081java//src//com//softserve//homework16//ex01//file2.txt");

        if (!Files.exists(result)) {
            try {
                Files.createFile(result);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String numberOfLines = String.format("Number of lines in the file 'file1.txt' is %s%n", getNumberOfLines(career));
        System.out.print(numberOfLines);

        String longestLine = String.format("The longest line is '%s'%n", getLongestLine(career));
        System.out.print(longestLine);

        String pattern = "\\d{2}.\\d{2}.\\d{4}";
        String birthdayDate = String.format("Birthdate in the file is %s", getBirthdayDate(career, pattern));
        System.out.print(birthdayDate);

        try {
            Files.writeString(result, numberOfLines, StandardOpenOption.WRITE);
            Files.writeString(result, longestLine, StandardOpenOption.APPEND);
            Files.writeString(result, birthdayDate, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String getBirthdayDate(Path path, String pattern) {
        String birthday;
        try (Stream<String> lines = Files.lines(path)) {
            birthday = lines
                    .map(line -> line.split(" "))
                    .map(Arrays::asList)
                    .flatMap(Collection::stream)
                    .filter(s -> s.matches(pattern))
                    .findAny().get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return birthday;
    }

    private static String getLongestLine(Path path) {
        String longestLine;
        try (Stream<String> lines = Files.lines(path)) {
            longestLine = lines.max(Comparator.comparing(String::length)).orElse("Something went wrong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return longestLine;
    }

    private static int getNumberOfLines(Path filePath) {
        List<String> list;
        try (Stream<String> lines = Files.lines(filePath)) {
            list = lines.toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list.size();
    }


}
