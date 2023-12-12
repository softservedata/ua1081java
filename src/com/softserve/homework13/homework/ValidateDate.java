package com.softserve.homework13.homework;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ValidateDate {

    public static boolean validateDate(String date) {
        try {
            DateTimeFormatter dateFormatter  = DateTimeFormatter.ofPattern("MM.dd.yy");
            dateFormatter.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter date to be validated: ");
        String date = scanner.nextLine();
        boolean result = validateDate(date);
        System.out.println(result ? "Date is valid" : "Date is NOT valid");
    }
}
