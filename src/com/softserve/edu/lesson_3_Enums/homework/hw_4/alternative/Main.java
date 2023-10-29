package com.softserve.edu.lesson_3_Enums.homework.hw_4.alternative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This is an alternative way of solving this (I just didn't know how to do it right)

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleasee enter numbers of the students");
        int studNum = sc.nextInt();
        System.out.println("Please enter the season");
        System.out.println("1.Winter.");
        System.out.println("2.Spring.");
        System.out.println("3.Summer.");
        System.out.println("4.Autumn");
        int seasonChoice = sc.nextInt();
        Season current = null;

        switch (seasonChoice){
            case 1:
                current = Season.WINTER;
                break;
            case 2:
                current = Season.SPRING;
                break;
            case 3:
                current = Season.SUMMER;
                break;
            case 4:
                current = Season.AUTUMN;
                break;
            default:
                System.out.println("Please choice correct season");
        }

        Faculty faculty = new Faculty(studNum,current);
        System.out.println(faculty.getNum_students() + " students - " + faculty.getSeason().getName_en());

    }
}
