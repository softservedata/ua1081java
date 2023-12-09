package homework16.h2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileWithCode {

    public static void main(String[] args) throws IOException {

        Path code = Paths.get("./code.txt");
        Path myPath = Paths.get("./test2.txt");

        List<String> codeList = new ArrayList<>();
        try (Stream<String> liines = Files.lines(code)) {
            codeList = liines.toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<String> changedCode = codeList.stream().
                map(s -> s.replace("public", "private")).toList();

        Files.write(myPath, changedCode, StandardCharsets.UTF_8, StandardOpenOption.WRITE);
    }
}