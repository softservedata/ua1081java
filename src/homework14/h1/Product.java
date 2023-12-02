package homework14.h1;

import java.time.LocalDate;
import java.util.Objects;

class Product{
    private String manufactureCategory;
    private LocalDate manufactureDate;
    private double price;

    public Product(String manufactureCategory, LocalDate manufactureDate, double price) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct " + manufactureCategory+ " " + manufactureDate +" "+ price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(manufactureCategory, product.manufactureCategory) && Objects.equals(manufactureDate, product.manufactureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, manufactureDate, price);
    }
}