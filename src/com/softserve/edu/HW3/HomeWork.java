package com.softserve.edu.HW3;

import java.util.Scanner;
import java.lang.Math;


public class HomeWork {
    public static int numTask = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input Task number, please: ");
        numTask = sc.nextInt();

        switch (numTask) {
            case 1:
                System.out.print("Input s1, s2, and s3, please: ");
                int s1 = sc.nextInt(), s2 = sc.nextInt(),  s3 = sc.nextInt();
                sc.nextLine(); // Consume the newline
                Area(s1, s2, s3);
                break;
            case 2:
                System.out.print("Input n1, n2, and n3, please: ");
                int n1 = sc.nextInt(), n2 = sc.nextInt(),  n3 = sc.nextInt();
                sc.nextLine(); // Consume the newline
                FindTheSmaller(n1, n2, n3);
                break;
            case 3:
                Person p1 = new Person();
                p1.input();
                Person p2 = new Person();
                p2.input();
                // Person p3 = new Person();
                // p3.input();
                // Person p4 = new Person();
                // p4.input();
                // Person p5 = new Person();
                // p5.input();

                p1.output();
                p2.output(); //гадаю, достатньо і двох осіб

                break;
            default:
                break;
        }
        sc.close();
    }

    public static void Area(int a, int b, int c){
        double S = 0.0, p = 0.0;
        p = (a+b+c)/2.0;
        System.out.println(p);
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("The area of the triangle is "+S);
    }
    public static void FindTheSmaller(int a, int b, int c){
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            if(arr[i]<temp){temp = arr[i];}
        }
        System.out.println("The smallest number is " +temp);

    }


    
}

