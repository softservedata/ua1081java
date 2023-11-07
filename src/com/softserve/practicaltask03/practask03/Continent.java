package com.softserve.practicaltask03.practask03;

public class Continent {
    private String continent;
    public static Continent EUROPE = new Continent("EUROPE");
    public static Continent ASIA = new Continent("ASIA");
    public static Continent AFRICA = new Continent("AFRICA");
    public static Continent NORTH_AMERICA = new Continent("NORTH_AMERICA");
    public static Continent SOUTH_AMERICA = new Continent("SOUTH_AMERICA");
    public static Continent AUSTRALIA = new Continent("AUSTRALIA");

    private Continent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country is located in " + continent ;
    }
}
