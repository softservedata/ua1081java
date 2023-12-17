package com.softserve.homework14.ex01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(new Product("Phone",
                LocalDate.of(2023, 7, 28), 3000), new Product("Phone",
                LocalDate.of(2022, 6, 27), 4500), new Product("Phone",
                LocalDate.of(2021, 8, 22), 3500), new Product("Phone",
                LocalDate.of(2023, 3, 23), 3500), new Product("Phone",
                LocalDate.of(2023, 2, 27), 2400), new Product("Phone",
                LocalDate.of(2022, 12, 26), 3600), new Product("Phone",
                LocalDate.of(2023, 6, 26), 2000), new Product("Phone",
                LocalDate.of(2023, 1, 26), 1500), new Product("Phone",
                LocalDate.of(2022, 4, 28), 1399), new Product("Phone",
                LocalDate.of(2018, 7, 23), 5500), new Product("Phone",
                LocalDate.of(2020, 10, 13), 7000), new Product("Fridge",
                LocalDate.of(2022, 1, 3), 16500), new Product("Oven",
                LocalDate.of(2023, 3, 25), 15000), new Product("Oven",
                LocalDate.of(2023, 6, 22), 14500), new Product("Oven",
                LocalDate.of(2021, 7, 27), 12300), new Product("Oven",
                LocalDate.of(2020, 5, 6), 11300), new Product("TV",
                LocalDate.of(2023, 6, 7), 16200), new Product("TV",
                LocalDate.of(2023, 3, 23), 17200), new Product("TV",
                LocalDate.of(2021, 8, 13), 13200), new Product("TV",
                LocalDate.of(2023, 10, 10), 19200)));
        System.out.println(productList.size());

        List<Product> filteredPhones = productList.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice, (o1, o2) -> Double.compare(o2, o1))).toList(); // descending order
        System.out.println(filteredPhones);

    }
}
