package PracticalTasks9.Practical3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCollectionRandom {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        fillCollection(myCollection);
        System.out.println("Collection of 10 integers: " + myCollection);

//        Find and save in list newCollection all positions of element more than 5 in the
//        collection. Output newCollection to the console
        List<Integer> newCollection = findAllMoreThan5(myCollection);
        System.out.println("Positions of element more than 5: " + newCollection);

//        Remove from collection myCollection elements, which are greater then 20. Output the
//        result
        myCollection.removeIf(integer -> integer > 20);
        System.out.println("Collection after remove greater then 20: " + myCollection);

//        Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position –
//        xxx, value of element – xxx”
        insertElements(myCollection, 2, 1);
        insertElements(myCollection, 8, -3);
        insertElements(myCollection, 5, -4);


        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted Collection: " + myCollection);
    }

    private static List<Integer> fillCollection(List<Integer> collection) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            collection.add(random.nextInt(30));
        }
        return collection;
    }

    private static List<Integer> findAllMoreThan5(List<Integer> collection) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) > 5) {
                positions.add(i + 1);
            }
        }
        return positions;
    }

    private static void insertElements(List<Integer> collection, int position, int element) {
        collection.add(position, element);
        System.out.println("Inserted at position " + position + " - Value of element: " + element);
    }
}

