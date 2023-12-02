package practical12.p1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Square{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sideA =0;
        int sideB =0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Enter side a: ");
            try {
                sideA = sc.nextInt();
                isValid = true;
        }catch (InputMismatchException exception){
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
        isValid = false;
        while (!isValid){
            System.out.println("Enter side b: ");
            try {
                sideB = sc.nextInt();
                isValid=true;
            }catch (InputMismatchException exception){
                System.out.println(exception.getMessage());
                sc.nextLine();
            }
        }
        try {
            int squareOfRectangle = squareRectangle(sideA,sideB);
            System.out.println(squareOfRectangle);
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return a * b;
    }
}