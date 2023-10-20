package com.softserve.hw01;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        System.out.println("============ Zadacha 1 =============");

        System.out.println("Please write radius");
        Scanner task1 = new Scanner(System.in);
        float radius = task1.nextFloat();
        float p = 3.14159f;
        float perimeter = (2 * p* radius);
        float area = ((radius*radius) * p);
        System.out.println("Square = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("============ Zadacha 2 =============");

        System.out.println("What is your name?");
        Scanner task2 = new Scanner(System.in);
        String text = task2.nextLine();
        System.out.print("Where do you live, " + text);
        System.out.println("?");
        String text2 = task2.nextLine();
        System.out.print("Hello " + text);
        System.out.println(", you live in " + text2);

        System.out.println("============ Zadacha 3 =============");

        System.out.print("Cost per minute of FIRST call:");
        Scanner task3 = new Scanner(System.in);
        float c1 = task3.nextFloat();
        System.out.print("Duration of FIRST call:");
        float t1 = task3.nextFloat();
        float price1 = (c1 * t1);
        System.out.print("Cost per minute of SECOND call:");
        float c2 = task3.nextFloat();
        System.out.print("Duration of SECOND call:");
        float t2 = task3.nextFloat();
        float price2 = (c2 * t2);
        System.out.print("Cost per minute of Third call:");
        float c3 = task3.nextFloat();
        System.out.print("Duration of Third call:");
        float t3 = task3.nextFloat();
        float price3 = (c3 * t3);
        float total = (price1 + price2 + price3);
        System.out.println("Results:");
        System.out.println("Price of first call =" + price1);
        System.out.println("Price of second call =" + price2);
        System.out.println("Price of third call =" + price3);
        System.out.println("Total price = " + total);
    }

}