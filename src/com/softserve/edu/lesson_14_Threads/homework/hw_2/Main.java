package com.softserve.edu.lesson_14_Threads.homework.hw_2;

public class Main {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("One thread");

            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Two thread");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                Thread three = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Three thread");
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
                three.start();
                ;
                try {
                    three.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });
            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        one.start();
    }
}
