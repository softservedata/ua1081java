package com.softserve.edu.lesson_14_Threads.homework.hw_3;

public class DeadLock extends Thread{
    private final Object lock1;
    private final Object lock2;

    public DeadLock(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " lock 1");
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " lock2");
            }

        }
    }
}
