package homework5.h1;

import java.util.Arrays;
import java.util.Scanner;

class Month{

    public static void main(String[] args) {

        int[] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");

        int numberMonth =scanner.nextInt();

        System.out.println((dayInMonth[numberMonth-1]));

    }
}