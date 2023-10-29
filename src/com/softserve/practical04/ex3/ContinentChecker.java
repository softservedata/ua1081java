package com.softserve.practical04.ex3;

import java.util.Scanner;

public class ContinentChecker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, input a name of a country:");
        String input = sc.nextLine();
        Continent continent = switch (input.toLowerCase()) {
            case "ukraine", "france", "italy" -> Continent.EUROPE;
            case "indonesia", "china", "malaysia" -> Continent.ASIA;
            case "egypt", "cameroon", "nigeria" -> Continent.AFRICA;
            case "australia", "new zealand", "papua new guinea" -> Continent.AUSTRALIA;
            case "usa", "canada", "mexico" -> Continent.NORTH_AMERICA;
            case "colombia", "brazil", "argentina" -> Continent.SOUTH_AMERICA;
            case "empty continent" -> Continent.ANTARCTICA;
            default -> Continent.INVALID_CONTINENT;
        };
        System.out.printf("The continent of your country %s is %s.", input, continent);
    }
}
