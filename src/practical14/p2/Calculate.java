package practical14.p2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

class Calculate {


    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("count: " + stats.getCount());
        System.out.println("min: " + stats.getMin());
        System.out.println("max: " + stats.getMax());
        System.out.println("sum: " + stats.getSum());

    }
}

