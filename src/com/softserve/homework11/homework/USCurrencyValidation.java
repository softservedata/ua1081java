/*
The task requires implementation of a pattern to match US currency format,
which includes a dollar sign ($) followed by any number of digits, a dot, and two digits after the dot.
The next step is to input a text containing several instances of US currency format via the console.
Finally, display all the occurrences of US currency format on the console screen.
 */

package com.softserve.homework11.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrencyValidation {

    public static boolean validateCurrency (String currency) {
        String pattern = "^\\$(\\d+)(\\.\\d{2})$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(currency);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter several values of the value of the product to be checked for currency validity: ");

        String[] separateValues = scanner.nextLine().split("\\s+");
        int counter = 0;

        System.out.println("All the occurrences of US currency format: ");

        for (String value : separateValues) {
            if (validateCurrency(value)) {
                counter += 1;
                System.out.println("\t- " + value);
            }
        }

        if (counter == 0) {
            System.out.println("\tNone");
        }

    }
}
