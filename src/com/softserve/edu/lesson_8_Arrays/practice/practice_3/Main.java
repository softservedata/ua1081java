package com.softserve.edu.lesson_8_Arrays.practice.practice_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        randomNum(numbers);
        insertElementInNewPosition(numbers);
        addToNewCollectionMore5(numbers);
        removeFromCollectionMore20(numbers);

        numbers.sort(Collections.reverseOrder());
        System.out.println("Sorted: " + numbers);

    }

    static void randomNum(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(-50, 50));
        }
        System.out.println("Random numbers: " + list);
    }

    static void addToNewCollectionMore5(List<Integer> list) {
        List<Integer> five = new LinkedList<>();
        for (Integer i : list) {
            if (i > 5) {
                five.add(i);
            }
        }
        System.out.println("New list with elements more than 5: " + five);
    }

    static void removeFromCollectionMore20(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > 20) {
                iterator.remove();
            }
        }
        System.out.println("Deleted all elements more than 20: " + list);
    }

    static void insertElementInNewPosition(List<Integer> list) {
        list.set(2, 1);
        list.set(8, -3);
        list.set(5, -4);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Position: " + i + " Value of element: " + list.get(i));
//        }

        int position = 0;
        for (Integer i : list) {
            System.out.println("Position: " + position + " Value: " + i);
            position++;
        }
    }
}
