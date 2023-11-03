package practical5.p3;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[6];

        for (int q = 0; q < num.length; q++) {
            num[q] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(num));

        int biggest = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > biggest) {
                biggest = num[i];
            }
        }
        System.out.println("Biggest number is: " + biggest);

        int sumPositive = 0;
        for (int j = 0; j < num.length; j++) {
            if (num[j] > 0) {

                sumPositive = sumPositive + num[j];
                // or sum += num[j];
            }
        }
        System.out.println("Sum of positive numbers is: " + sumPositive);

        int sumNegative = 0;
        for (int x = 0; x < num.length; x++) {
            if (num[x] < 0) {
                sumNegative += num[x];
            }
        }
        System.out.println("Sum of negative numbers is: " + sumNegative);

        int numberPositive = 0;
        int numbersNegative = 0;
        for (int l = 0; l < num.length; l++) {
            if (num[l] < 0) {
                numbersNegative++;
            } else if (num[l] > 0) {
                numberPositive++;
            }
        }

        if (numberPositive > numbersNegative) {
            System.out.println("more positive");
        } else if (numberPositive < numbersNegative) {
            System.out.println("more negative");
        } else {
            System.out.println("equal");
        }
    }
}
