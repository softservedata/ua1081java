package com.softserve.homework04.practicaltask;

import java.util.Scanner;

public enum Continent {
    ASIA, AFRICA, NORTHAMERICA, SOUTHAMERICA, EUROPE
}

class ContinentChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Continent continent;
        System.out.print("Please enter the country name: ");
        String country = scanner.nextLine();
        continent = switch (country) {
            case "Japan", "Taiwan", "India" -> Continent.ASIA;
            case "Nigeria", "Egypt", "Zambia" -> Continent.AFRICA;
            case "Jamaica", "Canada", "Aruba" -> Continent.NORTHAMERICA;
            case "Brazil", "Argentina", "Colombia" -> Continent.SOUTHAMERICA;
            default -> Continent.EUROPE;
        };
        System.out.print(continent);
    }
}