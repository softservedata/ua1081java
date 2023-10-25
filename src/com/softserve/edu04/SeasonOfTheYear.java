package com.softserve.edu04;

public enum SeasonOfTheYear {
    WINTER, SPRING, SUMMER, AUTUMN
}

class Application {
    public static void main(String[] args) {
        SeasonOfTheYear season;
        season = SeasonOfTheYear.WINTER;
        String name = "WINTER";
        String name1 = "WONTER";//will be exception, because there is no such enum
        SeasonOfTheYear seasonName = SeasonOfTheYear.valueOf(name);
        SeasonOfTheYear seasonName1 = SeasonOfTheYear.valueOf(name1);

        System.out.println(seasonName);
        System.out.println(seasonName1);//exception
    }
}