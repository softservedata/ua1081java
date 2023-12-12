package com.softserve.homework14_multithreading.task02;

public class Task02Demo extends Thread {
    public static void main(String[] args) {

//               2. Cause a deadlock. Organize the expectations of ending a thread in main(), and make
//        the end of the method main() in this thread.

        final Object first = new Object();
        final Object second = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (first) {
                    System.out.println("Thread 1: Locked first");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (second) {
                        System.out.println("Thread 1: Locked second");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (second) {
                    System.out.println("Thread 2: Locked second");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (first) {
                        System.out.println("Thread 2: Locked first");
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished");
    }


}
