package homework1.h2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        byte radius = sc.nextByte();

        System.out.println("Perimeter is:");
        System.out.println(2*3.14*radius);


        System.out.println("Area is:");
        System.out.println((radius*radius)*3.14);








    }
}