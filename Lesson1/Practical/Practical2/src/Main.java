import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first number:");

        num1 = scan.nextInt();

        System.out.println("Enter second number:");
        num2 = scan.nextInt();

        System.out.println("Enter third number:");
        num3 = scan.nextInt();

        double average = (double) (num1 + num2 + num3) / 3;
        System.out.println("Avarege number is: " + average);


    }
}