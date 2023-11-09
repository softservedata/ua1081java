package PracticalTasks4;

import java.util.Scanner;

public class DayOfTheWeek {
    static Scanner scanner = new Scanner(System.in);

    enum dayOfWeek {
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четверг"),
        FRIDAY("Friday", "Пятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");
        private final String engname;
        private final String ukrname;

        dayOfWeek(String engname, String ukrname) {
            this.engname = engname;
            this.ukrname = ukrname;
        }

        public String getEngname() {
            return engname;
        }

        public String getUkrname() {
            return ukrname;
        }

        public static void main(String[] args) {
            System.out.println("Enter the number of the day of the week: ");
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Day of the week (English): " + dayOfWeek.MONDAY.getEngname());
                    System.out.println("Day of the week (Ukrainian): " + dayOfWeek.MONDAY.getUkrname());
                    break;
                case 2:
                    System.out.println("Day of the week (English): " + dayOfWeek.TUESDAY.getEngname());
                    System.out.println("Day of the week (Ukrainian): " + dayOfWeek.TUESDAY.getUkrname());
                    break;
                case 3:
                    System.out.println("Day of the week (English): " + dayOfWeek.WEDNESDAY.getEngname());
                    System.out.println("Day of the week (Ukrainian): " + dayOfWeek.WEDNESDAY.getUkrname());
                    break;
                case 4:
                    System.out.println("Day of the week (English): " + dayOfWeek.THURSDAY.getEngname());
                    System.out.println("Day of the week (Ukrainian): " + dayOfWeek.THURSDAY.getUkrname());
                    break;
                case 5:
                    System.out.println("Day of the week (English): " + dayOfWeek.FRIDAY.getEngname());
                    System.out.println("Day of the week (Ukrainian): " + dayOfWeek.FRIDAY.getUkrname());
                    break;
                case 6:
                    System.out.println("Day of the week (English): " + dayOfWeek.SATURDAY.getEngname());
                    System.out.println("Day of the week (Ukrainian): " + dayOfWeek.SATURDAY.getUkrname());
                    break;
                case 7:
                    System.out.println("Day of the week (English): " + dayOfWeek.SUNDAY.getEngname());
                    System.out.println("Day of the week (Ukrainian): " + dayOfWeek.SUNDAY.getUkrname());
                    break;
                default:
                    System.out.println("There are only seven days in a week!");
            }
        }
    }
}