package PracticalTasks4;

import java.util.Locale;
import java.util.Scanner;

public class CountryAndContinents {
    static Scanner scanner = new Scanner(System.in);

    enum Continents {
        Asia, Africa, America, Europe,
        ;
    }

    public static void main(String[] args) {
        System.out.println("Enter country name:");
        String input = scanner.nextLine();
//        input.toUpperCase(0).toLowerCase(1);
        switch (input) {
            case "China", "Japan", "India", "Russia", "South Korea", "Indonesia", "Turkey", "Saudi Arabia", "Taiwan", "Iran":
                System.out.println("The country of " + input + " is located on the continent of " + Continents.Asia);
                break;
            case "Nigeria", "Egypt", "Ethiopia", "Morocco", "Angola", "Kenya", "Libya", "Tanzania":
                System.out.println("The country of " + input + " is located on the continent of " + Continents.Africa);
                break;
            case "United States", "Mexico", "Canada", "Dominican Republic", "Cuba", "Panama", "Argentina", "Brazil", "Colombia":
                System.out.println("The country of " + input + " is located on the continent of " + Continents.America);
                break;
            case "Austria", "Belgium", "Bulgaria", "Estonia", "France", "Germany", "Italy", "Poland", "Ukraine":
                System.out.println("The country of " + input + " is located on the continent of " + Continents.Europe);
                break;
            default:
                System.out.println("This country is not on our list.");
        }
    }

}
//"China", "Japan", "India", "Russia", "South Korea", "Indonesia", "Turkey", "Saudi Arabia", "Taiwan", "Iran"
