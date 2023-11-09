package PracticalTasks3.Practical1;

import static PracticalTasks3.Practical1.Main.SCANNER;

public class SumAvg {
    static private int totalSum;

    public static int num1;
    public static int num2;

    public SumAvg(int num1, int num2) {
        SumAvg.num1 = num1;
        SumAvg.num2 = num2;
        totalSum = num1 + num2;
    }

    public SumAvg() {

    }

    static public double getAverageSum(){
        return (double) totalSum / 2;
    }
    public static void printAverage() {
        System.out.println("The average of " + SumAvg.num1 + " and " + SumAvg.num2 + " is " + SumAvg.getAverageSum());
    }

    static public int getTotalSum(){
        return totalSum;
    }
    public static void printTotal() {
        System.out.println("The sum of " + SumAvg.num1 + " and " + SumAvg.num2 + " is " + SumAvg.getTotalSum());
    }

    public static void promptNum1(SumAvg num1) {
        System.out.print("Enter first number: ");
        num1.setNum1(SCANNER.nextInt());
    }
    public static void promptNum2(SumAvg num2) {
        System.out.print("Enter the second number: ");
        num2.setNum2(SCANNER.nextInt());
    }


    @Override
    public String toString() {
        return "Practical01{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        totalSum -= SumAvg.num1;
        SumAvg.num1 = num1;
        totalSum += SumAvg.num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        totalSum -= SumAvg.num2;
        SumAvg.num2 = num2;
        totalSum += SumAvg.num2;
    }
//    public static double getNumber(Scanner scanner, String prompt){
//        System.out.println(prompt);
//        while (!scanner.hasNextDouble()){
//            System.out.println("Please enter a number:");
//            scanner.next();
//            System.out.println(prompt);
//        }
//        return scanner.nextDouble();

//    }

}
