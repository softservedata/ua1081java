package com.softserve.HomeWorks.HomeWork04Ex4;

import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public enum Season {
        WINTER("Winter"),
        SPRING("Spring"),
        SUMMER("Summer"),
        AUTUMN("Autumn");

        private final String seasonName;

        Season(String seasonName) {
            this.seasonName = seasonName;
        }

        public String getSeasonName() {
            return seasonName;
        }
    }

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public void displayFacultyInfo() {
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Current Season: " + currentSeason.getSeasonName());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input information about the faculty
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Choose the current season:");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        System.out.print("Enter the corresponding number for the season: ");
        int seasonChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Season currentSeason;

        switch (seasonChoice) {
            case 1:
                currentSeason = Season.WINTER;
                break;
            case 2:
                currentSeason = Season.SPRING;
                break;
            case 3:
                currentSeason = Season.SUMMER;
                break;
            case 4:
                currentSeason = Season.AUTUMN;
                break;
            default:
                System.out.println("Invalid choice for the season. Exiting program.");
                return;
        }

        // Create a Faculty object with the input information
        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        // Display faculty information
        System.out.println("\nFaculty Information:");
        faculty.displayFacultyInfo();
    }
}

