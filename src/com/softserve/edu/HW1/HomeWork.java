package com.softserve.edu.HW1;

import java.util.Scanner;

public class HomeWork {
    public static int numTask = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input Task number, please: ");
        numTask = sc.nextInt();

        switch (numTask) {
            case 1:
                System.out.print("Input radius, please: ");
                int radius = sc.nextInt();
                sc.nextLine(); // Consume the newline
                FlowerBad(radius);
                break;
            case 2:
                HelloMethod();
                break;
            case 3:
                PhoneCalls();
                break;
            default:
                break;
        }
        sc.close();
    }
    
    public static void FlowerBad(int rad){
            System.out.println("C= " + 2*3.14*rad + " and S= " + 3.14*rad*rad);
    }

    public static void HelloMethod(){
        System.out.println("What is your name? ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Where do you live " + name +"? ");
        String address = sc.nextLine();
        
        System.out.println("So, your name is " + name +" and you live in " + address);
    }

    public static void PhoneCalls(){
        int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt();
        int t1 = sc.nextInt(), t2 = sc.nextInt(), t3 = sc.nextInt();
        System.out.println(c1*t1 + c2*t2 + c3*t3); //працюючий вивід

        //return c1*t1 + c2*t2 + c3*t3; - непрацюючий return
    }
    
}
