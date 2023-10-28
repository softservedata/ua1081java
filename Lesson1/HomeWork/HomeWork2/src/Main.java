import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String address;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Where do you live, " + name + " ?");
        address = scan.nextLine();
        System.out.println("Your name:" + name + "\nYour address:" + address);
    }
}