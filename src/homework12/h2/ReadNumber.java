package homework12.h2;

import java.util.InputMismatchException;
import java.util.Scanner;

class ReadNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        try {
            for (int i = 0; i < 5; i++) {
                int numbers = readNumber(start, end);
                System.out.println(numbers);
            }

        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());

    }

}

    static int readNumber(int start, int end) throws Exception {
        System.out.printf("Enter your number between %d and %d: ", start, end);
        try {
            int number = scanner.nextInt();
            if (number < start || number > end) {
                throw new Exception("Number is out of range");
            }
            return number;
        } catch (InputMismatchException e) {
            throw new Exception("Invalid input");
        }

    }
}