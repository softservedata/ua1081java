package com.softserve.homework16.ex02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path sourceCode = Paths.get("C://Users//Administrator//IdeaProjects//ua1081java//src//com//softserve//homework16//ex02//code.txt");
        Path resultCode = Paths.get("C://Users//Administrator//IdeaProjects//ua1081java//src//com//softserve//homework16//ex02//codeResult.txt");

        List<String> codeResult = new ArrayList<>();

        try (Stream<String> lines = Files.lines(sourceCode)) {
            codeResult = lines.
                    map(s->s.replaceAll("public", "private"))
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.write(resultCode, codeResult, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
