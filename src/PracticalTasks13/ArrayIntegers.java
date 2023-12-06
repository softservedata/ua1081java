package PracticalTasks13;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ArrayIntegers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Origin Array: " + nums);
        System.out.print("Modify Array: ");
        count(nums, n -> n > 3 && n < 8);
    }

    public static void count(List<Integer> nums, Predicate<Integer> predicate) {
        for (Integer n : nums) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }

    }
}
