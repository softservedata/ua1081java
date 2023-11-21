package PracticalTasks9.Practical3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyCollectionConsole {
    public static void main(String[] args) {
        // Declare a collection
        List<Integer> myCollection = new ArrayList<>();
        fillCollection(myCollection);

        // Find and save in list newCollection all positions of element more than 5 in the
        // collection. Output newCollection to the console
        List<Integer> newCollection = findPositionsGreaterThan5(myCollection);
        System.out.println("Positions of elements greater than 5: " + newCollection);

        // Remove from collection myCollection elements, which are greater then 20. Output the
        // result
        myCollection.removeIf(element -> element > 20);
        System.out.println("Collection after removing elements greater than 20: " + myCollection);

        // Insert elements 1, -3, -4 in positions 2, 8, 5.
        insertElements(myCollection, 2, 1);
        insertElements(myCollection, 8, -3);
        insertElements(myCollection, 5, -4);

        // Output the result in the format: “position – xxx, value of element – xxx”
        printCollectionWithPositions(myCollection);

        // Sort and print collection.
        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted Collection: " + myCollection);
    }

    // Function to fill the collection from the console (you can modify this based on your preference)
    private static void fillCollection(List<Integer> collection) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers for the collection:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            collection.add(number);
        }
    }

    // Function to find positions of elements greater than 5
    private static List<Integer> findPositionsGreaterThan5(List<Integer> collection) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) > 5) {
                positions.add(i);
            }
        }
        return positions;
    }

    // Function to insert elements at specific positions and output the result
    private static void insertElements(List<Integer> collection, int position, int element) {
        collection.add(position, element);
    }

    // Function to print the collection with positions
    private static void printCollectionWithPositions(List<Integer> collection) {
        System.out.println("Collection after insertions: ");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println("\tPosition - " + i + ", Value of Element - " + collection.get(i) + "; ");
        }
        System.out.println();
    }
}
