package com.softserve.homework09.homework.hw1;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        Random randomInt = new Random();

        List<Integer> originalList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            originalList.add(randomInt.nextInt(-100, 100));
        }
        System.out.println("Original List: " + originalList);

        //Swap the maximum and minimum elements in the list
        List<Integer> swappedList = new ArrayList<>(originalList);
        int maxIntIndex = originalList.indexOf(Collections.max(originalList));
        int minIntIndex = originalList.indexOf(Collections.min(originalList));
        Collections.swap(swappedList, maxIntIndex, minIntIndex);
        System.out.println("Swapped List: " + swappedList);

        //Insert a random three-digit number before the first negative element of the list
        List<Integer> randomIntBeforeNegativeList = new LinkedList<>();
        randomIntBeforeNegativeList.addAll(originalList);
        for (int i = 0; i < randomIntBeforeNegativeList.size(); i++) {
            if (randomIntBeforeNegativeList.get(i) >= 0) {
                continue;
            } else {
                randomIntBeforeNegativeList.add(i, randomInt.nextInt(100, 999));
                break;
            }
        }
        System.out.println("Random Int Before Negative List: " + randomIntBeforeNegativeList);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        List<Integer> zeroBetweenNeighboringElementsList = new LinkedList<>();
        zeroBetweenNeighboringElementsList.addAll(originalList);
        for(int i = 1; i < zeroBetweenNeighboringElementsList.size(); i++) {
            if (zeroBetweenNeighboringElementsList.get(i) * zeroBetweenNeighboringElementsList.get(i - 1) < 0) {
                zeroBetweenNeighboringElementsList.add(i, 0);
            }
        }
        System.out.println("Zero Between Neighboring Elements List: " + zeroBetweenNeighboringElementsList);

        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order
        List<Integer> reverseList = new ArrayList<>(originalList);
        int firstElement = reverseList.remove(0);
        Collections.reverse(reverseList);
        reverseList.add(0, firstElement);
        System.out.println("Reversed List: " + reverseList);

        //In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
        List<Integer> removeLastEvenElement = new LinkedList<>();
        removeLastEvenElement.addAll(originalList);
        Collections.reverse(removeLastEvenElement);
        Iterator<Integer> iterator = removeLastEvenElement.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
            if (integer % 2 == 0) {
                iterator.remove();
                break;
            }
        }
        Collections.reverse(removeLastEvenElement);
        System.out.println(removeLastEvenElement);

        //Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
        List<Integer> removeAfterMinimumList = new LinkedList<>();
        removeAfterMinimumList.addAll(originalList);
        minIntIndex = removeAfterMinimumList.indexOf(Collections.min(removeAfterMinimumList));
        if (minIntIndex != removeAfterMinimumList.size() - 1) {
            removeAfterMinimumList.remove(minIntIndex + 1);
        }
        System.out.println("Remove After Minimum List: " + removeAfterMinimumList);
    }
}