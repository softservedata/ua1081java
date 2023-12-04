package com.softserve.edu.lesson_13_streamAPI.homework.hw_1;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private String manufacture;
    private String category;
    private LocalDate date;
    private double price;

    public Product(String manufacture, String category, LocalDate date, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(manufacture, product.manufacture) && Objects.equals(category, product.category) && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacture, category, date, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
