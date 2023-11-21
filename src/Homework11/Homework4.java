package Homework11;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = validateInput("Enter first name: ", scanner);
        String lastName = validateInput("Enter last name: ", scanner);
        String greetingMessage = greetingMessage(firstName);

        System.out.printf("%s%n", greetingMessage);
    }

    private static String validateInput(String text, Scanner scanner) {
        String name;
        do {
            System.out.println(text);
            name = scanner.nextLine();
        } while (!validName(name));

        return name;
    }

    private static boolean validName(String name) {
        String pattern = "^[A-Za-z -]+$";
        return Pattern.matches(pattern, name);
    }

    private static String greetingMessage(String name) {
        Random random = new Random();
        String[] greetingMessage = {
                "Hi %s. Nice to meet you!",
                "Hello %s. Welcome.",
                "Hi %s. Have a nice day.",
                "Hi %s. Thank you for coming.",
                "It's great to have you here, %s."};
        int index = random.nextInt(greetingMessage.length);
        return String.format(greetingMessage[index], name);
    }
}
