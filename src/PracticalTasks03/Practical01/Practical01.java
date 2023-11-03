package PracticalTasks03.Practical01;

import static PracticalTasks03.Practical01.MainPractical01.SCANNER;

public class Practical01 {
    static private int totalSum;

    public static int num1;
    public static int num2;

    public Practical01(int num1, int num2) {
        Practical01.num1 = num1;
        Practical01.num2 = num2;
        totalSum = num1 + num2;
    }

    public Practical01() {

    }

    static public double getAverageSum(){
        return (double) totalSum / 2;
    }
    public static void printAverage() {
        System.out.println("The average of " + Practical01.num1 + " and " + Practical01.num2 + " is " + Practical01.getAverageSum());
    }

    static public int getTotalSum(){
        return totalSum;
    }
    public static void printTotal() {
        System.out.println("The sum of " + Practical01.num1 + " and " + Practical01.num2 + " is " + Practical01.getTotalSum());
    }

    public static void promptNum1(Practical01 num1) {
        System.out.println("Enter first number:");
        num1.setNum1(SCANNER.nextInt());
    }
    public static void promptNum2(Practical01 num2) {
        System.out.println("Enter the second number:");
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
        totalSum -= Practical01.num1;
        Practical01.num1 = num1;
        totalSum += Practical01.num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        totalSum -= Practical01.num2;
        Practical01.num2 = num2;
        totalSum += Practical01.num2;
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
