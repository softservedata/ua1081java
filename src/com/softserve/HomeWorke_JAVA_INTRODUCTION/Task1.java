package com.softserve.HomeWorke_JAVA_INTRODUCTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 Write a program that reads three strings and outputs them in the reverse order, each on a new line. //

        System.out.println("Input text:");
        String userText1 = br.readLine();
        String userText2 = br.readLine();
        String userText3 = br.readLine();

        System.out.println("Output text:");
        System.out.println(userText3 + "\n" + userText2 + "\n" + userText1);

    }

}