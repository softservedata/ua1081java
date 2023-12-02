package practical11.p2;

import java.util.Scanner;

class Output {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.printf("%s %s.%s.\n",lastName,firstName.charAt(0),middleName.charAt(0));

        System.out.println(firstName);

        System.out.printf("%s %s %s", firstName,middleName,lastName);



    }

}
