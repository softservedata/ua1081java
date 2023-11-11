package Lesson3.HomeWork;


import java.util.Scanner;

public class HomeWork2 {

    public static void findTheSmallest(int a,int b,int c){
        if (a>b){
            if(b>c){
                System.out.println("The smallest number is " + c);
            }
            else {
                System.out.println("The smallest number is " + b);
            }
        }
        else{
            if(a>c){
                System.out.println("The smallest number is " + c);
            }
            else {
                System.out.println("The smallest number is " + a);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Input first num");
        a = scan.nextInt();

        System.out.println("Input second num");
        b = scan.nextInt();

        System.out.println("Input third num");
        c = scan.nextInt();

        findTheSmallest(a,b,c);
    }

}
