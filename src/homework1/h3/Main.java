package homework1.h3;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("First call time?");
        float first = sc.nextFloat();

        System.out.println("Second call time?");
        float second = sc.nextFloat();

        System.out.println("Third call time?");
        float third = sc.nextFloat();


        System.out.println("The cost of a minute of the first call?");
        float firstc = sc.nextFloat();

        System.out.println("The cost of a minute of the second call?");
        float secondc = sc.nextFloat();

        System.out.println("The cost of a minute of the third call?");
        float thirdc = sc.nextFloat();

        System.out.println("Cost of the first call:");
        System.out.println(first*firstc);

        System.out.println("Cost of the second call:");
        System.out.println(second*secondc);


        System.out.println("Cost of the third call:");
        System.out.println(third*thirdc);

        System.out.println("Total Cost of Calls:");
        System.out.println((first*firstc)+(second*secondc)+(third*thirdc));


    }
}