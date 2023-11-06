package Homework_04_Ivan;

public class MonthDaysApp {
        public static int calculateDaysInMonth(int monthNumber) {
            if (monthNumber < 1 || monthNumber > 12) {
                System.out.print("Invalid number. Please enter a number between 1 and 12. ");
                return -1; // Return -1 to indicate an invalid input
            }

            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return daysInMonth[monthNumber - 1];
        }
    }

