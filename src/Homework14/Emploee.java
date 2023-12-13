package Homework14;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emploee {
    private String name;

    public Emploee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static Optional<String> mostPopular (Stream<Emploee> emploees) {
        Map<String, Long> nameCount = emploees.collect(Collectors.groupingBy(Emploee::getName, Collectors.counting()));
        if (nameCount.isEmpty()) {
            return Optional.empty();
        }
        Optional<Map.Entry<String, Long>> maxEntry = nameCount.entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue));
        return maxEntry.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Emploee empl1 = new Emploee("Bob");
        Emploee empl2 = new Emploee("Din");
        Emploee empl3 = new Emploee("Sam");
        Emploee empl4 = new Emploee("Sam");

        Stream<Emploee> employeeStr = Stream.of(empl1, empl2, empl3, empl4);

        Optional<String> mostPopular = mostPopular(employeeStr);

        System.out.println("Most popular name: " + mostPopular.orElse("No name"));
    }
}
