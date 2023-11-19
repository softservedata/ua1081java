package com.softserve.Homework09.Practical09.Task1;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxList = new ArrayList<>();
        heavyBoxList.add( new HeavyBox(2,"Box1"));
        heavyBoxList.add(new HeavyBox(4,"Box2"));
        heavyBoxList.add(new HeavyBox(2,"Box3"));
        heavyBoxList.add(new HeavyBox(7,"Box4"));
        System.out.println(" All boxes");
        printBoxes(heavyBoxList);
        System.out.println(" Remove last box");
        removeLastBox(heavyBoxList);
        printBoxes(heavyBoxList);
        System.out.println(" After change weight");
        changeWeight(heavyBoxList, 0,1);
        printBoxes(heavyBoxList);

    }
    public static void printBoxes(List<HeavyBox> heavyBoxList){
        for (HeavyBox heavyBox: heavyBoxList) {
            System.out.println(heavyBox);
        }
    }
    public static void removeLastBox(List<HeavyBox> heavyBoxList){
        ListIterator<HeavyBox> iterator = heavyBoxList.listIterator(heavyBoxList.size());
        HeavyBox heavyBox = iterator.previous();
        iterator.remove();
    }
    public static void changeWeight(List<HeavyBox> heavyBoxList, int indexBox, int weight){
        for (int i = 0; i < heavyBoxList.size(); i++) {
            if(i==indexBox){
                heavyBoxList.get(i).setWeight(weight);
            }
        }
    }
}
class HeavyBox{
    private int weight;
    private String contents;
    public HeavyBox(int weight, String contents){
        this.weight =weight;
        this.contents= contents;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }
}