package homework11.h4;

import java.util.Random;
import java.util.Scanner;


class CorrectText {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Enter first name:");
        String name = scanner.nextLine();
        boolean validName;
        do {
            validName = name.matches("[A-Za-z -]+");
            if (!validName) {
                System.out.println("Invalid name. Please enter again:");
                name = scanner.nextLine();
            }
        } while (!validName);


        System.out.println(" Enter last name:");
        String lastName = scanner.nextLine();
        boolean validLast;
        do {
            validLast = lastName.matches("[A-Za-z -]");
            if (!validLast) {
                System.out.println("Invalid last name. Please try again: ");
            }
        } while (validLast);

        String[] greeting = new String[]{
                "Hello, %s! Welcome.",
                "Hi %s! Nice to see you.",
                "Greetings, %s! How can I help you?",
                "%s, it's a pleasure to meet you!"
        };

        Random random = new Random();
        int indexGreeting = random.nextInt(greeting.length);
        System.out.printf(greeting[indexGreeting], name);


    }


}