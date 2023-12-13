package PracticalTasks14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractical1 {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        long emptyString = list.stream().filter(String::isEmpty).count();
        System.out.println("Empty strings in the list: " + emptyString);

        List<String> remEmpty = list.stream().filter(string -> !string.isEmpty()).toList();
        System.out.println("List after remove empty strings: " + remEmpty);

        String listUpp = remEmpty.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("String after converted: " + listUpp);

    }
}
