package homework14.h2;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Employee> employees = Stream.of(
                new Employee("Bob", 33),
                new Employee("Din", 32),
                new Employee("Sam", 31),
                new Employee("Sam", 32),
                new Employee("Eva", 30)
        );

        Optional<String> mostPopular=mostPopularName(employees);
        mostPopular.ifPresentOrElse(System.out::println,
                () -> System.out.println("Stream is empty!"));
    }
    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> toMap = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        Optional<Map.Entry<String,Long>> maxEntry= toMap.entrySet()
                .stream().max(Map.Entry.comparingByValue());
        return maxEntry.map(Map.Entry::getKey);
    }
}
