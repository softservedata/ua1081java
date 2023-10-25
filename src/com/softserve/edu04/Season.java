package com.softserve.edu04;

 class Season {
    private final String season;
    public static final Season WINTER = new Season("Winter");
    public static final Season SPRING = new Season("Spring");
    public static final Season SUMMER = new Season("Summer");
    public static final Season AUTUMN = new Season("Autumn");
    private Season(String season) {
        this.season = season;
    }

}

class Demo{
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season);

        //Season season1 = Season("AUTUMN");//error
    }
}
