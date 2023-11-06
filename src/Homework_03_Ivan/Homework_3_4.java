/*
4.* Create a class named Faculty and input the information about the number of students (using the console)
and the current season (using enum).
Each season must have a name in English (use the constructor). In the main() method, check the correctness of the code.
Here, a season can signify a time of year (winter, spring, summer, autumn).
In the context of this task, it can correspond to a certain semester.
For example, autumn could be the first semester, spring - the second, and summer - the vacation period.
Winter may correspond to the period of winter exams.

 */

package Homework_03_Ivan;

import java.util.Scanner;

public class Homework_3_4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    int numberOfStudents = scanner.nextInt();

    System.out.println("Choose the current season: ");
    for (Season season: Season.values()){
        System.out.println(season.ordinal()+ 1 + ". " + season.getName());
    }
    int seasonChoice = scanner.nextInt();
    Season currentSeason = Season.values()[seasonChoice-1];

    Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println("Faculty information:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getName());
    }
    }

    enum Season {
        WINTER ("Winter"), SPRING ("Spring"), SUMMER ("Summer"), AUTUMN ("Autumn");
        private final String name;
        Season (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class Faculty {
        private int numberOfStudents;
        private Season currentSeason;

        public Faculty (int numberOfStudents,Season currentSeason) {
            this.numberOfStudents = numberOfStudents;
            this.currentSeason = currentSeason;
        }
        public int getNumberOfStudents(){
            return numberOfStudents;
        }
        public Season getCurrentSeason() {
            return currentSeason;
        }
     }

