package com.softserve.homework14_multithreading.task01;

public class HomeWork14Demo {
    public static void main(String[] args) {

//        1. Run three threads and output there different messages for 5 times. The third thread
//        supposed to start after finishing working of the two previous threads.

        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        MyThread thread3 = new MyThread(3);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();




    }
}
