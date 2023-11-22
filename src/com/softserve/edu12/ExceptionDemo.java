package com.softserve.edu12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //  which type of problem???

        int i = 4;
        int j = 0;
        System.out.println("Result: " + (i / j));  //  which type of problem???

        int[] a = new int[2];
        a[2] = 0;//  which type of problem???

    }
}
