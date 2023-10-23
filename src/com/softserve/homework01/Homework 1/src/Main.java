import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.println("Write radius of the Flower bed");
        Double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        Double y;
        y = 3.14 ;

        System.out.println("Perimeter is " + (2*y*x));
        System.out.println("Area is " + y*(x*x));


    }
}