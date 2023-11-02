package homework5.h4;

import java.util.Random;
import java.util.Scanner;

public class Randoms {

    public static void main(String[] args) {

        int x;
        int a;
        do {
            Random random = new Random();
            x = random.nextInt(11);



            System.out.println(" Tray to guest the number from 0 to 11 ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();

            if (x < a) {
                System.out.println("Too high, try again");
            }
            if (x > a) {
                System.out.println("Too low, try again");
            }
        }
        while (x != a); {
            System.out.println("You are right!");

        }

    }

    }






