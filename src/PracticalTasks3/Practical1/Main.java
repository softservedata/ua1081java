package PracticalTasks3.Practical1;

import java.util.Scanner;

import static PracticalTasks3.Practical1.SumAvg.*;

public class Main {

        static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
               SumAvg num1 = new SumAvg();
        SumAvg.promptNum1(num1);
        SumAvg num2 = new SumAvg();
        SumAvg.promptNum2(num2);
        printTotal();
        printAverage();


    }




}
