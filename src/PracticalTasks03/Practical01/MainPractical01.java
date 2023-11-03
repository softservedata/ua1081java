package PracticalTasks03.Practical01;

import java.util.Scanner;

import static PracticalTasks03.Practical01.Practical01.*;

public class MainPractical01 {

        static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
               Practical01 num1 = new Practical01();
        Practical01.promptNum1(num1);
        Practical01 num2 = new Practical01();
        Practical01.promptNum2(num2);
        printTotal();
        printAverage();


    }




}
