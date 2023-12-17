package com.softserve.homework15.ex01;

public class Run1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First message");
        }
    }
}
