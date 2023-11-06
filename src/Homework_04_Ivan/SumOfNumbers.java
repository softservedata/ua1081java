package Homework_04_Ivan;

public class SumOfNumbers {
    public static int sumFirstFivePositive(int[] numbers) {
        int sum = 0;
        int positiveCount = 0;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
                positiveCount++;
            }
        }

        if (positiveCount == 5) {
            return sum;
        } else {
            return -1;
        }
    }

    public static long productLastFiveNonPositive(int[] numbers) {
        long product = 1;
        int nonPositiveCount = 0;

        for (int i = numbers.length - 1; i >= numbers.length - 5; i--) {
            if (numbers[i] <= 0) {
                product *= numbers[i];
                nonPositiveCount++;
            }
        }

        if (nonPositiveCount == 5) {
            return product;
        } else {
            return -1;
        }
    }
}
