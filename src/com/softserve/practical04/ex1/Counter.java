package com.softserve.practical04.ex1;

public class Counter {
    private int counter = 0;
    public void oddCounter(int num) {
        if (num % 2 != 0) {
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }
}
