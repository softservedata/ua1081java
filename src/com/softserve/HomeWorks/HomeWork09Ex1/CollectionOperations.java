package com.softserve.HomeWorks.HomeWork09Ex1;

import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Fill the collection with 10 integers
        List<Integer> myCollection = new ArrayList<>();
        fillCollection(myCollection);

        // Step 2: Swap the maximum and minimum elements
        swapMaxAndMin(myCollection);

        // Step 3: Insert a random three-digit number before the first negative element
        insertRandomBeforeFirstNegative(myCollection);

        // Step 4: Insert a zero between all neighboring elements with different signs
        insertZeroBetweenDifferentSigns(myCollection);

        // Step 5: Copy elements to list1 and list2
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        copyElements(myCollection, list1, list2);

        // Step 6: Remove the last even element from myCollection
        removeLastEven(myCollection);

        // Step 7: Remove the element following the first minimum
        removeElementFollowingFirstMin(myCollection);

        // Display the final state of myCollection
        System.out.println("Final state of myCollection: " + myCollection);
    }

    private static void fillCollection(List<Integer> collection) {
        System.out.println("Enter 10 integers for the collection:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            collection.add(num);
        }
    }

    private static void swapMaxAndMin(List<Integer> collection) {
        if (!collection.isEmpty()) {
            int maxIndex = 0;
            int minIndex = 0;

            for (int i = 1; i < collection.size(); i++) {
                if (collection.get(i) > collection.get(maxIndex)) {
                    maxIndex = i;
                } else if (collection.get(i) < collection.get(minIndex)) {
                    minIndex = i;
                }
            }

            // Swap max and min elements
            Collections.swap(collection, maxIndex, minIndex);
        }
    }

    private static void insertRandomBeforeFirstNegative(List<Integer> collection) {
        Random random = new Random();
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                collection.add(i, random.nextInt(900) + 100); // Insert a random three-digit number
                break;
            }
        }
    }

    private static void insertZeroBetweenDifferentSigns(List<Integer> collection) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < collection.size() - 1; i++) {
            result.add(collection.get(i));
            if ((collection.get(i) >= 0 && collection.get(i + 1) < 0) ||
                    (collection.get(i) < 0 && collection.get(i + 1) >= 0)) {
                result.add(0); // Insert zero between different signs
            }
        }
        result.add(collection.get(collection.size() - 1)); // Add the last element
        collection.clear();
        collection.addAll(result);
    }

    private static void copyElements(List<Integer> source, List<Integer> list1, List<Integer> list2) {
        int k = Math.min(source.size(), 5); // Copy the first 5 elements
        list1.addAll(source.subList(0, k));

        for (int i = source.size() - 1; i >= k; i--) {
            list2.add(source.get(i)); // Copy the remaining elements in reverse order
        }
    }

    private static void removeLastEven(List<Integer> collection) {
        for (int i = collection.size() - 1; i >= 0; i--) {
            if (collection.get(i) % 2 == 0) {
                collection.remove(i);
                System.out.println("Last even element removed.");
                return;
            }
        }
        System.out.println("No even element found to remove.");
    }

    private static void removeElementFollowingFirstMin(List<Integer> collection) {
        int minIndex = 0;
        for (int i = 1; i < collection.size(); i++) {
            if (collection.get(i) < collection.get(minIndex)) {
                minIndex = i;
            }
        }

        if (minIndex < collection.size() - 1) {
            collection.remove(minIndex + 1);
            System.out.println("Element following the first minimum removed.");
        } else {
            System.out.println("The first minimum is the last element; nothing needs to be removed.");
        }
    }
}

