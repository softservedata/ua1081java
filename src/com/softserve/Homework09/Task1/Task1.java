package com.softserve.Homework09.Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = entryList();
        System.out.println(" Original");
        System.out.println(list + "\n");
        System.out.println(" Swap max and min");
        list = swapMaxAndMin(list);
        System.out.println(list + "\n");
        System.out.println(" Insert three numbers");
        insertThreeNumber(list);
        System.out.println(list + "\n");
        System.out.println(" Insert zero");
        insertZero(list);
        System.out.println(list + "\n");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        toTwoList(list, list1, list2, 2);
        System.out.println(" Split the list into two:\n list1: " + list1 + "\n list2: " + list2);
        System.out.println(" Delete last even number:");
        System.out.println(" Is an even number = " + deleteLastEvenNumber(list) + "\n Final list:");
        System.out.println(list + "\n");
        System.out.println(" Delete element after min:");
        deleteAfterMinElement(list);
        System.out.println(list);
    }

    public static void deleteAfterMinElement(List<Integer> list) {
        int indexOfMinElement = list.size() - 1;
        Integer element;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(indexOfMinElement)) {
                indexOfMinElement = i;
            }
        }
        if (indexOfMinElement == list.size() - 1) {
            return;
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            element = iterator.next();
            if (element.equals(list.get(indexOfMinElement))) {
                iterator.next();
                iterator.remove();
                return;
            }

        }
    }

    public static boolean deleteLastEvenNumber(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            Integer integer = iterator.previous();
            if (integer % 2 == 0) {
                iterator.remove();
                return true;
            }
        }
        return false;

    }

    public static void toTwoList(List<Integer> baseList, List<Integer> list1, List<Integer> list2, int k) {
        for (int i = 0; i < k; i++) {
            list1.add(baseList.get(i));
        }
        for (int i = baseList.size() - 1; i > k; i--) {
            list2.add(baseList.get(i));
        }
    }

    public static void insertZero(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) * list.get(i + 1) < 0) {
                list.add(i + 1, 0);
            }
        }
    }

    public static void insertThreeNumber(List<Integer> list) {
        Random random = new Random();
        int indexOfNegativeNumber = -1;
        for (Integer integer : list) {
            if (integer < 0) {
                indexOfNegativeNumber = list.indexOf(integer);
            }
        }
        for (int i = 1; i <= 3; i++) {
            list.add(indexOfNegativeNumber + i, random.nextInt(10));
        }
    }

    public static List<Integer> swapMaxAndMin(Collection<Integer> collection) {
        List<Integer> list = new ArrayList<>(collection);
        Integer maxIndex = 0;
        Integer minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        int temp = list.get(maxIndex);
        list.set(maxIndex, list.get(minIndex));
        list.set(minIndex, temp);
        return list;
    }

    public static List<Integer> entryList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(11));
        }
        return list;
    }
}
