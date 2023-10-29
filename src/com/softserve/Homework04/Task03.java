package com.softserve.Homework04;

import java.util.Scanner;

public class Task03 {
    public enum HTTP{
        ERROR400(400),//better to use here 400("Bad Request") and the same for other codes
        ERROR401(401),
        ERROR402(402),
        ERROR403(403),
        ERROR404(404),
        ERROR405(405),
        ERROR406(406),
        ERROR407(407);

        private HTTP(int code){
        }

        @Override
        public String toString() {
            return " "+super.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("******* Task 3 *******");
        System.out.print(" Enter code of error: ");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        switch ((code)){
            case 400 : System.out.println(HTTP.ERROR400);break;
            case 401 : System.out.println(HTTP.ERROR401);break;
            case 402 : System.out.println(HTTP.ERROR402);break;
            case 403 : System.out.println(HTTP.ERROR403);break;
            case 404 : System.out.println(HTTP.ERROR404);break;
            case 405 : System.out.println(HTTP.ERROR405);break;
            case 406 : System.out.println(HTTP.ERROR406);break;
            case 407 : System.out.println(HTTP.ERROR407);break;
           default:
               System.out.println(" Unknown error"); break;
        }
    }
}
