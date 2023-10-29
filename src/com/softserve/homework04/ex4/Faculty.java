package com.softserve.homework04.ex4;

import java.util.Scanner;

public class Faculty {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, input information about number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine(); //skipping blank enter after nextInt

        //assuming faculty may contain from 10 to 100 students
        if (numberOfStudents >= 10 && numberOfStudents <= 100) {
            System.out.println("Please, input information about a season: ");
            String season = sc.nextLine();
            String seasonName = StudyingSeasons.valueOf(season.toUpperCase()).getSeason();
            String seasonCheck = StudyingSeasons.valueOf(season.toUpperCase()).getActivity();
            System.out.printf("You have entered %s, the activity should be %s.", seasonName, seasonCheck);
        } else System.out.println("Sorry, you have input illegal number of students. A faculty may contain from 10 to 100.");
    }
}
