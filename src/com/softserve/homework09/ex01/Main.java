package com.softserve.homework09.ex01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(-10, 11));
        }

        System.out.printf("Original collection: %s%n", myCollection);

        Collections.swap(myCollection,
                myCollection.indexOf(Collections.max(myCollection)),
                myCollection.indexOf(Collections.min(myCollection)));

        System.out.printf("Collection after max (%s) - min (%s) swap: %s%n",
                Collections.max(myCollection),
                Collections.min(myCollection),
                myCollection);

        for (Integer i : myCollection) {
            if (i < 0) {
                int randomThreeDigit = rand.nextInt(100, 1000);
                myCollection.add(myCollection.indexOf(i), randomThreeDigit);
                System.out.printf("Collection after adding 3-digit integer (%d) before negative: %s%n",
                        randomThreeDigit, myCollection);
                break;
            }
        }
        if (myCollection.size() == 10) {
            System.out.println("There is no negative integers in the list");
        }

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }

        System.out.printf("Collection after adding zeros between digits of different signs: %s%n",
                myCollection);

        int k = myCollection.size() / 2;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>();

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.printf("Collection of first k elements in direct order: %s%n", list1);
        System.out.printf("Collection of remaining elements, added in reverse order: %s%n", list2);

        myCollection.removeAll(new ArrayList<>(List.of(0)));//let's remove zeros, otherwise there will always be even number
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                System.out.printf("Collection after removal of zeros and last even element: %s%n",
                        myCollection);
                break;
            }
            if (i == 0 && myCollection.get(i) % 2 != 0) {
                System.out.println("There are no even elements in the list");
            }
        }

        if (myCollection.indexOf(Collections.min(myCollection)) < myCollection.size() - 1) {
            myCollection.remove(myCollection.indexOf(Collections.min(myCollection)) + 1);
            System.out.printf("Collection after removal of element after the first minimum: %s%n",
                    myCollection);
        } else {
            System.out.println("There is no element after minimal one, so nothing is removed");
        }
    }
}
