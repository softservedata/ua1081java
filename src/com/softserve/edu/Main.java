package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;
//import java.io.InputStreamReader;

public class Main { // implements Serializable {

    /**
     * <b>Super</b> Method.
     */
    public static void method1() {
        System.out.println("Hello world!");
    }

    public static void main(String[] args) throws IOException {
        /*
        System.out.println("Hello world!");
        int i = 2;
        System.out.println("i = " + i);
        String s = "Privet"; // String s = new String("Privet");
        System.out.println("s = " + s);
        //
        var k = 1.2; // double
        //var k = "abcd";
        System.out.println("k = " + k);
        //
        System.out.print("0123456789");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\tABC");
        //
        method1();
        */
        /*
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.print("input text = ");
        String text = br.readLine(); // "123" -> 49 50 51
        int num = Integer.parseInt(text);
        num = num + 1;
        System.out.println("result (num + 1) = " + num);
        */
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("input text = ");
        //String text = sc.nextLine();
        int num = sc.nextInt();
        num = num + 1;
        System.out.println("result (num + 1) = " + num);
        //
    }

}