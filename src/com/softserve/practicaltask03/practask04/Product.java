package com.softserve.practicaltask03.practask04;

public class Product {
    private String nameProduct;
    private double doublePrice;
    private int quantity;

    public Product(String nameProduct, double doublePrice, int quantity) {
        this.nameProduct = nameProduct;
        this.doublePrice = doublePrice;
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getDoublePrice() {
        return doublePrice;
    }

    public void setDoublePrice(double doublePrice) {
        this.doublePrice = doublePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", doublePrice=" + doublePrice +
                ", quantity=" + quantity +
                '}';
    }


    public static void displayMostExpensiveItem(Product product1, Product product2, Product product3, Product product4) {
        double max = product1.getDoublePrice();
        String name = product1.getNameProduct();
        int quantity = product1.getQuantity();
        if (max < product2.getDoublePrice()) {
            max = product2.getDoublePrice();
            name = product2.getNameProduct();
            quantity = product2.getQuantity();
        }
        if (max < product3.getDoublePrice()) {
            max = product3.getDoublePrice();
            name = product3.getNameProduct();
            quantity = product3.getQuantity();
        }
        if (max < product4.getDoublePrice()) {
            max = product4.getDoublePrice();
            name = product4.getNameProduct();
            quantity = product4.getQuantity();
        }
        System.out.println("The most expensive item is " + name + " and its quantity is " + quantity);
    }

    public static void displayNamesItemsByBiggestQuantity(Product product1, Product product2, Product product3, Product product4) {
        int max = product1.getQuantity();
        String name = product1.getNameProduct();
        if (max < product2.getQuantity()) {
            max = product2.getQuantity();
            name = product2.getNameProduct();
        }
        if (max < product3.getQuantity()) {
            max = product3.getQuantity();
            name = product3.getNameProduct();
        }
        if (max < product4.getQuantity()) {
            max = product4.getQuantity();
            name = product4.getNameProduct();
        }
        System.out.println(name + " has the biggest quantity: " + max);
    }
}
