package homework11.h3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CurrencyFormat {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String usaPattern = "\\$\\d+\\.\\d{2}";
        System.out.println("Enter text :");
        String inputText = scanner.nextLine();
        Pattern p = Pattern.compile(usaPattern);
        Matcher m = p.matcher(inputText);
        System.out.println("US Currency Formats found in the text:");
        while (m.find()) {
            System.out.println(m.group());
        }


    }

}