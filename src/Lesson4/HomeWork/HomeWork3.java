package Lesson4.HomeWork;

import java.util.Scanner;

enum HTTPError {
    INFORMATIONAL_RESPONSE, OPERATION_SUCCESS, REDIRECTION, CLIENT_ERROR, SERVER_ERROR, DOESNT_MATCH
}

public class HomeWork3 {
    public static void main(String[] args) {
        HTTPError httpError;
        int codeError;
        System.out.println("Enter your error from 100 to 500");
        Scanner scan = new Scanner(System.in);
        codeError = scan.nextInt();
        httpError = switch (codeError / 100) {
            case 1 -> HTTPError.INFORMATIONAL_RESPONSE;
            case 2 -> HTTPError.OPERATION_SUCCESS;
            case 3 -> HTTPError.REDIRECTION;
            case 4 -> HTTPError.CLIENT_ERROR;
            case 5 -> HTTPError.SERVER_ERROR;
            default -> HTTPError.DOESNT_MATCH;
        };

        System.out.println("Your error " + httpError);
    }

}
