package com.softserve.Homework04.Practical04.Task4;

public class Task04 {
    public static void main(String[] args) {
        System.out.println(" ******  Practical Task4 *****");
        Product[] products = {
                new Product("Smartphone", 7888, 7),
                new Product("Bread", 35, 1),
                new Product("Milk", 36, 5),
                new Product("TV", 102000, 4)};
        Product mostExpensive = products[0];
        Product biggestQuantity = products[0];
        for (int i = 0; i < products.length; i++) {

            if (mostExpensive.getPrice() < products[i].getPrice()) {
                mostExpensive = products[i];
            }
            if (biggestQuantity.getQuantity() < products[i].getQuantity()) {
                biggestQuantity = products[i];
            }
        }
        System.out.println(" " + mostExpensive.getName() + " (quantity: " + mostExpensive.getQuantity() + " ) has the most expensive item " + mostExpensive.getPrice());
        System.out.println(" " + biggestQuantity.getName() + " has the biggest quantity " + biggestQuantity.getQuantity());

    }

}
