package com.softserve.homework14.homework;

import java.time.LocalDate;
import java.util.*;

public class Product {

    private String category;
    private LocalDate manufactureDate;
    private double price;

    public Product(String category, LocalDate manufactureDate, double price) {
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: \n\tCategory: " + category + "\n\tManufacture Date: " + manufactureDate + "\n\tPrice: " + price;
    }

    public static void representProducts(List<Product> products) {
        products.stream()
                .filter(product -> product.getCategory().equals("Phone") && product.getPrice() > 3000 && product.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(x -> x, (p1, p2) -> (int) (p1.getPrice() - p2.getPrice())))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of( 2014, 2, 11), 3542.4));
        products.add(new Product("Computer", LocalDate.of( 2015, 10, 22), 1050.6));
        products.add(new Product("Computer Mice", LocalDate.of( 2023, 8, 17), 10.3));
        products.add(new Product("Frig", LocalDate.of( 2008, 11, 29), 1000.0));
        products.add(new Product("Microwave oven", LocalDate.of( 2011, 12, 2), 234.7));
        products.add(new Product("Phone", LocalDate.of( 2020, 5, 18), 2435.7));
        products.add(new Product("Headphone", LocalDate.of( 2023, 5, 20), 12.5));
        products.add(new Product("Music speakers", LocalDate.of( 2021, 7, 5), 123.5));
        products.add(new Product("Power bank", LocalDate.of( 2023, 9, 26), 23.2));
        products.add(new Product("Phone", LocalDate.of( 2022, 1, 28), 1873.9));
        products.add(new Product("Computer", LocalDate.of( 2019, 10, 26), 2198.7));
        products.add(new Product("Computer Mice", LocalDate.of( 2017, 6, 18), 8.0));
        products.add(new Product("Microwave oven", LocalDate.of( 2018, 3, 3), 456.3));
        products.add(new Product("Phone", LocalDate.of( 2023, 9, 9), 1890.4));
        products.add(new Product("Phone", LocalDate.of( 2018, 12, 1), 3782.0));
        products.add(new Product("Headphone", LocalDate.of( 2011, 6, 20), 2.5));
        products.add(new Product("Phone", LocalDate.of( 2021, 2, 15), 3187.8));
        products.add(new Product("Music speakers", LocalDate.of( 2019, 7, 6), 287.4));
        products.add(new Product("Phone", LocalDate.of( 2023, 5, 19), 3542.4));
        products.add(new Product("Power bank", LocalDate.of( 2023, 3, 21), 100.4));

        representProducts(products);
    }
}
