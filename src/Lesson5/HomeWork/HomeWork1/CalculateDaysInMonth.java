package Lesson5.HomeWork.HomeWork1;


import java.util.Scanner;

public class CalculateDaysInMonth {
    public static void calculateDaysInMonth() {
        int idMonth;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a month number:");
        idMonth = scan.nextInt();
        idMonth -= 1;



        if (idMonth >= 0 && idMonth <= 11) {
            System.out.println("Your month has  " + (daysInMonth[idMonth]) + " days");
        } else {
            System.out.println("Your month doesn't exist");
        }

    }

}
