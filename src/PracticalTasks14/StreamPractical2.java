package PracticalTasks14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamPractical2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        long count = primes.size();
        System.out.println("Count: " + count);

        int min = primes.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Min: " + min);

        int max = primes.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max: " + max);

        int sum = primes.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

    }
}
