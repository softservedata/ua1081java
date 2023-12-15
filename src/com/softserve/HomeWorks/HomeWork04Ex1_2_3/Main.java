package com.softserve.HomeWorks.HomeWork04Ex1_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Task1(scanner);
                    break;
                case 2:
                    Task2(scanner);
                    break;
                case 3:
                    Task3(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Select a problem to solve:");
        System.out.println("1. Check if three float numbers fall within the range [-5, 5]");
        System.out.println("2. Find the maximum and minimum among three integers");
        System.out.println("3. Map an HTTP error code to the corresponding name using an enum");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void Task1(Scanner scanner) {
        System.out.println("Task 1: Check if three float numbers fall within the range [-5, 5]");
        System.out.println("Enter three float numbers:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        if (isWithinRange(num1) && isWithinRange(num2) && isWithinRange(num3)) {
            System.out.println("All numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }

    private static void Task2(Scanner scanner) {
        System.out.println("Task 2: Find the maximum and minimum among three integers");
        System.out.println("Enter three integer numbers:");
        int intNum1 = scanner.nextInt();
        int intNum2 = scanner.nextInt();
        int intNum3 = scanner.nextInt();

        int max = Math.max(Math.max(intNum1, intNum2), intNum3);
        int min = Math.min(Math.min(intNum1, intNum2), intNum3);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    private static void Task3(Scanner scanner) {
        System.out.println("Problem 3: Map an HTTP error code to the corresponding name using an enum");
        System.out.println("Enter an HTTP error code:");
        int errorCode = scanner.nextInt();

        HTTPError error = mapErrorCode(errorCode);
        if (error != null) {
            System.out.println("HTTP Error " + errorCode + ": " + error.getDescription());
        } else {
            System.out.println("Unknown HTTP error code: " + errorCode);
        }
    }

    private static boolean isWithinRange(float num) {
        return num >= -5 && num <= 5;
    }

    private static HTTPError mapErrorCode(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getErrorCode() == errorCode) {
                return error;
            }
        }
        return null;
    }

    public enum HTTPError {
        ERROR_400(400, "Bad Request"),
        ERROR_401(401, "Unauthorized"),
        ERROR_402(402, "Payment Required");
        // Add more error codes as needed

        private final int errorCode;
        private final String description;

        HTTPError(int errorCode, String description) {
            this.errorCode = errorCode;
            this.description = description;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public String getDescription() {
            return description;
        }
    }
}
