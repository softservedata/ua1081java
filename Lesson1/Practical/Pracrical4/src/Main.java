import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer;

        System.out.println("How are you?");

        Scanner scan = new Scanner(System.in);

        answer = scan.nextLine();

        System.out.println("You are " + answer);

    }
}