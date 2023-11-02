package com.softserve.homework04.practicaltask;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

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

    public static void main(String[] args) {
        Product firstProduct = new Product("Computer", 1111.4, 1);
        Product secondProduct = new Product("Phone", 555.4, 10);
        Product thirdProduct = new Product("Pen", 1.7, 100);
        Product fourthProduct = new Product("Microphone", 44.2, 45);

        Product[] productArray = new Product[] {firstProduct, secondProduct, thirdProduct, fourthProduct};


        Product mostExpensiveProduct = productArray[0];
        Product biggestQuantityProduct = productArray[0];

        for (int i = 1; i < productArray.length - 1; i++) {
            mostExpensiveProduct = (productArray[i].getPrice() > mostExpensiveProduct.getPrice()) ? productArray[i] : mostExpensiveProduct;
            biggestQuantityProduct = (productArray[i].getQuantity() > biggestQuantityProduct.getQuantity()) ? productArray[i] : biggestQuantityProduct;
        }
        System.out.println("The most expensive item:\n    Name: " + mostExpensiveProduct.getName() + "\n    Quantity: " + mostExpensiveProduct.getQuantity() +
                "\nThe name of the item, which has the biggest quantity: " + biggestQuantityProduct.getName());
    }
}
