package homework4.h3;

import java.util.Scanner;


enum  HTTPError{
    Bad_Request, Unauthorized, Payment_Request, Forbidden, Not_found
}
public class Error {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter error number:");
        String error = sc.nextLine();
        HTTPError check = switch (error.toLowerCase()) {
            case "400" -> HTTPError.Bad_Request;
            case "401" -> HTTPError.Unauthorized;
            case "402" -> HTTPError.Payment_Request;
            case "403" -> HTTPError.Forbidden;
            default ->  HTTPError.Not_found;

       };
        System.out.println("Your error means: " + check);
    }
}