package com.softserve.HomeWorke_JAVA_INTRODUCTION;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task4 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 4*

        System.out.println("How are you?");
        String answer = br.readLine();

        System.out.println("You are " + answer);

    }

}