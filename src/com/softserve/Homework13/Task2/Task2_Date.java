package com.softserve.Homework13.Task2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Task2_Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter  date (dd:MM:yyyy): ");
        String date =scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        LocalDate localDate;
        try {
         localDate = LocalDate.parse(date,dateTimeFormatter);
            System.out.println(" Your date: "+localDate.format(dateTimeFormatter));
        }catch (DateTimeException e){
            throw  new RuntimeException(" Wrong date!");
        }
    }
}
