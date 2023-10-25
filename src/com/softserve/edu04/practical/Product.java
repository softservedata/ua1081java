package com.softserve.edu04.practical;

//TODO Task4
//It's our class Product, that was created how record in Java 14. It's a new feature in Java 14.
//record is a final class, that can't be extended and has a constructor, getters, equals, hashCode and toString methods.
//It's a good practice to use records for immutable objects.
//You can read more about records here: https://www.baeldung.com/java-record-keyword

//public record Product(String name, double price, int quantity) {
//}
public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
class ProductTest{
    public static void main(String[] args) {
        Product product1 = new Product("Bread", 10.0, 5);
        Product product2 = new Product("Milk", 15.0, 3);
        Product product3 = new Product("Water", 12.0, 7);
        Product product4 = new Product("Chocolate", 8.0, 10);

        // Find the most expensive item without a loop
        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }

        // Find the item with the largest quantity without a loop
        Product largestQuantity = product1;
        if (product2.getQuantity() > largestQuantity.getQuantity()) {
            largestQuantity = product2;
        }
        if (product3.getQuantity() > largestQuantity.getQuantity()) {
            largestQuantity = product3;
        }
        if (product4.getQuantity() > largestQuantity.getQuantity()) {
            largestQuantity = product4;
        }

        System.out.println("Name and quantity of the most expensive item:");
        System.out.println("Name: " + mostExpensive.getName());
        System.out.println("Price: " + mostExpensive.getPrice());

        System.out.println("\nName of the item with the largest quantity:");
        System.out.println("Name: " + largestQuantity.getName());

        //The same with a loop.This solution is more flexible and scalable.
        // Find the most expensive item
//        Product mostExpensive = product1;
//        for (Product product : new Product[] { product2, product3, product4 }) {
//            if (product.getPrice() > mostExpensive.getPrice()) {
//                mostExpensive = product;
//            }
//        }
//
//        // Find the item with the largest quantity
//        Product largestQuantity = product1;
//        for (Product product : new Product[] { product2, product3, product4 }) {
//            if (product.getQuantity() > largestQuantity.getQuantity()) {
//                largestQuantity = product;
//            }
//        }
//
//        System.out.println("Name and quantity of the most expensive item:");
//        System.out.println("Name: " + mostExpensive.getName());
//        System.out.println("Quantity: " + mostExpensive.getQuantity());
//
//        System.out.println("\nName of the item with the largest quantity:");
//        System.out.println("Name: " + largestQuantity.getName());
    }
}
