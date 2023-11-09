package com.softserve.homework04.homework.faculty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsWithdrawned;
        int studentsReinstated;

        //Create faculty with attributes
        Faculty faculty = new Faculty(150, Season.AUTUMN);

        System.out.println("The new academic year has begun. \n" +
                "It is " + faculty.getCurrentSeason().getSeasonName().toLowerCase() + " and the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() +
                " at the faculty. \n" + faculty.getStudentsNumber() + " students started their studies.");

        //Change season (winter) and students number
        faculty.setCurrentSeason(faculty.getCurrentSeason().nextSeason());
        System.out.print("\n" + faculty.getCurrentSeason().getSeasonName() + " has begun and it is the " +
                faculty.getCurrentSeason().getSemesterName().toLowerCase() + " period at the faculty.\n" +
                "Please indicate how many students were withdrawn before the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() + " period: ");

        studentsWithdrawned = scanner.nextInt();
        faculty.setStudentsNumber(faculty.getStudentsNumber() - studentsWithdrawned);

        System.out.println("\nAs of the beginning of the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() + " period, there are " +
                faculty.getStudentsNumber() + " students at the faculty.");

        //Change season (spring) and students number
        faculty.setCurrentSeason(faculty.getCurrentSeason().nextSeason());
        System.out.print("\n" + faculty.getCurrentSeason().getSeasonName() + " has begun and it is the " +
                faculty.getCurrentSeason().getSemesterName().toLowerCase() + " at the faculty.\n" +
                "Please indicate how many students were withdrawn before the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() + ": ");

        studentsWithdrawned = scanner.nextInt();
        faculty.setStudentsNumber(faculty.getStudentsNumber() - studentsWithdrawned);

        System.out.print("\nPlease indicate how many students were reinstated before the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() + ": ");

        studentsReinstated = scanner.nextInt();
        faculty.setStudentsNumber(faculty.getStudentsNumber() + studentsReinstated);

        System.out.println("\nAs of the beginning of the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() + ", there are " +
                faculty.getStudentsNumber() + " students at the faculty.");

        //Change season (winter) and students number
        faculty.setCurrentSeason(faculty.getCurrentSeason().nextSeason());
        System.out.print("\n" + faculty.getCurrentSeason().getSeasonName() + " has begun and it is the " +
                faculty.getCurrentSeason().getSemesterName().toLowerCase() + " at the faculty.\n" +
                "Please indicate how many students were withdrawn before the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() + ": ");

        studentsWithdrawned = scanner.nextInt();
        faculty.setStudentsNumber(faculty.getStudentsNumber() - studentsWithdrawned);

        System.out.println("\nAs of the beginning of the " + faculty.getCurrentSeason().getSemesterName().toLowerCase() + ", there are " +
                faculty.getStudentsNumber() + " students at the faculty.");
    }
}
