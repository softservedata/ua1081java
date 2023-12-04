package com.softserve.Homework13.Task3;

import java.time.LocalDate;
import java.util.Scanner;

public class Task3_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter  year: ");
        String date =scanner.nextLine();
        System.out.println(" Year "+date+" is leap: "+isLeapYear(date));
    }
    public static boolean isLeapYear(String year){
        LocalDate date = LocalDate.ofYearDay( Integer.parseInt(year), 1);
        return date.isLeapYear();
    }
}
