package com.softserve.practicaltask03.practask03;

import java.util.Scanner;

public class PracticalTask03 {
    static Scanner scanner = new Scanner(System.in);

    public static void findContinentByCountry() {
        System.out.println("Enter name of country: ");
        String countryName = scanner.nextLine().toLowerCase();
        switch (countryName) {
            case "afghanistan", "armenia", "azerbaijan", "bahrain", "bangladesh", "bhutan",
                    "brunei", "cambodia", "china", "cyprus", "georgia", "india", "indonesia", "iran",
                    "iraq", "israel", "japan", "jordan", "kazakhstan", "kuwait", "kyrgyzstan", "laos", "lebanon",
                    "malaysia", "maldives", "mongolia", "myanmar", "nepal", "north korea", "oman", "pakistan",
                    "philippines", "qatar", "saudi arabia", "singapore", "south korea", "syria", "tajikistan",
                    "thailand", "turkey", "turkmenistan", "emirates", "uzbekistan", "vietnam",
                    "yemen" -> System.out.println(Continent.ASIA);
            case "angola", "benin", "botswana", "burkina faso", "burundi", "cameroon", "chad", "comoros", "congo",
                    "egypt", "eritrea", "ethiopia", "gabon", "gambia", "ghana", "guinea", "kenya", "libya",
                    "madagascar", "malawi", "mali", "mauritania", "morocco", "nigeria", "senegal", "seychelles",
                    "sudan", "tanzania", "tunisia", "uganda", "zambia",
                    "zimbabwe" -> System.out.println(Continent.AFRICA);
            case "albania", "andorra", "austria", "belarus", "belgium", "bulgaria", "croatia", "czech republic",
                    "denmark", "estonia", "finland", "france", "germany", "greece", "hungary", "iceland",
                    "ireland", "italy", "latvia", "liechtenstein", "lithuania", "luxembourg", "malta", "moldova",
                    "monaco", "montenegro", "netherlands", "norway", "poland", "portugal", "romania", "russia",
                    "serbia", "slovakia", "slovenia", "spain", "sweden", "switzerland", "ukraine",
                    "united kingdom" -> System.out.println(Continent.EUROPE);
            case "usa", "mexico", "canada", "guatemala", "haiti", "dominican republic", "cuba", "jamaica", "bahamas", "barbados",
                    "bermuda" -> System.out.println(Continent.NORTH_AMERICA);
            case "brazil", "colombia", "argentina", "peru", "venezuela", "chile", "ecuador", "bolivia",
                    "paraguay", "uruguay" -> System.out.println(Continent.SOUTH_AMERICA);
            case "australia", "new zealand", "fiji", "samoa", "papua new guinea",
                    "solomon islands" -> System.out.println(Continent.AUSTRALIA);
            default -> System.out.println("You entered incorrect country name");
        }
    }
}
