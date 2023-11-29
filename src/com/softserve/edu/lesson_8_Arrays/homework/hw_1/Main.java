package com.softserve.edu.lesson_8_Arrays.homework.hw_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();
        randomNum(myCollection);
        swapMinAndMax(myCollection);
        insertRandomDigitBeforeNegative(myCollection);
        copyCollection(myCollection, 4);
        removeFirstAfterMin(myCollection);
        insertZero(myCollection);

    }

    /**
     * The method randomNum uses Random.nextInt to generate random numbers.
     * @param list
     */
    static void randomNum(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(-50, 50));
        }
        System.out.println("Random numbers: " + list);
    }
    //The method swapMinAndMax uses Collections.min and Collections.max, which is efficient.
    // Be cautious with lists that contain duplicate min or max values,
    // as indexOf will return the index of the first occurrence.
    static void swapMinAndMax(List<Integer> list) {
        int min = list.indexOf(Collections.min(list));
        int max = list.indexOf(Collections.max(list));
        Collections.swap(list, min, max);
        System.out.println("Swapped min and max values: " + list);
    }

    /**
     * The method insertRandomDigitBeforeNegative uses Random.nextInt to generate random numbers.
     * @param list
     */
    static void insertRandomDigitBeforeNegative(List<Integer> list) {
        Random random = new Random();
        int n = random.nextInt(100, 999);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, n);
                break;
            }
        }
        System.out.println("Added digit before negative: " + list);
    }


    static void copyCollection(List<Integer> list, int k) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2Reversed = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }

        for (int i = list.size() - 1; i >= k; i--) {
            list2Reversed.add(list.get(i));
        }

        System.out.println("The first K elements: " + list1);
        System.out.println("All other reverse elements: " + list2Reversed);

    }

    static void removeFirstAfterMin(List<Integer> list) {
        int min = list.indexOf(Collections.min(list));
        if (list.size() - 1 != min) {
            list.remove(min + 1);
        }
        System.out.println("Removed next number after min: " + list);
    }

    static void insertZero(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            temp.add(list.get(i));
            if (list.get(i) > 0 && list.get(i + 1) < 0 || list.get(i) < 0 && list.get(i + 1) > 0) {
                temp.add(0);
            }
        }
        temp.add(list.get(list.size() - 1));
        list.clear();
        list.addAll(temp);

        System.out.println("Added zero between all with different signs: " + list);

    }
}
//Removing the Last Even Element from myCollection is missing