package homework16.h1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Career {

    public static void main(String[] args) throws IOException {
        Path career = Paths.get("./text1.txt");
        Path myPath = Paths.get("./test2.txt");

        List<String> careerList;
        try (Stream<String> lines = Files.lines(career)){
            careerList = lines.toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //1
        List<String> numberOfLines;
        numberOfLines = careerList.stream().map(String::length).map(String::valueOf).toList();
        //System.out.println(numberOfLines);
        Files.write(myPath, numberOfLines, StandardCharsets.UTF_8, StandardOpenOption.WRITE);

        //2
        String longestLine = careerList.stream().max(Comparator.comparing(String::length)).get();
        //System.out.println(longestLine);
        Files.write(myPath, longestLine.getBytes(), StandardOpenOption.APPEND);

        //3
        String birthDay = careerList.stream().filter(s ->s.matches(".*\\d{2}\\.\\d{2}\\.\\d{4}.*")).findFirst().get();
        //System.out.println(birthDay);
        Files.write(myPath, birthDay.getBytes(), StandardOpenOption.APPEND);

    }
}
