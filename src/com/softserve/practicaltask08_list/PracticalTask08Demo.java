package com.softserve.practicaltask08_list;

import com.softserve.homework08_list.task01.CollectionListUtility;
import com.softserve.homework08_list.task02.Student;
import com.softserve.practicaltask08_list.task01.HeavyBox;
import com.softserve.practicaltask08_list.task02.Numbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticalTask08Demo {
    public static void main(String[] args) {

//        Task 01 Create a dynamic array containing objects of the HeavyBox class which includes int weight
//        and String contents fields. Output its contents using for-each loop.
//          • Change the weight of the first box by 1.
//          • Remove the last box.
//          • Output result to the console. Remove all boxes and output result to the console.

        List<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(25, "Potato"));
        heavyBoxes.add(new HeavyBox(10, "Tomato"));
        heavyBoxes.add(new HeavyBox(20, "Cherry"));
        heavyBoxes.add(new HeavyBox(5, "Strawberry"));
        heavyBoxes.add(new HeavyBox(30, "Banana"));
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);
        }

        System.out.println("********");
        for (HeavyBox heavyBox : heavyBoxes) {
            heavyBoxes.get(0);
            heavyBox.setWeight(1);
            break;
        }
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);
        }

        System.out.println("**********");
        heavyBoxes.remove(heavyBoxes.get(heavyBoxes.size() - 1));
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);
        }

//        Task 02 Suppose, the user enters a set of numbers as a single string "1, 2, 3, 4, 4, 5, 6, 6, 7, 8" from
//        the console (can be other numbers):
//          • Remove of duplicate elements in a string.
//          • Output the result to the console.

        System.out.println("\n*******Demonstrate task 02*****\n");
        Numbers.enterSetOfNumbers();
    }
}
