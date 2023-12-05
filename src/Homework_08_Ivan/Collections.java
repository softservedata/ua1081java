/* Declare collection myCollection of 10 integers and fill it (from the console or random).
• Swap the maximum and minimum elements in the list.
• Insert a random three-digit number before the first negative element of the list
• Insert a zero between all neighboring elements collection myCollection with different signs
• Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
• In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element,
display a message.
• Remove from the list myCollection the element following the first minimum. If the minimum element is the last one,
nothing needs to be removed.
Use one or more of the next: List, ArrayList, LinkedList*/

package Homework_08_Ivan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collections {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(List.of(1, -2, 3, -4, 5, -6, 7, -8, 9));

        swapMinMax(myCollection); // Swap the maximum and minimum elements in the list
        System.out.println("Collection with max and min elements swapped: " + myCollection);

        insertRandomNumber(myCollection); // Insert a random three-digit number before the first negative element
        System.out.println("Collection with random number: " + myCollection);

        insertZeroBetweenDifferentSigns(myCollection); // Insert a zero between all neighboring elements with different signs
        System.out.println("Collection with zeros: " + myCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        copyToTwoLists(myCollection, 4, list1, list2); // Copy the first 4 elements to list1 and the rest to list2
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        removeLastEvenElement(myCollection); // Remove the last even element from myCollection
        System.out.println("Collection with last even element removed: " + myCollection);

        removeElementAfterFirstMinimum(myCollection); // Remove the element following the first minimum
        System.out.println("Collection with element following first minimum removed: " + myCollection);

     }

    private static void insertRandomNumber(List<Integer> myCollection) {
        int randomNum = new Random().nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomNum);
                break;
            }
        }
    }

    private static void insertZeroBetweenDifferentSigns(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int num1 = myCollection.get(i);
            int num2 = myCollection.get(i + 1);
            if (num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0) {
                myCollection.add(i + 1, 0);
                i++; // Skip the zero that was just inserted
            }
        }
    }

    private static void copyToTwoLists(List<Integer> myCollection, int k, List<Integer> list1, List<Integer> list2) {
        list1.addAll(myCollection.subList(0, k));
        list2.addAll(myCollection.subList(k, myCollection.size()));
        java.util.Collections.reverse(list2);
    }

    private static void removeLastEvenElement(List<Integer> myCollection) {
        int evenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                evenIndex = i;
                break;
            }
        }
        if (evenIndex != -1) {
            myCollection.remove(evenIndex);
        } else {
            System.out.println("No even elements found.");
        }
    }

    private static void removeElementAfterFirstMinimum(List<Integer> myCollection) {
        int minIndex = myCollection.indexOf(java.util.Collections.min(myCollection));
        if (minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }
    }

    private static void swapMinMax(List<Integer> myCollection) {
        if (myCollection.isEmpty()) return;

        int maxIndex = 0;
        int minIndex = 0;
        int max = myCollection.get(0);
        int min = myCollection.get(0);

        for (int i = 1; i < myCollection.size(); i++) {
            int num = myCollection.get(i);
            if (num > max) {
                max = num;
                maxIndex = i;
            } else if (num < min) {
                min = num;
                minIndex = i;
            }
        }

        java.util.Collections.swap(myCollection, maxIndex, minIndex);
    }
}