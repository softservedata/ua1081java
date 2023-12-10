package com.softserve.edu.lesson_14_Threads.homework.hw_1;

import static java.lang.Thread.sleep;

public class PractThread extends Thread {
    private String text;


    public PractThread(String text) {
        this.text = text;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(text);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


