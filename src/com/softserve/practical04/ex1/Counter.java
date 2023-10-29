package com.softserve.practical04.ex1;

public class Counter {
    private int counter = 0;
    public void oddCounter(int num1, int num2, int num3) {
        if (num1 % 2 != 0) {
            counter++;
        }
        if (num2 % 2 != 0) {
            counter++;
        }
        if (num3 % 2 != 0) {
            counter++;
        }
    }
    public int getCounter() {
        return counter;
    }
}
