package homework1.h1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.print("Where do you live " + name + " ?");
        String address = sc.nextLine();

        System.out.println("Hello " + name + " . You live in " + address);
        sc.close();//close the scanner, don't forget
    }
}