package com.softserve.HomeWorks.HomeWor01;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Task selection menu:");
            System.out.println("1. Task 1");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Exit");

            System.out.print("Select a task (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You have selected a task 1");

                    System.out.println("Enter the value of radius: ");
                    double radius = scanner.nextDouble();

                    if (radius > 0) {
                        double perimeter = (2 * Math.PI * radius);
                        System.out.println("Perimeter = " + perimeter);
                    } else {
                        System.out.println("Radius lower than zero ");
                    }

                    break;

                case 2:
                    System.out.println("You have selected a task 2");

                    System.out.println("What's your name: ");
                    String name = scanner.nextLine();

                    System.out.println("Where do you live, " + name);
                    String adress = scanner.nextLine();

                    System.out.println(name + ",your adress is: " + adress);

                    break;

                case 3:
                    System.out.println("You have selected a task 3");

                    double c1 ;
                    double c2 ;
                    double c3 ;

                    double t1 ;
                    double t2 ;
                    double t3 ;

                    System.out.println("Enter the value of the c1 and t1: ");
                    c1 = scanner.nextDouble();
                    t1 = scanner.nextDouble();

                    System.out.println("Enter the value of c2 and t2: ");
                    c2 = scanner.nextDouble();
                    t2 = scanner.nextDouble();

                    System.out.println("Enter the value of c3 and t3: ");
                    c3 = scanner.nextDouble();
                    t3 = scanner.nextDouble();

                    if (c1 > 0 && c2 > 0 && c3 > 0 && t1 > 0 && t2 > 0 && t3 > 0)
                    {
                        double c1t1 = c1 * t1;
                        double c2t2 = c2 * t2;
                        double c3t3 = c3 * t3;
                        double total = c1t1 + c2t2 +c3t3;
                        System.out.println("Cost of the first call: " + c1t1 );
                        System.out.println("Cost of the second call: " + c2t2);
                        System.out.println("Cost of the third call: " + c3t3);
                        System.out.println("Total cost of the calls: " + total);

                    }
                    else {
                        System.out.println("Cost and duration of the calls must be over than zero");
                    }

                    break;


                default:
                    System.out.println("Incorrect selection. Try again.");
                    break;


            }
        }while (choice != 4);





    }
}