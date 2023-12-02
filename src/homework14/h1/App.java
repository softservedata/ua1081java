package homework14.h1;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2018, 11, 12), 2999));
        products.add(new Product("Phone", LocalDate.of(2019, 11, 12), 3300));
        products.add(new Product("Phone", LocalDate.of(2020, 11, 12), 2300));
        products.add(new Product("Phone", LocalDate.of(2023, 11, 12), 3100));
        products.add(new Product("Phone", LocalDate.of(2022, 11, 12), 3200));
        products.add(new Product("TV", LocalDate.of(2022, 11, 12), 3600));
        products.add(new Product("TV", LocalDate.of(2022, 11, 12), 3700));
        products.add(new Product("TV", LocalDate.of(2022, 11, 12), 3800));
        products.add(new Product("TV", LocalDate.of(2022, 11, 12), 3900));
        products.add(new Product("TV", LocalDate.of(2022, 11, 12), 4000));
        products.add(new Product("Laptop", LocalDate.of(2022, 11, 12), 4100));
        products.add(new Product("Laptop", LocalDate.of(2022, 11, 12), 4200));
        products.add(new Product("Laptop", LocalDate.of(2022, 11, 12), 4300));
        products.add(new Product("Laptop", LocalDate.of(2022, 11, 12), 4400));
        products.add(new Product("Laptop", LocalDate.of(2022, 11, 12), 4500));
        products.add(new Product("Printer", LocalDate.of(2022, 11, 12), 1000));
        products.add(new Product("Printer", LocalDate.of(2022, 11, 12), 1100));
        products.add(new Product("Printer", LocalDate.of(2022, 11, 12), 1200));
        products.add(new Product("Printer", LocalDate.of(2022, 11, 12), 1300));
        products.add(new Product("Printer", LocalDate.of(2022, 11, 12), 1400));

        Period period = Period.ofMonths(12);
        LocalDate minusTwelve = LocalDate.now().minus(period);

        products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getManufactureDate().isBefore(minusTwelve))
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);


    }
}
