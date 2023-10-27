package homework3.h1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side a");
        double a = sc.nextInt();

        System.out.println("Enter side b");
        double b = sc.nextInt();

        System.out.println("Enter side c");
        double c = sc.nextInt();

        System.out.println("Area =% .2f".formatted(areaT(a, b, c)));
    }
    static double areaT(double a, double b, double c) {
        double s = (a+b+c)/2;

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));



        }
    }
