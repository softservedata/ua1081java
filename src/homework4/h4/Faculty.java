package homework4.h4;

import java.util.Scanner;

public class Faculty {
    enum CurrentSeason{
        WINTER("period of winter exams"),
        SPRING("second semester"),
        SUMMER("vacation period"),
        AUTUMN("first semester");

        private final String name;

        CurrentSeason(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter season");
        String season = sc.nextLine();

        switch (season.toLowerCase()){
            case "winter":
                season = String.valueOf(CurrentSeason.WINTER.name);
                break;
            case  "spring":
                season = String.valueOf(CurrentSeason.SPRING.name);
                break;
            case "summer":
                season = String.valueOf(CurrentSeason.SUMMER.name);
                break;
            case "autumn":
                season = String.valueOf(CurrentSeason.AUTUMN.name);
                break;

        }
        System.out.println("Number of student " + number + " and its " + season );






        }
    }
