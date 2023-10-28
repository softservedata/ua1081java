package com.softserve.Homework04;

import java.util.Scanner;

public class Task04Faculty {
    public enum Season {
        SUMMER("chilling", "summer"),
        WINTER("exams", "winter"),
        SPRING("studding", "spring" +
                ""),
        AUTUMN("studding", "autumn");
        private final String name;
        private final String stage;

        private Season(String stage, String name) {
            this.name = name;
            this.stage = stage;
        }

        public String getStage() {
            return stage;
        }

        public String getName() {
            return name;
        }

        public static void main(String[] args) {
            System.out.println("******* Task 4 *******");
            int numberOfStudents;
            String nameSeason;
            String stage = null;
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter number of students: ");
            numberOfStudents = scanner.nextInt();
            scanner.nextLine();
            System.out.print(" Enter name of season: ");
            nameSeason = scanner.nextLine();
            switch (nameSeason.toLowerCase()) {
                case "autumn":
                    nameSeason = AUTUMN.getName();
                    stage = AUTUMN.getStage();
                    break;
                case "summer":
                    nameSeason = SUMMER.getName();
                    stage = SUMMER.getStage();
                    break;
                case "spring":
                    nameSeason = SPRING.getName();
                    stage = SPRING.getStage();
                    break;
                case "winter":
                    nameSeason = WINTER.getName();
                    stage = WINTER.getStage();
                    break;
            }
            System.out.println(" " + numberOfStudents + " students, " + nameSeason + " has come, so it's time to " + stage);
        }
    }
}
