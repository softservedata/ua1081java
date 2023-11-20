package homework10.h1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(11);
        set1.add(13);
        set1.add(15);
        System.out.println("set1 = " + set1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(10);
        set2.add(12);
        set2.add(14);
        System.out.println("set2 = " + set2);
        Set<Integer> union = union(set1, set2);
        System.out.println("union = " + union);
        Set<Integer> intersect = intersect(set1, set2);
        System.out.println("intersect = " + intersect);
        Set<Integer> subtract = new HashSet<>(set1);
        subtract.retainAll(set2);
        System.out.println("subtract = " + subtract);

    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> duplicate= new HashSet<>();
        for (Integer integer : set2) {
            if (result.contains(integer)) {
                duplicate.add(integer);
            }
        }
        return duplicate;
    }
}