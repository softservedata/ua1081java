import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {




        int r;
        System.out.println("Enter the radius of the circle:");
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();

        double PCircle = 2 * 3.14 * r;
        double SCircle = 3.14 * pow(r, 2) ;

        System.out.println("Your Perimeter: " + PCircle + " \nArea: " + SCircle);
    }
}