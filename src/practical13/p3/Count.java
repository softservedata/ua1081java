package practical13.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Count {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(10);
        arr.add(12);
        arr.add(15);
        arr.add(17);
        arr.add(18);
        System.out.println("Count of even numbers: " + count(arr, n -> n % 2 == 0));
        System.out.println("Count of numbers multiples of 5: " + count(arr, n -> n % 5 == 0));



    }

    public static int count(List<Integer> arr, MyFunc f) {
        AtomicInteger counted = new AtomicInteger();
        arr.forEach(n -> {
            if (f.f(n)) {
                counted.getAndIncrement();
            }
        });
        return counted.get();
    }

    @FunctionalInterface
    interface MyFunc {
        boolean f(int n);
    }
}
