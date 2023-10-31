package homework4.h1;

import java.util.Scanner;

public class Check {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1;
        float number2;
        float number3;

        System.out.println("Enter the first number:");
        number1 = sc.nextFloat();

        System.out.println("Enter the second number:");
        number2 = sc.nextFloat();

        System.out.println("Enter the third number:");
        number3 = sc.nextFloat();


        if (rangeNumber(number1) && rangeNumber(number2) && rangeNumber(number3)) {
            System.out.println("All numbers belong to the range [-5, 5]");
            }
            else {
                System.out.println("Not all numbers belong to the range [-5, 5]");
            }
        }
        public static boolean rangeNumber(float number){
        return number>=-5 && number <=5;
        }
        }






