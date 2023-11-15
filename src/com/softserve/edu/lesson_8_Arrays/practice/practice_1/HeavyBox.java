package com.softserve.edu.lesson_8_Arrays.practice.practice_1;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    private int weight;
    private String contents;

    List<HeavyBox> list = new ArrayList<>();

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }

    public  List<HeavyBox> removeLast(List<HeavyBox> o){
        int last = o.size() - 1;
        o.remove(last);
        return o;

    }
}
