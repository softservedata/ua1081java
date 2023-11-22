package com.softserve.practical09.ex03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(-10, 50));
        }

        System.out.printf("Random list is: %s%n", myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }

        System.out.printf("New collection with elements greater than 5 is: %s%n", newCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }

        System.out.printf("The collection with removed values over 20 is: %s%n", myCollection);

        changeElemInCollection(myCollection, 2, 1);
        changeElemInCollection(myCollection, 8, -3);
        changeElemInCollection(myCollection, 5, -4);

        Collections.sort(myCollection);
        System.out.printf("Collection sorted in ascending order: %s%n", myCollection);

        Collections.sort(myCollection, Collections.reverseOrder());
        System.out.printf("Collection sorted in descending order: %s%n", myCollection);

        Collections.sort(myCollection, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        System.out.printf("Collection sorted in ascending order: %s%n", myCollection);

        Collections.sort(myCollection, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            }
        });

        System.out.printf("Collection sorted in descending order: %s%n", myCollection);
    }

    private static void changeElemInCollection(List<Integer> myCollection, int elemNr, int elemValue) {
        if (myCollection.size() <= elemNr) {
            System.out.printf("Sorry, index of %d is higher than size of the collection%n", elemNr);
        } else {
            myCollection.set(elemNr, elemValue);
            System.out.printf("Position - %d, value of element - %d%n", elemNr, myCollection.get(elemNr));
        }
    }
}
