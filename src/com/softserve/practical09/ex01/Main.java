package com.softserve.practical09.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> boxList = new ArrayList<>();
        boxList.add(new HeavyBox(23, "glass"));
        boxList.add(new HeavyBox(35, "canned food"));
        boxList.add(new HeavyBox(18, "chocolate"));

        print(boxList);

        boxList.get(0).setWeight(1);
        boxList.remove(boxList.size() - 1);

        System.out.println();
        print(boxList);

    }

    private static void print(List<HeavyBox> boxList) {
        for (HeavyBox box : boxList) {
            System.out.println(box);
        }
    }
}
