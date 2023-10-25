package com.softserve.edu04.practical;

import java.util.Scanner;
//TODO Task3

/**
 * Declare an enum with the names of continents (e.g., Europe, Asia, Africa, etc.).
 * Ask the user to enter the name of the country from the console.
 * Using a switch statement, determine the continent to which the entered country belongs and output the name of the continent.
 * Output the result to the console.
 */
enum Continent {
    EUROPE, ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
}

public class ContinentChecker {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the name of a country: ");
        String country = scanner.nextLine();
        Continent continent = switch (country.toLowerCase()) {
            case "france", "germany", "ukraine" -> Continent.EUROPE;
            case "china", "india", "japan" -> Continent.ASIA;
            case "egypt", "kenya", "nigeria" -> Continent.AFRICA;
            case "usa", "canada", "mexico" -> Continent.NORTH_AMERICA;
            case "brazil", "argentina", "peru" -> Continent.SOUTH_AMERICA;
            case "australia", "new zealand" -> Continent.AUSTRALIA;
            default -> Continent.ANTARCTICA;//I don't know any countries in Antarctica :) But it is a continent.
        };

        System.out.println("The country " + country + " is in the continent " + continent);
    }
}
