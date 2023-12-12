package com.softserve.homework13_streamAPI.task01;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ProductDemo {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("Phone", LocalDate.of(2022, Month.DECEMBER, 11), 5000),
                new Product("Laptop", LocalDate.of(2023, Month.SEPTEMBER, 13), 1500),
                new Product("AirPods", LocalDate.of(2023, Month.MARCH, 12), 2000),
                new Product("Phone", LocalDate.of(2021, Month.AUGUST, 2), 4000),
                new Product("Phone", LocalDate.of(2023, Month.APRIL, 30), 2500),
                new Product("Phone", LocalDate.of(2021, Month.AUGUST, 5), 3000),
                new Product("AirPods", LocalDate.of(2023, Month.SEPTEMBER, 13), 2000),
                new Product("AirPods", LocalDate.of(2023, Month.AUGUST, 31), 5000),
                new Product("Phone", LocalDate.of(2023, Month.SEPTEMBER, 2), 6000),
                new Product("Phone", LocalDate.of(2023, Month.MARCH, 5), 2000),
                new Product("Laptop", LocalDate.of(2023, Month.AUGUST, 31), 3000),
                new Product("AirPods", LocalDate.of(2021, Month.MARCH, 31), 8000),
                new Product("Phone", LocalDate.of(2023, Month.SEPTEMBER, 5), 5000),
                new Product("Laptop", LocalDate.of(2023, Month.AUGUST, 31), 5000),
                new Product("Laptop", LocalDate.of(2021, Month.JUNE, 13), 5000),
                new Product("Laptop", LocalDate.of(2023, Month.MARCH, 5), 5000),
                new Product("Laptop", LocalDate.of(2023, Month.AUGUST, 31), 5000),
                new Product("AirPods", LocalDate.of(2023, Month.MARCH, 12), 5000),
                new Product("Phone", LocalDate.of(2022, Month.JUNE, 3), 2900),
                new Product("Phone", LocalDate.of(2022, Month.AUGUST, 2), 3500),
                new Product("AirPods", LocalDate.of(2022, Month.SEPTEMBER, 5), 5000),
                new Product("Phone", LocalDate.of(2022, Month.MARCH, 13), 3500),
                new Product("AirPods", LocalDate.of(2022, Month.SEPTEMBER, 5), 5000),
                new Product("Phone", LocalDate.of(2022, Month.JUNE, 2), 3500),
                new Product("Phone", LocalDate.of(2022, Month.AUGUST, 31), 3500));

        List<Product> filteredList = sortListProductByPriceViaCategoryPhoneOlderThanYear(productList);
        System.out.println("Filtered and sorted products:");
        for (Product product : filteredList) {
            System.out.println(product);
        }
    }

    public static List<Product> sortListProductByPriceViaCategoryPhoneOlderThanYear(List<Product> list) {
        return list.stream()
                .filter(product -> product.getManufacture().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(product -> product.getPrice()))
                .toList();
    }


}
