package practical14.p1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second",
                "third", "third", "sec", "blablabla");

        System.out.println("Empty Strings in this list are: "
                + list.stream().filter(String::isEmpty).count());

        System.out.println("Without empty Strings: ");
        list.stream().filter(s -> !s.isEmpty()).forEach(System.out::println);

    }
}