package com.softserve.edu.HW4;

import java.util.Scanner;

import com.softserve.edu.HW3.Person;
import com.softserve.edu.HW4.Dog.Breed;

public class HomeWork {
    public static int numTask = 0;
    static Scanner sc = new Scanner(System.in);

    public static int HTTPError400 = 400;
    public static int HTTPError401 = 401;
    public static int HTTPError402 = 402;
    public static int HTTPError404 = 404;
    public static void main(String[] args) {
        System.out.print("Input Task number, please: ");
        numTask = sc.nextInt();

        switch (numTask) {
            case 1:
                System.out.print("Input n1, n2, and n3, please: ");
                float n1 = sc.nextInt(), n2 = sc.nextInt(),  n3 = sc.nextInt();
                sc.nextLine(); // Consume the newline
                Task1(n1, n2, n3);
                break;
            case 2:
                System.out.print("Input n1, n2, and n3, please: ");
                int num1 = sc.nextInt(), num2 = sc.nextInt(),  num3 = sc.nextInt();
                sc.nextLine(); // Consume the newline
                Task2(num1, num2, num3);
                break;
            case 3:
                System.out.print("Input number of Error, please: ");
                int num = sc.nextInt();
                sc.nextLine(); // Consume the newline
                Task3(num);
                break;
            case 5:
                Dog dog1 = new Dog(4, "Frank", Breed.BORDERCOLLIE);
                Dog dog2 = new Dog(3, "Yuki", Breed.DOGGOARGENTINO);
                Dog dog3 = new Dog(1, "Frank", Breed.FRENCHBULLDOG);
                dog1.equals(dog2);
                dog1.equals(dog3);


                Task2(dog1.getAge(), dog2.getAge(), dog3.getAge()); //Output the name and the breed of the oldest dog.

                break;
            default:
                break;
        }
        sc.close();
    }

    public static void Task1(float a, float b, float c){
        if((a>=-5 && a<=5)&&(b>=-5 && b<=5)&&(c>=-5 && c<=5)){
            System.out.println("Numbers belong to the range [-5, 5]");
        }
        else{
            System.out.println("Numbers not belong to the range [-5, 5]");
        }
    }

    public static void Task2(int a, int b, int c){
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            if(arr[i]<temp){temp = arr[i];}
        }
        System.out.println("The smallest number is " +temp);

        for(int i = 1; i < arr.length; i++ ){
            if(arr[i]>temp){temp = arr[i];}
        }
        System.out.println("The bigger number is " +temp);
    }
    public static void Task3(int number){
        if(number == HTTPError400){System.out.println("That's HTTP Error 400!");}
        else if(number == HTTPError401){System.out.println("That's HTTP Error 401!");}
        else if(number == HTTPError402){System.out.println("That's HTTP Error 402!");}
        else if(number == HTTPError404){System.out.println("That's HTTP Error 404!");}
    }



}
