package com.softserve.edu.lesson_8_Arrays.practice.practice_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(455,"Bananas"));
        boxes.add(new HeavyBox(322,"Mango"));
        boxes.add(new HeavyBox(501,"Chocolate"));
        boxes.add(new HeavyBox(222,"Cookies"));
        boxes.add(new HeavyBox(101,"Kiwi"));

        changeWeightOnTheFirstElement(boxes);
        removeLast(boxes);
        removeAllList(boxes);

    }

    static void display(List<HeavyBox> boxes){
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
    }

    static void changeWeightOnTheFirstElement(List<HeavyBox> boxes){
        if(!boxes.isEmpty()){
            boxes.get(0).setWeight(1);
        }
    }

    static void removeLast(List<HeavyBox>boxes){
        int last = boxes.size() - 1;
        boxes.remove(last);
        display(boxes);
    }

    static void removeAllList(List<HeavyBox>boxes){
        boxes.clear();
        display(boxes);
    }


}
