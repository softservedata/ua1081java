import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstString;
        String secondString;
        String thirdString;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string");
        firstString = scan.nextLine();
        System.out.println("Enter second string");
        secondString = scan.nextLine();
        System.out.println("Enter third string");
        thirdString = scan.nextLine();

        System.out.println("Result:");
        System.out.println(thirdString);
        System.out.println(secondString);
        System.out.println(firstString);




    }
}