package com.softserve.Homework09.Practical09.Task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("\n Original list");
     List<Integer> list = entryList();
        System.out.println(list);
        System.out.println("\n Numbers more then 5:");
     List<Integer> updatedList = moreThenXNumbers(list,5);
        System.out.println(updatedList);
        System.out.println("\n Remove elements more then 20:");
        removeNumbersMoreThenX(updatedList,20);
        System.out.println(updatedList);
        insertElements(updatedList);
        System.out.println("\n Sort collection:");
        Collections.sort(updatedList);
        System.out.println(updatedList);

    }
    public static List<Integer> entryList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static List<Integer> moreThenXNumbers(List<Integer> list, int x){
        List<Integer> newList = new ArrayList<>();
        for (Integer element: list) {
            if(element>x){
                newList.add(element);
            }
        }
        return  newList;
    }
    public static void removeNumbersMoreThenX(List<Integer> list, int x){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer element = iterator.next();
            if(element>x){
                iterator.remove();
            }
        }
    }
    public static void insertElements(List<Integer> list){
        if(list.size()>2){
            list.add(2,1);
        }
        if(list.size()>8){
            list.add(8,-3);
        }
        if(list.size()>5){
            list.add(5,4);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("position – "+ i +", value of element – "+list.get(i));
        }
    }
}
