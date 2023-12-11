package com.softserve.edu.HW5;

import java.util.Scanner;

public class HomeWork4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(randomNum);

        boolean repeat = false;

        do {
            System.out.print("Guess the number: ");
            int num = sc.nextInt();

            if(num == randomNum){System.out.println("You guess it right!!!"); repeat = true;}
            else if(num <= randomNum){System.out.println("Too low, try again.");}
            else if(num >= randomNum){System.out.println("Too high, try again.");}

        } while (!repeat);

        sc.close();
        
    }
    
}
