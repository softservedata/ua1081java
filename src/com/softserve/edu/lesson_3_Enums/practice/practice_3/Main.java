package com.softserve.edu.lesson_3_Enums.practice.practice_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the country name:");
        String country = sc.nextLine();
        Continent continent = switch (country) {
            case "Italy", "Poland", "Ukraine" -> Continent.EUROPE;
            case "Japan", "India", "China" -> Continent.ASIA;
            case "Nigeria", "Mali", "Gana" -> Continent.AFRICA;
            case "Australia", "New Zealand", "New Caledonia" -> Continent.AUSTRALIA;
            case "Brazil", "Peru", "Argentina" -> Continent.SOUTH_AMERICA;
            case "Mexico", "USA", "Canada" -> Continent.NORRTH_AMERICA;
            default -> Continent.ANTARCTICA;
        };
        System.out.println(continent);
    }
}

