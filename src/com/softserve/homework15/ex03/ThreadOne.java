package com.softserve.homework15.ex03;

public class ThreadOne implements Runnable {
    @Override
    public void run() {
        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread threadThree = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            threadThree.start();
        });
        threadTwo.start();

    }

    public static void main(String[] args) {
        Runnable runnable = new ThreadOne();
        Thread threadOne = new Thread(runnable);
        threadOne.start();
    }
}
