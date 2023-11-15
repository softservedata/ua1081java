package com.softserve.Practical_T_JAVA_INTRODUCTION;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task3 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3*

        System.out.println("Подай число а:");
        float a = Integer.parseInt(br.readLine());
        System.out.println("Подай число b:");
        float b = Integer.parseInt(br.readLine());

        float addition = a + b;
        float subtraction = a - b;
        float multiplication = a * b;
        float division = a / b;

        System.out.println("a + b = " + addition);
        System.out.println("a - b = " + subtraction);
        System.out.println("a * b = " + multiplication);
        System.out.println("a / b = " + division);

    }

}