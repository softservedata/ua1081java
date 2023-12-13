package Homework14;

import PracticalTasks5.Employee;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    private final String manufactureCategory;
    private final LocalDate dateOFManufacture;
    private final double price;

    public Product(String manufactureCategory, LocalDate dateOFManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOFManufacture = dateOFManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getDateOFManufacture() {
        return dateOFManufacture;
    }

    public double getPrice() {
        return price;
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return null;
    }

    public static List<Product> productSort (List<Product> products) {
        return products.stream()
                .filter(product -> product.getManufactureCategory().equalsIgnoreCase("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOFManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "\tProduct: " +
                "Manufacture Category - '" + manufactureCategory + '\'' +
                ", Date OF Manufacture - " + dateOFManufacture +
                ", Price - " + price +
                '\n';
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2023, Month.AUGUST, 11), 25000));
        products.add(new Product("Laptop", LocalDate.of(2021, Month.DECEMBER, 25), 18999));
        products.add(new Product("Phone", LocalDate.of(2020, Month.AUGUST, 21), 9500));
        products.add(new Product("TV", LocalDate.of(2020, Month.SEPTEMBER, 2), 26000));
        products.add(new Product("Laptop", LocalDate.of(2023, Month.JUNE, 4), 32000));
        products.add(new Product("Phone", LocalDate.of(2017, Month.JANUARY, 17), 2300));
        products.add(new Product("TV", LocalDate.of(2022, Month.JULY, 10), 19000));
        products.add(new Product("TV", LocalDate.of(2020, Month.OCTOBER, 9), 15500));
        products.add(new Product("Phone", LocalDate.of(2022, Month.NOVEMBER, 5), 19500));
        products.add(new Product("Laptop", LocalDate.of(2022, Month.AUGUST, 23), 24000));
        products.add(new Product("Phone", LocalDate.of(2021, Month.AUGUST, 8), 4650));
        products.add(new Product("TV", LocalDate.of(2019, Month.SEPTEMBER, 16), 8999));
        products.add(new Product("Laptop", LocalDate.of(2018, Month.NOVEMBER, 25),7600 ));
        products.add(new Product("TV", LocalDate.of(2017, Month.DECEMBER, 30), 5500));
        products.add(new Product("Phone", LocalDate.of(2020, Month.JANUARY, 26), 11300));
        products.add(new Product("Laptop", LocalDate.of(2016, Month.FEBRUARY, 1), 4500));
        products.add(new Product("Phone", LocalDate.of(2014, Month.MARCH, 13), 2650));
        products.add(new Product("TV", LocalDate.of(2023, Month.APRIL, 4), 37900));
        products.add(new Product("Phone", LocalDate.of(2018, Month.MAY, 30), 17300));
        products.add(new Product("Laptop", LocalDate.of(2021, Month.JUNE, 17), 16400));

        System.out.println(productSort(products));
    }
}
