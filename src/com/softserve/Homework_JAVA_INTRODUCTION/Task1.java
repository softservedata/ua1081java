package com.softserve.Homework_JAVA_INTRODUCTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Radius = ");
        double radius = Integer.parseInt(br.readLine());

        double p = 3.14d;
        double perimeter = 2 * p * radius;
        double area = p * (radius * radius);

        System.out.println("If the radius of a circle = " + radius + " Then the perimeter = " + perimeter + " and the area = " + area);

    }

}