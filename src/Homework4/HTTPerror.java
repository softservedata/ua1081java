package Homework4;

import java.util.Scanner;

public class HTTPerror {
    static Scanner scanner = new Scanner(System.in);

    enum Errors {
        e400("Bad Request"), e401("Unauthorized"), e402("Payment Required"),
        e403("Forbidden"), e404("Not Found"), e405("Method Not Allowed"),
        e406("Not Acceptable"), e407("Proxy Authentication Required"), e408("Request Timeout"),
        e409("Conflict"), e410("Gone"),
        ;

        private final String description;

        Errors(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter error code: ");
        int number = scanner.nextInt();
        switch (number) {
            case 400:
                System.out.println("Error " + number + " " + Errors.e400.getDescription());
                break;
            case 401:
                System.out.println("Error " + number + " " + Errors.e401.getDescription());
                break;
            case 402:
                System.out.println("Error " + number + " " + Errors.e402.getDescription());
                break;
            case 403:
                System.out.println("Error " + number + " " + Errors.e403.getDescription());
                break;
            case 404:
                System.out.println("Error " + number + " " + Errors.e404.getDescription());
                break;
            case 405:
                System.out.println("Error " + number + " " + Errors.e405.getDescription());
                break;
            case 406:
                System.out.println("Error " + number + " " + Errors.e406.getDescription());
                break;
            case 407:
                System.out.println("Error " + number + " " + Errors.e407.getDescription());
                break;
            case 408:
                System.out.println("Error " + number + " " + Errors.e408.getDescription());
                break;
            case 409:
                System.out.println("Error " + number + " " + Errors.e409.getDescription());
                break;
            case 410:
                System.out.println("Error " + number + " " + Errors.e410.getDescription());
                break;
            default:
                System.out.println("Our database contains error codes from 400 to 410.");
        }
    }
}
