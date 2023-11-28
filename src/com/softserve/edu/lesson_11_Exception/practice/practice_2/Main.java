package com.softserve.edu.lesson_11_Exception.practice.practice_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] types = {"rose", "lily", "orchid"};
        String[] colors = {"blue", "white", "blue"};
        int[] size = {5, 1, 2};
        for (int i = 0; i < 3; i++) {
            try {
                Plant plant = new Plant(size[i],colors[i],types[i]);
                System.out.println(plant);


            } catch (ColorException | TypeException | SizeException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
    }
}
