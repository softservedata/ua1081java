package com.softserve.edu.lesson_14_Threads.practice.practice_2;

public class PractThread extends Thread {

    private String text;
    private int pause;

    public PractThread(String text, int pause) {
        this.text = text;
        this.pause = pause;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(text);
        }

    }


}
