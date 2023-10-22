import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Input your first number: ");
        double fNum = sc.nextDouble();
    System.out.println("Input your second number: ");
        double sNum = sc.nextDouble();
    System.out.println("Input your third number: ");
        double thNum = sc.nextDouble();

    System.out.println("Average number is: " + (fNum + sNum + thNum) / 3);

    }
}