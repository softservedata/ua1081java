package com.softserve.edu.lesson_13_streamAPI.homework.hw_1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milka", "Chocolate", LocalDate.of(1970, Month.NOVEMBER, 4), 3.40));
        products.add(new Product("Apple", "Phone", LocalDate.of(1976, Month.APRIL, 1), 899.00));
        products.add(new Product("HP", "Сomputer", LocalDate.of(1939, Month.JULY, 2), 499.99));
        products.add(new Product("Nokia", "Phone", LocalDate.of(1985, Month.OCTOBER, 17), 150.20));
        products.add(new Product("Philips", "Iron", LocalDate.of(1891, Month.MAY, 15), 109.00));
        products.add(new Product("Samsung", "Phone", LocalDate.of(1969, Month.JANUARY, 13), 600.3));
        products.add(new Product("Huawei", "Phone", LocalDate.of(1943, Month.JULY, 28), 200.10));
        products.add(new Product("Philip Morris", "Tobacco", LocalDate.of(1847, Month.NOVEMBER, 10), 11.99));

        List<Product> sortedByPhone = products.stream()
                .filter(product -> "Phone".equals(product.getCategory()))
                .filter(product -> product.getPrice() > 300)
                .filter(product -> product.getDate().isBefore(LocalDate.now().minusYears(45)))
                .sorted((p1, p2) -> (int) (p1.getPrice() - p2.getPrice())).toList();
        sortedByPhone.forEach(System.out::println);
    }
}
