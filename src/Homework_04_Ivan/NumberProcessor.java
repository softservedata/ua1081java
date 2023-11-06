package Homework_04_Ivan;

/*5 integer numbers and find:
        o position of second positive number;
        o minimum value and its position in the array.
        o calculate the product of all entered even numbers (exclude 0 from even if entered by
        user). */

    public class NumberProcessor {
        public static int findSecondPositive(int[] numbers) {
            int positiveCount = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    positiveCount++;
                    if (positiveCount == 2) {
                        return i; // Return the position of the second positive number
                    }
                }
            }

            return -1; // Return -1 if there are not enough positive numbers
        }

        public static int[] findMinValueAndPosition(int[] numbers) {
            int minValue = Integer.MAX_VALUE;
            int minPosition = -1;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                    minPosition = i;
                }
            }

            int[] result = {minValue, minPosition};
            return result; // Return an array with minimum value and its position
        }

        public static int calculateProductOfEvenNumbers(int[] numbers) {
            int product = 1;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                    product *= numbers[i];
                }
            }

            return product; // Return the product of even numbers (exclude 0)
        }
    }

