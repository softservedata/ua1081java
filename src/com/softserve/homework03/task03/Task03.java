package com.softserve.homework03.task03;

import java.util.Scanner;

import static com.softserve.homework03.HomeWork03Demo.scanner;

public class Task03 {
    public static void displayErrorName() {
//        System.out.println("Enter number representing HTTP error code (e.g., 400, 401, 402, 403, 404).");
//        int errorNumber = scanner.nextInt();
//        if (errorNumber == 400) {
//            System.out.println(HttpError.BADREQUEST + " BAD REQUEST");
//        } else if (errorNumber == 401) {
//            System.out.println(HttpError.UNAUTHORIZED + " UNAUTHORIZED");
//        } else if (errorNumber == 402) {
//            System.out.println(HttpError.PAYMENTREQUIRED + " PAYMENT REQUIRED");
//        } else if (errorNumber == 403) {
//            System.out.println(HttpError.FORBIDDEN + " FORBIDDEN");
//        } else if (errorNumber == 404) {
//            System.out.println(HttpError.NOTFOUND + " NOT FOUND");
//        } else {
//            System.out.println("Invalid HTTP error code");
//        }
        //better use switch
        int errorNumber = scanner.nextInt();

        switch (errorNumber) {
            case 400 -> System.out.println(HttpError.BADREQUEST.getError() + " BAD REQUEST");
            case 401 -> System.out.println(HttpError.UNAUTHORIZED.getError() + " UNAUTHORIZED");
            case 402 -> System.out.println(HttpError.PAYMENTREQUIRED.getError() + " PAYMENT REQUIRED");
            case 403 -> System.out.println(HttpError.FORBIDDEN.getError() + " FORBIDDEN");
            case 404 -> System.out.println(HttpError.NOTFOUND.getError() + " NOT FOUND");
            default -> System.out.println("Invalid HTTP error code");
        }
        scanner.nextLine(); // clear the scanner buffer
        //I added scanner.nextLine() to clear the scanner buffer, because you can use scanner in other method
    }

}



