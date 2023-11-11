package Homework4;

import java.util.Scanner;

public class Faculty {
    static Scanner scanner = new Scanner(System.in);

    enum Season {
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

    // Faculty class
    private final int numberOfStudents;
    private final Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public static void main(String[] args) {

        // Input number of students
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input current season
        System.out.println("Enter the current season:");
        for (Season season : Season.values()) {
            System.out.println(season + " - " + season.getSeasonName());
        }
        Season season = Season.valueOf(scanner.nextLine().toUpperCase());

        // Creating Faculty object
        Faculty faculty = new Faculty(students, season);

        // Output faculty details
        System.out.println("Faculty details:");
        System.out.println("Number of students: " + faculty.numberOfStudents);
        System.out.println("Current season: " + faculty.currentSeason.getSeasonName());

        scanner.close();
    }
}
