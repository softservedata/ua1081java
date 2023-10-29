package com.softserve.homework03.task03;

import java.util.Scanner;

public class Task03 {
    static Scanner scanner = new Scanner(System.in);

    public static void displayErrorName() {
        System.out.println("Enter number representing HTTP error code (e.g., 400, 401, 402, 403, 404).");
        int errorNumber = scanner.nextInt();
        if (errorNumber == 400) {
            System.out.println(HttpError.BADREQUEST + " BAD REQUEST");
        } else if (errorNumber == 401) {
            System.out.println(HttpError.UNAUTHORIZED + " UNAUTHORIZED");
        } else if (errorNumber == 402) {
            System.out.println(HttpError.PAYMENTREQUIRED + " PAYMENT REQUIRED");
        } else if (errorNumber == 403) {
            System.out.println(HttpError.FORBIDDEN + " FORBIDDEN");
        } else if (errorNumber == 404) {
            System.out.println(HttpError.NOTFOUND + " NOT FOUND");
        } else {
            System.out.println("Invalid HTTP error code");
        }
    }

}


