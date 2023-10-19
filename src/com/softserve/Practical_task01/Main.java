package com.softserve.Practical_task01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Task selection menu:");
            System.out.println("1. Task 1");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Task 4");
            System.out.println("5. Exit");

            System.out.print("Select a task (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You have selected a task 1");
                    //Scanner scanner = new Scanner(System.in);

                    System.out.println("Enter the first string: ");
                    String firstString = scanner.nextLine();

                    System.out.println("Enter the second string: ");
                    String secondString = scanner.nextLine();

                    System.out.println("Enter the third string: ");
                    String thirdString = scanner.nextLine();

                    System.out.println("Reversed order:");
                    System.out.println(thirdString);
                    System.out.println(secondString);
                    System.out.println(firstString);

                    break;

                case 2:
                    System.out.println("You have selected a task 2");
                   // Scanner scanner2 = new Scanner(System.in);

                    System.out.print("Enter the first number: ");
                    double firstNumber = scanner.nextDouble();

                    System.out.print("Enter the second number: ");
                    double secondNumber = scanner.nextDouble();

                    System.out.print("Enter the third number: ");
                    double thirdNumber = scanner.nextDouble();

                    // Calculate the average
                    double average = (firstNumber + secondNumber + thirdNumber) / 3;

                    System.out.println("The average of the three numbers is: " + average);

                    break;

                case 3:
                    System.out.println("You have selected a Task 3");

                    System.out.println("Enter the value of a: ");
                    double a = scanner.nextDouble();

                    System.out.println("Enter the value of b: ");
                    double b = scanner.nextDouble();

                    double sum = a + b;
                    double difference = a - b;
                    double multiplication = a * b;

                    if (b != 0)
                    {
                        double division = a / b;
                        System.out.println("a + b = " + sum);
                        System.out.println("a - b = " + difference);
                        System.out.println("a * b = " + multiplication);
                        System.out.println("a / b = " + division);
                    }
                    else
                    {
                        System.out.println("a + b = " + sum);
                        System.out.println("a - b = " + difference);
                        System.out.println("a * b = " + multiplication);
                        System.out.println("Division by zero is not allowed");
                    }

                    break;

                case 4:
                    System.out.println("How are you?");

                    System.out.println("Write your answer:");
                    String answer = scanner.nextLine();

                    System.out.println("You are " + answer);
                    break;


                case 5:
                    System.out.println("The program is complete");
                    break;

                default:
                    System.out.println("Incorrect selection. Try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();


    }
}