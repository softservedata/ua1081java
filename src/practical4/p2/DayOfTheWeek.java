package practical4.p2;

import java.util.Scanner;

class DayOfTheWeek{
    static Scanner scanner = new Scanner(System.in);
    enum Day{
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четвер"),
        FRIDAY("Friday", "П'ятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");

        private String englishName;
        private String ukrainianName;

        Day(String englishName, String ukrainianName) {
            this.englishName = englishName;
            this.ukrainianName = ukrainianName;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of day of the week: ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber){
            case 1-> System.out.println("Its " + Day.MONDAY.englishName
                    + " in English and " + Day.MONDAY.ukrainianName + " in Ukrainian");
            case 2-> System.out.println("Its " + Day.TUESDAY.englishName
                    + " in English and " + Day.TUESDAY.ukrainianName + " in Ukrainian");
            case 3-> System.out.println("Its " + Day.WEDNESDAY.englishName
                    + " in English and " + Day.WEDNESDAY.ukrainianName + " in Ukrainian");
            case 4-> System.out.println("Its " + Day.THURSDAY.englishName
                    + " in English and " + Day.THURSDAY.ukrainianName + " in Ukrainian");
            case 5-> System.out.println("Its " + Day.FRIDAY.englishName
                    + " in English and " + Day.FRIDAY.ukrainianName + " in Ukrainian");
            case 6-> System.out.println("Its " + Day.SATURDAY.englishName
                    + " in English and " + Day.SATURDAY.ukrainianName + " in Ukrainian");
            case 7-> System.out.println("Its " + Day.SUNDAY.englishName
                    + " in English and " + Day.SUNDAY.ukrainianName + " in Ukrainian");
            default -> System.out.println("There is no such day of the week");
        }
        scanner.close();
    }

}