import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a:");
        a = scan.nextInt();
        System.out.println("Enter b:");
        b = scan.nextInt();



        System.out.println("Result:");
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b));
        if(b!=0){
            System.out.println("a / b = " + ((double)a / (double)b));
        }
        else{
            System.out.println("b = 0. Division refused");
        }


    }
}