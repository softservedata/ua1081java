/*
3. Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.).
The program should use an enum called HTTPError to map the input number to the corresponding name of the error and output it.
*/
package Homework_03_Ivan;

import java.util.Scanner;

public class Homework_3_3 {

    public enum HTTPError {
        Informational_responses, Successful_responses, Redirection_messages, Client_error_responses, Server_error_responses
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of HTTP error [100-499]: ");
        int number = scanner.nextInt();
        HTTPError httpError;

        if (number >= 100 && number <= 199) {
            httpError = HTTPError.Informational_responses;
        } else if (number >= 200 && number <= 299) {
            httpError = HTTPError.Successful_responses;
        } else if (number >= 300 && number <= 399) {
            httpError = HTTPError.Redirection_messages;
        } else if (number >= 400 && number <= 499) {
            httpError = HTTPError.Client_error_responses;
        } else {
            httpError = HTTPError.Server_error_responses;
        }

        System.out.println(httpError);
    }
}


/*
        Informational responses (100 – 199)
        Successful responses (200 – 299)
        Redirection messages (300 – 399)
        Client error responses (400 – 499)
        Server error responses (500 – 599)
*/
