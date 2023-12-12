package com.softserve.homework14_multithreading.task03;

public class Task03Demo {
    public static void main(String[] args) {
//        3. Create a thread «one», which would start the thread «two», which has to output its
//        number («Thread number two») 3 times and create thread «three», which would to
//        output message «Thread number three» 5 times.

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                Thread three = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Thread number three");
                        }
                    }
                });
                three.start();
            }
        });

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                two.start();
            }
        });

        one.start();


    }
}
