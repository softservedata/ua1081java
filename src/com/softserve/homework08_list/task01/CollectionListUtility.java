package com.softserve.homework08_list.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionListUtility {
    public static List<Integer> createList() {
        int num = 10;
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            double random = Math.random() * num;
            myCollection.add((int) random);
        }
        return myCollection;
    }

    public static void swapMaxMinElementInList() {
        List<Integer> myList = CollectionListUtility.createList();
        System.out.println("Original list for swap: " + myList);
        int min = myList.get(0);
        int indexMin = 0;
        int max = myList.get(0);
        int indexMax = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (min > myList.get(i)) {
                min = myList.get(i);
                indexMin = i;
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            if (max < myList.get(i)) {
                max = myList.get(i);
                indexMax = i;
            }
        }
        Collections.swap(myList, indexMax, indexMin);
        System.out.println("Swap max/min element in list: " + myList);
    }

    public static void insertRandomThreeDigitNumberBeforeFirstNegativeElement(int threeDigitNumber) {
        if ((threeDigitNumber >= 100) && (threeDigitNumber <= 999)) {
            int num = 10;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                double random = Math.random() * (20 - (-20) + 1) - 20;
                list.add((int) random);
            }
            System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 0) {
                    list.add(i, threeDigitNumber);
                    break;
                }
            }
            System.out.println(list);
        } else {
            System.out.println("You entered not Three Digit Number");
        }
    }

    public static void insertZeroBetweenAllNeighboringElementsWithDifferentSigns() {
        int num = 10;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            double random = Math.random() * (20 - (-20) + 1) - 20;
            list.add((int) random);
        }
        System.out.println(list);

//        Additional solving method:
//        for (int i = 0; i < list.size() - 1; i++) {
//            if ((list.get(i) < 0 && list.get(i + 1) > 0) || (list.get(i) > 0 && list.get(i + 1) < 0)) {
//                list.add(i + 1, 0);
//            }
//        }

        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i)) * (list.get(i + 1)) < 0) {
                list.add(i + 1, 0);
            }
        }
        System.out.println(list);
    }

    public static void copyElementsFromCollectionToNewList() {
        List<Integer> myList = CollectionListUtility.createList();
        System.out.println("myList: " + myList);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = 3;
        for (int i = 0; i < k; i++) {
            list1.add(myList.get(i));
        }
        System.out.println(list1);
        for (int i = myList.size() - 1; i >= k; i--) {
            list2.add(myList.get(i));
        }
        System.out.println(list2);
    }


    public static void removeLastEvenElement() {
        List<Integer> myList = CollectionListUtility.createList();
        System.out.println("myList: " + myList);

//        Addition solving method:
//        for (int i = myList.size() - 1; i > 0; i--) {
//            if (myList.get(i) % 2 == 0) {
//                myList.remove(i);
//                System.out.println("List with remove element: " + myList);
//            } else {
//                System.out.println("There is no such element");
//            }
//            break;
//        }

        if (myList.get(myList.size() - 1) % 2 == 0) {
            myList.remove(myList.size() - 1);
            System.out.println("List with remove element: " + myList);
        } else {
            System.out.println("There is no such element");
        }
    }


    public static void removeFromListElementFollowingFirstMin() {
        List<Integer> myList = CollectionListUtility.createList();
        System.out.println("myList: " + myList);
        int min = myList.get(0);
        int indexMin = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (min > myList.get(i)) {
                min = myList.get(i);
                indexMin = i;
            }
        }
        if (indexMin < myList.size() - 1) {
            myList.remove(indexMin + 1);
        }
        System.out.println("List without following min element: " + myList);
    }

}



