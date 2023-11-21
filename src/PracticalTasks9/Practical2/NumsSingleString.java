package PracticalTasks9.Practical2;

import java.util.*;

public class NumsSingleString {
    public static void main(String[] args) {
        String userEnter = "1, 1, 3, 4, 4, 6, 6, 6, 7, 8";
        Set<String> uniqueNumbers = removeDuplicates(userEnter);
        System.out.println("User set of numbers: " + userEnter);
        System.out.println("Set after remove duplicate: " + uniqueNumbers);

    }

    public static Set<String> removeDuplicates(String enter) {
        String[] numbers = enter.split(",\\s");

        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));

        return uniqueNumbers;
    }
}
