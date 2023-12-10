package com.softserve.edu.HW5;

import java.util.Scanner;

import com.softserve.edu.HW4.Dog;
import com.softserve.edu.HW4.Dog.Breed;

public class HomeWork1 {
    public static int numTask = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Task number, please: ");
        numTask = sc.nextInt();

        switch (numTask) {
            case 1:
                System.out.print("Input number of the month, please: ");
                int number = sc.nextInt();
                sc.nextLine(); // Consume the newline
                Task1(number);
                break;
            case 2:
                int[] numbersArray = new int[10];
                System.out.print("Input 10 nums, please: \n");
                for (int i = 0; i < 10; i++) {
                    numbersArray[i] = sc.nextInt();
                }
                sc.nextLine(); // Consume the newline
                Task2(numbersArray);
                break;
            case 3:
                int[] arr = new int[5];
                System.out.print("Input 5 int num, please: \n");
                for (int i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }
                sc.nextLine(); // Consume the newline
                Task3(arr);
                break;
            default:
                break;
        }
        sc.close();
    }

    public static void Task1(int num){
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        System.out.println("Count of days in "+ months[num-1]+" is "+ daysInMonth[num-1]);
    }

    public static void Task2(int[] arr){
        int sum = 0;
        int prod = 1;
        boolean bol = true;
        for(int i = 0; i<10; i++){
            if(arr[i]<0){bol = false;} 
        }
        if(bol){
            for(int i=0; i<5; i++){sum += arr[i];}
        }
        else{for(int i = 9; i>4; i--){prod *= arr[i];}}
        if(bol){System.out.println("The sum equal "+ sum);}
        else{System.out.println("The prod equal "+ prod);}

    }

    public static void Task3(int[] arr){
        int posNum = 0;
        int pos = 0;
        int prod = 1;
        for(int i = 0; i<5; i++){
            if(arr[i]>0){posNum++;} 
            if(posNum==2){System.out.println("The position's of a second positive number is "+ ++i);}
        }
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            if(arr[i]<temp){temp = arr[i]; pos = i;}
        }
        System.out.println("The smallest number is arr["+ pos +"] = " +temp);

        for(int i = 0; i<5; i++){
            if(arr[i]%2 ==0 && arr[i]!=0){prod *= arr[i];} 
        }
        System.out.println("The product of all entered even numbers "+prod);


    }



    
}
