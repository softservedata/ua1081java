package Homework11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a text containing several instances of US currency format:");
        String inputText = scanner.nextLine();

        String currencyFormat = "\\$\\d+(\\.\\d{2})?";

        Pattern p = Pattern.compile(currencyFormat);
        Matcher m = p.matcher(inputText);
        while (m.find()) {
            System.out.println(m.group());
        }
        scanner.close();
    }
}
