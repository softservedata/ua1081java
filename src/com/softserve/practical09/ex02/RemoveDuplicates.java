package com.softserve.practical09.ex02;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 3, 6, 4, 3";
        String[] strArray = input.split(", ");
        List<Integer> intList = new ArrayList<>();

        for (String string : strArray) {
            intList.add(Integer.parseInt(string));
        }

        //v1
        System.out.println(new HashSet<>(intList));
        //v1

        //v2
        List<Integer> newList = new ArrayList<>();

        for (String s : strArray) {
            if(!newList.contains(Integer.parseInt(s))) {
                newList.add(Integer.parseInt(s));
            }
        }

        System.out.println(newList);
        //v2

        //v3
        for (int i = 0; i < intList.size() - 1; i++) {
            Integer toCompare = intList.get(i);
            ListIterator<Integer> iterator = intList.listIterator(i + 1);
            while (iterator.hasNext()) {
                if (toCompare.equals(iterator.next())) {
                    iterator.remove();
                }
            }
        }

        System.out.println(intList);
        //v3
    }
}
