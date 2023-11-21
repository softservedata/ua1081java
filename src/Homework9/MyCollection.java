package Homework9;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {

//        Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        fillColection(myCollection);
        System.out.println("Fill collection: " + myCollection);

//        Swap the maximum and minimum elements in the list.
        int max = myCollection.indexOf(Collections.max(myCollection));
        int min = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, max, min);
        System.out.println("Swap result: " + myCollection);

//        Insert a random three-digit number before the first negative element of the list
        int randomNumber = 100 + new Random().nextInt(200);
        if (min != -1) {
            myCollection.add(min, randomNumber);
        }
        System.out.println("Result after insert a three-digit number: " + myCollection);

//        Insert a zero between all neighboring elements collection myCollection with different signs
        ListIterator<Integer> iterator = myCollection.listIterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (iterator.hasNext()) {
                int next = iterator.next();
                iterator.previous();
                if (current * next < 0) {
                    iterator.add(0);
                }
            }
        }
        System.out.println("Result after insert a zero: " + myCollection);

//        Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
//        list2 in reverse order.
        int k = 7;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, Math.min(k, myCollection.size())));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(Math.min(k, myCollection.size()), myCollection.size()));
        Collections.reverse(list2);
        System.out.println("Result of list1: " + list1 + "\nResult of List2 in reverse: " + list2);

//        In a list myCollection remove the last even element (if there are even elements in the list). If
//        there is no such element, display a message.
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                System.out.println("Result of remove the last even element: " + myCollection);
                break;
            } else {
                System.out.println("There are no even numbers on the list.");
            }
        }
        int firstMin = myCollection.indexOf(Collections.min(myCollection));
        if (firstMin < myCollection.size() - 1) {
            myCollection.remove(firstMin + 1);
        } else {
            System.out.println("The minimum element is the last one.");
        }
    }

    private static List<Integer> fillColection(List<Integer> collection) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            collection.add(random.nextInt(30) - 10);
        }
        return collection;
    }
}
