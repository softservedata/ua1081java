package com.softserve.edu.lesson_3_Enums.practice.practice_4;

public class Main {
    public static void main(String[] args) {
        Product coffe = new Product();
        coffe.setName("Jacobs");
        coffe.setPrice(80.5);
        coffe.setQuantity(3);

        Product chocolate = new Product("Milka", 100.4, 3);
            Product milk = new Product("Ferma", 38.5, 12);
        Product cream = new Product("Radymo", 50.4, 10);

        Product expensive = coffe;
        if (chocolate.getPrice() > expensive.getPrice()) {
            expensive = chocolate;
        }
        if (milk.getPrice() > expensive.getPrice()) {
            expensive = milk;
        }
        if (cream.getPrice() > expensive.getPrice()) {
            expensive = cream;
        }



        Product biggestQ = coffe;
        if (chocolate.getQuantity() > biggestQ.getQuantity()) {
            biggestQ = chocolate;
        }
        if (milk.getQuantity() > biggestQ.getQuantity()) {
            biggestQ = milk;
        }

        if (cream.getQuantity() > biggestQ.getQuantity()) {
            biggestQ = cream;
        }

        System.out.println("Expensive " + expensive.getName() + " quaintity " + expensive.getQuantity());
        System.out.println("Item with the Largest Quantity " + biggestQ.getName());
    }
}






