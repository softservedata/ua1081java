package com.softserve.homework14_multithreading.task01;

public class MyThread extends Thread {
    private int number;

    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + number);
        }
    }
}
