import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your first number: ");
        int a = sc.nextInt();
    System.out.println("Enter your second number: ");
        int b = sc.nextInt();

    int sum = a + b;
    int deduction = a - b;
    int multiplication = a * b;
    var division = (double) a / b;

        System.out.println("Sum operation: " + sum);
        System.out.println("Subtraction operation: " + deduction);
        System.out.println("Multiplication operation: " + multiplication);
        System.out.println("Division operation: " + division);
    }
}