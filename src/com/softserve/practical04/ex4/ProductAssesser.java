package com.softserve.practical04.ex4;

public class ProductAssesser {
    public static void main(String[] args) {
        Product product1 = new Product("Beef", 240, 3);
        Product product2 = new Product("Chicken", 110.5, 5);
        Product product3 = new Product("Lamb", 261.3, 2);
        Product product4 = new Product("Pork", 214.6, 6);

        Product theMostExpensive = product1;
        Product theHighestQuantity = product1;

        if (product2.getPrice() > theMostExpensive.getPrice()) {
            theMostExpensive = product2;
        }

        if (product3.getPrice() > theMostExpensive.getPrice()) {
            theMostExpensive = product3;
        }

        if (product4.getPrice() > theMostExpensive.getPrice()) {
            theMostExpensive = product4;
        }

        if (product2.getQuantity() > theHighestQuantity.getQuantity()) {
            theHighestQuantity = product2;
        }

        if (product3.getQuantity() > theHighestQuantity.getQuantity()) {
            theHighestQuantity = product3;
        }

        if (product4.getQuantity() > theHighestQuantity.getQuantity()) {
            theHighestQuantity = product4;
        }
        System.out.printf("The most expensive product is %s with %s quantity. The highest-quantity product is %s.",
                theMostExpensive.getName(), theMostExpensive.getQuantity(), theHighestQuantity.getName());
    }
}
