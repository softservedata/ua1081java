package com.softserve.practicaltask08_list.task03;

import com.softserve.homework08_list.task02.Student;
import com.softserve.practicaltask08_list.task01.HeavyBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class myCollectionDemoTask03 {

    //    Task 03 In main() method declare a collection myCollection of 10 integers and fill it (from the
//    console or random):
//          • Find and save in list newCollection all positions of element more than 5 in the
//    collection. Output newCollection to the console;
//          • Remove from collection myCollection elements, which are greater then 20. Output the result
//          • Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position –
//    xxx, value of element – xxx”
//          • Sort and print collection.
//    Use one or more of the next: List, ArrayList, LinkedList
    public static void main(String[] args) {
        int num = 30;
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            double random = Math.random() * num;
            myCollection.add((int) random);
        }
        System.out.println("My Collection: " + myCollection);


        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Indexes of elements more than five: " + newCollection);


        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i > 20) {
                iterator.remove();
            }
        }
        System.out.println("Collection after remove: " + myCollection);


        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position: " + i + " value of element: " + myCollection.get(i));
        }


        Collections.sort(myCollection);
        System.out.println("Sort collection: " + myCollection);
    }
}
