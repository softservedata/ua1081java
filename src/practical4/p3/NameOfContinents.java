package practical4.p3;

import java.util.Locale;
import java.util.Scanner;

class NameOfContinents {

    public static void main(String[] args) {
        System.out.println("Enter country: ");
        String country = scanner.next();
        Continents continents = Continents.getForCountry(country);
        System.out.println(continents);
        scanner.close();
    }

    static Scanner scanner = new Scanner(System.in);

    enum Continents {
        AFRICA, ASIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA;

        @Override
        public String toString() {
            String name = name();
            return name.charAt(0) + name.substring(1).toLowerCase();
        }

        public static Continents getForCountry(String country) {
            return switch (country.toUpperCase()){
                case "EGYPT", "SOUTH_AFRICA", "NIGERIA" -> AFRICA;
                case "CHINA", "INDIA", "JAPAN" -> ASIA;
                case "UKRAINE", "POLAND", "GERMANY" -> EUROPE;
                case "USA", "CANADA", "MEXICO" -> NORTH_AMERICA;
                case "BRAZIL", "ARGENTINA", "CHILE" -> SOUTH_AMERICA;
                case "AUSTRALIA", "NEW_ZEALAND", "FIJI" -> AUSTRALIA;
                case "ANTARCTICA" -> ANTARCTICA;
                default -> throw new IllegalArgumentException("No such country" + country);
            };
        }
    }

}