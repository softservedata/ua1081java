package com.softserve.edu.lesson_3_Enums.homework.hw_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students at the faculty: ");
        int number_students = sc.nextInt();
        System.out.println("Please enter the season: (winter/spring/summer/autumn)");
        String seasonChoice = sc.next();
        for (Season value : Season.values()) {
            if (seasonChoice.toLowerCase().equals(value.getEn()) && (number_students >= 2)) {
                switch (value) {
                    case WINTER -> System.out.println(number_students + " students have period of the winter exam");
                    case SPRING -> System.out.println(number_students + " students have second semester");
                    case AUTUMN -> System.out.println(number_students + " students have first semester");
                    case SUMMER -> System.out.println(number_students + " students have vacation period");
                }
            }



        }

    }
}











