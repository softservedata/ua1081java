package Homework13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataFormatMethod {
    private static void dataFormat () {
        LocalDateTime currentData = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy.");
        System.out.println("Validate format: " + currentData.format(formatter));
    }

    public static void main(String[] args) {
        dataFormat();
    }
}
