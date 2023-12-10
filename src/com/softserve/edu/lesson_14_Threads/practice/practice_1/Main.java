package com.softserve.edu.lesson_14_Threads.practice.practice_1;

    public class Main {
        public static void main(String[] args) throws InterruptedException {
            for (int i = 0; i < 10; i++) {
                System.out.println("I love Java");
                Thread.sleep(1000);
            }
        }
    }

