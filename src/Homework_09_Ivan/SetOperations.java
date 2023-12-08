/*
1. Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), realizing the operations
of union and intersection of two sets. Test the operation of these techniques on two pre-filled sets.
 */

package Homework_09_Ivan;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        // Створення копії першої множини
        Set<T> unionSet = new HashSet<>(set1);

        // Додавання всіх елементів з другої множини до копії першої множини
        unionSet.addAll(set2);

        // Повертаємо об'єднану множину
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        // Створення копії першої множини
        Set<T> intersectSet = new HashSet<>(set1);

        // Перетинання копії першої множини з другою множиною
        intersectSet.retainAll(set2);

        // Повертаємо множину із спільними елементами
        return intersectSet;
    }

    public static void main(String[] args) {
        // Створення та заповнення першої та другої множини

        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6));

        // Виклик методу об'єднання множин
        Set<Integer> unionSet = union(set1, set2);

        // Виклик методу перетину множин
        Set<Integer> intersectSet = intersect(set1, set2);

        // Виведення результатів на екран
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectSet);
    }
}
